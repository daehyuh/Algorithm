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


def bs(arr, target, low = None, high =None):
    low, high = low or 0, high or len(arr)-1
    if low > high:
        return -1

    mid = (low+high) // 2

    if arr[mid] > target:
        return bs(arr, target, low, mid)
    if arr[mid] == target:
        return mid
    if arr[mid] < target:
        return bs(arr,target,mid+1, high)


print(bs(["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "N", "O", "P"], "G"))

def line_search(arr, target):
    for i in range(len(arr)):
        if arr[i] == target:
            return i
    return -1

print(line_search(["A", "B", "C", "D", "E", "F", "G", "H", "I", "J", "K", "L", "N", "O", "P"], "G"))