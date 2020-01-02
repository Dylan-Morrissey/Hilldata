package org.wit.archaeologicalfieldwork.activities;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001e\u0010+\u001a\u00020,2\u0006\u0010-\u001a\u00020\u00062\u0006\u0010.\u001a\u00020\u00062\u0006\u0010/\u001a\u000200J.\u00101\u001a\u00020,2\u0006\u00102\u001a\u0002032\u0006\u00104\u001a\u0002032\u0006\u00105\u001a\u00020\u00122\u0006\u00106\u001a\u0002032\u0006\u00107\u001a\u000203J\u0006\u00108\u001a\u00020,J\u000e\u00109\u001a\u00020,2\u0006\u0010:\u001a\u00020\u0012J\u0006\u0010;\u001a\u00020,J\u0006\u0010<\u001a\u00020,J\u0006\u0010=\u001a\u00020,R\u0014\u0010\u0005\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\u0006X\u0086D\u00a2\u0006\b\n\u0000\u001a\u0004\b\n\u0010\bR\u001a\u0010\u000b\u001a\u00020\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u001d\u001a\u00020\u001eX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010#\u001a\u00020$X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b)\u0010*\u00a8\u0006>"}, d2 = {"Lorg/wit/archaeologicalfieldwork/activities/HillfortPresenter;", "", "view", "Lorg/wit/archaeologicalfieldwork/views/hillfort/HillfortView;", "(Lorg/wit/archaeologicalfieldwork/views/hillfort/HillfortView;)V", "IMAGE_REQUEST", "", "getIMAGE_REQUEST", "()I", "LOCATION_REQUEST", "getLOCATION_REQUEST", "app", "Lorg/wit/archaeologicalfieldwork/main/MainApp;", "getApp", "()Lorg/wit/archaeologicalfieldwork/main/MainApp;", "setApp", "(Lorg/wit/archaeologicalfieldwork/main/MainApp;)V", "edit", "", "getEdit", "()Z", "setEdit", "(Z)V", "hillfort", "Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "getHillfort", "()Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "setHillfort", "(Lorg/wit/archaeologicalfieldwork/models/HillfortModel;)V", "location", "Lorg/wit/archaeologicalfieldwork/models/LocationModel;", "getLocation", "()Lorg/wit/archaeologicalfieldwork/models/LocationModel;", "setLocation", "(Lorg/wit/archaeologicalfieldwork/models/LocationModel;)V", "user", "Lorg/wit/archaeologicalfieldwork/models/UserModel;", "getUser", "()Lorg/wit/archaeologicalfieldwork/models/UserModel;", "setUser", "(Lorg/wit/archaeologicalfieldwork/models/UserModel;)V", "getView", "()Lorg/wit/archaeologicalfieldwork/views/hillfort/HillfortView;", "doActivityResult", "", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "doAddOrSave", "name", "", "description", "visited", "date", "notes", "doCancel", "doCheckBox", "checkBox", "doDelete", "doSelectImage", "doSetLocation", "app_debug"})
public final class HillfortPresenter {
    private final int IMAGE_REQUEST = 1;
    private final int LOCATION_REQUEST = 2;
    @org.jetbrains.annotations.NotNull()
    private org.wit.archaeologicalfieldwork.models.UserModel user;
    @org.jetbrains.annotations.NotNull()
    private org.wit.archaeologicalfieldwork.models.HillfortModel hillfort;
    @org.jetbrains.annotations.NotNull()
    private org.wit.archaeologicalfieldwork.models.LocationModel location;
    @org.jetbrains.annotations.NotNull()
    private org.wit.archaeologicalfieldwork.main.MainApp app;
    private boolean edit;
    @org.jetbrains.annotations.NotNull()
    private final org.wit.archaeologicalfieldwork.views.hillfort.HillfortView view = null;
    
    public final int getIMAGE_REQUEST() {
        return 0;
    }
    
    public final int getLOCATION_REQUEST() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.models.UserModel getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.UserModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.models.HillfortModel getHillfort() {
        return null;
    }
    
    public final void setHillfort(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.models.LocationModel getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.LocationModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.main.MainApp getApp() {
        return null;
    }
    
    public final void setApp(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.main.MainApp p0) {
    }
    
    public final boolean getEdit() {
        return false;
    }
    
    public final void setEdit(boolean p0) {
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
    
    public final void doActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.NotNull()
    android.content.Intent data) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.views.hillfort.HillfortView getView() {
        return null;
    }
    
    public HillfortPresenter(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.views.hillfort.HillfortView view) {
        super();
    }
}