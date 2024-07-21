from itertools import combinations

# 5개의 모음 정의
vowels = ('a', 'e', 'i', 'o', 'u')
L, C = map(int, input().split(' '))

# 가능한 암호를 사전식으로 출력하기 위한 입력 이후 정렬
array = input().split(' ')
array.sort()

# 길이가 1인 모든 암호 조합 확인
for password in combinations(array, L):
    # 패스워드에 포함된 각 문자를 확인하며 모음의 개수 세기
    count = 0
    for i in password:
        if i in vowels:
            count += 1
    # 최소 1개의 모음과 최소 2개의 자음이 있는 경우 출력
    if count >= 1 and count <= L - 2:
        print(''.join(password))
