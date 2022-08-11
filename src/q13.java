public class q13 {
    public static void main(String[] args) {
        System.out.print("String: "); String a = common.readString().toLowerCase();
        for (String word: a.split(" ")){
            StringBuffer s = new StringBuffer(word);
            if(s.reverse().toString().equals(word)) System.out.print(word+" ");
            s.setLength(0);
        }
    }
}
