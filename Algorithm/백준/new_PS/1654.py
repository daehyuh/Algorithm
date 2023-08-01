def sol():
    a, b = map(int, input().split())
    arr = []
    for i in range(a):
        arr.append(int(input()))

    low = 1
    high = max(arr)
    mid = 0

    while low <= high:
        mid = (low + high) // 2
        line = 0
        for i in arr:
            line += i // mid
        if line >= b:
            low = mid + 1
        else:
            high = mid - 1
    return high


print(sol())