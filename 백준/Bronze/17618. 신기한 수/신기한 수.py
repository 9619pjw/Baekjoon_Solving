N = int(input())

def solve(n):
    si = str(n)
    tmp = 0
    for s in si:
        tmp += int(s)
    if n % tmp == 0:
        return True
    return False

ans = 0
for i in range(1, N+1):
    if solve(i):
        ans += 1

print(ans)
