public class q11 {
    public static void main(String[] args) {
        System.out.print("String: "); String a = common.readString();
        for (int i=0; i<a.length(); i++){
            if(Character.isUpperCase(a.charAt(i))) System.out.print(a.toLowerCase().charAt(i));
            else System.out.print(a.toUpperCase().charAt(i));
        }
    }
}
