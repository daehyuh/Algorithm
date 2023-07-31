import sys
from itertools import combinations

dwarf = [int(sys.stdin.readline()) for _ in range(9)]
seven = list(combinations(dwarf, 7))

for i in seven:
    if sum(i) == 100:
        ans = list(i)
        break

ans = sorted(ans)
for ans_ in ans:
    print(ans_)