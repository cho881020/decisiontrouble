package kr.co.kjstudio.decisiontrouble;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;

import kr.co.kjstudio.decisiontrouble.activity.BaseActivity;
import kr.co.kjstudio.decisiontrouble.activity.EditDecisionActivity;
import kr.co.kjstudio.decisiontrouble.data.UserData;
import kr.co.kjstudio.decisiontrouble.util.ContextUtil;
import kr.co.kjstudio.decisiontrouble.util.GlobalData;

public class MainActivity extends BaseActivity {

    private android.widget.TextView text1;
    private android.widget.Button button1;
    private android.widget.LinearLayout activitymain;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        setCustomActionBar();
        bindViews();
        setupEvents();
        setValues();


    }

    @Override
    public void setupEvents() {
        super.setupEvents();

        final UserData myData= new UserData();

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(mContext, EditDecisionActivity.class);
                intent.putExtra("user", myData);
                startActivity(intent);
            }
        });

    }


    @Override
    public void setValues() {
        super.setValues();

        GlobalData.cardCompanies
        if (ContextUtil.getUserId(mContext).equals("") ){
            Log.d("Login check", "로그인 안함");
        }
        else {

        }

        text1.setText("초기값");
    }

    @Override
    public void bindViews() {
        super.bindViews();

        this.activitymain = (LinearLayout) findViewById(R.id.activity_main);
        this.button1 = (Button) findViewById(R.id.button1);
        this.text1 = (TextView) findViewById(R.id.text1);


    }
}
