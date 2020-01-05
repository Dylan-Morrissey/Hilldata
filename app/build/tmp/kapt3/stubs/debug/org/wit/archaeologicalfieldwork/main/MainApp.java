package org.wit.archaeologicalfieldwork.main;

import java.lang.System;

<<<<<<< HEAD
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\n\u001a\u00020\u000bH\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t\u00a8\u0006\f"}, d2 = {"Lorg/wit/archaeologicalfieldwork/main/MainApp;", "Landroid/app/Application;", "Lorg/jetbrains/anko/AnkoLogger;", "()V", "hillforts", "Lorg/wit/archaeologicalfieldwork/models/HillfortStore;", "getHillforts", "()Lorg/wit/archaeologicalfieldwork/models/HillfortStore;", "setHillforts", "(Lorg/wit/archaeologicalfieldwork/models/HillfortStore;)V", "onCreate", "", "app_debug"})
public final class MainApp extends android.app.Application implements org.jetbrains.anko.AnkoLogger {
    @org.jetbrains.annotations.NotNull()
    public org.wit.archaeologicalfieldwork.models.HillfortStore hillforts;
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.models.HillfortStore getHillforts() {
        return null;
    }
    
    public final void setHillforts(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortStore p0) {
=======
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\u0010\u001a\u00020\u0011H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006\u0012"}, d2 = {"Lorg/wit/archaeologicalfieldwork/main/MainApp;", "Landroid/app/Application;", "Lorg/jetbrains/anko/AnkoLogger;", "()V", "user", "Lorg/wit/archaeologicalfieldwork/models/UserModel;", "getUser", "()Lorg/wit/archaeologicalfieldwork/models/UserModel;", "setUser", "(Lorg/wit/archaeologicalfieldwork/models/UserModel;)V", "users", "Lorg/wit/archaeologicalfieldwork/models/UserStore;", "getUsers", "()Lorg/wit/archaeologicalfieldwork/models/UserStore;", "setUsers", "(Lorg/wit/archaeologicalfieldwork/models/UserStore;)V", "onCreate", "", "app_debug"})
public final class MainApp extends android.app.Application implements org.jetbrains.anko.AnkoLogger {
    @org.jetbrains.annotations.NotNull()
    public org.wit.archaeologicalfieldwork.models.UserStore users;
    @org.jetbrains.annotations.NotNull()
    public org.wit.archaeologicalfieldwork.models.UserModel user;
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.models.UserStore getUsers() {
        return null;
    }
    
    public final void setUsers(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.UserStore p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.models.UserModel getUser() {
        return null;
    }
    
    public final void setUser(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.UserModel p0) {
>>>>>>> 377f6d9accf986e08b58ae4575005f9f6550becc
    }
    
    @java.lang.Override()
    public void onCreate() {
    }
    
    public MainApp() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLoggerTag() {
        return null;
    }
}