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
