package week3;

public class Person {

    private String name;
    private String address;
    private Account account;

    public Person(String name , String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name){
        this.name = name;
    }

    public String getAddress() {
        return this.address;
    }

    public void setAccount(Account account){
        this.account = account;
    }

    public void showAccountDetail(){
        if(this.account.isSaving()){
            System.out.println("This is a Saving Acc");
        }else{
            System.out.println("This is a not a Saving Acc");
        }
        System.out.println("Your Acc no : "+ this.account.getAccountNumber());
        
    }
}
