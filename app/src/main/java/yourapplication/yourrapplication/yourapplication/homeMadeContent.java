package yourapplication.yourrapplication.yourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.balysv.materialripple.MaterialRippleLayout;
import com.yourrapplication.yourapplication.R;

public class homeMadeContent extends AppCompatActivity {

    MaterialRippleLayout Fekra;


    String [] urls =new String[1];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_made_content);

        Fekra=findViewById(R.id.mtrFekraVid);

        urls[0]="https://www.youtube.com/watch?v=xCQoCZ0n0Bk";

       Fekra.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),hodawebview.class);
                i.putExtra("links9",urls[0]);
                startActivity(i);
            }
        });
    }
}