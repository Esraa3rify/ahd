package yourapplication.yourrapplication.yourapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.balysv.materialripple.MaterialRippleLayout;
import com.yourrapplication.yourapplication.R;

public class hebalec extends AppCompatActivity {
  MaterialRippleLayout hebalec1tov;
  MaterialRippleLayout hepalec2tov;
    MaterialRippleLayout hepalec3tov;
    MaterialRippleLayout hepalec4tov;
    MaterialRippleLayout hepalec5tov;
    MaterialRippleLayout hepalec6tov;

  String [] urls =new String[6];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hebalec);

        hebalec1tov=findViewById(R.id.mtrhebalec1);
        hepalec2tov=findViewById(R.id.mtrhebalec2);
        hepalec3tov=findViewById(R.id.mtrhebalec3);
        hepalec4tov=findViewById(R.id.mtrhebalec4);
        hepalec5tov=findViewById(R.id.mtrhebalec5);
        hepalec6tov=findViewById(R.id.mtrhebalec6);




        urls[0]="https://www.youtube.com/watch?v=sztBcu1jX2M";
        urls[1]="https://www.youtube.com/watch?v=vWIJWfU21nc";
        urls[2]="https://www.youtube.com/watch?v=ZL03wPYE3Co";
        urls[3]="https://www.youtube.com/watch?v=WwLUjoQYL3M";
        urls[4]="https://www.youtube.com/watch?v=oi1yjrB_2H0";
        urls[5]="https://youtube.com/playlist?list=PLQUVm8JlcFzysHs6zl4Jun69XxkG65fpj";


        hebalec1tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),hebawebview.class);
                i.putExtra("links",urls[0]);
                startActivity(i);
            }
        });



        hepalec2tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),hebawebview.class);
                i.putExtra("links",urls[1]);
                startActivity(i);
            }
        });



        hepalec3tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),hebawebview.class);
                i.putExtra("links",urls[2]);
                startActivity(i);
            }
        });


        hepalec4tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),hebawebview.class);
                i.putExtra("links",urls[3]);
                startActivity(i);
            }
        });


        hepalec5tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),hebawebview.class);
                i.putExtra("links",urls[4]);
                startActivity(i);
            }
        });



        hepalec6tov.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(getApplicationContext(),hebawebview.class);
                i.putExtra("links",urls[5]);
                startActivity(i);
            }
        });
    }

}
