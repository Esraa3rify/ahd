package yourapplication.yourrapplication.yourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.yourrapplication.yourapplication.R;

public class khitanWebView extends AppCompatActivity {
    WebView Khitanlecex;

    @Override
    public void  onBackPressed() {
        if (Khitanlecex.canGoBack()) {
            Khitanlecex.goBack();
        } else {
            super.onBackPressed();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_khitan_web_view);

        Khitanlecex =(WebView) findViewById(R.id.KhitanWeb);

        Intent i=getIntent();
        String website1= i.getStringExtra("links8");

        Khitanlecex.setWebViewClient(new WebViewClient());
        Khitanlecex.loadUrl(website1);

        WebSettings webSettings=Khitanlecex.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}