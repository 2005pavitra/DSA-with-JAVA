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
        vector<int> v(n);
        for (int &i : v)
            cin >> i;

        sort(v.begin(), v.end(), greater<int>());

        if(v[0] == v[n-1])cout<<"No"<<endl;
        else{
            swap(v[1],v[n-1]);
            cout<<"Yes"<<endl;
            for(int i : v)cout<<i<<" ";
        }
        cout<<"\n";

    }
}