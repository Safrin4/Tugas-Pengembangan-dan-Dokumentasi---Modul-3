package Modul3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

public class PartisipantSer implements Serializable {
    private String firstName;
    private String lastName;
    private int age;

    public PartisipantSer(String firstName, String lastName, int age){
        this.firstName=firstName;
        this.lastName=lastName;
        this.age=age;
    }

    public void printData(){
        System.out.println("Nama\t: "+firstName+" "+lastName);
        System.out.println("Usia\t: "+age);
    }

    public void saveObject(PartisipantSer Obj){
        try{
            FileOutputStream fos = new FileOutputStream("E:/Sister/src/data.ser");
            ObjectOutputStream ous = new ObjectOutputStream(fos);
            ous.writeObject(Obj);
            ous.flush();
            ous.close();
        }catch(IOException ioe){
            System.out.println("A problem accured during serialize.\n"+ioe.getMessage());
        }
    }

    public void readObject(PartisipantSer Obj) throws ClassNotFoundException{
        try{
            FileInputStream fis = new FileInputStream("E:/Sister/src/data.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);
            Obj = (PartisipantSer) ois.readObject();
            Obj.printData();
            fis.close();
        }catch(IOException ex){
            System.out.println("A problem occured during serialize.\n"+ex);
            System.exit(1);
        }
    }

    public static void main(String[] args) throws ClassNotFoundException {
        PartisipantSer is = new PartisipantSer("Dee","aja",22);
        is.saveObject(is);
        is.readObject(is);
    }
}
