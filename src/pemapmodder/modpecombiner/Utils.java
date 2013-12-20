package pemapmodder.modpecombiner;

import java.io.BufferedReader;
import java.io.File;

public class Utils {

	public static String readFile(File f)throws Exception{
		return readFile(new BufferedReader(new java.io.InputStreamReader(new java.io.FileInputStream(f))));
	}
	public static String readFile(BufferedReader reader) throws Exception{
		String result="";
		for(String line=reader.readLine(); line!=null; line=reader.readLine())result+=line;
		reader.close();
		return result;
	}

}
