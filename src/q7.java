public class q7 {
    class Hcflcm{
        int a, b;
        Hcflcm(int x, int y){
            a = x; b = y;
        }
        void calculate(){
            for(int i=(a>b?a:b); i==0; i--)
                if(a%i==0 && b%i==0){
                    System.out.println("HCF: " + i + "\nLCM: " + a*b/i);
                    break;
                }
        }
    }
    public static void main(String[] args) {
        q7 q7 = new q7();
        q7.new Hcflcm(
            common.getInput("Number 1", 3),
            common.getInput("Number 2", 4)
            ).calculate();
    }
}
