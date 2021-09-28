package yourapplication.yourrapplication.yourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.balysv.materialripple.MaterialRippleLayout;
import com.yourrapplication.yourapplication.R;

public class MainActivityhodalecs extends AppCompatActivity {
    MaterialRippleLayout hodalec1tov;
    MaterialRippleLayout hodalec2tov;
    MaterialRippleLayout hodalec3tov;
    MaterialRippleLayout hodalec4tov;
    MaterialRippleLayout hodalec5tov;
    MaterialRippleLayout hodalec6tov;
    MaterialRippleLayout hodalec7tov;
    MaterialRippleLayout hodalec8tov;
    MaterialRippleLayout hodalec9tov;
    MaterialRippleLayout hodalec10tov;
    String [] urls =new String[10];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_activityhodalecs);
        hodalec1tov=findViewById(R.id.mtrhodalec1);
        hodalec2tov=findViewById(R.id.mtrhodalec2);
        hodalec3tov=findViewById(R.id.mtrhodalec3);
        hodalec4tov=findViewById(R.id.mtrhodalec4);
        hodalec5tov=findViewById(R.id.mtrhodalec5);
        hodalec6tov=findViewById(R.id.mtrhodalec6);
        hodalec7tov=findViewById(R.id.mtrhodalec7);
        hodalec8tov=findViewById(R.id.mtrhodalec8);
        hodalec9tov=findViewById(R.id.mtrhodalec9);
        hodalec10tov=findViewById(R.id.mtrhodalec10);

        urls[0]="https://www.youtube.com/watch?v=qxJWrcJwWcM";
        urls[1]="https://www.youtube.com/watch?v=OUp2sPp7ZiU";
        urls[2]="https://www.youtube.com/watch?v=VoO8EP_YQDA";
        urls[3]="https://www.youtube.com/watch?v=XXHFl81Gp7o";
        urls[4]="https://www.youtube.com/watch?v=ci5wR52kFKI";
        urls[5]="https://www.youtube.com/watch?v=TTOUwYZoVro";
        urls[6]="https://www.youtube.com/watch?v=khw7eZN8qus";
        urls[7]="https://www.youtube.com/watch?v=UxF3QRts2Fk";
        urls[8]="https://www.youtube.com/channel/UCaWw_M1wJh9Pj_LXRd8HeNQ";
        urls[9]="https://www.goodreads.com/author/show/7159804._";



        hodalec1tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),hodawebview.class);
                i.putExtra("links2",urls[0]);
                startActivity(i);
            }
        });


        hodalec2tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),hodawebview.class);
                i.putExtra("links2",urls[1]);
                startActivity(i);
            }
        });

        hodalec3tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),hodawebview.class);
                i.putExtra("links2",urls[2]);
                startActivity(i);
            }
        });

        hodalec4tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),hodawebview.class);
                i.putExtra("links2",urls[3]);
                startActivity(i);
            }
        });

        hodalec5tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),hodawebview.class);
                i.putExtra("links2",urls[4]);
                startActivity(i);
            }
        });

        hodalec6tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),hodawebview.class);
                i.putExtra("links2",urls[5]);
                startActivity(i);
            }
        });


        hodalec7tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),hodawebview.class);
                i.putExtra("links2",urls[6]);
                startActivity(i);
            }
        });


        hodalec8tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),hodawebview.class);
                i.putExtra("links2",urls[7]);
                startActivity(i);
            }
        });

        hodalec9tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),hodawebview.class);
                i.putExtra("links2",urls[8]);
                startActivity(i);
            }
        });

        hodalec10tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),hodawebview.class);
                i.putExtra("links2",urls[9]);
                startActivity(i);
            }
        });




    }
}