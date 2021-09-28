package yourapplication.yourrapplication.yourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.yourrapplication.yourapplication.R;

public class Linkedinweb extends AppCompatActivity {
    WebView Aboutmeex;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_linkedinweb);


        Aboutmeex =(WebView) findViewById(R.id.LinkedWeb);

        Intent i=getIntent();
        String website1= i.getStringExtra("links6");

        Aboutmeex.setWebViewClient(new WebViewClient());
        Aboutmeex.loadUrl(website1);

        WebSettings webSettings=Aboutmeex.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
    }
