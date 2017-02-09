package in.modelexam.samplecomponenetsapp;

import android.os.Build;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class WebviewSample extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_webview_sample);
        WebView browser = (WebView) findViewById(R.id.webviewsample);
        browser.loadUrl("http://www.i-visionblog.com");
        browser.getSettings().setJavaScriptEnabled(true);

        if (Build.VERSION.SDK_INT >= 19) {
            browser.getSettings().setCacheMode(WebSettings.LOAD_CACHE_ELSE_NETWORK);
        }

    }
}
