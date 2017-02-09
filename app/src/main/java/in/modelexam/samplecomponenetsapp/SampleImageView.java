package in.modelexam.samplecomponenetsapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Toast;

public class SampleImageView extends AppCompatActivity {

    private ImageView sampleImageView;
    private ImageButton sampleImageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_multimedia);
        sampleImageView = (ImageView) findViewById(R.id.imageView);
        sampleImageButton = (ImageButton) findViewById(R.id.imageButton);

        sampleImageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(getApplicationContext(),"imagebutton clicked",Toast.LENGTH_LONG).show();
                sampleImageView.setImageDrawable(getResources().getDrawable(R.drawable.sergey));
                sampleImageView.setScaleType(ImageView.ScaleType.CENTER_CROP);
            }
        });
    }
}
