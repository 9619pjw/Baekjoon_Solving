import sys

def dfs(road, x, y,count,apple,answer):
    if apple == 3:
        answer.append(count)
    dx = [0,-1,0,1]
    dy = [-1,0,1,0]
    for i in range(4):	#4개의 방향으로 돈다
        ddx = x + dx[i]
        ddy = y + dy[i]
        if ddx < 0 or ddx > 4 or ddy < 0 or ddy > 4: #범위가 아니라면 pass
            continue
        if road[ddx][ddy] == -1:	#해당 좌표가 -1 이라면 막혔으니 pass
            continue
        if road[ddx][ddy] == 1:	#1이라면 status를 True로 정해주고 apple의 수를 증가한다.
            status = True
            apple+=1
        else:
            status = False	#0일 경우에는 status를 False로 한다. 
        cnt = road[x][y]	#dfs에서 빠져 나왔을 경우 road[x][y]의 값을 복귀시켜야 하기 때문에 변수에 저장시켜 놓는다.
        road[x][y] = -1
        dfs(road, ddx,ddy,count+1, apple,answer)
        road[x][y] = cnt	#빠져나왔을 경우 좌표 값 원복
        if status == True:	#만약 사과를 하나 챙겼다면 원복
            apple -=1
    return answer
road = []
for i in range(5):
    a = list(map(int, sys.stdin.readline().split()))
    road.append(a)
x,y = map(int, sys.stdin.readline().split())
apple = 0
answer = []
if road[x][y] == 1:
    apple +=1
answer = dfs(road,x,y,0,apple, answer)
if len(answer) == 0:
    print(-1)
else:
    print(min(answer))