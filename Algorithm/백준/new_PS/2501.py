val = input()
number = int(val.split(' ')[0])
k = int(val.split(' ')[1])

약수 = []

for i in range(1, number+1):
    if number%i == 0:
        약수.append(i)

if len(약수) < k: print(0)
else: print(약수[k-1])