package com.atltodo;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;

public class MainActivity extends Activity {
	@Override
    protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		this.setContentView(R.layout.activity_main);
		
		Intent intent = new Intent(Intent.ACTION_VIEW);
		intent.setData(Uri.parse("http://www.atltodo.com"));
		this.startActivity(intent);
		this.finish();
	}
}
