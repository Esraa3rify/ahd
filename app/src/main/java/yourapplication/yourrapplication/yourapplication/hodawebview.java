package yourapplication.yourrapplication.yourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.yourrapplication.yourapplication.R;

public class hodawebview extends AppCompatActivity {


    WebView hodaalecex;


    @Override
    public void  onBackPressed() {
        if (hodaalecex.canGoBack()) {
            hodaalecex.goBack();
        } else {
            super.onBackPressed();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hodawebview);

        hodaalecex =(WebView) findViewById(R.id.hodaWeb);

        Intent i=getIntent();
        String website2= i.getStringExtra("links2");

        hodaalecex.setWebViewClient(new WebViewClient());
        hodaalecex.loadUrl(website2);

        WebSettings webSettings= hodaalecex.getSettings();
        webSettings.setJavaScriptEnabled(true);







    }

}
