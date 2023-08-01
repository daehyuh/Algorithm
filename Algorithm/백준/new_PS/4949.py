while True:
    i = input()
    if i == ".":
        break
    arr = []
    for j in i:
        if j == "(":
            arr.append("(")
        if j == "[":
            arr.append("[")
        if j == ")":
            if len(arr) != 0:
                if arr[-1] == "(":
                    arr.pop(-1)
                else:
                    arr.append(")")
            else:
                arr.append(")")
        if j == "]":
            if len(arr) != 0:
                if arr[-1] == "[":
                    arr.pop(-1)
                else:
                    arr.append("]")
            else:
                arr.append("]")
    if not arr:
        print("yes")
    else:
        print("no")
