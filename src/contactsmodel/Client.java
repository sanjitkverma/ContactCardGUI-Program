/**
 * The client file uses setter and getter methods to modify
 * the properties of the GUI and data file. It also outputs the contents
 * of the client object using the toString() and System.println() methods
 * @author Sanjit Verma
 * @since 2/19/2020
 * @param firstname to modify the firstname for the GUI and data file
 * @param lastname to modify and set the lastname for the GUI
 * @param gender to hold and modify the data for the file
 * @param age   to hold and modify the age for the file
 * @param phone to hold and modify the phone numbers for the file
 * @param email to hold and modify the email for the file
 */
package contactsmodel;
public class Client {
    public String firstname;
    public String lastname;
    public String gender;
    public int age;
    public String phone;
    public String email;

public Client(String firstnames, String lastnames, String genders, int age, String phonenum, String emails){
    firstname = firstnames;
    lastname = lastnames;
    gender = genders;
    this.age = age;
    this.phone = phonenum;
    this.email = emails;
    }
//for gender
public String getGender() {
        return gender;
    }
public void setGender(String gender) {
        this.gender = gender;
    }


//for first name
public String getFirstname() {
        return firstname;
    }
public void setFirstname(String firstname) {
        this.firstname = firstname;
    }


//for lastname
public String getLastname() {
        return lastname;
    }
public void setLastname(String lastname) {
        this.lastname = lastname;
    }


//for age
public int getAge() {
        return age;
    }
public void setAge(int age) {
        this.age = age;
    }


//for email
public String getEmail() {
        return email;
    }
public void setEmail(String email) {
        this.email = email;
    }


//for phone
public String getPhone() {
        return phone;
    }
public void setPhone(String phone) {
        this.phone = phone;
    }


//format for GUI
public String toString(){
        return String.format("%-20s%-20s%-40s%30s%20s%30s", firstname, lastname, gender, age, phone, email);
    }
}