package com.ppm.retrofit2demo.block;

import android.os.Bundle;
import android.view.View;

import com.ppm.retrofit2demo.R;
import com.ppm.retrofit2demo.net.scheduler.SchedulerProvider;

import androidx.annotation.Nullable;
import androidx.appcompat.app.AppCompatActivity;

/**
 */

public class ViewActivity extends AppCompatActivity implements Contract.View {

    private Presenter presenter;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        presenter = new Presenter(new Model(), this, SchedulerProvider.getInstance());
    }

    public void btnRequest(View view) {
        presenter.getList();
    }

    @Override
    public void getDataSuccess() {

    }

    @Override
    public void getDataFail() {

    }
}
