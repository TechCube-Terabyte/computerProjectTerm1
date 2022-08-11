
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
        common.printInfo("Functions:\n\t"+
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
