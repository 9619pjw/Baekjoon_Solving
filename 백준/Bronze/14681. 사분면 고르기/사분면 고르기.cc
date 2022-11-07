#include <iostream>
using namespace std;

int main(void)
{
	int x;
	int y;
	cin >> x;
	cin >> y;
	if (x > 0 && y > 0)
		cout << 1 << endl;
	else if (x > 0 && y < 0)
		cout << 4 << endl;
	else if (x < 0 && y>0)
		cout << 2 << endl;
	else
		cout << 3 << endl;
	return 0;
}