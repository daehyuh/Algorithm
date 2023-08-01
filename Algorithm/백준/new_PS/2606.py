n = int(input())  # 컴퓨터 개수
v = int(input())  # 연결선 개수
graph = [[] for i in range(n+1)] # 그래프 초기화
visited = [0] * (n+1)

for i in range(v):
    a, b = map(int, input().split())
    graph[a] += [b]
    graph[b] += [a]
# ==============

from collections import deque

visited[1] = 1
Q = deque([1])
while Q:
    c = Q.popleft()
    for nx in graph[c]:
        if visited[nx] == 0:
            Q.append(nx)
            visited[nx] = 1
print(sum(visited)-1)