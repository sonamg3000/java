package Simplepro;

import java.util.HashMap;
import java.util.Map;

import org.json.simple.JSONObject;

public class simplejsonobject {

	public static void main(String[] args)
			 {
		Map<Object, Object> dataMap = new HashMap<Object,Object>();
	
	 
	dataMap.put ("name", "Sonam");
	dataMap.put ("age", new Integer(25));
	dataMap.put ("Salary", new Double(5000.99));
	dataMap.put ("employed", new Boolean(true));
	dataMap.put ("job", "Testing");
	
	JSONObject jsonObj = new JSONObject(dataMap);

	System.out.print("Encoding from JAVA to JSON: ");
	System.out.print(jsonObj);
	}	

	}


