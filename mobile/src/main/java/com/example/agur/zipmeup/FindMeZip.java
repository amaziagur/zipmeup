package com.example.agur.zipmeup;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class FindMeZip extends AppCompatActivity {

    public static final String EXPECTED_ZIP_CODE = "90210";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_me_zip);

        final TextView mTextView = (TextView) findViewById(R.id.zipMeUpTxtView);

        final Button button = (Button) findViewById(R.id.zipMeUpBtn);
        button.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                mTextView.setText(EXPECTED_ZIP_CODE);
            }
        });
    }
}
