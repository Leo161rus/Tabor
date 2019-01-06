package com.example.hp.tabor;

import android.support.design.widget.TextInputLayout;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;

public class  MainActivity extends AppCompatActivity {
    private CheckBox remember_login_and_password;
    private EditText email_Edit_Text;
    private TextInputLayout password_Text_Input;
    private Button enter_button;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        remember_login_and_password = (CheckBox)findViewById(R.id.rememberCheckBox);
        email_Edit_Text = (EditText) findViewById(R.id.emailEditText);
        password_Text_Input = (TextInputLayout) findViewById(R.id.password_layout);
        enter_button = (Button) findViewById(R.id.enter);


        remember_login_and_password.setButtonDrawable(R.drawable.button_checbox);


        enter_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    forEnter();
                }
            });


        }


                private void connectErrorValidationLogin(){
                    FragmentManager manager = getSupportFragmentManager();
                    ErrorEmailOrPhoneNumber dialog = new ErrorEmailOrPhoneNumber();
                    dialog.show(manager, "Error email empty");

                    Log.i("TAG", "Error connection");
                }


                private void connectErrorValidationPassword(){
                    FragmentManager manager = getSupportFragmentManager();
                    ErrorPassword dialog = new ErrorPassword();
                    dialog.show(manager,"Error password empty");

                    Log.i("TAG", "Error connection");
                }


                private void connectErrorValidLoginAndPassword(){
                    FragmentManager manager = getSupportFragmentManager();
                    ErrorEmailAndPassword dialog = new ErrorEmailAndPassword();
                    dialog.show(manager,"Error password empty");

                    Log.i("TAG", "Error connection");

        }

                     private void forEnter(){
                         String login = email_Edit_Text.getText().toString().trim();
                         String password = password_Text_Input.getEditText().getText().toString().trim();

                        if(login.isEmpty() & password.isEmpty())connectErrorValidLoginAndPassword();
                        else if(login.isEmpty() & !password.isEmpty())connectErrorValidationLogin();
                        else if(!login.isEmpty() & password.isEmpty())connectErrorValidationPassword();
    }


    }








