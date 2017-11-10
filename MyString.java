
public class MyString {

    private String Id;
    private String firstName;
    private String lastName;


    public void setId(String id){
        this.Id = id;
    }

    public void setFristName(String firstName){
        this.firstName = firstName;
    }

    public void setLastName(String lastName){
        this.lastName = lastName;
    }

    public void setFullName(firstName, lastName) {
        // this.firstName = firstName;
        this.lastName = lastName;
    }

     public void setFullName(firstName, lastName) {
        this.firstName = "Hi " + firstName + " ";
        this.lastName = lastName;
     }

}