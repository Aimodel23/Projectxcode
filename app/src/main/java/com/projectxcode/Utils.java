package com.projectxcode;

import android.content.Context;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.widget.Toast;

public class Utils {

    /**
     * Checks if the device is connected to the internet.
     *
     * @param context The context to use for accessing system services.
     * @return True if the device is connected to the internet, false otherwise.
     */
    public static boolean isInternetConnected(Context context) {
        ConnectivityManager connectivityManager = (ConnectivityManager) context.getSystemService(Context.CONNECTIVITY_SERVICE);
        if (connectivityManager != null) {
            NetworkInfo activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
            return activeNetworkInfo != null && activeNetworkInfo.isConnected();
        }
        return false;
    }

    /**
     * Shows a toast message.
     *
     * @param context The context to use for displaying the toast.
