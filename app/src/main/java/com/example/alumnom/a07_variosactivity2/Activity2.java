package com.example.alumnom.a07_variosactivity2;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class Activity2 extends AppCompatActivity {
    TextView tv;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Bundle bundle = getIntent().getExtras();
        setTheme(bundle.getInt("style"));
        //setTheme(R.style.Theme1);
        setContentView(R.layout.activity_2);

        //Si se llama a setTheme despues de SetContentView, parece no aplicarse el nuevo style
        //this.setTheme(bundle.getInt("style"));
        tv = (TextView) findViewById(R.id.tv);
        tv.setText(bundle.getString("texto"));

    }

    public void salir(View v) {
        finish();
    }
}
