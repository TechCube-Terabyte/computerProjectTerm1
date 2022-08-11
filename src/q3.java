public class q3 {
    /**
     * @param n Number to operate on
     * @return  1 if n is pronic else returns 0
     */
    static int Pronic(int n){
        for(int i=0; i<n; i++) if(i*(i+1)==n) return 1;
        return 0;
    }
    public static void main(String[] args) {
        if(Pronic(common.getInput("Number", 12))==1) System.out.println("Number is pronic");
        else System.out.println("Number is not pronic");
    }
}
