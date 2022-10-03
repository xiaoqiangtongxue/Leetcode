package LC_860;

public class Solution1 {
    public boolean lemonadeChange(int[] bills) {
        int count1 = 0;
        int count2 = 0;
        for(int i = 0; i < bills.length; i++){
            if(bills[i] == 5){
                count1++;
            }else if(bills[i] == 10){
                if(count1 >= 1){
                    count1--;
                    count2++;
                }else{
                    return false;
                }
            }else{
                if(count2 >= 1 && count1 >= 1){
                    count2--;
                    count1--;
                }else if(count1 >= 3){
                    count1 -= 3;
                }else{
                    return false;
                }
            }
        }
        return  true;
    }
}
