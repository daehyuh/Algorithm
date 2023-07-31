a = 1000 - int(input())

money = [500, 100, 50, 10, 5, 1]

result = 0

for i in money:
    if a != 0:
        result += a // i
        a = a % i

print(result)