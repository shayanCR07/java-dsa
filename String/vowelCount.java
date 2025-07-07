public class vowelCount {
    public static void main(String[] args) {
      String s[] = {"are", "amy", "u"};
      int left = 0;
      int right = 2;
      System.out.println(countVowel(s, left, right));  
    }
    public static int countVowel (String[] word, int left, int right)
    {
        int count = 0;
        for(int i = left; i<= right; i++)
        {
            char s = word[i].charAt(0);
            char t = word[i].charAt(word[i].length()-1);

            if(s == 'a'||s == 'e'||s == 'i'||s == 'o'||s == 'u')
            {
                if(t == 'a'||t == 'e'||t == 'i'||t == 'o'||t == 'u')
                {
                    count++;
                }
            }

        }
        return count;
    }
}
