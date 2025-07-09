public class balancesString {
    public static void main(String[] args) {
        String num = "12342";
        System.out.println(isBalanced(num));
    }
    public static boolean isBalanced(String num) {
        int len = num.length();
        int sum1 = 0;
        int sum2 = 0;
        for(int i = 0; i<len; i=i+2)
        {
            sum1 = sum1+(num.charAt(i)-'0');
        }
        for(int i = 1; i<len; i=i+2)
        {
            sum2 = sum2+(num.charAt(i)-'0');
        }
        if(sum1 == sum2)return true;
        return false;
    }
}
