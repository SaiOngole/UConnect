package com.team404.uconnect;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class LoginScreen extends Activity{
	private EditText emailField;
	private EditText passwordField;
	private String email;
	private String password;
	private Button login;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.login);
		assignFields();
		readText();
		login = (Button)findViewById(R.id.login);
		login.setText("Login");
		login.setOnClickListener(loginListener);

	}
	private void assignFields() {
		emailField = (EditText) findViewById(R.id.email);
		passwordField = (EditText) findViewById(R.id.password);
	}

	private void readText() {
		email = emailField.getText().toString();
		password = passwordField.getText().toString();
	}
	private OnClickListener loginListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// Authentication code here
			
		}
	};
}
