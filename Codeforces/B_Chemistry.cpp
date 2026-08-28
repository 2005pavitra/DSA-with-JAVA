// we have to find the length of the palindrome
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
        string s;
        cin >> s;

        unordered_map<char, int> map;

        for(char c: s){
            map[c]++;
        }

        int nuOfOdds = 0;
        for(auto x : map){
            if(x.second%2==1)nuOfOdds++;
        }

        if(nuOfOdds<= k+1)cout<<"YES"<<endl;
        else{
            cout<<"NO"<<endl;
        }
    }
}

