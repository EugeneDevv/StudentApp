package com.eujoh.studentapp.User;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;

import com.eujoh.studentapp.R;

public class contacts extends AppCompatActivity {

    //Variables
    ImageView bacBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.contacts);

        //Hooks
        bacBtn = findViewById(R.id.back_pressed_contacts);
        bacBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                contacts.super.onBackPressed();
            }
        });
    }
}