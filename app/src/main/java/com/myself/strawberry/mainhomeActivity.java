package com.myself.strawberry;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class mainhomeActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState){

        super.onCreate(savedInstanceState);
        setContentView(R.layout.mainhome);

        ImageButton DicBtn = (ImageButton) findViewById(R.id.dicBtn);
        ImageButton ComBtn = (ImageButton) findViewById(R.id.comuBtn);
        ImageButton HomeBtn = (ImageButton) findViewById(R.id.homeBtn);
        ImageButton StoreBtn = (ImageButton) findViewById(R.id.storeBtn);
        ImageButton UserBtn = (ImageButton) findViewById(R.id.userBtn);
        ImageButton CctvBtn = (ImageButton) findViewById(R.id.cctvBtn);

        DicBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                startActivity(intent);
            }
        });

        ComBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), ComunityActivity.class);
                startActivity(intent);
            }
        });

        HomeBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), MainActivity.class);
                startActivity(intent);
            }
        });

        StoreBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), StoreActivity.class);
                startActivity(intent);
            }
        });

        UserBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), UserActivity.class);
                startActivity(intent);
            }
        });

        CctvBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                Intent intent = new Intent(getApplicationContext(), CctvActivity.class);
                startActivity(intent);
            }
        });

    }
}
