package yourapplication.yourrapplication.yourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.yourrapplication.yourapplication.R;

public class Ahmedwebview extends AppCompatActivity {
    WebView Ahmedlecex;

    @Override
    public void  onBackPressed() {
        if (Ahmedlecex.canGoBack()) {
            Ahmedlecex.goBack();
        } else {
            super.onBackPressed();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahmedwebview);


        Ahmedlecex =(WebView) findViewById(R.id.AhmedwebLec1);

        Intent i=getIntent();
        String website1= i.getStringExtra("links3");

        Ahmedlecex.setWebViewClient(new WebViewClient());
        Ahmedlecex.loadUrl(website1);

        WebSettings webSettings= Ahmedlecex.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}