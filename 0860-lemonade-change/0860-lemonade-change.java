class Solution {
    public boolean lemonadeChange(int[] bills) {
        if(bills[0]>5) return false; 
        HashMap<Integer,Integer> moneyWeHave = new HashMap<>();
        moneyWeHave.put(5,0);
        moneyWeHave.put(10,0);
        moneyWeHave.put(20,0);

        for(int bill: bills){
            if(bill==5){
                moneyWeHave.put(5,moneyWeHave.get(5)+1);
            }else if(bill==10){
                if(moneyWeHave.get(5)<=0) return false; 
                moneyWeHave.put(10, moneyWeHave.get(10)+1);
                moneyWeHave.put(5, moneyWeHave.get(5)-1);
            }else if(bill==20){
                if (moneyWeHave.get(10) > 0 && moneyWeHave.get(5) > 0) {
                    // Use one 10 and one 5
                    moneyWeHave.put(10, moneyWeHave.get(10) - 1);
                    moneyWeHave.put(5, moneyWeHave.get(5) - 1);
                } else if (moneyWeHave.get(5) >= 3) {
                    // Use three 5s
                    moneyWeHave.put(5, moneyWeHave.get(5) - 3);
                } else {
                    return false;
                }

            }
            
        }
        return true; 
        
    }
}