#include <iostream>
using namespace std;

int main()
{
    int N;

    cin >> N;

    for(int i = 1; i <= 10; i++)
    {
        cout << N * i;

        if(i != 10)
        {
            cout << " ";
        }
    }

    return 0;
}