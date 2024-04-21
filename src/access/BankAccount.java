package access;

public class BankAccount {

    private int balance;

    public BankAccount() {
        balance = 0;
    }

    // public Method : deposit
    public void deposit(int amount) {
        if (isAmountValid(amount)) {
            balance += amount;
        }else{
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // public Method : withraw
    public void withdraw(int amount) {
        if (isAmountValid(amount) && balance - amount >= 0) {
            balance -= amount;
        }else {
            System.out.println("유효하지 않은 금액입니다.");
        }
    }

    // 잔액
    // public 메서드: getBalance
    public int getBalance() {
        return balance;
    }

    // 검증로직
    public boolean isAmountValid(int amount) {
        // 금액이 0보다 커야함
        return amount > 0;
    }
}
