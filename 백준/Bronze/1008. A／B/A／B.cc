#include <iostream>
using namespace std;

int main(void)
{
    double a, b = 0;
    cin >> a >> b;
    
    cout.precision(9);
    cout <<fixed;
    cout << a/b<<endl;
    return 0;
}