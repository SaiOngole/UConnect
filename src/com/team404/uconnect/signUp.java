package com.team404.uconnect;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class SignUp extends Activity{
	private EditText firstNameField;
	private EditText lastNameField;
	private EditText emailField;
	private EditText passwordField;
	private EditText confirmPasswordField;
	private String firstName;
	private String lastName;
	private String email;
	private String password;
	private String confirmPassword;
	private Button signUp;
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.splash);
		assignFields();
		readText();
		signUp = (Button)findViewById(R.id.signUp);
		signUp.setText("Sign Up");
		signUp.setOnClickListener(signUpListener);
	}
	private void assignFields() {
		firstNameField = (EditText)findViewById(R.id.firstName);
		lastNameField = (EditText)findViewById(R.id.lastName);
		emailField = (EditText)findViewById(R.id.email);
		passwordField = (EditText)findViewById(R.id.password);
		confirmPasswordField = (EditText)findViewById(R.id.confirmPassword);
	}
	private void readText() {
		 firstName = firstNameField.getText().toString();
		 lastName = lastNameField.getText().toString();
		 email = emailField.getText().toString();
		 password = passwordField.getText().toString();
		 confirmPassword = confirmPasswordField.getText().toString();
	}
	private OnClickListener signUpListener = new OnClickListener() {
		
		@Override
		public void onClick(View v) {
			// Send data to parse
			
		}
	};
}
