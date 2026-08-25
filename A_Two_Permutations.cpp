#include<bits/stdc++.h>
using namespace std;

int main(){
    int t ;
    cin>>t;

    while(t-- >0){
        int n; 
        cin>>n;
        int a;
        cin>>a;
        int b;
        cin>>b;

        if( (n == a) && (n==b)){
            cout<<"Yes"<<endl;
        }else if(n-(a+b)>1){
            cout<<"Yes"<<endl;
        }else cout<<"No"<<endl;
    }
}