package yourapplication.yourrapplication.yourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.balysv.materialripple.MaterialRippleLayout;
import com.yourrapplication.yourapplication.R;

public class Aboutme extends AppCompatActivity {
    MaterialRippleLayout Aboutme;

    String [] urls =new String[1];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_aboutme);

        Aboutme=findViewById(R.id.mtrLinkedin);

        urls[0]="https://www.linkedin.com/in/esraa-arify-1487741a8";

        Aboutme.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),Linkedinweb.class);
                i.putExtra("links6",urls[0]);
                startActivity(i);
            }
        });



    }
}