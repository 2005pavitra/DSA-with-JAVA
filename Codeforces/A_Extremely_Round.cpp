#include <bits/stdc++.h>
using namespace std;

int main()
{
    int t;
    cin >> t;

    while (t-- > 0)
    {
        int n;
        cin >> n;

        int k = n;
        int reversed = 0;
        while (k > 0)
        {
            reversed = reversed * 10 + (k % 10); // Extract last digit and shift left
            k /= 10;                             // Remove last digit
        }
        

        int dig = 0;
        while (n > 0)
        {
            n /= 10;
            dig++;
        }

        int ans = 0;
        for (int i = 1; i < dig; i++)
        {
            ans += 9;
        }
        int last = reversed%10;
        ans+=last;
        cout<<ans<<endl;
    }
}
