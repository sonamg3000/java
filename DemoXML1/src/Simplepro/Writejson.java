package Simplepro;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

public class Writejson {
@SuppressWarnings("unchecked")
public static void main(String[] args)
	{
	JSONObject obj=new JSONObject();
	obj.put("name", "sonam");
	obj.put("location", "pune");
	
	JSONArray list=new JSONArray();
	list.add("java");
	list.add("jsp");
	list.add("servlet");
	obj.put("course", "list");
	try 
		(FileWriter file =new FileWriter("readjson.java"))
		{
		file.write(obj.toString());
		file.flush();
	}
	catch(IOException  e)
	{
	e.printStackTrace();
	}
	System.out.println(obj);
	}

	}


