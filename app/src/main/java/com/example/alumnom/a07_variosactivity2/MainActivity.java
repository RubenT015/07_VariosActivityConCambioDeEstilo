package com.example.alumnom.a07_variosactivity2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Boton1(View v) {
        Intent i = new Intent(this, Activity2.class );
        i.putExtra("texto","Boton 1 pulsado");
        i.putExtra("style",R.style.Theme1);
        startActivity(i);
    }
    public void Boton2(View v) {
        Intent i = new Intent(this, Activity2.class );
        i.putExtra("texto","Boton 2 pulsado");
        i.putExtra("style",R.style.Theme2);
        startActivity(i);
    }
    public void Boton3(View v) {
        Intent i = new Intent(this, Activity2.class );
        i.putExtra("texto","Boton 3 pulsado");
        i.putExtra("style",R.style.Theme3);
        startActivity(i);
    }
    public void Boton4(View v) {
        Intent i = new Intent(this, Activity2.class );
        i.putExtra("texto","Boton 4 pulsado");
        i.putExtra("style",R.style.Theme4);
        startActivity(i);
    }
}
