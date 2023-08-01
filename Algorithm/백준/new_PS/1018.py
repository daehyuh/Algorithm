n, m = map(int, input().split())
board = []

for _ in range(n):
    board.append(input())
case1 = 0  # 블랙이 먼저
case2 = 0  # 화이트가 먼저
res = []
for a in range(n-7):
    for b in range(m-7):
        case1 = 0  # 블랙이 먼저
        case2 = 0  # 화이트가 먼저
        for i in range(a, a+8):
            for j in range(b, b+8):
                if j%2 == 0 and i%2 == 0:
                    if board[i][j] == 'W':
                        case1 +=1
                    elif board[i][j] == 'B':
                        case2 +=1
                elif j%2 == 1 and i%2 == 0:
                    if board[i][j] == 'B':
                        case1 +=1
                    elif board[i][j] == 'W':
                        case2 +=1
                elif j%2 == 0 and i%2 == 1:
                    if board[i][j] == 'B':
                        case1 +=1
                    elif board[i][j] == 'W':
                        case2 +=1
                elif j%2 == 1 and i%2 == 1:
                    if board[i][j] == 'W':
                        case1 +=1
                    elif board[i][j] == 'B':
                        case2 +=1
        res.append(min(case1, case2))

print(min(res))
