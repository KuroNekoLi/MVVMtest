package com.example.test330;

import androidx.appcompat.app.AppCompatActivity;
import androidx.databinding.DataBindingUtil;
import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.example.test330.databinding.ActivityMainBinding;
import com.example.test330.model.User;
import com.example.test330.viewmodels.MainViewModel;
import com.google.android.material.textfield.TextInputEditText;

import java.util.Objects;

public class MainActivity extends AppCompatActivity
{
    MainViewModel mainViewModel;
    private TextInputEditText etAccount, etPwd;
    private TextView tvAccount, tvPwd;
    private User user;

    @Override
    protected void onCreate( Bundle savedInstanceState )
    {
        super.onCreate( savedInstanceState );
//        setContentView( R.layout.activity_main );
        ActivityMainBinding dataBinding = DataBindingUtil.setContentView( this, R.layout.activity_main );
        user = new User( "admin", "123456" );
        dataBinding.setUser( user );

        dataBinding.btnLogin.setOnClickListener( v ->
        {
            user.setAccount( dataBinding.etAccount.getText().toString().trim() );
            user.setPwd( dataBinding.etPwd.getText().toString().trim() );
        } );
//        //綁定
//        mainViewModel = new ViewModelProvider( this ).get(MainViewModel.class);
//
//        etAccount =findViewById( R.id.et_account );
//        etPwd = findViewById( R.id.et_pwd );
//        tvAccount = findViewById( R.id.tv_account );
//        tvPwd = findViewById( R.id.tv_pwd );
//
//        findViewById( R.id.btn_login ).setOnClickListener( v -> {
//            mainViewModel.account.setValue( Objects.requireNonNull( etAccount.getText() ).toString().trim() );
//            mainViewModel.pwd.setValue( Objects.requireNonNull( etPwd.getText() ).toString().trim() );
//
//            if( Objects.requireNonNull( mainViewModel.account.getValue() ).isEmpty()){
//                Toast.makeText( this, "請輸入帳號", Toast.LENGTH_SHORT ).show();
//                return;
//            }
//            if( Objects.requireNonNull( mainViewModel.pwd.getValue() ).isEmpty()){
//                Toast.makeText( this, "請輸入密碼", Toast.LENGTH_SHORT ).show();
//                return;
//            }
//            Toast.makeText( this, "登入成功", Toast.LENGTH_SHORT ).show();
//        } );
//
//        mainViewModel.account.observe( this,account ->tvAccount.setText( "帳號"+account ) );
//        mainViewModel.pwd.observe( this,pwd ->tvPwd.setText( "密碼"+pwd ) );
//    }
    }
}