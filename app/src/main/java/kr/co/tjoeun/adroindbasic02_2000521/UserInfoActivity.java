package kr.co.tjoeun.adroindbasic02_2000521;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;

import android.os.Bundle;

import java.util.Calendar;

import kr.co.tjoeun.adroindbasic02_2000521.databinding.ActivityUserInfoBinding;

public class UserInfoActivity extends BaseActivity {

    ActivityUserInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = DataBindingUtil.setContentView(this,R.layout.activity_user_info);
        setupEvents();
        setValues();
    }

    @Override
    public void setupEvents() {

    }

    @Override
    public void setValues() {

        String name = getIntent().getStringExtra("userName");
        int birthYear = getIntent().getIntExtra("userBirthYear",-1);
        int age = Calendar.getInstance().get(Calendar.YEAR) - birthYear + 1;


        binding.userInfoTxt.setText(String.format("%s(%d세)", name,age));

    }
}
