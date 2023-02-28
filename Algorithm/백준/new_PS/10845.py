# push X: 정수 X를 큐에 넣는 연산이다.
# pop: 큐에서 가장 앞에 있는 정수를 빼고, 그 수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
# size: 큐에 들어있는 정수의 개수를 출력한다.
# empty: 큐가 비어있으면 1, 아니면 0을 출력한다.
# front: 큐의 가장 앞에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.
# back: 큐의 가장 뒤에 있는 정수를 출력한다. 만약 큐에 들어있는 정수가 없는 경우에는 -1을 출력한다.

que_list = []

import sys
n = int(sys.stdin.readline())

for i in range(n):
    commend = sys.stdin.readline()
    sort_com = commend[0:2]
    
    if sort_com == 'pu':
        que_list.append(int(commend.split(' ')[1]))
    elif sort_com == 'po':
        if len(que_list) == 0:
            print(-1)
        else:
            print(que_list.pop(0))
    elif sort_com == 'si':
        print(len(que_list))
    elif sort_com == 'em':
        if len(que_list) == 0:
            print(1)
        else:
            print(0)
    elif sort_com == 'fr':
        if len(que_list) == 0:
            print(-1)
        else:
            print(que_list[0])
    elif sort_com == 'ba':
        if len(que_list) == 0:
            print(-1)
        else:
            print(que_list[-1])