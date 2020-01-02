package org.wit.archaeologicalfieldwork.views.hillfort;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000~\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0007\n\u0002\u0010\u0006\n\u0002\b\u0002\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010-\u001a\u00020.2\u0006\u0010/\u001a\u0002002\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u000203H\u0016J.\u00104\u001a\u00020.2\u0006\u00105\u001a\u0002062\u0006\u00107\u001a\u0002062\u0006\u00108\u001a\u00020\f2\u0006\u00109\u001a\u0002062\u0006\u0010:\u001a\u000206J\u0006\u0010;\u001a\u00020.J\u000e\u0010<\u001a\u00020.2\u0006\u0010=\u001a\u00020\fJ\u000e\u0010>\u001a\u00020.2\u0006\u0010?\u001a\u00020\"J\u0006\u0010@\u001a\u00020.J+\u0010A\u001a\u00020.2\u0006\u0010/\u001a\u0002002\f\u0010B\u001a\b\u0012\u0004\u0012\u0002060C2\u0006\u0010D\u001a\u00020EH\u0016\u00a2\u0006\u0002\u0010FJ\b\u0010G\u001a\u00020.H\u0007J\u0006\u0010H\u001a\u00020.J\b\u0010I\u001a\u00020.H\u0007J\u0006\u0010J\u001a\u00020.J\u0016\u0010K\u001a\u00020.2\u0006\u0010L\u001a\u00020M2\u0006\u0010N\u001a\u00020MR\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u0011\u0010\u0017\u001a\u00020\u0018\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0019\u0010\u001aR\u001a\u0010\u001b\u001a\u00020\u001cX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001c\u0010!\u001a\u0004\u0018\u00010\"X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u001a\u0010\'\u001a\u00020(X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010*\"\u0004\b+\u0010,\u00a8\u0006O"}, d2 = {"Lorg/wit/archaeologicalfieldwork/views/hillfort/HillfortPresenter;", "Lorg/wit/archaeologicalfieldwork/views/Base/BasePresenter;", "view", "Lorg/wit/archaeologicalfieldwork/views/Base/BaseView;", "(Lorg/wit/archaeologicalfieldwork/views/Base/BaseView;)V", "defaultLocation", "Lorg/wit/archaeologicalfieldwork/models/LocationModel;", "getDefaultLocation", "()Lorg/wit/archaeologicalfieldwork/models/LocationModel;", "setDefaultLocation", "(Lorg/wit/archaeologicalfieldwork/models/LocationModel;)V", "edit", "", "getEdit", "()Z", "setEdit", "(Z)V", "hillfort", "Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "getHillfort", "()Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "setHillfort", "(Lorg/wit/archaeologicalfieldwork/models/HillfortModel;)V", "locationRequest", "Lcom/google/android/gms/location/LocationRequest;", "getLocationRequest", "()Lcom/google/android/gms/location/LocationRequest;", "locationService", "Lcom/google/android/gms/location/FusedLocationProviderClient;", "getLocationService", "()Lcom/google/android/gms/location/FusedLocationProviderClient;", "setLocationService", "(Lcom/google/android/gms/location/FusedLocationProviderClient;)V", "map", "Lcom/google/android/gms/maps/GoogleMap;", "getMap", "()Lcom/google/android/gms/maps/GoogleMap;", "setMap", "(Lcom/google/android/gms/maps/GoogleMap;)V", "user", "Lorg/wit/archaeologicalfieldwork/models/UserModel;", "getUser", "()Lorg/wit/archaeologicalfieldwork/models/UserModel;", "setUser", "(Lorg/wit/archaeologicalfieldwork/models/UserModel;)V", "doActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "doAddOrSave", "name", "", "description", "visited", "date", "notes", "doCancel", "doCheckBox", "checkBox", "doConfigureMap", "m", "doDelete", "doRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "doResartLocationUpdates", "doSelectImage", "doSetCurrentLocation", "doSetLocation", "locationUpdate", "lat", "", "lng", "app_debug"})
public final class HillfortPresenter extends org.wit.archaeologicalfieldwork.views.Base.BasePresenter {
    @org.jetbrains.annotations.NotNull()
    private org.wit.archaeologicalfieldwork.models.UserModel user;
    @org.jetbrains.annotations.Nullable()
    private com.google.android.gms.maps.GoogleMap map;
    @org.jetbrains.annotations.NotNull()
    private com.google.android.gms.location.FusedLocationProviderClient locationService;
    @org.jetbrains.annotations.NotNull()
    private final com.google.android.gms.location.LocationRequest locationRequest = null;
    @org.jetbrains.annotations.NotNull()
    private org.wit.archaeologicalfieldwork.models.HillfortModel hillfort;
    @org.jetbrains.annotations.NotNull()
    private org.wit.archaeologicalfieldwork.models.LocationModel defaultLocation;
    private boolean edit;
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.models.UserModel getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.UserModel p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final com.google.android.gms.maps.GoogleMap getMap() {
        return null;
    }
    
    public final void setMap(@org.jetbrains.annotations.Nullable()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.FusedLocationProviderClient getLocationService() {
        return null;
    }
    
    public final void setLocationService(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.location.FusedLocationProviderClient p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.location.LocationRequest getLocationRequest() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.models.HillfortModel getHillfort() {
        return null;
    }
    
    public final void setHillfort(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.models.LocationModel getDefaultLocation() {
        return null;
    }
    
    public final void setDefaultLocation(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.LocationModel p0) {
    }
    
    public final boolean getEdit() {
        return false;
    }
    
    public final void setEdit(boolean p0) {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void doSetCurrentLocation() {
    }
    
    public final void doConfigureMap(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap m) {
    }
    
    public final void locationUpdate(double lat, double lng) {
    }
    
    @java.lang.Override()
    public void doRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    public final void doAddOrSave(@org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String description, boolean visited, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String notes) {
    }
    
    public final void doCancel() {
    }
    
    public final void doDelete() {
    }
    
    public final void doSelectImage() {
    }
    
    public final void doCheckBox(boolean checkBox) {
    }
    
    public final void doSetLocation() {
    }
    
    @android.annotation.SuppressLint(value = {"MissingPermission"})
    public final void doResartLocationUpdates() {
    }
    
    @java.lang.Override()
    public void doActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.NotNull()
    android.content.Intent data) {
    }
    
    public HillfortPresenter(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.views.Base.BaseView view) {
        super(null);
    }
}