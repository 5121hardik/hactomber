#include<bits/stdc++.h>
using namespace std;
int main()
{
    int ar[10001],le[10001],ri[10001],i,n,t;
    cin>>n;
    for(i=1;i<=n;i++)
    cin>>ar[i];
    le[0]=0;
    for(i=1;i<=n;i++)
    le[i] =__gcd(le[i-1],ar[i]);
    ri[n+1]=0;
    for(i=n;i>=1;i--)
    ri[i]=__gcd(ri[i+1],ar[i]);
    cin>>t;
    while(t--)
    {
      int l,r;
      cin>>l>>r;
      cout<<le[l-1]<<" "<<ri[r+1]<<endl;
      cout<<__gcd(le[l-1],ri[r+1])<<endl;
    }
}