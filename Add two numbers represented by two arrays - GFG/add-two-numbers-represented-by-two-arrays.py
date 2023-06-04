#User function Template for python3

class Solution:
    def calc_Sum (self, arr,  n, brr, m) : 
        #Complete the function
        sum=0
        sum1=0
        for i in arr:
            sum=sum*10+i
        for i in brr:
            sum1=sum1*10+i
        return str(sum+sum1)
            



#{ 
 # Driver Code Starts
#Initial Template for Python 3

for _ in range(0,int(input())):
    
    n = int(input())
    arr = list(map(int,input().strip().split()))
    m = int(input())
    brr = list(map(int,input().strip().split()))
    ob=Solution()
    res = ob.calc_Sum(arr, n, brr, m)
    print(res)


# } Driver Code Ends