n = int(input())
a = list(map(int, input().split(' ')))
b = list(map(int, input().split(' ')))
result = n
cnt = n
for i in a:
    i -= b[0]
    if i > 0:
        if i % b[1]:
            cnt += (i // b[1]) + 1
        else:
            cnt += (i // b[1])

print(cnt)