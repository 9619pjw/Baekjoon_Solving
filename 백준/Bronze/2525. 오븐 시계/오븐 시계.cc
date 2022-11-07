#include <iostream>
using namespace std;

int main(void)
{
	int a, b, c;
	int hour = 0;
	int min = 0;

	cin >> a >> b >> c;

	hour = a;
	min = b + c;
	if (min >= 60)
	{
		int tmp = min / 60;
		min -= (tmp * 60);
		hour += tmp;
		if (hour >= 24)
		{
			hour -= 24;
		}
	}
	cout << hour << " " << min;
	return 0;
}