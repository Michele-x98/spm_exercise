package com.example.smp;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
/**
 * Hello world!
 *
 */
public class App 
{
   public static void main( String[] args ){
        System.out.println( "Hello World!" );
        writeJson();
    }

    public static void writeJson(){
        JSONObject first = new JSONObject();
        first.put("name", "michele");
        first.put("age", "23");

        JSONObject second = new JSONObject();
        second.put("name", "pippo");
        second.put("age", "31");
        
        JSONArray list = new JSONArray();
        list.add(first);
        list.add(second);

        try (FileWriter file = new FileWriter("object.json")) {
            file.write(list.toJSONString()); 
            file.flush();
 
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
