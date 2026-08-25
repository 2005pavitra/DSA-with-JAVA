#include <bits/stdc++.h>
using namespace std;

int main() {
    ios_base::sync_with_stdio(false);
    cin.tie(NULL);

    int t;
    cin >> t;

    while (t-- > 0) {
        int n;
        cin >> n;
        vector<int> v(n);
        
        for (int &i : v) {
            cin >> i; 
        }

        int odds = 0;
        int evens = 0;
        for (int i = 0; i < n; i++) {
            if (v[i] % 2 != 0) { 
                v[i] = 1;
            } else {
                v[i] = 0;
            }
        }

        int i = 0;
        while (i < n) {
            if (i + 1 < n && v[i] == 1 && v[i + 1] == 1) {
                while (i + 1 < n && v[i + 1] == 1) {
                    odds++;
                    i++;
                    // cout<<"odd "<<odds<<endl;
                }
            } else if (i + 1 < n && v[i] == 0 && v[i + 1] == 0) {
                while (i + 1 < n && v[i + 1] == 0) {
                    evens++;
                    i++;
                    // cout<<"even "<<evens<<endl;
                }
            }
            i++; 
        }
        int ans = (odds > 0 ? odds  : 0) + (evens > 0 ? evens : 0);
        cout << ans << "\n";
    }
    return 0;
}
