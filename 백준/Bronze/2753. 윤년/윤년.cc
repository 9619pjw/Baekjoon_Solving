#include <iostream>
using namespace std;

int main(void)
{
	int i;
	cin >> i;

	if ((i % 4 == 0  && i % 100 != 0 ) || i % 400 == 0)
		cout << 1 << endl;
	else
		cout << 0 << endl;
	return 0;
}