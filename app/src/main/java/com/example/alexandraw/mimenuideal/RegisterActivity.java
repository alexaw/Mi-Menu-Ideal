package com.example.alexandraw.mimenuideal;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class RegisterActivity extends AppCompatActivity implements View.OnClickListener {

    EditText name, lastname, numId, usr, pass;
    String sName, sLastname, sNumId, sUsr,sPass;
    Button reg;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = (EditText)findViewById(R.id.name);
        lastname = (EditText)findViewById(R.id.lastname);
        numId = (EditText)findViewById(R.id.numId);
        usr = (EditText)findViewById(R.id.usr);
        pass = (EditText)findViewById(R.id.pass);

        reg = (Button)findViewById(R.id.btnReg);

        reg.setOnClickListener(this);

    }


    @Override
    public void onClick(View v) {
        switch (v.getId()) {

            case R.id.btnReg:

                //editor.putBoolean(KEY_REG, true);
                sName=name.getText().toString();
                sLastname=lastname.getText().toString();
                sNumId=numId.getText().toString();
                sUsr=usr.getText().toString();
                sPass=pass.getText().toString();

                //editor.commit();


                            Intent intent = new Intent(RegisterActivity.this, LoginActivity.class);
                            startActivity(intent);
                            finish();



        }
    }
}
