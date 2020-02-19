/**
 * The contactslist file implements the methods for the ContactList class according to the UML Class Diagram
 * @author Sanjit Verma
 * @since 2/19/2020
 * @param listname for new string
 * @param contacts for new arraylist and modify it
 */
package contactsmodel;// imports
import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;
//create new array list
public class ContactList {
    private String listName;
    private ArrayList<Client> contacts;

    public ContactList(){
        listName = "";
        contacts = new ArrayList<>();

    }
    public String getListName() {
        return listName;
    }
    public void setListName(String listname) {
        this.listName = listname;
    }
    public Client getContact (int index){
        return contacts.get(index);
    }
    public int size(){
        return contacts.size();
    }
    public void deleteContact(int index){
        contacts.remove(index);
    }
    public void addContact(Client client){
        contacts.add(client);
    }
    public void loadContacts(String filename){
        try{
            Scanner read = new Scanner(new File(filename));
            listName = read.nextLine();
            while(read.hasNext()){
                String[] info = read.nextLine().split(",");
                Client client = new Client(info[0], info[1], info[2], Integer.parseInt(info[3]), info[4], info[5]);
                contacts.add(client);
            }
        }
        catch(FileNotFoundException ex){
            System.out.println("Error No file");
        }

    }
//contact save method
public void saveContacts(String filename){
        try{
            PrintWriter write = new PrintWriter(new File(filename));
            write.print(this.toString());
            write.close();
        }
        catch(FileNotFoundException ex){
            System.out.println("File Incorrect");
        }
    }
public String toString(){
        String s = "";
        int i = 0;
        while(i < size()){
            s += contacts.get(i) + System.lineSeparator();
            i++;
        }
        return listName + System.lineSeparator() + s;
    }
}


