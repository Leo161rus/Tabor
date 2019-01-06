package com.example.hp.tabor;

import android.app.AlertDialog;
import android.app.Dialog;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class ErrorEmailAndPassword extends AppCompatDialogFragment {
    ImageButton exit_error_email_and_password;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState) {
        View v = LayoutInflater.from(getActivity())
                .inflate(R.layout.empty_lgin_and_password, null);

        exit_error_email_and_password = (ImageButton)v.findViewById(R.id.exit_error_login_and_password);
        exit_error_email_and_password.setOnClickListener(new Button.OnClickListener() {
            @Override
            public void onClick(View v) {
                closefragment();
            }
        });

        return new AlertDialog.Builder(getActivity())
                .setView(v)
                .create();
    }

    private void closefragment(){
        getActivity().getSupportFragmentManager().beginTransaction().remove(this).commit();
    }
}
