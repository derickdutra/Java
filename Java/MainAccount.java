import com.sun.tools.javac.Main;

public class MainAccount {
    public static void main(String[] Args){

        Account settingAccount = new Account();
        settingAccount.setValue(1500);
        settingAccount.setSake(500);
        settingAccount.setDeposit(450);
        settingAccount.setName("Derick");

        System.out.println("\nInitial Account Details..");
        System.out.printf("Account Name: %s%n", settingAccount.getName());
        System.out.printf("Account Value: %.2f%n", settingAccount.getValue());
        System.out.printf("Account Sake: %.2f%n", settingAccount.getSake());
        System.out.printf("Account Deposit: %.2f%n", settingAccount.getDeposit());
        System.out.printf("Account Balance: %.2f%n", settingAccount.getBalance());

        settingAccount.withdraw(500);
    }
}
