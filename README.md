# Computer Project Term 1
### Soham Mishra

## Question 1
```java
public class q1 {
    static void polygon(int n, char ch){
        for(int i=0; i<n; i++){
            for(int j=0; j<n; j++) System.out.print(ch);
            System.out.println();
        }
    }
    static void polygon(int x, int y){
        for(int i=0; i<x; i++){
            for(int j=0; j<y; j++) System.out.print('@');
            System.out.println();
        }
    }
    static void polygon(){
        System.out.println("*\n**\n***");
    }
    public static void main(String[] args){
        System.out.println("Functions:\n\t"+
        "1. void polygon(int n, char ch)\n\t"+
        "2. void polygon(int x, int y)\n\t"+
        "3. void polygon()"
        );
        switch(common.getInput("Function to execute", 1)){
            case 1: polygon(common.getInput("Length of side", 5), common.getInput("Character", '+')); break;
            case 2: polygon(common.getInput("Length", 5), common.getInput("Breadth", 10)); break;
            case 3: polygon();
        }
    }
}
```
| Variable | Type | Description |
|----------|------|-------------|
| n | int | Length of side |
| ch | char | Character |
| x | int | Length |
| y | int | Breadth |
Output:
    Functions:
            1. void polygon(int n, char ch)
            2. void polygon(int x, int y)
            3. void polygon()
    Function to execute [1]:
    Length of side [5]: 
    Character [+]: 
    +++++
    +++++
    +++++
    +++++
    +++++

    Function to execute [1]: 2
    Length [5]: 
    Breadth [10]: 
    @@@@@@@@@@
    @@@@@@@@@@
    @@@@@@@@@@
    @@@@@@@@@@
    @@@@@@@@@@

    Function to execute [1]: 3
    *
    **
    ***
## Question 2
```java
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
```
| Variable | Type | Description |
|----------|------|-------------|
| d1 | int | Discount |
| d2 | int | Discount |
| d3 | int | Discount |

## Question 3
```java
public class q3 {
    /**
     * @param n Number to operate on
     * @return  1 if n is pronic else returns 0
     */
    static int Pronic(int n){
        for(int i=0; i<n; i++) if(i*(i+1)==n) return 1;
        return 0;
    }
    public static void main(String[] args) {
        if(Pronic(common.getInput("Number", 12))==1) System.out.println("Number is pronic");
        else System.out.println("Number is not pronic");
    }
}
```
| Variable | Type | Description |
|----------|------|-------------|
| n | int | Number |
## Question 4
```java
public class q4 {
    class Account {
        String acctno; int balance;
        int interest(int amt, int roi){
            return (int) ((amt*roi)/100.0);
        }
        void display(){
            System.out.println("Balance: "+balance+"\nAccount no.: "+acctno);
        }
        void updateBalance(int amt, int rate){
            balance += interest(amt, rate);
        }
    }
}
```
| Variable | Type | Description |
|----------|------|-------------|
| amt | int | Amount |
| rate | int | Rate |
| acctno | String | Account no. |
| balance | int | Balance |
## Question 5
```java
public class q5 {
    static int Armstrong(int n){
        int a=0;
        for(int i=0; i<String.valueOf(n).length(); i++)
            a+=Math.pow(
                Character.getNumericValue(String.valueOf(n).charAt(i)),
                String.valueOf(n).length()
                );
        if(a==n) return 1;
        else return 0;
    }
    public static void main(String[] args) {
        if(Armstrong(common.getInput("Number", 153))==1)
            System.out.println("Number is armstrong");
        else System.out.println("Number is not armstrong");
    }
}
```
## Question 6
```java
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
```
| Variable | Type | Description |
|----------|------|-------------|
| cp | int | Cost price |
| sp | int | Selling price |

## Question 7
ERR
```java
public class q7 {
    class Hcflcm{
        int a, b;
        Hcflcm(int x, int y){
            a = x; b = y;
        }
        void calculate(){
            for(int i=(a>b?a:b); i>0; i--)
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
```
## Question 8
```java
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
```
| Variable | Type | Description |
|----------|------|-------------|
| p | int | Population at the beginning of 2001 |
| r | int | Rate of growth |
## Question 9
```java
public class q9 {
    static void wordTriangle(String word){
        for(int i=word.length()-1; i>=0; i--){
            for(int j=i; j<word.length(); j++) System.out.print(word.charAt(j));
            System.out.println();
        }

    }
    public static void main(String[] args) {
        System.out.print("String: ");
        wordTriangle(common.readString());
    }
}
```
| Variable | Type | Description |
|----------|------|-------------|
| word | String | Word |
## Question 10
```java
public class q10 {
    static void initials(String name){
        System.out.print(name.toUpperCase().charAt(0));
        for(int i=0; i<name.length()-1; i++)
            if (name.charAt(i)==' ') System.out.print("."+name.toUpperCase().charAt(i+1));
    }
    public static void main(String[] args) {
        System.out.print("Name: ");
        initials(common.readString());
    }
}
```
| Variable | Type | Description |
|----------|------|-------------|
| name | String | Name |
## Question 11
```java
public class q11 {
    public static void main(String[] args) {
        System.out.print("String: "); String a = common.readString();
        for (int i=0; i<a.length(); i++){
            if(Character.isUpperCase(a.charAt(i))) System.out.print(a.toLowerCase().charAt(i));
            else System.out.print(a.toUpperCase().charAt(i));
        }
    }
}
```
| Variable | Type | Description |
|----------|------|-------------|
| a | String | String |
## Question 12
```java
public class q12 {
    static boolean Palin(String a){
        StringBuffer s = new StringBuffer(a);
        return (s.reverse().toString().equals(a));
    }
    public static void main(String[] args) {
        System.out.print("String: ");
        if(Palin(common.readString())) System.out.println("String is a palindrome");
        else System.out.println("String is not a palindrome");
    }
}
```
| Variable | Type | Description |
|----------|------|-------------|
| a | String | String |
| s | StringBuffer | Variable to reverse |
## Question 13
```java
public class q13 {
    public static void main(String[] args) {
        System.out.print("String: "); String a = common.readString().toLowerCase();
        for (String word: a.split(" ")){
            StringBuffer s = new StringBuffer(word);
            if(s.reverse().toString().equals(word)) System.out.print(word+" ");
            s.setLength(0);
        }
    }
}
```
| Variable | Type | Description |
|----------|------|-------------|
| a | String | String |
| s | StringBuffer | Variable to reverse |
## Question 14
```java
public class q14 {
    public static void main(String[] args) {
        System.out.print("String: "); String[] a = common.readString().split(" ");
        for (int i=a.length-1; i>=0; i--)
            System.out.print(a[i] + " ");
    }
}
```
| Variable | Type | Description |
|----------|------|-------------|
| a | String | String |
## Question 15
```java
public class q15 {
    public static void main(String[] args) {
        System.out.println("String: ");
        String[] a=common.readString().split(" ");
        for(String word:a) System.out.print((word.toLowerCase()=="blue")?"red ":word+" ");
    }
}
```
| Variable | Type | Description |
|----------|------|-------------|
| a | String[] | String array |
## Question 16
```java
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
```
| Variable | Type | Description |
|----------|------|-------------|
| a | int[] | Integer array |
## Question 17
```java
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
```
| Variable | Type | Description |
|----------|------|-------------|
| a | int[] | Integer array |
| max | int | Maximum value |
| min | int | Minimum value |
## Question 18
```java
public class q18 {
    public static void main(String[] args) {
        String[] w = {"Chichén Itzá", "Christ the Redeemer", "Taj Mahal", "Great Wall of China", "Machu Picchu", "Petra", "Colosseum"};
        String[] c = {"Mexico", "Brazil", "India", "China", "Peru", "Jordan", "Italy"};
        System.out.print("Country: "); String a=common.readString();
        for(int i=0;i<c.length;i++) if(c[i].equals(a)){
            System.out.println(w[i]); System.exit(0);
        }
        System.out.println("Sorry not found!");
    }
}
```
| Variable | Type | Description |
|----------|------|-------------|
| w | String[] | Wonders of the world |
| c | String[] | Country array |
| a | String | String |
## Question 19
```java
public class q19 {
    public static void main(String[] args) {
        int[] a = new int[10];
        for(int i=0; i<10; i++) a[i] = common.getInput("Integer "+(i+1), (int)(Math.random()*100));
        for(int i=9; i>=0; i--) System.out.print(a[i] + " ");
    }
}
```
| Variable | Type | Description |
|----------|------|-------------|
| a | int[] | Integer array |
## Question 20
```java
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
```
| Variable | Type | Description |
|----------|------|-------------|
| a | String[] | String array |
## common.java
```java
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
public interface common{
    /**
     * @param prompt        String to prompt user with
     * @param defaultValue  Value to be returned if no input is supplied
     * @return  Input of type int
     * @throws IOException
     */
    static int getInput(String prompt, int defaultValue){
        while (true) {
            //BufferedReader s = new BufferedReader(new InputStreamReader(System.in));
            System.out.print(prompt+" ["+defaultValue+"]: "); String a = readString();
            try {
                return Integer.parseInt(a);
            } catch (NumberFormatException e) {
                if (a.isEmpty()) return defaultValue;
                else printError("Value entered isn't an Integer");
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
            else if(a.length()>1) printError("Value entered must be single Character");
            else return a.charAt(0);
        }
    }
    static int getLimitedInput(String prompt, int min, int max, int defaultValue){
        while (true) {
            int a = getInput(prompt+" [Bounds: "+min+" to "+max+"]", defaultValue);
            if(a<=min || a>=max) printError("Input must be between " + min + " and " + max);
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
    static void printError(String s) { System.out.println("\u001B[31mError:\u001B[0m "+s);}
    static void printArray(int[] a) { for(int i=0; i<10; i++) System.out.print(a[i]+" ");}
    static void printArray(String[] a) { for(int i=0; i<10; i++) System.out.print(a[i]+" ");}
}
```