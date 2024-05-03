class Solution {
    public int compareVersion(String version1, String version2) {
        String version1Arr[] = version1.split("\\.");
        String version2Arr[] = version2.split("\\.");
        int n1 = version1Arr.length;
        int n2 = version2Arr.length;
        int p1=0, p2=0;
        while(p1<n1 || p2<n2){
            int num1 = (p1<n1)?Integer.parseInt(version1Arr[p1]):0;
            int num2 = (p2<n2)?Integer.parseInt(version2Arr[p2]):0;
            if(num1!=num2){
                return (num1>num2)?1:-1;
            }
            p1++;
            p2++;
            
        }
        return 0;
    }
}