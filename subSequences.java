import java.util.HashSet;
public class subSequences {
    public static void printSub(String str, int idx, String sub, HashSet<String> set){
        if(idx == str.length()){
            if(set.contains(sub)){
                return;
            }
            else{
                System.out.println(sub);
                set.add(sub);
                return;
            }
        }
        char chr = str.charAt(idx);
        printSub(str, idx+1, sub+chr, set);
        printSub(str, idx+1, sub, set);
    }
    public static void main(String[] args) {
        HashSet<String> set = new HashSet<>();
        String str = "aaaa";
        printSub(str,0,"",set);
    }
}
