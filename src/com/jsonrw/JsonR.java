package com.jsonrw;


import com.jsonrw.jsonDataP.DataLoader;
import com.google.gson.Gson;



import java.io.IOException;

import java.nio.charset.Charset;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Paths;


/**
 * Created by Toni P on 4/21/2015.
 */
public class JsonR {
    public void JustDoIt() {

        final Gson gson = new Gson();
        String json = new String();
        try{json = readFile("c:\\AndroidProjects\\OUTPUT\\test.json", StandardCharsets.UTF_8);}catch (Exception e){}

        DataLoader data = gson.fromJson(json, DataLoader.class);



    }
    static String readFile(String path, Charset encoding)
            throws IOException
    {
        byte[] encoded = Files.readAllBytes(Paths.get(path));
        return new String(encoded, encoding);
    }
}
