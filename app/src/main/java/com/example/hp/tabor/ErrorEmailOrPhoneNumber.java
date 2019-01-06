package com.example.hp.tabor;

import android.app.Activity;
import android.app.AlertDialog;
import android.app.Dialog;
import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentTransaction;
import android.support.v7.app.AppCompatDialogFragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

public class ErrorEmailOrPhoneNumber extends AppCompatDialogFragment {
    ImageButton exit_error;

    @Override
    public Dialog onCreateDialog(Bundle savedInstanceState){
        View v = LayoutInflater.from(getActivity())
                .inflate(R.layout.empty_login,null);

        exit_error = (ImageButton) v.findViewById(R.id.exit_error_login);


        exit_error.setOnClickListener(new Button.OnClickListener() {
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

