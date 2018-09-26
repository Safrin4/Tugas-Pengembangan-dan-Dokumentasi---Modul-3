package Modul3;

import java.util.ArrayList;
import java.util.List;

public class SerializationApp {
    public static void main(String[] args) throws ClassNotFoundException {
        List<Participant> participants = new ArrayList<Participant>();

        participants.add(new Participant("Dee","Aja",22));
        participants.add(new Participant("Ani","Fahmi",21));
        participants.add(new Participant("Haya","Hayati",20));
        participants.add(new Participant("Aya","Hayati",19));

        System.out.println("Participant: "+ participants +"\n");

        SerializationDemo demo = new SerializationDemo();
        demo.serialize(participants, "E:/Sister/src/participantData.ser");
        System.out.println("Serialization is Done\n");

        System.out.println("Deserialize Object...");
        List<Participant> newList = demo.deserialize("E:/Sister/src/participantData.ser");
        System.out.println("New List: "+newList);
    }
}
