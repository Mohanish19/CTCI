// import java.util.Arrays;

// Q: Given Two strings, check if both are permutation of each other

public class permutation{
    public static void main(String[] args) {
        String s = "dog";
        String t = "god";
        System.out.println(permu(s, t));
    }

    static boolean permu(String s, String t){
        if(s.length() != t.length()){
            return false;
        }
        int [] letters = new int [128];
        
        char[]s_array = s.toCharArray();
        for( char c : s_array){
            letters[c]++;
        }

        for(int i = 0; i < t.length(); i++){
            int c = (int) t.charAt(i);
            letters[c]--;
            if(letters[c] < 0){
                return false;
            }
        }
            
        return true;
    }
}


// Solution 1: Sorting the Strings

// public class permutation {
//     public static void main(String[] args) {
//         String s = "dog";
//         String t = "god";
//        System.out.println(permu(s , t)); 
//     }
//     static String sort(String s){
//         char[]content = s.toCharArray();
//         Arrays.sort(content);
//         return new String(content);
//     }

//     static boolean permu(String s , String t){
//         if(s.length() != t.length()){
//             return false;
//         }
//         return sort(s).equals(sort(t));
//     }
// }
