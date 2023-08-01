a = int(input())

for i in range(a):
    b, c = map(int, input().split())
    subarr = list(map(int, input().split()))
    sel = c
    idx = 0
    while len(subarr) != 0:
        # print(subarr, sel)
        if subarr[0] == max(subarr):
            if sel == 0 and (subarr[0] == max(subarr)):
                idx += 1
                break
            subarr.pop(0)
            sel -= 1
            if sel == -1:
                sel = len(subarr)-1
            idx += 1
        else:
            subarr.append(subarr.pop(0))

            sel -= 1
            if sel == -1:
                sel = len(subarr)-1
    print(idx)
