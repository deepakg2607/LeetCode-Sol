//{ Driver Code Starts
#include<bits/stdc++.h>
using namespace std;

// } Driver Code Ends
class Solution{
    private:
    void deepak(string S, vector<string>&ans, int i)
    {
        if(i>=S.size())
        {
            ans.push_back(S);
            return;
        }
        for(int j=i;j<S.size();j++)
        {
            swap(S[i], S[j]);
            deepak(S , ans , i+1);
            swap(S[i], S[j]);
        }
    }
    public:
    //Complete this function
    
    vector<string> permutation(string S)
    {
        vector<string> ans;
        int index=0;
        deepak(S, ans, index);
        sort(ans.begin(), ans.end());
        return ans;
    }
};


//{ Driver Code Starts.

int main()
{
	int T;
	cin>>T;
	while(T--)
	{
		string S;
		cin>>S;
		Solution ob;
		vector<string> vec = ob.permutation(S);
		for(string s : vec){
		    cout<<s<<" ";
		}
		cout<<endl;
	
	}
	return 0;
}
// } Driver Code Ends