package Modul3;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.List;

public class SerializationDemo {
    public void serialize(List<Participant> pList, String fileName) {
        try {
            ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(pList);
        }catch(IOException ex){
            System.out.println("A Problem Occured during Serialization\n"+ex.getMessage());
        }
    }

    public List<Participant> deserialize(String fileName) throws ClassNotFoundException{
        List<Participant> pList = null;
        try{
            ObjectInputStream in = new ObjectInputStream(new FileInputStream(fileName));
            pList = (List<Participant>) in.readObject();
        }catch(IOException ex){
            System.out.printf("A Problem Occured during Deserializing %s%n", fileName);
            System.out.println(ex.getMessage());
        }
        return pList;
    }
}
