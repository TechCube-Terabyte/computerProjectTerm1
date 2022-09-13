import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public interface common{
    /**
     * @param prompt        String to prompt user with
     * @param defaultValue  Value to be returned if no input is supplied
     * @return  Input of type int
     */
    static int getInput(String prompt, int defaultValue){
        while (true) {
            //BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(prompt+" ["+defaultValue+"]: "); String a = readString();
            try {
                return Integer.parseInt(a);
            } catch (NumberFormatException e) {
                if (a.isEmpty()) return defaultValue;
                else System.out.println("\u001B[31mError:\u001B[0m Value entered isn't an Integer");
            }
        }
    }
    /**
     * @param prompt        String to prompt user with
     * @param defaultValue  Value to be returned if no input is supplied
     * @return  Input of type int
     */
    static char getInput(String prompt, char defaultValue){
        while (true) {
            System.out.print(prompt+" ["+defaultValue+"]: "); String a = readString();
            if (a.isEmpty()) return defaultValue;
            else if(a.length()>1) System.out.println("\u001B[31mError:\u001B[0m Value entered must be single Character");
            else return a.charAt(0);
        }
    }
    static int getLimitedInput(String prompt, int min, int max, int defaultValue){
        while (true) {
            int a = getInput(prompt+" [Bounds: "+min+" to "+max+"]", defaultValue);
            if(a<=min || a>=max) System.out.println("\u001B[31mError:\u001B[0m Input must be between " + min + " and " + max);
            else return a;
        }
    }
    static String readString(){
        try {
            BufferedReader s = new BufferedReader(new InputStreamReader(System.in)); return s.readLine().trim();
        } catch (IOException e) {
            return "ERROR";
        }
    }
    static void printArray(int[] a) { for(int i=0; i<10; i++) System.out.print(a[i]+" ");}
    static void printArray(String[] a) { for(int i=0; i<10; i++) System.out.print(a[i]+" ");}
}