package user.clses;

import java.io.*;

public class WriteFile{
	
	//private static int count=0;
	//String fileName=getServletContext().getRealPath("jsp.txt");
	
		public void writeFile(String str1, String str2) {
			
			String dirName = "C:\\Users\\e11438\\Documents\\SOFTWARES\\apache-tomcat-8.0.21\\wtpwebapps\\StarBloggers\\Files\\Posts";
			File dir = new File (dirName);
			try {
				long t1 = System.currentTimeMillis(); //time
				String fileName = t1+".txt";
				File actualFile = new File (dir, fileName);
				 //create the file
		      FileWriter writer = new FileWriter(actualFile); 
		      
		      //save the title of the post with file name in postDetails.txt 
		      writeFileName(t1, str1);
		      
		      // Writes the content to the file
		      writer.write(str1);
		      writer.write("\r\n");
		      writer.write("\r\n");
		      writer.write(str2); 
		      writer.flush();
		      writer.close();
			}catch(IOException e) {
				System.out.println(e);
			}
			
		}
		
		//method to write title of posts and filenames to a different file
		public static void writeFileName(long fileName, String title) {
			//count++;
			String filePath = "C:\\Users\\e11438\\Documents\\SOFTWARES\\apache-tomcat-8.0.21\\wtpwebapps\\StarBloggers\\Files\\postDetails.txt";
			String fName = "postDetails.txt";
			File dir = new File(filePath);
			
			if(!dir.exists()){
				File Pdetails = new File(dir,fName);
				//count=0;
			}
			
			 try {
				 
				    FileWriter fw = new FileWriter(dir,true); //the true will append the new data
				    fw.write(fileName+","+title);//appends the string to the file
				    fw.write("\r\n");
				    fw.close();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			    
		
		 
		}
}