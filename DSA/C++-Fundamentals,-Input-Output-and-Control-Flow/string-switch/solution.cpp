#include <bits/stdc++.h>
using namespace std;

int main() {
   

   string status;

   cin >> status;

    if(status == "OK")
    {
        cout << "Success";
    }
    else if(status == "ERROR")
    {
        cout << "Failure";
    }
    else if(status == "PENDING")
    {
        cout << "Waiting";
    }
    else
    {
        cout << "Unknown";
    }

   return 0;

}