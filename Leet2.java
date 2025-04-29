public class Leet2 {
    
    public int lengthOfLastWord(String s) {
        boolean char_flag = false;
        int len = 0;
        for (int i = s.length() - 1; i >= 0; i--) {
            if (Character.isLetter(s.charAt(i))) {
                char_flag = true;
                len++;
            } else {
                if (char_flag == true)
                    return len;
            }
        }
        return len;
    }
    public static void main(String[] args) {
        String input = "Geeks For Geeks  ";
        Leet2 l = new Leet2();
        System.out.println("The length of last word is "
                + l.lengthOfLastWord(input));
    }
}