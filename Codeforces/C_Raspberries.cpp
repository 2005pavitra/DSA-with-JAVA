#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;

    while (t--)
    {
        int n, k;
        cin >> n >> k;
        vector<int> v(n);
        int even = 0;

        int minOp = k;
        for (int i = 0; i < n; i++)
        {
            cin >> v[i];
            if (v[i] % 2 == 0)even++;
            int op = (k - (v[i] % k)) % k;
            minOp = min(minOp, op);
        }

        if (k == 4)
        {
            minOp = min({minOp, max(0, 2 - even)});
        }

        cout << minOp << endl;
    }
}
