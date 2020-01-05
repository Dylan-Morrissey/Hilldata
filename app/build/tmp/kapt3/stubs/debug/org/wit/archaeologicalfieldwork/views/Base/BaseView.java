package org.wit.archaeologicalfieldwork.views.Base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b&\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016J\u0016\u0010\f\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u000e2\u0006\u0010\u000f\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u00052\u0006\u0010\u0012\u001a\u00020\u0005J.\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0014\u001a\u00020\u00152\b\b\u0002\u0010\u0016\u001a\u00020\u00172\b\b\u0002\u0010\u0018\u001a\u00020\u00192\n\b\u0002\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\"\u0010\u001c\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00172\u0006\u0010\u001e\u001a\u00020\u00172\b\u0010\u001f\u001a\u0004\u0018\u00010 H\u0014J\b\u0010!\u001a\u00020\u000bH\u0014J+\u0010\"\u001a\u00020\u000b2\u0006\u0010\u001d\u001a\u00020\u00172\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00190$2\u0006\u0010%\u001a\u00020&H\u0016\u00a2\u0006\u0002\u0010\'J\u0010\u0010(\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bJ\u0010\u0010)\u001a\u00020\u000b2\u0006\u0010*\u001a\u00020+H\u0016J\u0016\u0010,\u001a\u00020\u000b2\f\u0010*\u001a\b\u0012\u0004\u0012\u00020+0-H\u0016J\u0010\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u000200H\u0016J\b\u00101\u001a\u00020\u000bH\u0016R\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u00062"}, d2 = {"Lorg/wit/archaeologicalfieldwork/views/Base/BaseView;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/jetbrains/anko/AnkoLogger;", "()V", "basePresenter", "Lorg/wit/archaeologicalfieldwork/views/Base/BasePresenter;", "getBasePresenter", "()Lorg/wit/archaeologicalfieldwork/views/Base/BasePresenter;", "setBasePresenter", "(Lorg/wit/archaeologicalfieldwork/views/Base/BasePresenter;)V", "hideProgress", "", "init", "toolbar", "Landroidx/appcompat/widget/Toolbar;", "upEnabled", "", "initPresenter", "presenter", "navigateTo", "view", "Lorg/wit/archaeologicalfieldwork/views/Base/VIEW;", "code", "", "key", "", "value", "Landroid/os/Parcelable;", "onActivityResult", "requestCode", "resultCode", "data", "Landroid/content/Intent;", "onDestroy", "onRequestPermissionsResult", "permissions", "", "grantResults", "", "(I[Ljava/lang/String;[I)V", "share", "showHillfort", "hillfort", "Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "showHillforts", "", "showLocation", "location", "Lorg/wit/archaeologicalfieldwork/models/LocationModel;", "showProgress", "app_debug"})
public abstract class BaseView extends androidx.appcompat.app.AppCompatActivity implements org.jetbrains.anko.AnkoLogger {
    @org.jetbrains.annotations.Nullable()
    private org.wit.archaeologicalfieldwork.views.Base.BasePresenter basePresenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.Nullable()
    public final org.wit.archaeologicalfieldwork.views.Base.BasePresenter getBasePresenter() {
        return null;
    }
    
    public final void setBasePresenter(@org.jetbrains.annotations.Nullable()
    org.wit.archaeologicalfieldwork.views.Base.BasePresenter p0) {
    }
    
    public final void navigateTo(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.views.Base.VIEW view, int code, @org.jetbrains.annotations.NotNull()
    java.lang.String key, @org.jetbrains.annotations.Nullable()
    android.os.Parcelable value) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.views.Base.BasePresenter initPresenter(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.views.Base.BasePresenter presenter) {
        return null;
    }
    
    public final void share(@org.jetbrains.annotations.Nullable()
    android.os.Parcelable value) {
    }
    
    public final void init(@org.jetbrains.annotations.NotNull()
    androidx.appcompat.widget.Toolbar toolbar, boolean upEnabled) {
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
    }
    
    @java.lang.Override()
    public void onRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResults) {
    }
    
    public void showHillfort(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel hillfort) {
    }
    
    public void showHillforts(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> hillfort) {
    }
    
    public void showLocation(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.LocationModel location) {
    }
    
    public void showProgress() {
    }
    
    public void hideProgress() {
    }
    
    public BaseView() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLoggerTag() {
        return null;
    }
}