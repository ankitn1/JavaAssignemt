
package assignment;
public class Pangram {
    public static void main(String[] args) {
        String input = " Youngster Gerald Coetzee took 3 as England self "
                + "destructed and lost to South Africa by 229 runs at "
                + "the Wankhede on Saturday.";
                
        boolean isPangram = isPangram(input);

        if (isPangram) {
            System.out.println("The input is a pangram.");
        } else {
            System.out.println("The input is not a pangram.");
        }
    }

    public static boolean isPangram(String s) {
        s = s.toLowerCase();
        boolean[] letters = new boolean[26];

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if ('a' <= c && c <= 'z') {
                letters[c - 'a'] = true;
            }
        }

        for (boolean letter : letters) {
            if (!letter) {
                return false; 
            }
        }

        return true;
    }
}