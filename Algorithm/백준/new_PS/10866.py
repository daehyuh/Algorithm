# push_front X: 정수 X를 덱의 앞에 넣는다.
# push_back X: 정수 X를 덱의 뒤에 넣는다.
# pop_front: 덱의 가장 앞에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
# pop_back: 덱의 가장 뒤에 있는 수를 빼고, 그 수를 출력한다. 만약, 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
# size: 덱에 들어있는 정수의 개수를 출력한다.
# empty: 덱이 비어있으면 1을, 아니면 0을 출력한다.
# front: 덱의 가장 앞에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.
# back: 덱의 가장 뒤에 있는 정수를 출력한다. 만약 덱에 들어있는 정수가 없는 경우에는 -1을 출력한다.

deck_list = []

import sys
n = int(sys.stdin.readline())

for i in range(n):
    commend = sys.stdin.readline()
    sort_com = commend[0:2]

    if sort_com == 'pu':
        if commend[0:6] == 'push_b':
            deck_list.append(int(commend.split(' ')[1]))
        if commend[0:6] == 'push_f':
            deck_list.insert(0,int(commend.split(' ')[1]))
    elif sort_com == 'po':
        if len(deck_list) == 0:
            print(-1)
        else:
            if commend[0:5] == 'pop_b':
                print(deck_list.pop(-1))
            if commend[0:5] == 'pop_f':
                print(deck_list.pop(0))
    elif sort_com == 'si':
        print(len(deck_list))
    elif sort_com == 'em':
        if len(deck_list) == 0:
            print(1)
        else:
            print(0)
    elif sort_com == 'fr':
        if len(deck_list) == 0:
            print(-1)
        else:
            print(deck_list[0])
    elif sort_com == 'ba':
        if len(deck_list) == 0:
            print(-1)
        else:
            print(deck_list[-1])