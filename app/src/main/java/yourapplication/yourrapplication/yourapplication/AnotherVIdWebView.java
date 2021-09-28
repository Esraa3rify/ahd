package yourapplication.yourrapplication.yourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.yourrapplication.yourapplication.R;

public class AnotherVIdWebView extends AppCompatActivity {
    WebView Anotherlecex;


    @Override
    public void  onBackPressed() {
        if (Anotherlecex.canGoBack()) {
            Anotherlecex.goBack();
        } else {
            super.onBackPressed();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another_vid_web_view);


        Anotherlecex =(WebView) findViewById(R.id.AnotherWeb);

        Intent i=getIntent();
        String website1= i.getStringExtra("links5");

        Anotherlecex.setWebViewClient(new WebViewClient());
        Anotherlecex.loadUrl(website1);

        WebSettings webSettings=Anotherlecex.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}