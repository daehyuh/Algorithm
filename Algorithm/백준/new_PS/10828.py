# push X: 정수 X를 스택에 넣는 연산이다.
# pop: 스택에서 가장 위에 있는 정수를 빼고, 그 수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.
# size: 스택에 들어있는 정수의 개수를 출력한다.
# empty: 스택이 비어있으면 1, 아니면 0을 출력한다.
# top: 스택의 가장 위에 있는 정수를 출력한다. 만약 스택에 들어있는 정수가 없는 경우에는 -1을 출력한다.

stack_list = []

import sys
n = int(sys.stdin.readline())

for i in range(n):
    commend = sys.stdin.readline()
    sort_com = commend[0:2]
    
    if sort_com == 'pu':
        stack_list.append(int(commend.split(' ')[1]))
    elif sort_com == 'po':
        if len(stack_list) == 0:
            print(-1)
        else:
            print(stack_list.pop())
    elif sort_com == 'si':
        print(len(stack_list))
    elif sort_com == 'em':
        if len(stack_list) == 0:
            print(1)
        else:
            print(0)
    elif sort_com == 'to':
        if len(stack_list) == 0:
            print(-1)
        else:
            print(stack_list[-1])