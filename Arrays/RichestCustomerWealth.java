// You are given an m x n integer grid accounts where accounts[i][j] is the amount of money the i​​​​​​​​​​​th​​​​ customer has in the j​​​​​​​​​​​th​​​​ bank. Return the wealth that the richest customer has.
// A customer's wealth is the amount of money they have in all their bank accounts. The richest customer is the customer that has the maximum wealth



public class RichestCustomerWealth {

    static int maxWealth(int[][] arr){
        int max = 0;
        for (int i = 0; i < arr.length; i++) {
            int rowSum = 0;
            for(int j = 0; j < arr[i].length; j++){
                rowSum += arr[i][j];
            }
            if(rowSum > max){
                max = rowSum;
            }
    }
    System.out.print("Maximum wealth is : ");
    return max;
}

    public static void main(String[] args) {
        int[][] arr = {
            {2,4,1,15,6},
            {5,4,3,6,8},
            {5,2,7,4,9}
        };
        int ans = maxWealth(arr);
        System.out.println(ans);
    }
}
