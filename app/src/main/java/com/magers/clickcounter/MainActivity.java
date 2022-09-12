package com.magers.clickcounter;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.snackbar.Snackbar;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FloatingActionButton fab= findViewById(R.id.fAB_1);
        fab.setOnClickListener (view -> {
            TextView tv = findViewById(R.id.tv_1);
            String stringValue = tv.getText().toString();
            Integer originalValue = Integer.parseInt(stringValue);
            Integer newValue = MyHelper.doubleMyValue(originalValue);
            tv.setText(newValue.toString());

            Snackbar.make(view, "TAP!", Snackbar.LENGTH_LONG)
                    .setAction("TAP", null).show();
        });
    }
}