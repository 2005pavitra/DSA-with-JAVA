#include<bits/stdc++.h>
using namespace std;

int main(){
    int t ;
    cin>>t;
    while(t-->0){
        int n; 
        cin>>n;
        vector<int> v(n);
        int cnt = 0;
        for(int i = 0; i< n; i++){
            cin>>v[i];
            if(v[i] == 2)cnt++;
        }

        if(cnt%2 == 1){
            cout<<"-1"<<endl;;
        }else if(cnt == 0){
            cout<<"1"<<endl;
        }
        
        else{
            int half = cnt/2;
            int i = 0;
            while(i< n && half>0){
                if(v[i] == 2)half--; 
                i++;
            }
            cout<<i<<endl;
        }

        
        
    }
}