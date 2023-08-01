a, b = map(int, input().split())

dic = {}
for i in range(a):
    x, y = input().split()
    dic[x] = y

for i in range(b):
    x = input(); print(dic[x])