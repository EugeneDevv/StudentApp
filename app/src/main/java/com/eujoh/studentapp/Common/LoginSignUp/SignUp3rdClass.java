package com.eujoh.studentapp.Common.LoginSignUp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.eujoh.studentapp.User.UserDashboard;

import com.eujoh.studentapp.R;

public class SignUp3rdClass extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up3rd_class);
    }

    public void callUserDashBoard(View view) {
        startActivity(new Intent(this,UserDashboard.class));
    }
}