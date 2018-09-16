package com.nawal.diaryapp.mainfolder;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.nawal.diaryapp.R;

import java.util.TimerTask;

/**
 * Created by ALQUIATY on 09/05/15.
 */
public class InputSchoolActivity extends ActionBarActivity {

    TextView textView;



    public void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.inputschoolcode_layout);

        textView = (TextView)findViewById(R.id.textview1_islayout);

        textView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(InputSchoolActivity.this, InputUserInfoActivity.class);
                startActivity(intent);
            }
        });
    }

}
