package week3;

public class Account {
    private Boolean isSaving;
    private String accountNumber;

    public Account(String accountNumber , Boolean isSaving){
        this.accountNumber = accountNumber;
        this.isSaving = isSaving;
    }

    public String getAccountNumber(){
        return this.accountNumber;
    }

    public Boolean isSaving(){
        return this.isSaving;
    }
}
