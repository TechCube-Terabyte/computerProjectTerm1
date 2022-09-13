public class q19 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i=0; i<10; i++) a[i] = common.getInput("Integer "+(i+1), (int)(Math.random()*100));
        for(int i=9; i>=0; i--) System.out.print(a[i] + " ");
    }
}
