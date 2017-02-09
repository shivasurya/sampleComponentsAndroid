package in.modelexam.samplecomponenetsapp;

import android.net.Uri;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.MediaController;
import android.widget.VideoView;

public class SampleVideoView extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sample_video_view);

        VideoView videoView =(VideoView)findViewById(R.id.videoview);

        //Creating MediaController
        MediaController mediaController= new MediaController(this);
        mediaController.setAnchorView(videoView);

        //specify the location of media file
        String path = "android.resource://" + getPackageName() + "/" + R.raw.small;

        //Setting MediaController and URI, then starting the videoView
        videoView.setMediaController(mediaController);
        videoView.setVideoURI(Uri.parse(path));
        videoView.requestFocus();
        videoView.start();
    }
}
