package kr.co.kjstudio.decisiontrouble.activity;

import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

/**
 * Created by KJ on 2017-04-02.
 */

public class BaseActivity extends AppCompatActivity {

    public Context mContext = null;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        mContext = this;
    }

    public void bindViews() {

    }

    public void setupEvents() {

    }

    public void setCustomActionBar() {

    }

    public void setValues() {

    }
}
