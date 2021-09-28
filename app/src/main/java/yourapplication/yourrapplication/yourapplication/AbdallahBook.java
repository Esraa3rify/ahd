package yourapplication.yourrapplication.yourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.yourrapplication.yourapplication.R;
import com.github.barteksc.pdfviewer.PDFView;

public class AbdallahBook extends AppCompatActivity {
 PDFView pdfView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_abdallah_book);

        pdfView=findViewById(R.id.pdfView);
        pdfView.fromAsset("abdallahh.pdf")
                .load()
        ;
    }
}