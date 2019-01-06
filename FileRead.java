import java.util.*;
import java.io.*;
import java.util.logging.*;

public class FileRead{
	public static void main(String[] args){
	Logger logger=Logger.getLogger(FileRead.class.getName());
		try{
			File file =new File("/home/nipuna/HackerRank/test.txt");
			BufferedReader br=new BufferedReader(new FileReader(file));
			String line;
			while((line=br.readLine())!=null){
				System.out.println(line);
			}
		} catch(FileNotFoundException ex){
			logger.info(ex.toString());
		} catch(IOException ex){
			logger.info(ex.toString());	
		}
	}	

}
