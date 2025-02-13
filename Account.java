public class Account {
    double value;
    double sake;
    double deposit;
    String name;

    public void setValue(double accountValue) {
        this.value = accountValue;
    }

    public void setSake(double accountSake){
        this.sake = accountSake;
    }

    public void setDeposit(double accountDeposit){
        this.deposit = accountDeposit;
    }

    public void setName(String accountName){
        this.name = accountName;
    }

    public double getValue(){
        return value;
    }

    public double getSake(){
        return sake;
    }

    public double getDeposit(){
        return deposit;
    }

    public String getName(){
        return name;
    }

    private void checkBalance(){
        if (value < sake){
            System.out.println("You have insufficient funds");
        } else {
            System.out.println("Sake is available");
        }
    }

    public void withdraw(double amount){
        if(value >= amount){
            value -= amount;
            System.out.printf("You have withdrawn %.2f from your account%n", amount);
        } else {
            System.out.println("Insufficient funds");
        }
    }

    public double getBalance(){
        return value - sake + deposit;
    }





}

