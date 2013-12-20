package pemapmodder.modpecombiner;

import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import android.app.Activity;

public class Combiner extends Object{

	public class ScriptInterpreter extends Object{
		
	}
	public final static int newLevel=0,leaveGame=1;
	protected OutputStreamWriter output;
	protected Activity app;
	protected int[] usedFxs={};
	protected final String inited;
	protected String content;
	public Combiner(Activity in1, OutputStream out) throws Exception {
		this.app=in1;
		this.inited=Utils.readFile(new BufferedReader(new java.io.InputStreamReader(in1.getAssets().open("init_script.js"))));
		this.output=new OutputStreamWriter(out);
		this.content=this.inited;
	}
	public void save(){
		
	}

}
