class Solution {
    public int tribonacci(int n) {
        // //DP approach 
        // int arr[] = new int[38];
        // arr[0]=0; 
        // arr[1]=1;
        // arr[2]=1;
        // for(int i =3; i<=n; i++){
        //     arr[i]=arr[i-1]+arr[i-2]+arr[i-3];
        // }
        // return arr[n];
        
        
        
        //alternative approach without extra space; 
        int p0 =0, p1=1, p2=1,sum=0; 
        
        if(n<=2){
            return (n==0)?0:1;
        }
        
        for(int i =3; i<=n; i++){
            sum = p0+p1+p2; 
            p0=p1; 
            p1=p2; 
            p2=sum; 
        }
        
        return sum; 
    }
}