package yourapplication.yourrapplication.yourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.yourrapplication.yourapplication.R;

public class hebawebview extends AppCompatActivity {
 WebView hebaalecex;


    @Override
    public void  onBackPressed() {
        if (hebaalecex.canGoBack()) {
            hebaalecex.goBack();
        } else {
            super.onBackPressed();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hebawebview);

        hebaalecex =(WebView) findViewById(R.id.hebaLec1);

        Intent i=getIntent();
        String website1= i.getStringExtra("links");

        hebaalecex.setWebViewClient(new WebViewClient());
        hebaalecex.loadUrl(website1);

        WebSettings webSettings= hebaalecex.getSettings();
        webSettings.setJavaScriptEnabled(true);







    }

    }




