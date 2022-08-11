public class q16 {
    public static void main(String[] args) {
        int[] a=new int[10];
        for(int i=0; i<10; i++) a[i] = common.getInput("Integer "+i, 100+i);
        for(int n:a) if(n>99); else{
            System.out.println(n+" isn't a 3-digit number"); System.exit(0);
        }
        System.out.println("All numbers are 3-digit.");
    }
}
