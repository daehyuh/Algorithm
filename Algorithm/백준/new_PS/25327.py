n, m = map(int, input().split())
nlist = []

for _ in range(n):
    nlist.append(input().split())

for _ in range(m):
    mlist = input().split()
    result = 0
    for i in nlist:
        count = 0
        for j in range(3):
            if mlist[j] == '-':
                count += 1
                continue
            if mlist[j] == i[j]:
                count += 1
        if count == 3:
            result += 1
    print(result)
