public class q15 {
    public static void main(String[] args) {
        System.out.println("String: ");
        String[] a=common.readString().split(" ");
        for(String word:a) System.out.print((word.toLowerCase()=="blue")?"red":word);
    }
}
