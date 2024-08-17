N, d, k, c = map(int, input().split())
arr = []
for i in range(N):
    arr.append(int(input()))

max_sushi = 0
for i in range(N):
    eat_sushi = 1
    check = [0] * (d+1)
    check[c] = 1
    for j in range(i, i+k):
        sushi = arr[j % N]

        if not check[sushi]:
            eat_sushi += 1
        check[sushi] += 1
    max_sushi = max(max_sushi, eat_sushi)

print(max_sushi)