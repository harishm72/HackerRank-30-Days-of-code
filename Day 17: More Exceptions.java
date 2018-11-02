//Write your code here
class Calculator{ 
    int power(int n, int p) throws Exception{
        int ans;
        if(n<0||p<0){
            throw new Exception("n and p should be non-negative");
        }
        else{
             ans=1;
            for(int i=0;i<p;i++){
                ans=ans*n;
            }
            
        }
        return ans;
}
}
