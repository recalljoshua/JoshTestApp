package org.josh.test.service;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.josh.test.model.Employee;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;

public class EmployeeService {	
	String url = "http://s3-ap-southeast-1.amazonaws.com/fundo/js/profiles.json";
	
	public List<Employee> getAll() {
		try {
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			
			int responseCode = con.getResponseCode();
			if (responseCode == 200) {
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();
				while((inputLine = in.readLine()) != null)
				{
					response.append(inputLine);
				}
				in.close();
	
				Gson gson = new Gson();
				//System.out.println(response.toString()); // JSON STRING from the URL
				List<Employee> list = gson.fromJson(response.toString(), new TypeToken<List<Employee>>(){}.getType());
	
//				for(Employee x:list) {
//					System.out.println(x.getEmail());
//		            System.out.println(x.name.getFirst());
//					System.out.println(x.name.getMiddle());
//					System.out.println(x.name.getLast());
//					System.out.println("\n \n");
//		        }
				
				return list;
			} else {
				return null;
			}
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
	}
	
	public Employee getEmployee(String id) {
		try {
			
			URL obj = new URL(url);
			HttpURLConnection con = (HttpURLConnection) obj.openConnection();
			
			int responseCode = con.getResponseCode();
			if (responseCode == 200) {
				BufferedReader in = new BufferedReader(new InputStreamReader(con.getInputStream()));
				String inputLine;
				StringBuffer response = new StringBuffer();
				while((inputLine = in.readLine()) != null)
				{
					response.append(inputLine);
				}
				in.close();
	
				Gson gson = new Gson();
				//System.out.println(response.toString()); // JSON STRING from the URL
				List<Employee> list = gson.fromJson(response.toString(), new TypeToken<List<Employee>>(){}.getType());
				
				for(Employee x:list) {
					if (id.equals(x.getId())) {
						System.out.println(x.getAddress());
						return x;
					}
		        }
			} else {
				return null;
			}
		} catch (Exception e) {
			System.out.println(e);
			return null;
		}
		return null;
	}
}
