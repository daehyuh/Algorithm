def binary_search(arr, target, low=None, high=None):
    low, high = low or 0, high or len(arr) - 1
    if low > high:
        return -1
    mid = (low + high) // 2
    if arr[mid] > target:
        return binary_search(arr, target, low, mid)
    if arr[mid] == target:
        return mid
    if arr[mid] < target:
        return binary_search(arr, target, mid + 1, high)

input()

arr = list(map(int, input().split(' ')))
arr2 = arr
arr2 = list(set(arr2))
arr2.sort()

for i in arr:
    print(binary_search(arr2, i), end=" ")