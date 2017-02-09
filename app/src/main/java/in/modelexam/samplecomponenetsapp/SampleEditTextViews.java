package in.modelexam.samplecomponenetsapp;

import android.content.DialogInterface;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class SampleEditTextViews extends AppCompatActivity {

    private EditText samplePersonEditText;
    private EditText samplePasswordEditText;
    private EditText sampleNumericPasswordEditText;
    private EditText sampleEmailEditText;
    private EditText samplePhoneNumberEditText;
    private EditText samplePostalAddressEditText;
    private EditText sampleMultiLineEditText;
    private EditText sampleTimeEditText;
    private EditText sampleDateEditText;
    private EditText sampleNumberSignedEditText;
    private EditText sampleNumberDecimalEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_edit_text_views);
        loadAllViews();
    }
    private void loadAllViews(){
        samplePersonEditText            = (EditText) findViewById(R.id.personNameView);
        samplePasswordEditText          = (EditText) findViewById(R.id.passwordView);
        sampleNumericPasswordEditText   = (EditText) findViewById(R.id.numericPasswordView);
        sampleEmailEditText             = (EditText) findViewById(R.id.emailView);
        samplePhoneNumberEditText       = (EditText) findViewById(R.id.phoneView);
        samplePostalAddressEditText     = (EditText) findViewById(R.id.addressView);
        sampleMultiLineEditText         = (EditText) findViewById(R.id.multilineView);
        sampleTimeEditText              = (EditText) findViewById(R.id.timeView);
        sampleDateEditText              = (EditText) findViewById(R.id.dateView);
        sampleNumberSignedEditText      = (EditText) findViewById(R.id.numberView);
        sampleNumberDecimalEditText     = (EditText) findViewById(R.id.numberDecimalView);
    }

    public void numDecimalClick(View view) {
        if(sampleNumberDecimalEditText.getText().length() > 0) {
            showDialog(sampleNumberDecimalEditText.getText().toString());
        }
    }

    public void numSignedClick(View view) {
        if(sampleNumberSignedEditText.getText().length() > 0) {
            showDialog(sampleNumberSignedEditText.getText().toString());
        }
    }

    public void dateClick(View view) {
        if(sampleDateEditText.getText().length() > 0) {
            showDialog(sampleDateEditText.getText().toString());
        }
    }

    public void timeClick(View view) {
        if(sampleTimeEditText.getText().length() > 0) {
            showDialog(sampleTimeEditText.getText().toString());
        }
    }

    public void multilineClick(View view) {
        if(sampleMultiLineEditText.getText().length() > 0) {
            showDialog(sampleMultiLineEditText.getText().toString());
        }
    }

    public void postalClick(View view) {
        if(samplePostalAddressEditText.getText().length() > 0) {
            showDialog(samplePostalAddressEditText.getText().toString());
        }
    }

    public void phoneNumberClick(View view) {
        if(samplePhoneNumberEditText.getText().length() > 0) {
            showDialog(samplePhoneNumberEditText.getText().toString());
        }
    }

    public void passwordClick(View view) {
        if(samplePasswordEditText.getText().length() > 0) {
            showDialog(samplePasswordEditText.getText().toString());
        }
    }

    public void numberPasswordClick(View view) {
        if(sampleNumericPasswordEditText.getText().length() > 0) {
            showDialog(sampleNumericPasswordEditText.getText().toString());
        }
    }

    public void emailClick(View view) {
        if(sampleEmailEditText.getText().length() > 0) {
            showDialog(sampleEmailEditText.getText().toString());
        }
    }

    private void showDialog(String message){
        AlertDialog.Builder alertDialogBuilder = new AlertDialog.Builder(this);
        alertDialogBuilder.setMessage(message);
        alertDialogBuilder.setPositiveButton("OKAY",
                new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface arg0, int arg1) {

                    }
                });

        AlertDialog alertDialog = alertDialogBuilder.create();
        alertDialog.show();
    }

    public void personEditText(View view) {
        if(samplePersonEditText.getText().length() > 0) {
            showDialog(samplePersonEditText.getText().toString());
        }
    }
}
