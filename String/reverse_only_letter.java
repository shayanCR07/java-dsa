public class reverse_only_letter {
    public static void main(String[] args) {
        String s = "ab-cd";
        System.out.println(isReverse(s));
    }
    public static String isReverse (String s)
    {
        int start = 0;
        int end = s.length()-1;
        char ch[] = s.toCharArray();

        while(start<end)
        {
            if(!Character.isLetter(ch[start]))
            {
                start++;
            }
            else if(!Character.isLetter(ch[end]))
            {
                end--;
            }
            else {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return new String(ch);
    }
}
