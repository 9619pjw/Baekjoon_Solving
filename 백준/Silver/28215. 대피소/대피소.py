from itertools import combinations

def mii():
    return map(int, input().split())

N, K = mii()
INF = float("INF")
x = [0] * N
y = [0] * N

for i in range(N):
    x[i], y[i] = mii()

def max_dist(comb):
    rst = 0
    for i in range(N):
        min_dist = INF
        for c in comb:
            dist = abs(x[i] - x[c]) + abs(y[i] - y[c])
            min_dist = min(min_dist, dist)
        rst = max(rst, min_dist)
    return rst

ans = INF
for comb in combinations(range(N), K):
    ans = min(ans, max_dist(comb))

print(ans)