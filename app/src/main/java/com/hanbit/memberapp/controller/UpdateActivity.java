package com.hanbit.memberapp.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hanbit.memberapp.R;

public class UpdateActivity extends AppCompatActivity implements View.OnClickListener {

    EditText etID,etPass,etName,etTel,etAddr;
    Button btUpdate,btCancle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_update);

        etID= (EditText) findViewById(R.id.etID);
        etPass= (EditText) findViewById(R.id.etPass);
        etName= (EditText) findViewById(R.id.etName);
        etTel= (EditText) findViewById(R.id.etTel);
        etAddr= (EditText) findViewById(R.id.etAddr);

        btUpdate= (Button) findViewById(R.id.btUpdate);
        btCancle= (Button) findViewById(R.id.btCancle);

        btUpdate.setOnClickListener(this);
        btCancle.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btUpdate :

                break;

            case R.id.btCancle :

                break;
        }
    }
}
