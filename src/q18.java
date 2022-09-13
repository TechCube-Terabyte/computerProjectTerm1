public class q18 {
    public static void main(String[] args) {
        String[] w = {"Chichén Itzá", "Christ the Redeemer", "Taj Mahal", "Great Wall of China", "Machu Picchu", "Petra", "Colosseum"};
        String[] c = {"Mexico", "Brazil", "India", "China", "Peru", "Jordan", "Italy"};
        System.out.print("Country: "); String a=common.readString();
        for(int i=0;i<c.length;i++) if(c[i].equals(a)){
            System.out.println(w[i]); System.exit(0);
        }
        System.out.println("Sorry not found!");
    }
}
