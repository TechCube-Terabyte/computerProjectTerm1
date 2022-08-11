public class q8 {
    class Population{
        float p, r;
        Population(int a, int b){
            p = a; r = b;
        }
        void print(){
            System.out.println("Year\tPopulation\n");
            for(int i=1; i<=7; i++) System.out.println("200"+i+"\t"+(int)(p*Math.pow(1+(r/100.0), i)));
        }
    }
    public static void main(String[] args) {
        q8 q8 = new q8();
        q8.new Population(
            common.getInput("Population at the beginning of 2001", 100),
            common.getInput("Rate of growth", 5)
            ).print();
    }
}
