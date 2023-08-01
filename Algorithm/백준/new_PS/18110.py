
def my_round(num):
    if num - int(num) >= 0.5:
        return int(num) + 1
    else:
        return int(num)


a = int(input())
arr = []
for i in range(a):
    arr.append(int(input()))
if not arr:
    print(0)
else:
    arr.sort()
    sum = 0
    count = 0
    for i in range(my_round(a*0.15), len(arr) - my_round(a*0.15)):
        sum += arr[i]
        count += 1
    print(my_round(sum/count))