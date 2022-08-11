public class q6 {
    class Profit_Loss{
        int cp, sp;
        Profit_Loss(){
            cp = 0; sp = 0;
        }
        void input(int a, int b){
            cp = a; sp = b;
        }
        void display(){
            input(
                common.getInput("Cost price", 100),
                common.getInput("Selling price", 200)
                );
            if(sp>cp) System.out.println("Profit percent: " + ((sp-cp)*cp)/100.0);
            else System.out.println("Loss percent: " + ((cp-sp)*cp)/100.0 + "%");
        }
    }
    public static void main(String[] args) {
        q6 q6 = new q6();
        q6.new Profit_Loss().display();
    }
}
