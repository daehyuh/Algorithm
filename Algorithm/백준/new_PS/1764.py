a, b = map(int,input().split())
dic = {}
for i in range(a+b):
    c = input()
    if c in dic:
        dic[c] = dic[c]+1
    else:
        dic[c] = 1
res = []

for k, v in dic.items():
    if v >= 2:
        res.append(k)
res.sort()
print(len(res))
for i in res:
    print(i)