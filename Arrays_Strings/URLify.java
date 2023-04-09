// Q: Replae all whitespace with "%20" in a given string

public class URLify {
    public static void main(String[] args) {
        String str = "Mr John Smith";
        char []s_array = str.toCharArray();
        int trueLength = 13;
        replaceSpaces(s_array, trueLength);
    }

    static void replaceSpaces(char[]str , int trueLength){
        int spaces = 0, index , i = 0;
        for(i = 0; i < trueLength; i++){
            if(str[i] == ' '){
                spaces++;
            }
        }

        index = trueLength + spaces * 2;
        if(trueLength < str.length)
            str[trueLength] = '\0';

        for(i = trueLength; i >= 0; i--){
            if(str[i] == ' '){
                str[index - 1] = '%';
                str[index - 2] = '2';
                str[index - 3] = '0';
                index = index - 3;
            } else {
                str[index - 1] = str[i];
                index--;
            }
        }
    }
}
