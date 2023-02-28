import sys
n = sys.stdin.readline()
a = int(n.split(' ')[0])
b = int(n.split(' ')[1])

arr1 = []
arr2 = []

line_case1 = [] # W시작 
line_case2 = [] # B시작

for i in range(b): 
    if i % 2 == 0:
        line_case1.append("W")
        line_case2.append("B")
    else:
        line_case1.append("B")
        line_case2.append("W")


for i in range(a):
    if i % 2 == 0:
        arr1.append(line_case1)
        arr2.append(line_case2)
    else:
        arr1.append(line_case2)
        arr2.append(line_case1)

arr1_cnt = 0
arr2_cnt = 0


input_arr = []

for i in range(b):
	input_arr.append(list(map(int, input().split())))


for i in range(a):
    for j in range(b):
        if input_arr[i][j] != arr1[i][j]:
            arr1_cnt+=1
        if input_arr[i][j] != arr2[i][j]:
            arr2_cnt+=1

print(min(arr1_cnt,arr2_cnt))