public class q12 {
    static boolean Palin(String a){
        StringBuffer s = new StringBuffer(a);
        return (s.reverse().toString().equals(a));
    }
    public static void main(String[] args) {
        System.out.print("String: ");
        if(Palin(common.readString())) System.out.println("String is a palindrome");
        else System.out.println("String is not a palindrome");
    }
}
