package user.clses;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import org.apache.jasper.tagplugins.jstl.core.Out;

public class ReadFile {
	static HashMap<String,String> res = new HashMap<String,String>();
	public static String readFile(String args) {
		 
		BufferedReader br = null;
		String res="";
		String sCurrentLine="asdasdsad";
		//System.out.println(sCurrentLine);
		try {		
 
			br = new BufferedReader(new FileReader("C:\\Users\\e11438\\Documents\\SOFTWARES\\apache-tomcat-8.0.21\\wtpwebapps\\StarBloggers\\Files\\"+args));
 
			while ((sCurrentLine = br.readLine()) != null) {
				res+=("<br>"+sCurrentLine);
				//System.out.println(sCurrentLine);
			}
 
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			try {
				if (br != null)br.close();
			} catch (IOException ex) {
				ex.printStackTrace();
			}
		}
		//System.out.println(res);
		return res;
 
	}
	
	//method to initialize 'res' HashMap and return it
	public static HashMap<String,String> firstTen(){
		
		res = new HashMap<String,String>();
		String str = readFile("postDetails.txt");
		String[] lines = str.split("<br>");
		if(lines.length<10){
			//can't start from 0
			for(int i=1;i<lines.length;i++){
				String[] subLine = lines[i].trim().split("%%");
				if(subLine.length>1){
					res.put(subLine[0], subLine[1]);	
				}else{
					res.put("fake small", subLine.toString());
				}
			}
		}
		return res;
	}
	public String print(){
		return "sadasd";
	}

}
