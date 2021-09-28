package yourapplication.yourrapplication.yourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.balysv.materialripple.MaterialRippleLayout;
import com.yourrapplication.yourapplication.R;

public class ahmedbenaa extends AppCompatActivity {
    MaterialRippleLayout Ahmedlec1tov;
    MaterialRippleLayout Ahmedlec2tov;
    MaterialRippleLayout Ahmedlec3tov;
    MaterialRippleLayout Ahmedlec4tov;
    MaterialRippleLayout Ahmedlec5tov;
    MaterialRippleLayout Ahmedlec6tov;
    MaterialRippleLayout Ahmedlec7tov;
    MaterialRippleLayout Ahmedlec8tov;
    MaterialRippleLayout AhmedBenaaBookK;
    String [] urls =new String[9];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ahmedbenaa);


        Ahmedlec1tov=findViewById(R.id.mtrAhmedBenaaLec1);
        Ahmedlec2tov=findViewById(R.id.mtrAhmedBenaaLec2);
        Ahmedlec3tov=findViewById(R.id.mtrAhmedBenaaLec3);
        Ahmedlec4tov=findViewById(R.id.mtrAhmedBenaaLec4);
        Ahmedlec5tov=findViewById(R.id.mtrAhmedBenaaLec5);
        Ahmedlec6tov=findViewById(R.id.mtrAhmedBenaaLec6);
        Ahmedlec7tov=findViewById(R.id.mtrAhmedBenaaLec7);
        Ahmedlec8tov=findViewById(R.id.mtrAhmedBenaaLec8);
        AhmedBenaaBookK=findViewById(R.id.mtrAhmedBenaaBook);


        urls[0]="https://youtube.com/playlist?list=PLZmiPrHYOIsTOFqP2PWgJIYbISVjbBLPz";
        urls[1]="https://www.youtube.com/watch?v=AjjfynteiAE";
        urls[2]="https://www.youtube.com/watch?v=0J3sormDghU";
        urls[3]="https://www.youtube.com/watch?v=T_bnmtTj7T4";
        urls[4]="https://www.youtube.com/watch?v=x1c6EPVdVfM";
        urls[5]="https://www.youtube.com/watch?v=R-ubp8KpmNA";
        urls[6]="https://www.youtube.com/watch?v=3-TNWhWNvD0";
        urls[7]="https://youtube.com/playlist?list=PLZmiPrHYOIsSKmnbaqP85RYG5HvZqZ9Qm";
        urls[8]="https://www.noor-book.com/%D9%83%D8%AA%D8%A7%D8%A8-%D8%A7%D9%84%D9%8A-%D8%A7%D9%84%D8%AC%D9%8A%D9%84-%D8%A7%D9%84%D8%B5%D8%A7%D8%B9%D8%AF-pdf";




        Ahmedlec1tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Ahmedwebview.class);
                i.putExtra("links3",urls[0]);
                startActivity(i);
            }
        });


        Ahmedlec2tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Ahmedwebview.class);
                i.putExtra("links3",urls[1]);
                startActivity(i);
            }
        });


        Ahmedlec3tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Ahmedwebview.class);
                i.putExtra("links3",urls[2]);
                startActivity(i);
            }
        });


        Ahmedlec4tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Ahmedwebview.class);
                i.putExtra("links3",urls[3]);
                startActivity(i);
            }
        });

        Ahmedlec5tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Ahmedwebview.class);
                i.putExtra("links3",urls[4]);
                startActivity(i);
            }
        });

        Ahmedlec6tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Ahmedwebview.class);
                i.putExtra("links3",urls[5]);
                startActivity(i);
            }
        });

        Ahmedlec7tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Ahmedwebview.class);
                i.putExtra("links3",urls[6]);
                startActivity(i);
            }
        });


        Ahmedlec8tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Ahmedwebview.class);
                i.putExtra("links3",urls[7]);
                startActivity(i);
            }
        });

        AhmedBenaaBookK.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Ahmedwebview.class);
                i.putExtra("links3",urls[8]);
                startActivity(i);
            }
        });
    }
}