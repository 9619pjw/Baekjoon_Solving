#include <iostream>
using namespace std;

int main(void) {
	int a = 0;
	int b = 0;
	int T = 0;
	cin >> T;

	for (int i = 0; i < T; i++)
	{
		cin >> a >> b;
		cout << a + b << endl;
	}
	return 0;
}