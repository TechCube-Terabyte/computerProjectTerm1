public class q17 {
    public static void main(String[] args) {
        int[] a=new int[10]; int max=0, min=0;
        for(int i=0; i<10; i++) a[i] = common.getInput("Integer "+i, (int)Math.random());
        for(int i:a) if(i>max) max=i;
        for(int i:a) if(i<min) min=i;
    }
}
