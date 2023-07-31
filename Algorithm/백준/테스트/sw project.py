import tkinter as tk
from tkinter import messagebox, simpledialog


class User:
    def __init__(self, username, password):
        self.username = username
        self.password = password


class Book:
    def __init__(self, title, author, genre):
        self.title = title
        self.author = author
        self.genre = genre
        self.reviews = []
        self.ratings = []
        self.pass_score = 0
        self.points = 0

    def add_review(self, review):
        self.reviews.append(review)

    def add_rating(self, rating):
        self.ratings.append(rating)

    def set_pass_score(self, score):
        self.pass_score = score

    def set_points(self, points):
        self.points = points

    def get_book_info(self):
        info = f"제목: {self.title}\n저자: {self.author}\n장르: {self.genre}\n통과 점수: {self.pass_score}\n포인트: {self.points}\n"
        return info

    def calculate_average_rating(self):
        if self.ratings:
            return sum(self.ratings) / len(self.ratings)
        else:
            return 0.0


class Community:
    def __init__(self):
        self.books = []

    def add_book(self, book):
        self.books.append(book)

    def sort_books(self):
        self.books.sort(key=lambda book: book.title)

    def search_books(self, keyword, search_type):
        results = []
        for book in self.books:
            if search_type == "제목" and keyword.lower() in book.title.lower():
                results.append(book)
            elif search_type == "저자" and keyword.lower() in book.author.lower():
                results.append(book)
            elif search_type == "장르" and keyword.lower() in book.genre.lower():
                results.append(book)
        return results

    def write_review_and_rate(self, reviewer, book_title):
        for book in self.books:
            if book.title == book_title:
                review = simpledialog.askstring("후기 작성", "도서 후기를 작성하세요:")
                rating = simpledialog.askinteger("평점 메기기", "도서 평점을 매겨주세요 (1~5):", minvalue=1, maxvalue=5)
                book.add_review(review)
                book.add_rating(rating)
                messagebox.showinfo("작성 완료", "후기 작성 및 평점 메기기가 완료되었습니다.")
                break

    def calculate_average_rating(self):
        total_ratings = []
        for book in self.books:
            total_ratings.extend(book.ratings)
        if total_ratings:
            return sum(total_ratings) / len(total_ratings)
        else:
            return 0.0

    def sort_books(self):
        self.books.sort(key=lambda book: book.title)

    def search_books(self, keyword, search_type):
        if search_type == "제목":
            results = list(filter(lambda book: keyword.lower() in book.title.lower(), self.books))
        elif search_type == "저자":
            results = list(filter(lambda book: keyword.lower() in book.author.lower(), self.books))
        elif search_type == "장르":
            results = list(filter(lambda book: keyword.lower() in book.genre.lower(), self.books))
        else:
            results = []
        return results

    def authenticate_user(self, username, password):
        for user in self.users:
            if user.username == username and user.password == password:
                return True
        return False

    def register_user(self, username, password):
        if self.check_username_available(username):
            user = User(username, password)
            self.users.append(user)
            return True
        return False

    def check_username_available(self, username):
        for user in self.users:
            if user.username == username:
                return False
        return True


# 도서 커뮤니티 생성
community = Community()
community.users = [User("user1", "password1"), User("user2", "password2")]  # 예시 사용자 생성


# 가입 함수
def register():
    username = simpledialog.askstring("가입", "사용자 이름을 입력하세요:")
    password = simpledialog.askstring("가입", "비밀번호를 입력하세요:", show='*')
    if community.register_user(username, password):
        messagebox.showinfo("가입 성공", "가입에 성공하였습니다. 이제 로그인해주세요.")
    else:
        messagebox.showwarning("가입 실패", "사용자 이름이 이미 사용 중입니다.")


# 로그인 함수
def login():
    username = simpledialog.askstring("로그인", "사용자 이름을 입력하세요:")
    password = simpledialog.askstring("로그인", "비밀번호를 입력하세요:", show='*')
    if community.authenticate_user(username, password):
        messagebox.showinfo("로그인 성공", "로그인에 성공하였습니다.")
        enable_functionality()
    else:
        messagebox.showwarning("로그인 실패", "사용자 인증에 실패하였습니다.")


# 로그인 성공 시 활성화할 기능들
def enable_functionality():
    write_review_button.config(state=tk.NORMAL)
    challenge_button.config(state=tk.NORMAL)


# GUI 생성
window = tk.Tk()
window.title("도서 커뮤니티")
window.geometry("600x650")

# 예시 도서 추가
book1 = Book("Harry Potter and the Sorcerer's Stone", "J.K. Rowling", "Fantasy")
book2 = Book("To Kill a Mockingbird", "Harper Lee", "Fiction")
book3 = Book("Pride and Prejudice", "Jane Austen", "Romance")
book1.set_pass_score(80)
book1.set_points(10)
book2.set_pass_score(70)
book2.set_points(5)
book3.set_pass_score(90)
book3.set_points(8)
community.add_book(book1)
community.add_book(book2)
community.add_book(book3)


def show_book_info():
    selected_book = book_listbox.get(tk.ACTIVE)
    for book in community.books:
        if book.title == selected_book:
            info = f"제목: {book.title}\n저자: {book.author}\n장르: {book.genre}\n통과 점수: {book.pass_score}\n포인트: {book.points}\n"
            messagebox.showinfo("도서 정보", info)
            break


def search_books():
    keyword = search_entry.get()
    search_type = search_var.get()
    results = community.search_books(keyword, search_type)
    book_listbox.delete(0, tk.END)
    if results:
        for book in results:
            book_listbox.insert(tk.END, book.title)
    else:
        messagebox.showinfo("검색 결과", "일치하는 도서가 없습니다.")


def write_review_and_rate():
    selected_book = book_listbox.get(tk.ACTIVE)
    community.write_review_and_rate("사용자1", selected_book)


def calculate_community_average_rating():
    avg_rating = community.calculate_average_rating()
    messagebox.showinfo("커뮤니티 평균 평점", f"커뮤니티 전체 도서의 평균 평점: {avg_rating:.2f}")


# 가입 버튼
register_button = tk.Button(window, text="가입", command=register)
register_button.pack(pady=5)

# 로그인 버튼
login_button = tk.Button(window, text="로그인", command=login)
login_button.pack(pady=5)

# 도서 목록
book_frame = tk.Frame(window)
book_frame.pack(pady=10)

book_label = tk.Label(book_frame, text="도서 목록:")
book_label.pack()

book_listbox = tk.Listbox(book_frame, width=50)
book_listbox.pack()

for book in community.books:
    book_listbox.insert(tk.END, book.title)

# 도서 정보 버튼
info_button = tk.Button(window, text="도서 정보", command=show_book_info)
info_button.pack(pady=5)

# 후기 작성 버튼
write_review_button = tk.Button(window, text="후기 작성", command=write_review_and_rate)
write_review_button.pack(pady=5)


def view_reviews():
    selected_book = book_listbox.get(tk.ACTIVE)
    for book in community.books:
        if book.title == selected_book:
            reviews = "\n".join(book.reviews)
            messagebox.showinfo("후기 보기", f"{book.title} 도서의 후기:\n{reviews}")
            break


# 후기 보기 버튼
view_reviews_button = tk.Button(window, text="후기 보기", command=view_reviews)
view_reviews_button.pack(pady=5)


def start_challenge():
    messagebox.showinfo("독서 챌린지", "독서 챌린지를 시작합니다.")


# 독서 챌린지 버튼
challenge_button = tk.Button(window, text="독서 챌린지", command=start_challenge)
challenge_button.pack(pady=5)


def show_quote():
    messagebox.showinfo("명언 인용구", "명언 인용구: '책은 마음을 풍요롭게 하는 양식이다.'")


# 명언 인용구 버튼
quote_button = tk.Button(window, text="명언 인용구", command=show_quote)
quote_button.pack(pady=5)


def add_book():
    title = simpledialog.askstring("도서 추가", "도서 제목을 입력하세요:")
    author = simpledialog.askstring("도서 추가", "도서 저자를 입력하세요:")
    genre = simpledialog.askstring("도서 추가", "도서 장르를 입력하세요:")
    pass_score = simpledialog.askinteger("도서 추가", "통과 점수를 입력하세요:")
    points = simpledialog.askinteger("도서 추가", "포인트를 입력하세요:")
    new_book = Book(title, author, genre)
    new_book.set_pass_score(pass_score)
    new_book.set_points(points)
    community.add_book(new_book)
    book_listbox.insert(tk.END, new_book.title)
    messagebox.showinfo("도서 추가", "도서가 성공적으로 추가되었습니다.")


# 도서 추가 버튼
add_book_button = tk.Button(window, text="도서 추가", command=add_book)
add_book_button.pack(pady=5)

# 검색
search_frame = tk.Frame(window)
search_frame.pack(pady=10)

search_label = tk.Label(search_frame, text="검색:")
search_label.grid(row=0, column=0)

search_entry = tk.Entry(search_frame)
search_entry.grid(row=0, column=1)

search_var = tk.StringVar()
search_var.set("제목")

search_type_dropdown = tk.OptionMenu(search_frame, search_var, "제목", "저자", "장르")
search_type_dropdown.grid(row=0, column=2)

search_button = tk.Button(search_frame, text="검색", command=search_books)
search_button.grid(row=0, column=3, padx=10)

# 커뮤니티 평균 평점
avg_rating_button = tk.Button(window, text="커뮤니티 평균 평점", command=calculate_community_average_rating)
avg_rating_button.pack(pady=5)

window.mainloop()
