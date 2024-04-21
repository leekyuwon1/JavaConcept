package access;

public class BankAccountMain {

    public static void main(String[] args) {
        BankAccount bank = new BankAccount();

        // 입금
        bank.deposit(9000);

        //출금
        bank.withdraw(5000);

        //잔액
        System.out.println("balance : " + bank.getBalance());



    }
}

