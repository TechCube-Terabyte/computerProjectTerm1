public class q9 {
    static void wordTriangle(String word){
        for(int i=word.length()-1; i>=0; i--){
            for(int j=i; j<word.length(); j++) System.out.print(word.charAt(j));
            System.out.println();
        }

    }
    public static void main(String[] args) {
        System.out.print("String: ");
        wordTriangle(common.readString());
    }
}
