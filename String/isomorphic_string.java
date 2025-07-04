
import java.util.HashMap;
import java.util.Map;

public class isomorphic_string {
    public static void main(String[] args) {
        String s1 = "egg";
        String s2 = "odd";
         if (isIsomorphic(s1, s2)) {
            System.out.println(s1 + " and " + s2 + " are isomorphic.");
        } else {
            System.out.println(s1 + " and " + s2 + " are not isomorphic.");
        }
    }
    
    public static boolean isIsomorphic ( String s, String t)
    {
        if (s.length() != t.length()) return false;
        Map<Character, Character> mapST = new HashMap<>();
        Map<Character, Character> mapTS = new HashMap<>();

        for (int i = 0; i < s.length(); i++) {
            char c1 = s.charAt(i);
            char c2 = t.charAt(i);

            if (mapST.containsKey(c1)) {
                if (mapST.get(c1) != c2) return false;
            } else {
                mapST.put(c1, c2);
            }

            if (mapTS.containsKey(c2)) {
                if (mapTS.get(c2) != c1) return false;
            } else {
                mapTS.put(c2, c1);
            }
        }

        return true;
    }
}
