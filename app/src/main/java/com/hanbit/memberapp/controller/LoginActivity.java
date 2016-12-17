package com.hanbit.memberapp.controller;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hanbit.memberapp.R;

public class LoginActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etID,etPass;
    Button btLogin,btCancle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        etID= (EditText) findViewById(R.id.etID);
        etPass= (EditText) findViewById(R.id.etPass);
        btLogin= (Button) findViewById(R.id.btLogin);
        btCancle= (Button) findViewById(R.id.btCancle);

        etID.setOnClickListener(this);
        etPass.setOnClickListener(this);
        btLogin.setOnClickListener(this);
        btCancle.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){

            case R.id.btLogin :
                this.startActivity(new Intent(LoginActivity.this,ListActivity.class));
                break;

            case R.id.btCancle :

                break;
        }
    }
}
