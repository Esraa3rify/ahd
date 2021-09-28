package yourapplication.yourrapplication.yourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.balysv.materialripple.MaterialRippleLayout;
import com.yourrapplication.yourapplication.R;
public class AnotherVideos extends AppCompatActivity {
    MaterialRippleLayout Anothervid1tov;
    MaterialRippleLayout Anothervid2tov;
    MaterialRippleLayout Anothervid3tov;
    MaterialRippleLayout Anothervid4tov;
    MaterialRippleLayout Anothervid5tov;
    MaterialRippleLayout Anothervid6tov;
    MaterialRippleLayout Anothervid7tov;
    MaterialRippleLayout Anothervid8tov;
    MaterialRippleLayout Anothervid9tov;
    MaterialRippleLayout Anothervid10tov;

    String [] urls =new String[10];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_another_videos);

        Anothervid1tov=findViewById(R.id.AnVid1);
        Anothervid2tov=findViewById(R.id.AnVid2);
        Anothervid3tov=findViewById(R.id.AnVid3);
        Anothervid4tov=findViewById(R.id.AnVid4);
        Anothervid5tov=findViewById(R.id.AnVid5);
        Anothervid6tov=findViewById(R.id.AnVid6);
        Anothervid7tov=findViewById(R.id.AnVid7);
        Anothervid8tov=findViewById(R.id.AnVid8);
        Anothervid9tov=findViewById(R.id.AnVid9);
        Anothervid10tov=findViewById(R.id.AnVid10);





        urls[0]="https://www.youtube.com/watch?v=Lr1ayK-ctSo";
        urls[1]="https://www.youtube.com/watch?v=scFM2Z_uC_4&list=PLPt2dINI2MIaDS_XRHMR3fHy0OITNV0Wg&index=13";
        urls[2]="https://www.youtube.com/watch?v=0w6EUUHyrys";
        urls[3]="https://youtube.com/playlist?list=PL3znWKWhVTRbp6DfjK8qZkdTFbqOprAFk";
        urls[4]="https://www.youtube.com/watch?v=tWfwYWZ4nM0";
        urls[5]="https://www.youtube.com/watch?v=tryA0_evE2E";
        urls[6]="https://www.youtube.com/watch?v=AMtwTYq2Oes";
        urls[7]="https://www.youtube.com/watch?v=C8mMegfZwgo";
        urls[8]="https://www.youtube.com/watch?v=nfehkXTZi44";
        urls[9]="https://www.noor-book.com/%D9%83%D8%AA%D8%A8-%D9%82%D8%A7%D8%B3%D9%85-%D8%A3%D9%85%D9%8A%D9%86-pdf";




        Anothervid1tov.setOnClickListener(new View.OnClickListener() {
            @Override
      public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),AnotherVIdWebView.class);
                i.putExtra("links5",urls[0]);
                startActivity(i);
            }
        });
        Anothervid2tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),AnotherVIdWebView.class);
                i.putExtra("links5",urls[1]);
                startActivity(i);
            }
        });
        Anothervid3tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),AnotherVIdWebView.class);
                i.putExtra("links5",urls[2]);
                startActivity(i);
            }
        });

        Anothervid4tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),AnotherVIdWebView.class);
                i.putExtra("links5",urls[3]);
                startActivity(i);
            }
        });

        Anothervid5tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),AnotherVIdWebView.class);
                i.putExtra("links5",urls[4]);
                startActivity(i);
            }
        });

        Anothervid6tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),AnotherVIdWebView.class);
                i.putExtra("links5",urls[5]);
                startActivity(i);
            }
        });


        Anothervid7tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),AnotherVIdWebView.class);
                i.putExtra("links5",urls[6]);
                startActivity(i);
            }
        });

        Anothervid8tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),AnotherVIdWebView.class);
                i.putExtra("links5",urls[7]);
                startActivity(i);
            }
        });
        Anothervid9tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),AnotherVIdWebView.class);
                i.putExtra("links5",urls[8]);
                startActivity(i);
            }
        });

        Anothervid10tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),AnotherVIdWebView.class);
                i.putExtra("links5",urls[9]);
                startActivity(i);
            }
        });
    }
}