import turtle
import random
imagelist = ["front.gif",
             "back.gif"]
# 화면 초기화
screen = turtle.Screen()
screen.setup(800, 600)
screen.addshape(imagelist[0])
screen.addshape(imagelist[1])

# 사용자로부터 홀 또는 짝 입력 받기
user_choice = turtle.textinput("Coin Flip", "홀 또는 짝을 입력하세요:")

# 동전 개수 랜덤으로 결정
coin_count = random.randint(1, 10)

# 동전 이미지 생성 함수
def create_coin():
    coin = turtle.Turtle()
    coin.shape("circle")
    coin.penup()
    coin.speed(0)
    coin.hideturtle()
    return coin

# 동전 위치 랜덤으로 설정
def set_coin_position(coin):
    x = random.randint(-300, 300)
    y = random.randint(-300, 300)
    coin.goto(x, y)

# 동전 앞면 또는 뒷면 결정
def flip_coin():
    return random.choice([0, 1])

# 동전 이미지 그리기
for _ in range(coin_count):
    coin = create_coin()
    coin.shape(imagelist[flip_coin()])
    set_coin_position(coin)
    coin.showturtle()


# 입력값과 결과 비교
if (coin_count % 2 == 0 and user_choice == "짝") or (coin_count % 2 == 1 and user_choice == "홀"):
    # 결과 출력
    turtle.penup()
    turtle.goto(0, -350)
    turtle.write(f"결과: 성공", align="center", font=("Arial", 16, "bold"))
else:
    # 결과 출력
    turtle.penup()
    turtle.goto(0, -350)
    turtle.write(f"결과: 실패 {coin_count}", align="center", font=("Arial", 16, "bold"))


# 화면 유지
turtle.done()
