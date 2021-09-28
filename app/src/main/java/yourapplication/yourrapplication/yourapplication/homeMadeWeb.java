package yourapplication.yourrapplication.yourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;

import com.yourrapplication.yourapplication.R;

public class homeMadeWeb extends AppCompatActivity {
    WebView HomeMadelecex;

    @Override
    public void  onBackPressed() {
        if (HomeMadelecex.canGoBack()) {
            HomeMadelecex.goBack();
        } else {
            super.onBackPressed();
        }
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_made_web);

        HomeMadelecex =(WebView) findViewById(R.id.HomeMadeWeb);

        Intent i=getIntent();
        String website1= i.getStringExtra("links9");

        HomeMadelecex.setWebViewClient(new WebViewClient());
        HomeMadelecex.loadUrl(website1);

        WebSettings webSettings=HomeMadelecex.getSettings();
        webSettings.setJavaScriptEnabled(true);
    }
}