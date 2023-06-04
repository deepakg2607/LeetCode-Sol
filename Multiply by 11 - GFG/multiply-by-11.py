#User function Template for python3
class Solution:
    def multiplyby11(self, number):
        # code here
        sum=int(number)
        dee=sum*11;
        return (dee);


#{ 
 # Driver Code Starts
#Initial Template for Python 3

if __name__ == '__main__': 
    t = int(input())
    for _ in range(t):
        number = input().strip()
        ob = Solution()
        print(ob.multiplyby11(number))
# } Driver Code Ends