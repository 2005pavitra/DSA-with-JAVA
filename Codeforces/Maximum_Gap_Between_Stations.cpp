#include<bits/stdc++.h>
using namespace std;

class Solution {
public:
    int maximumGap(string skill, string station) {
        int n = skill.size()-1, m = station.size()-1;
        vector<int> minVal(n), maxVal(n);

        int j = 0;
        for(int i = 0;i< n; i++){
            if(skill[i] == station[j]){
                minVal[i] = j;
                i++;
                j++;
            }else{
                j++;
            }
        }

        int j= m-1;
        for(int i = n-1; i>=0 ;i--){
            if(skill[i] == station[j]){
                maxVal[i] = j;
                i--;
                j--;
            }else{
                j--;
            }
        }

        int maxValDiff = 0;
        for(int i = 0; i< n-1;i++){
            maxValDiff = max(maxValDiff,( maxVal[i+1]-minVal[i]));
        }

        return maxValDiff;
    }
};