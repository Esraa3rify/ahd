package yourapplication.yourrapplication.yourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.balysv.materialripple.MaterialRippleLayout;
import com.yourrapplication.yourapplication.R;

public class AllContent extends AppCompatActivity {
MaterialRippleLayout mtrabdalla;
    MaterialRippleLayout HebaVar;
    MaterialRippleLayout HodaVar;
    MaterialRippleLayout AhmedBenaaVar;
    MaterialRippleLayout AnotherVideos;
    MaterialRippleLayout tafseerBaqraa;
    MaterialRippleLayout Khitan;
    MaterialRippleLayout HomeMade;

    String [] urls =new String[1];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_all_content);


        mtrabdalla = findViewById(R.id.mtrAbdo);

        mtrabdalla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), AbdallahBook.class);
                startActivity(i);
            }
        });


        HebaVar = findViewById(R.id.mtrHeba);

        HebaVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), hebalec.class);
                startActivity(i);
            }
        });


        HodaVar = findViewById(R.id.mtrHoda);

        HodaVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), MainActivityhodalecs.class);
                startActivity(i);
            }
        });

        AhmedBenaaVar = findViewById(R.id.mtrAhmedBenaa);

        AhmedBenaaVar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ahmedbenaa.class);
                startActivity(i);
            }
        });


        tafseerBaqraa = findViewById(R.id.mtrdrRuqiahTafseer);

        tafseerBaqraa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), ruqiahLecs.class);
                startActivity(i);
            }
        });


        AnotherVideos = findViewById(R.id.mtrAnotherVideos);
        AnotherVideos.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), AnotherVideos.class);
                startActivity(i);
            }
        });

        HomeMade = findViewById(R.id.mtrHomeMade);
      HomeMade.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), homeMadeContent.class);
                startActivity(i);
            }
        });
        Khitan = findViewById(R.id.mtrFemale);

        urls[0] = "https://www.youtube.com/watch?v=bPE3j88bExM";

        Khitan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(getApplicationContext(), khitanWebView.class);
                i.putExtra("links8", urls[0]);
                startActivity(i);
            }
        });


    }
}


