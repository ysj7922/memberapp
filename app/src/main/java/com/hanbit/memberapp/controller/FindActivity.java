package com.hanbit.memberapp.controller;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.hanbit.memberapp.R;

public class FindActivity extends AppCompatActivity implements View.OnClickListener {
    EditText etFind;
    Button btSearch, btCancle;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find);

        etFind = (EditText) findViewById(R.id.etFind);
        btSearch = (Button) findViewById(R.id.btSearch);
        btCancle = (Button) findViewById(R.id.btCancle);

        btSearch.setOnClickListener(this);
        btCancle.setOnClickListener(this);

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btSearch :

                break;

            case R.id.btCancle :

                break;
        }
    }
}
