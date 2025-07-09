
import java.util.ArrayList;
import java.util.List;

public class findWordsContainingCharacter {
    public static void main(String[] args) {
        String [] words =  {"leet","code"};
        char x  = 'e';
        System.out.println(findwordcontaining(words, x));
    }
    public static List<Integer> findwordcontaining (String []words, char x)
    {
        ArrayList<Integer> result = new ArrayList<>();
        for(int i = 0; i< words.length; i++)
        {
            if(words[i].contains(String.valueOf(x)))
            {
                result.add(i);
            }
        }
        return result;
    }
}
