package com.toastdemo;

import android.widget.Toast;

import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.bridge.ReactContextBaseJavaModule;
import com.facebook.react.bridge.ReactMethod;

public class ToastDemoModule extends ReactContextBaseJavaModule {

    public ToastDemoModule(ReactApplicationContext reactContext) {
        super(reactContext);
    }

    @Override
    public String getName() {
        return "ToastDemo";
    }

    @ReactMethod
    public void showToast(Promise promise){
        Toast.makeText(getCurrentActivity(), "this is a demo", Toast.LENGTH_LONG).show();
    }
}