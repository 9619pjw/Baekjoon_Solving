# 공의 개수 N, 바구니의 개수 K
N, K = map(int, input().split())

basket = [0] * (K + 1)
ball = N

for i in range(1, K + 1):
    basket[i] = i
    ball -= i

if ball < 0:
    print(-1)
else:
    while 0 < ball:
        for i in range(K, 0, -1):
            basket[i] += 1
            ball -= 1
            if ball == 0 :
                break
    print(basket[K] - basket[1])