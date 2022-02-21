package coreJavaQuestions;

class Details{
    private String name;
    private String email;
    private String phone_no;

    public void setName(String name){
        this.name = name;
    }
    public void setEmail(String email){
        this.email = email;
    }
    public void setPhone(String phone){
        this.phone_no = phone;
    }

    public String getName(){
        return name;
    }
    public String getEmail(){
        return email;
    }
    public String getPhone(){
        return phone_no;
    }
}
public class ques2 {

    public static void main(String[] args) { 
        Details dt = new Details();
        dt.setEmail("jayeshsingh001@gmail.com");
        dt.setName("Jayesh Singh");
        dt.setPhone("6377942860");

        System.out.println("The details are: \n"+dt.getName()+ "\n"+dt.getEmail()+ "\n"+dt.getPhone());
    }

}
