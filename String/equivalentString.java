public class equivalentString {
    public static void main(String[] args) {
        String s = "aaaa";
        String t = "bcdf";
        System.out.println(isEquivalentString(s, t));
    }
    public static boolean isEquivalentString (String s, String t)
    {
        int len = Math.min(s.length(), t.length());
        String s1 = s.toLowerCase();
        String s2 = t.toLowerCase();
        int[] freq = new int[26];

        for( int  i = 0; i< len; i++)
        {
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--; 
        }
        for(int  i = 0; i<26; i++)
        {
            if(Math.abs(freq[i])>3)
            {
                return false;
            }
        }
        return true;
    }
}
