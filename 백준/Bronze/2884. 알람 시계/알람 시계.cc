#include <iostream>
using namespace std;

int main(void)
{
	int hour;
	int minute;

	cin >> hour;  cin >> minute;
	if (minute < 45)
	{
		if (hour == 0)
			hour = 23;
		else
			hour -= 1;
		minute += 15;
	}
	else
	{
		minute -= 45;
	}
	cout << hour << " " << minute << endl;
	return 0;
}