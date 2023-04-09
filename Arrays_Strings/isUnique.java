// import java.util.HashSet;

public class isUnique {
    public static void main(String[] args) {
        String str = "Mohanish";
        if(str.length() > 128){
            System.out.println("False");
        }
       boolean []char_set = new boolean[128];
       for (int i = 0; i < str.length(); i++) {
            int val = str.charAt(i);
            if(char_set[val]){
                System.out.println("False");
            } else {
                System.out.println("True");
            }
       }
    }
}


 // HashSet<Character> st = new HashSet<>();
        // String str = "Mohanish";
        // for (int i = 0; i < str.length(); i++) {
        //     st.add(str.charAt(i));
        // }
        // if(str.length() == st.size()){
        //     System.out.println("True");
        // } else {
        //     System.out.println("False");
        // }