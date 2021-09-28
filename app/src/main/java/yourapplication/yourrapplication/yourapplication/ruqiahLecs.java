package yourapplication.yourrapplication.yourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.balysv.materialripple.MaterialRippleLayout;
import com.yourrapplication.yourapplication.R;

public class ruqiahLecs extends AppCompatActivity {

    MaterialRippleLayout RuqiahLec1;
    MaterialRippleLayout RuqiahLec2;
    MaterialRippleLayout RuqiahLec3;
    MaterialRippleLayout RuqiahLec4;
    MaterialRippleLayout RuqiahLec5;
    MaterialRippleLayout RuqiahLec6;
    MaterialRippleLayout RuqiahLec7;

    String [] urls =new String[7];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ruqiah_lecs);


        RuqiahLec1=findViewById(R.id.mtrruqiahlec1);
        RuqiahLec2=findViewById(R.id.mtrruqiahlec2);
        RuqiahLec3=findViewById(R.id.mtrruqiahlec3);
        RuqiahLec4=findViewById(R.id.mtrruqiahlec4);
        RuqiahLec5=findViewById(R.id.mtrruqiahlec5);
        RuqiahLec6=findViewById(R.id.mtrruqiahlec6);
        RuqiahLec7=findViewById(R.id.mtrruqiahlec7);

          urls[0]="https://www.youtube.com/watch?v=0365I-mxChY";
          urls[1]="https://www.youtube.com/watch?v=dZpalGvm_CQ";
          urls[2]="https://www.youtube.com/watch?v=Pfr0QB7IIBk";
          urls[3]="https://www.youtube.com/watch?v=7oOExsnJ4co";
          urls[4]="https://www.youtube.com/watch?v=MQE-Jd3UY-M";
          urls[5]="https://www.youtube.com/watch?v=PZl_gMsnIHQ";
          urls[6]="https://www.youtube.com/watch?v=G3xs_G_96Uo";


        RuqiahLec1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),ruqiahWebView.class);
                i.putExtra("links7",urls[0]);
                startActivity(i);
            }
        });

        RuqiahLec2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),ruqiahWebView.class);
                i.putExtra("links7",urls[1]);
                startActivity(i);
            }
        });

        RuqiahLec3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),ruqiahWebView.class);
                i.putExtra("links7",urls[2]);
                startActivity(i);
            }
        });

        RuqiahLec4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),ruqiahWebView.class);
                i.putExtra("links7",urls[3]);
                startActivity(i);
            }
        });

        RuqiahLec5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),ruqiahWebView.class);
                i.putExtra("links7",urls[4]);
                startActivity(i);
            }
        });

        RuqiahLec6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),ruqiahWebView.class);
                i.putExtra("links7",urls[5]);
                startActivity(i);
            }
        });
        RuqiahLec7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),ruqiahWebView.class);
                i.putExtra("links7",urls[6]);
                startActivity(i);
            }
        });
    }
}