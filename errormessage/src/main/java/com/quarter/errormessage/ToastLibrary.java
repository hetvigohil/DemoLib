package com.quarter.errormessage;

import android.content.Context;
import android.widget.Toast;

public class ToastLibrary {

    public static void demoToast(Context c, String message){

        Toast.makeText(c,message,Toast.LENGTH_SHORT).show();

    }
}
