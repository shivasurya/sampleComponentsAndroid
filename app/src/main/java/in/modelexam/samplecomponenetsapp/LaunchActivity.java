package in.modelexam.samplecomponenetsapp;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class LaunchActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_launch);

    }

    public void sampleActivity(View view) {
        Intent intent = new Intent(this,SampleWidgetView.class);
        startActivity(intent);
    }

    public void videoActivity(View view) {
        Intent intent = new Intent(this,SampleVideoView.class);
        startActivity(intent);
    }

    public void imageviewActivity(View view) {
        Intent intent = new Intent(this,SampleImageView.class);
        startActivity(intent);
    }

    public void edittextActivity(View view) {
        Intent intent = new Intent(this,SampleEditTextViews.class);
        startActivity(intent);
    }

    public void webviewActivity(View view) {
        Intent intent = new Intent(this,SampleWebView.class);
        startActivity(intent);
    }
}
