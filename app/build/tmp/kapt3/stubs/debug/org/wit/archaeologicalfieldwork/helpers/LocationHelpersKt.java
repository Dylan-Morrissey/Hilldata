package org.wit.archaeologicalfieldwork.helpers;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 2, d1 = {"\u0000$\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0015\n\u0000\u001a\u000e\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007\u001a\b\u0010\b\u001a\u00020\tH\u0007\u001a\u0016\u0010\n\u001a\u00020\u00052\u0006\u0010\u000b\u001a\u00020\u00012\u0006\u0010\f\u001a\u00020\r\"\u0014\u0010\u0000\u001a\u00020\u0001X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0002\u0010\u0003\u00a8\u0006\u000e"}, d2 = {"REQUEST_PERMISSIONS_REQUEST_CODE", "", "getREQUEST_PERMISSIONS_REQUEST_CODE", "()I", "checkLocationPermissions", "", "activity", "Landroid/app/Activity;", "createDefaultLocationRequest", "Lcom/google/android/gms/location/LocationRequest;", "isPermissionGranted", "code", "grantResults", "", "app_debug"})
public final class LocationHelpersKt {
    private static final int REQUEST_PERMISSIONS_REQUEST_CODE = 34;
    
    public static final int getREQUEST_PERMISSIONS_REQUEST_CODE() {
        return 0;
    }
    
    public static final boolean checkLocationPermissions(@org.jetbrains.annotations.NotNull()
    android.app.Activity activity) {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    public static final com.google.android.gms.location.LocationRequest createDefaultLocationRequest() {
        return null;
    }
    
    public static final boolean isPermissionGranted(int code, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
        return false;
    }
}