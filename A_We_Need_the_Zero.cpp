#include<bits/stdc++.h>
using namespace std;

int main(){
    int t; 
    cin>>t;

    while(t-->0){
        int n;
        cin>>n; 
        int xor_sum = 0;
        for(int i = 0; i< n; i++){
            int val;
            cin>>val;
            xor_sum^=val;
        }

        if(n%2 == 1){
            cout<<xor_sum<<endl;
        }else{
            if(xor_sum == 0){
                cout<<"1"<<endl;
            }else{
                cout<<"-1"<<endl;
            }
        }
    }
}