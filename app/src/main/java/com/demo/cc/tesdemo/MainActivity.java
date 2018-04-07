package com.demo.cc.tesdemo;

import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        final EditText ed_name = findViewById(R.id.ed_name);
        final EditText  ed_password= findViewById(R.id.ed_password);
        Button btn_login = findViewById(R.id.btn_login);
        final TextInputLayout tip_name = findViewById(R.id.tip_name);
        final TextInputLayout tip_password = findViewById(R.id.tip_password);
        //判断合法性
        btn_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (ed_name.getText().toString().trim().length()<5) {
                    tip_name.setErrorEnabled(true);
                    tip_name.setError("用户名不合法");
                }else {
                    tip_name.setErrorEnabled(false);
                }
                if (ed_password.getText().toString().trim().length()<5) {
                    tip_password.setErrorEnabled(true);
                    tip_password.setError("密码不合法");
                }else {
                    tip_password.setErrorEnabled(false);
                }
            }
        });
    }
}
