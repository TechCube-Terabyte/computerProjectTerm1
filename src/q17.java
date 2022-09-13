public class q17 {
    public static void main(String[] args) {
        int[] a=new int[10]; int max=0, min=0;
        for(int i=0; i<10; i++){
            a[i] = common.getInput("Integer "+(i+1), (int)(Math.random()*100));
            if(a[i]>max) max=i; if(a[i]<min) min=i;
        }
        System.out.print("Input:\t"); common.printArray(a);
        System.out.println(); int tmp=a[max]; a[max]=a[min]; a[min]=tmp;
        System.out.print("Output:\t"); common.printArray(a);
    }
}
