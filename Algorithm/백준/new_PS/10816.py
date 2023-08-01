input()
arr = list(map(int, input().split()))
input()


maplist = {}

for i in arr:
    if i in maplist:
        maplist[i] = maplist[i]+1
    else:
        maplist[i] = 1

a = list(map(int, input().split()))

for i in a:
    if i in maplist:
        print(maplist[i], end=' ')
    else:
        print(0, end=' ')