package com.team404.uconnect;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;

public class SplashScreen extends Activity {
	private Button loginButton;
	private Button signUpButton;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		setButtons();
	}
	private void setButtons() {
		//login button settings
		loginButton = (Button) findViewById(R.id.loginButton);
		loginButton.setText("Login");
		loginButton.setOnClickListener(loginListener);
		
		//sign up button settings
		
		signUpButton = (Button)findViewById(R.id.signUpButton);
		signUpButton.setText("Sign Up");
		signUpButton.setOnClickListener(signUpListener);
	}
	private OnClickListener loginListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
		}
	}; 
	
	private OnClickListener signUpListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// TODO Auto-generated method stub
			
		}
	};
}
