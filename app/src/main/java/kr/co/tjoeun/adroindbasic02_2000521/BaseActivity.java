package kr.co.tjoeun.adroindbasic02_2000521;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;

public abstract class BaseActivity extends AppCompatActivity {

    public Context mContext = this;

    public abstract void setupEvents();
    public abstract void setValues();

}
