package org.admintest.recyclerviewtest;

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

    public void startRvInScrollView(View view) {
        startActivity(new Intent(this, RVActivitySV.class));
    }

    public void startRvInFRameLayout(View view) {
        startActivity(new Intent(this, RVActivityFL.class));
    }
}
