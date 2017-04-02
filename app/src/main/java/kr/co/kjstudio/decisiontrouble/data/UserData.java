package kr.co.kjstudio.decisiontrouble.data;

import org.json.JSONException;
import org.json.JSONObject;

import java.io.Serializable;

/**
 * Created by KJ on 2017-04-02.
 */

public class UserData implements Serializable {

    public String userName;
    public String userNickName;
    public int userAge;

    public static UserData getUserDataFromJson(JSONObject json) {

        UserData data = new UserData();
        try {
            data.userName = json.getString("userName");
            data.userNickName = json.getString("userNickName");
            data.userAge = json.getInt("userAge");
        } catch (JSONException e) {
            e.printStackTrace();
        }

        return data;
    }

}
