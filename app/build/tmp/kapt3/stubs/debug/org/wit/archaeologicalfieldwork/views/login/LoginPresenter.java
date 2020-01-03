package org.wit.archaeologicalfieldwork.views.login;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0011\u001a\u00020\u0012J\u0016\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0014\u001a\u00020\u00152\u0006\u0010\u0016\u001a\u00020\u0015J\u0006\u0010\u0017\u001a\u00020\u0012R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR\u001c\u0010\u000b\u001a\u0004\u0018\u00010\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010\u00a8\u0006\u0018"}, d2 = {"Lorg/wit/archaeologicalfieldwork/views/login/LoginPresenter;", "Lorg/wit/archaeologicalfieldwork/views/Base/BasePresenter;", "view", "Lorg/wit/archaeologicalfieldwork/views/Base/BaseView;", "(Lorg/wit/archaeologicalfieldwork/views/Base/BaseView;)V", "auth", "Lcom/google/firebase/auth/FirebaseAuth;", "getAuth", "()Lcom/google/firebase/auth/FirebaseAuth;", "setAuth", "(Lcom/google/firebase/auth/FirebaseAuth;)V", "fireStore", "Lorg/wit/archaeologicalfieldwork/models/firebase/HillfortFireStore;", "getFireStore", "()Lorg/wit/archaeologicalfieldwork/models/firebase/HillfortFireStore;", "setFireStore", "(Lorg/wit/archaeologicalfieldwork/models/firebase/HillfortFireStore;)V", "doForgotPassword", "", "doSignIn", "loginEmail", "", "loginPassword", "doSignUp", "app_debug"})
public final class LoginPresenter extends org.wit.archaeologicalfieldwork.views.Base.BasePresenter {
    @org.jetbrains.annotations.NotNull()
    private com.google.firebase.auth.FirebaseAuth auth;
    @org.jetbrains.annotations.Nullable()
    private org.wit.archaeologicalfieldwork.models.firebase.HillfortFireStore fireStore;
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.auth.FirebaseAuth getAuth() {
        return null;
    }
    
    public final void setAuth(@org.jetbrains.annotations.NotNull()
    com.google.firebase.auth.FirebaseAuth p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    public final org.wit.archaeologicalfieldwork.models.firebase.HillfortFireStore getFireStore() {
        return null;
    }
    
    public final void setFireStore(@org.jetbrains.annotations.Nullable()
    org.wit.archaeologicalfieldwork.models.firebase.HillfortFireStore p0) {
    }
    
    public final void doForgotPassword() {
    }
    
    public final void doSignUp() {
    }
    
    public final void doSignIn(@org.jetbrains.annotations.NotNull()
    java.lang.String loginEmail, @org.jetbrains.annotations.NotNull()
    java.lang.String loginPassword) {
    }
    
    public LoginPresenter(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.views.Base.BaseView view) {
        super(null);
    }
}