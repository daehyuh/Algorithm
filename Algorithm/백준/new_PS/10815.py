def bf(arr, target, low = None, high =None):
    low, high = low or 0, high or len(arr)-1
    if low > high:
        return -1

    mid = (low+high) // 2

    if arr[mid] > target:
        return bf(arr, target, low, mid)
    if arr[mid] == target:
        return mid
    if arr[mid] < target:
        return bf(arr,target,mid+1, high)

input()
list1 = list(map(int, input().split(' ')))
list1.sort

input()
list2 = list(map(int, input().split(' ')))

for i in list2:
    if bf(list1, i) == -1:
        print("1", end=" ")
    else:
        print("0", end=" ")
