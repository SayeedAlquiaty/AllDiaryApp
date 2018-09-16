package com.nawal.diaryapp.mainfolder;
import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;

import java.util.Timer;
import java.util.TimerTask;

import com.nawal.diaryapp.R;
/**
 * Created by ALQUIATY on 08/05/15.
 */
public class StartupScreenActivity extends Activity {

    ImageView startImg;
    TimerTask task;
    Timer timer;
    public final int TIMER_DELAY = 1000;
    public final int TIMER_ONE_MINUTE = 60000;
    public final int TIMER_ONE_SECOND = 1000;

    public void onCreate(Bundle savedInstanceState)

    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.startupscreen_lauout);
        startImg = (ImageView)findViewById(R.id.startupimage);
        startImg.setImageResource(R.mipmap.startu_image);

        task = new TimerTask() {
            @Override
            public void run() {
                //gps_text.append("Time up ");
                try {
                    this.wait(TIMER_DELAY);

                } catch (InterruptedException e) {
                }
            }
        };
        //task.run();
        //task.cancel();
        Intent intent = new Intent(StartupScreenActivity.this, InputSchoolActivity.class);
        startActivity(intent);
    }
}
