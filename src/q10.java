public class q10 {
    static void initials(String name){
        System.out.print(name.toUpperCase().charAt(0));
        for(int i=0; i<name.length()-1; i++)
            if (name.charAt(i)==' ') System.out.print("."+name.toUpperCase().charAt(i+1));
    }
    public static void main(String[] args) {
        System.out.print("Name: ");
        initials(common.readString());
    }
}
