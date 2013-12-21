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
	public static long isInArray(Object[] array, Object item){
		for(int i=0;i<array.length;i++){
			if(array[i].equals(item)){
				return i;
			}
		}
		return -1;
	}
	public static int toInt(String in)throws Exception{//just found out that Integer.getInteger() can be used
		int l=in.length();
		int result=0;
		for(int i=l;i>=0;i--){
			char c=in.charAt(i);
			if((int)c>(int)'9'||(int)'0'>(int)c)throw new Exception("NaN");
			result+=((int)c-(int)'0')*10^(l-i);
		}
		return result;
	}
	public static String toStr(long in){//just found out that Integer.toString() can be used
		int l=Math.floor(Math.log(in))+1;
		String result="";
		for(int i=l-1;i>=0;i--){
		 result+=(in/(10^i))%10+(int)'0';
		}
		return result;
	}

}
