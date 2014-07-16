package org.androidanalyzer.gui;

import org.androidanalyzer.R;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.text.method.LinkMovementMethod;
import android.widget.TextView;

/**
 *  This Activity displays the About info of the Android Analyzer application.
 *  It is shown in the About tab of the Settings activity. 
 *
 */
public class AboutActivity extends Activity {

	/*
	 * (non-Javadoc)
	 * @see android.app.Activity#onCreate(android.os.Bundle)
	 */
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		String title = getResources().getString(R.string.about_title);
		setContentView(R.layout.about_layout);
		setTitle(title);
	}
	
	

}
