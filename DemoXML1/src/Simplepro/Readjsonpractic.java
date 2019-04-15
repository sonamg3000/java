package Simplepro;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class Readjsonpractic {
    @SuppressWarnings("UnknownError")
	public static void main(String[] args) 
	{
		JSONParser p=new JSONParser();
		try {
			Object obj = p.parse(new FileReader(
                    "E:\\JavaPrograms\\DemoXML1\\src\\Simplepro\\simple3.json"));
 
            JSONObject jsonObject = (JSONObject) obj;
			String FirstName =(String)jsonObject.get("FirstName");
			String LastName= (String)jsonObject.get("LastName");
			String Age=(String)jsonObject.get("Age");
			String Gender=(String)jsonObject.get("Gender");
			JSONArray companyList = (JSONArray) jsonObject.get("Company List");
			
			System.out.println("FirstName: "+ FirstName);
            System.out.println("LastName: " +LastName);
			System.out.println("Age:"+Age);
			System.out.println("Gender:"+Gender);
            System.out.println("\nCompany List:"); 
			Iterator<String> iterator = companyList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
 
        } catch (Exception e) {
            e.printStackTrace();
             
        }

	
	}
	
	

}

