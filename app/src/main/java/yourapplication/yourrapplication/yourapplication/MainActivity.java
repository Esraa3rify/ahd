package yourapplication.yourrapplication.yourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.balysv.materialripple.MaterialRippleLayout;
import com.yourrapplication.yourapplication.R;

public class MainActivity extends AppCompatActivity {
    MaterialRippleLayout strtApp;
    MaterialRippleLayout AboutMe;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        strtApp= findViewById(R.id.mtrStrt);

        strtApp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),AllContent.class);
                startActivity(i);
            }
        });

        AboutMe= findViewById(R.id.mtrAboutMe);

        AboutMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Aboutme.class);
                startActivity(i);
            }
        });

        Toast.makeText(getApplicationContext(),"ادعوا لوالدي بالرحمة",Toast.LENGTH_SHORT).show();
    }



}