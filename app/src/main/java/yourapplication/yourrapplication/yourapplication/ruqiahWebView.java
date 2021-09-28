package yourapplication.yourrapplication.yourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.yourrapplication.yourapplication.R;

public class ruqiahWebView extends AppCompatActivity {

    WebView Ruqiahlecex;


    @Override
    public void  onBackPressed() {
        if (Ruqiahlecex.canGoBack()) {
            Ruqiahlecex.goBack();
        } else {
            super.onBackPressed();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruqiah_web_view);

        Ruqiahlecex =(WebView) findViewById(R.id.ruqiahWeb);

        Intent i=getIntent();
        String website2= i.getStringExtra("links7");

        Ruqiahlecex.setWebViewClient(new WebViewClient());
        Ruqiahlecex.loadUrl(website2);

        WebSettings webSettings= Ruqiahlecex.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}