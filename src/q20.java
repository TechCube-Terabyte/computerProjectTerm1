public class q20 {
    public static void main(String[] args) {
        String[] a = new String[20];
        for(int i=0; i<20; i++){
            System.out.print("Name "+(i+1)+": "); a[i]=common.readString();
        }
        for (int i=0; i<19; i++) for (int j=0; j<19-i; j++)
            if (a[j].compareToIgnoreCase(a[j+1])<0) {
                String tmp=a[j+1]; a[j+1] = a[j]; a[j] = tmp;
            }
        common.printArray(a);
    }
}
