package com.myself.strawberry;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button btnNewActivity = (Button)findViewById(R.id.ddrBtn);
        ImageButton DangerBtn = (ImageButton)findViewById(R.id.dangerBtn);

        btnNewActivity.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),mainhomeActivity.class);
                startActivity(intent);
            }
        });

        DangerBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(),DangercamActivity.class);
                startActivity(intent);
            }
        });

    }
}