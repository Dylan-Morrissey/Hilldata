package org.wit.archaeologicalfieldwork.views.signup;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u000e\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u0013J\u0012\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0014R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0018"}, d2 = {"Lorg/wit/archaeologicalfieldwork/views/signup/SignUpView;", "Landroidx/appcompat/app/AppCompatActivity;", "Lorg/jetbrains/anko/AnkoLogger;", "()V", "newuser", "Lorg/wit/archaeologicalfieldwork/models/UserModel;", "getNewuser", "()Lorg/wit/archaeologicalfieldwork/models/UserModel;", "setNewuser", "(Lorg/wit/archaeologicalfieldwork/models/UserModel;)V", "presenter", "Lorg/wit/archaeologicalfieldwork/views/signup/SignUpPresenter;", "getPresenter", "()Lorg/wit/archaeologicalfieldwork/views/signup/SignUpPresenter;", "setPresenter", "(Lorg/wit/archaeologicalfieldwork/views/signup/SignUpPresenter;)V", "isEmailValid", "", "email", "", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "app_debug"})
public final class SignUpView extends androidx.appcompat.app.AppCompatActivity implements org.jetbrains.anko.AnkoLogger {
    @org.jetbrains.annotations.NotNull()
    private org.wit.archaeologicalfieldwork.models.UserModel newuser;
    @org.jetbrains.annotations.NotNull()
    public org.wit.archaeologicalfieldwork.views.signup.SignUpPresenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.models.UserModel getNewuser() {
        return null;
    }
    
    public final void setNewuser(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.UserModel p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.views.signup.SignUpPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.views.signup.SignUpPresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    public final boolean isEmailValid(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return false;
    }
    
    public SignUpView() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLoggerTag() {
        return null;
    }
}