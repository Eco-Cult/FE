package com.example.carbcon;

import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.support.design.widget.FloatingActionButton;


public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    public static int flag=0;
    private String description;
    private String foodId;
    private String category;
    private String value;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Toolbar toolbar = findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        FloatingActionButton fab = findViewById(R.id.fab);

        description = getIntent().getStringExtra("userFname");
        foodId = getIntent().getStringExtra("userid");
        category = getIntent().getStringExtra("userAddress");
        value = getIntent().getStringExtra("userPostcode");





    }
    public void reverseWord(View view) {
// Do something in response to button
        EditText editText = (EditText) findViewById(R.id.edit_message);
        String builder= new StringBuilder(editText.getText()).reverse().toString();
        editText.setText(builder);
    }

}