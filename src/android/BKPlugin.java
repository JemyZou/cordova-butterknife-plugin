package com.tts.bk;

import android.content.Context;
import android.content.Intent;
import android.text.TextUtils;

import com.demo.tts.bkmodule.BkActivity;
import org.apache.cordova.CallbackContext;
import org.apache.cordova.CordovaPlugin;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/**
 * Created by sven-ou on 2017/10/20.
 */

public class BKPlugin extends CordovaPlugin {
    private static final String ACTION_GO_DEMO = "goBKModlule";
    @Override
    public boolean execute(String action, JSONArray args, final CallbackContext callbackContext) throws JSONException {
        System.out.print("---------------execute--------------");
        if (ACTION_GO_DEMO.equals(action)) {
            gotoView(ACTION_GO_DEMO, args, callbackContext);
            return true;
        }
        return false;
    }
    private void gotoView(String action, JSONArray args, final CallbackContext callbackContext){
        System.out.print("---------------gotoView--------------");
        Context context = cordova.getActivity().getApplicationContext();
        Intent intent = new Intent(context, BkActivity.class);
        cordova.getActivity().startActivity(intent);
        callbackContext.success();
    }
}
