package com.bawei.liyizhi0709.view.activity;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public abstract class BaseActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        bujv();
        byid();
        shujiv();
        jianting();
    }

   public abstract void bujv();
    public abstract void byid();
    public abstract void shujiv();
    public abstract void jianting();

}
