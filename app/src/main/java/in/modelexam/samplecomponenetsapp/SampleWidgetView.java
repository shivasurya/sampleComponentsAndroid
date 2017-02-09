package in.modelexam.samplecomponenetsapp;

import android.content.DialogInterface;
import android.os.Bundle;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.CheckBox;
import android.widget.CompoundButton;
import android.widget.EditText;
import android.widget.ProgressBar;
import android.widget.RadioButton;
import android.widget.RadioGroup;
import android.widget.RatingBar;
import android.widget.Spinner;
import android.widget.Switch;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.ToggleButton;

public class SampleWidgetView extends AppCompatActivity
{
    private TextView sampleTextview;
    private EditText sampleEditTextView;
    private ToggleButton sampleToggleButton;
    private CheckBox sampleCheckBox1, sampleCheckBox2;
    private RadioGroup sampleRadioGroup;
    private RadioButton sampleMale,sampleFemale;
    private Spinner sampleSpinner;
    private ProgressBar sampleCircular, sampleHorizontal;
    private RatingBar sampleRatingbar;
    private Switch sampleSwitch;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_acitivity);
        loadAllViews();
        registerListeners();
    }

    private void loadAllViews(){
        sampleTextview      = (TextView)     findViewById(R.id.textviewsample);
        sampleEditTextView  = (EditText)     findViewById(R.id.edittextsample);
        sampleToggleButton  = (ToggleButton) findViewById(R.id.togglebuttonsample);
        sampleCheckBox1     = (CheckBox)     findViewById(R.id.checkbox1);
        sampleCheckBox2     = (CheckBox)     findViewById(R.id.checkbox2);
        sampleRadioGroup    = (RadioGroup)   findViewById(R.id.radiogroup);
        sampleMale          = (RadioButton)  findViewById(R.id.male);
        sampleFemale        = (RadioButton)  findViewById(R.id.female);
        sampleSpinner       = (Spinner)      findViewById(R.id.spinnersample);
        sampleCircular      = (ProgressBar)  findViewById(R.id.circular);
        sampleHorizontal    = (ProgressBar)  findViewById(R.id.horizontal);
        sampleRatingbar     = (RatingBar)    findViewById(R.id.ratingbar);
        sampleSwitch        = (Switch)       findViewById(R.id.switchsample);
    }

    private void registerListeners(){

        sampleCheckBox1.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                showDialog(String.valueOf(b));
            }
        });

        sampleCheckBox2.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                showDialog(String.valueOf(b));
            }
        });

        sampleMale.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                showDialog(String.valueOf(b)+" "+sampleRadioGroup.getCheckedRadioButtonId());
            }
        });

        sampleFemale.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                showDialog(String.valueOf(b)+" "+sampleRadioGroup.getCheckedRadioButtonId());
            }
        });

        sampleSpinner.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() {
            @Override
            public void onItemSelected(AdapterView<?> adapterView, View view, int i, long l) {
                String[] value = getResources().getStringArray(R.array.array_name);
                showDialog(value[i]);
            }

            @Override
            public void onNothingSelected(AdapterView<?> adapterView) {

            }
        });

        sampleRatingbar.setNumStars(5);
        sampleRatingbar.setOnRatingBarChangeListener(new RatingBar.OnRatingBarChangeListener() {
            @Override
            public void onRatingChanged(RatingBar ratingBar, float v, boolean b) {
                showDialog("rating: "+v+"");
            }
        });

        sampleSwitch.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton compoundButton, boolean b) {
                showDialog(String.valueOf(b));
            }
        });

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

    public void textView(View view)
    {
        Toast.makeText(this,sampleTextview.getText(),Toast.LENGTH_LONG).show();
        sampleTextview.setText("new text!!");
    }

    public void edittext(View view)
    {
        Toast.makeText(this,sampleEditTextView.getText(),Toast.LENGTH_LONG).show();
    }

    public void toggleClick(View view)
    {
        Toast.makeText(this,"toggle clicked",Toast.LENGTH_LONG).show();
        //sampleToggleButton.setChecked(true);
    }
}
