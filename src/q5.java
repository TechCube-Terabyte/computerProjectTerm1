public class q5 {
    static int Armstrong(int n){
        int a=0;
        for(int i=0; i<String.valueOf(n).length(); i++)
            a+=Math.pow(
                Character.getNumericValue(String.valueOf(n).charAt(i)),
                String.valueOf(n).length()
                );
        if(a==n) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        if(Armstrong(common.getInput("Number", 153))==1)
            System.out.println("Number is armstrong");
        else System.out.println("Number is not armstrong");
    }
}
