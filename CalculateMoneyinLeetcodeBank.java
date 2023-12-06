class Solution {
    public int totalMoney(int n) {
        int total = 0;
        for(int day = 0, payment = 1; day<n; day++, payment = 1+day%7+day/7){
            total+=payment;
        }
        return total;
    }
}
