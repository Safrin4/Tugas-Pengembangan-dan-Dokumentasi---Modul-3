package Modul3;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import javax.swing.*;

public class No3_SerializationApp {
    public static void main(String[] args) throws ClassNotFoundException, IOException {
        List<Participant> participants = new ArrayList<Participant>();

        String first = null, last = null, age;
        int g = 0;

                first = JOptionPane.showInputDialog("Masukkan Nama Depan!");
                last = JOptionPane.showInputDialog("Masukkan Nama Belakang!");
                age = JOptionPane.showInputDialog("Masukkan Umur!");
                g = Integer.parseInt(age);

        System.out.println("Participant: "+ participants +"\n");

        SerializationDemo demo = new SerializationDemo();
        demo.serialize(participants, "E:/Sister/src/ParticipantDataInput.ser");
        System.out.println("Serialization is Done\n");

        System.out.println("Deserialize Object...");
        List<Participant> newList = demo.deserialize("E:/Sister/src/ParticipantDataInput.ser");
        System.out.println("New List: "+newList);
    }
}
