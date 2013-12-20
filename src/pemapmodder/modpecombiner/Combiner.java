package pemapmodder.modpecombiner;

import java.io.BufferedReader;
import java.io.OutputStream;
import java.io.OutputStreamWriter;

import android.app.Activity;
import android.content.res.AssetManager;

public class Combiner extends Object{

	public final static int newLevel=0,leaveGame=1;
	protected OutputStreamWriter output;
	protected Activity app;
	protected int[] usedFxs={};
	protected final String inited;
	public Combiner(Activity in1, OutputStream out) throws Exception {
		this.app=in1;
		AssetManager assets=in1.getAssets();
		this.inited=Utils.readFile(new BufferedReader(new java.io.InputStreamReader(assets.open("init_script.js"))));
		this.output=new OutputStreamWriter(out);
		this.output.append(inited);
	}

}
