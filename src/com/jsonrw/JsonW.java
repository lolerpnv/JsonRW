package com.jsonrw;


import com.google.gson.Gson;
import com.google.gson.stream.JsonWriter;
import com.jsonrw.jsonDataP.DataObject;
import com.jsonrw.jsonDataP.Klub;

import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by Toni P on 4/21/2015.
 */
public class JsonW {
    public void JustDoIt()
    {

        FileWriter writer;
        DataObject obj = new DataObject();
        Gson gson = new Gson();


        Klub Event = new Klub();
        Event.Klub = "Old Bridge Pub";
        Event.Tekst =   "Prizemlje: Nova bend i Happy hour Osje?ko \n" +
                        "Pivnica: DJ Dance night i Happy hour Osje?ko";
        Event.Naslov = "Saturday Night Fever";
        Event.VrstaGlazbe = "Dance";
        Event.dodatno = "Ponuda pi?a od 21h: \n" +
                        "Osje?ko sv 0,5l - 5kn \n" +
                        "Medova?a 0,03l - 1kn";
        Event.pics.add("13_01.jpg");

        obj.Dan = "Subota";
        obj.Events.add(Event);


        String json = gson.toJson(obj);
        try {
            writer = new FileWriter("c:\\AndroidProjects\\OUTPUT\\test.json",false);
            writer.write(json);
            writer.close();

            System.out.println("Done");

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
