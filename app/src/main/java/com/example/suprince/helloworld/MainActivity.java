package com.example.suprince.helloworld;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final ImageView img1= (ImageView) findViewById(R.id.image1);
        final ImageView img2= (ImageView) findViewById(R.id.image2);
        img1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast(img1);
            }
        });

        img2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                showToast(img2);
            }
        });

    }
  public void showToast(ImageView img){
      if(img.getId()==R.id.image1){
      Toast.makeText(this,"You click image one",Toast.LENGTH_LONG).show();
      }
      if(img.getId()==R.id.image2){
          Toast.makeText(this,"You click image two",Toast.LENGTH_SHORT).show();
      }


  }

    public void startActivity(View view) {
        Intent i=new Intent(MainActivity.this,StudentActivity.class);
        i.putExtra("key1","suprince");
        startActivity(i);

    }
}



