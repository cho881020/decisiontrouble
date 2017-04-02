package kr.co.kjstudio.decisiontrouble.util;

import android.content.Context;
import android.content.SharedPreferences;

/**
 * Created by KJ on 2017-04-02.
 */

public class ContextUtil {


    private static final String PREFERENCE_NAME = "DecisionPreferences";
    private static final String USER_ID = "USER_ID";

    public static void setUserId(Context context, String userId) {

        SharedPreferences prefs = context.getSharedPreferences(PREFERENCE_NAME, Context.MODE_PRIVATE);
        prefs.edit().putString(USER_ID, userId);
    }

    public static String getUserId(Context context) {

        SharedPreferences prefs = context.getSharedPreferences(PREFERENCE_NAME,
                Context.MODE_PRIVATE);

        return prefs.getString(USER_ID, "");
    }

}
