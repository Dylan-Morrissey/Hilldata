package org.wit.archaeologicalfieldwork.views.Base;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0003\b\u0016\u0018\u00002\u00020\u0001B\u000f\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u00a2\u0006\u0002\u0010\u0004J \u0010\u000e\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u0014H\u0016J+\u0010\u0015\u001a\u00020\u000f2\u0006\u0010\u0010\u001a\u00020\u00112\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00180\u00172\u0006\u0010\u0019\u001a\u00020\u001aH\u0016\u00a2\u0006\u0002\u0010\u001bJ\b\u0010\u001c\u001a\u00020\u000fH\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0096\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u0002\u001a\u0004\u0018\u00010\u0003X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u0004\u00a8\u0006\u001d"}, d2 = {"Lorg/wit/archaeologicalfieldwork/views/Base/BasePresenter;", "", "view", "Lorg/wit/archaeologicalfieldwork/views/Base/BaseView;", "(Lorg/wit/archaeologicalfieldwork/views/Base/BaseView;)V", "app", "Lorg/wit/archaeologicalfieldwork/main/MainApp;", "getApp", "()Lorg/wit/archaeologicalfieldwork/main/MainApp;", "setApp", "(Lorg/wit/archaeologicalfieldwork/main/MainApp;)V", "getView", "()Lorg/wit/archaeologicalfieldwork/views/Base/BaseView;", "setView", "doActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "doRequestPermissionsResult", "permissions", "", "", "grantResult", "", "(I[Ljava/lang/String;[I)V", "onDestrop", "app_debug"})
public class BasePresenter {
    @org.jetbrains.annotations.NotNull()
    private org.wit.archaeologicalfieldwork.main.MainApp app;
    @org.jetbrains.annotations.Nullable()
    private org.wit.archaeologicalfieldwork.views.Base.BaseView view;
    
    @org.jetbrains.annotations.NotNull()
    public org.wit.archaeologicalfieldwork.main.MainApp getApp() {
        return null;
    }
    
    public void setApp(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.main.MainApp p0) {
    }
    
    public void doActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.NotNull()
    android.content.Intent data) {
    }
    
    public void doRequestPermissionsResult(int requestCode, @org.jetbrains.annotations.NotNull()
    java.lang.String[] permissions, @org.jetbrains.annotations.NotNull()
    int[] grantResult) {
    }
    
    public void onDestrop() {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wit.archaeologicalfieldwork.views.Base.BaseView getView() {
        return null;
    }
    
    public final void setView(@org.jetbrains.annotations.Nullable()
    org.wit.archaeologicalfieldwork.views.Base.BaseView p0) {
    }
    
    public BasePresenter(@org.jetbrains.annotations.Nullable()
    org.wit.archaeologicalfieldwork.views.Base.BaseView view) {
        super();
    }
}