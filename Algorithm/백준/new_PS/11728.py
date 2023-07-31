# from builtins import len
#
# x, y = map(int, input().split())
# a = list(map(int, input().split(' ')))
# b = list(map(int, input().split(' ')))
#
# res = []
#
# a_p, b_p = 0, 0
# a_len, b_len = len(a), len(b)
#
# while a_p != a_len or b_p != b_len:
#     if a_p == a_len:
#         res.append(b[b_p])
#         b_p += 1
#     elif b_p == b_len:
#         res.append(a[a_p])
#         a_p += 1
#     else:
#         if a[a_p] < b[b_p]:
#             res.append(a[a_p])
#             a_p += 1
#         else:
#             res.append(b[b_p])
#             b_p += 1
# print(*res)

x, y = map(int, input().split())
a = list(map(int, input().split(' ')))
b = list(map(int, input().split(' ')))

c = a+b

c.sort()
print(*c)