package kr.co.kjstudio.decisiontrouble.activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import kr.co.kjstudio.decisiontrouble.R;
import kr.co.kjstudio.decisiontrouble.data.UserData;

public class EditDecisionActivity extends BaseActivity {

    UserData mUserData = null;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_edit_decision);
        mUserData = (UserData) getIntent().getSerializableExtra("user");

        UserData tempUserData = new UserData();
//        tempUserData.userAge = spinner.getsele
    }
}
