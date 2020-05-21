package kr.co.tjoeun.adroindbasic02_2000521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.database.DatabaseUtils;
import android.os.Bundle;

import kr.co.tjoeun.adroindbasic02_2000521.databinding.ActivityMainBinding;

public class MainActivity extends BaseActivity {

    ActivityMainBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main);
ㄷ        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

    }
}
