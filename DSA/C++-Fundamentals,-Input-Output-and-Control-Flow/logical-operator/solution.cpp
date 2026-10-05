#include <iostream>
#include <string>
using namespace std;

int main()
{
    int a, b;
    string op;

    cin >> a >> b >> op;

    if(op == "&&")
    {
        cout << (a && b);
    }

    else
    {
        cout << (a || b);
    }

    return 0;
}