public class q2 {
    static int price=0;
    static double Discount(double d1){
        return price-(d1/100)*price;
    }
    static double Discount(double d1, double d2){
        return Discount(d1)-(d2/100)*Discount(d1);
    }
    static double Discount(double d1, double d2,double d3){
        return Discount(d1, d2)-(d3/100)*Discount(d1, d2);
    }
    public static void main(String[] args) {
        price = common.getInput("Price", 12000);
        System.out.println("Functions:\n\t"+
        "1. double Discount(int d1)\n\t"+
        "2. double Discount(int d1, int d2)\n\t"+
        "3. double Discount(int d1, int d2, int d3)"
        );
        switch(common.getInput("Function to execute", 1)){
            case 1: System.out.println("\u20B9"+Discount(
                common.getLimitedInput("Discount", 0, 100, 10)
                )); break;
            case 2: System.out.println("\u20B9"+Discount
                (common.getLimitedInput("Discount 1", 0, 100, 10),
                common.getLimitedInput("Discount 2", 0, 100, 10)
                )); break;
            case 3: System.out.println("\u20B9"+Discount(
                common.getLimitedInput("Discount 1", 0, 100, 10),
                common.getLimitedInput("Discount 2", 0, 100, 10),
                common.getLimitedInput("Discount 3", 0, 100, 10)
                )); break;
        }
    }
}
