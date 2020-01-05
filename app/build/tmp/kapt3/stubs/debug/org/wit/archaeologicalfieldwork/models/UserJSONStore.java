package org.wit.archaeologicalfieldwork.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\u0018\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u0014\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0018\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010\u0016\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\nH\u0016J\b\u0010\u0017\u001a\u00020\u0010H\u0002J\u0016\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00120\u00192\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u000e\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\n0\u0019H\u0016J\u001a\u0010\u001b\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\n2\u0006\u0010 \u001a\u00020!H\u0016J\b\u0010\"\u001a\u00020\u0010H\u0002J\u0018\u0010#\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\nH\u0016J\u0010\u0010$\u001a\u00020\u00102\u0006\u0010\u0013\u001a\u00020\nH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006%"}, d2 = {"Lorg/wit/archaeologicalfieldwork/models/UserJSONStore;", "Lorg/wit/archaeologicalfieldwork/models/UserStore;", "Lorg/jetbrains/anko/AnkoLogger;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "users", "", "Lorg/wit/archaeologicalfieldwork/models/UserModel;", "getUsers", "()Ljava/util/List;", "setUsers", "(Ljava/util/List;)V", "createHillfort", "", "hillfortModel", "Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "user", "createUser", "deleteHillfort", "deleteUser", "deserialize", "findAllHillforts", "", "findAllUsers", "findHillfortById", "id", "", "findUser", "findUserEmail", "email", "", "serialize", "updateHillfort", "updateUser", "app_debug"})
public final class UserJSONStore implements org.wit.archaeologicalfieldwork.models.UserStore, org.jetbrains.anko.AnkoLogger {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<org.wit.archaeologicalfieldwork.models.UserModel> users;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wit.archaeologicalfieldwork.models.UserModel> getUsers() {
        return null;
    }
    
    public final void setUsers(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wit.archaeologicalfieldwork.models.UserModel> p0) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.wit.archaeologicalfieldwork.models.UserModel findUser(long id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.wit.archaeologicalfieldwork.models.HillfortModel findHillfortById(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.UserModel user, long id) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.wit.archaeologicalfieldwork.models.UserModel findUserEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<org.wit.archaeologicalfieldwork.models.UserModel> findAllUsers() {
        return null;
    }
    
    @java.lang.Override()
    public void createUser(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.UserModel user) {
    }
    
    @java.lang.Override()
    public void updateUser(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.UserModel user) {
    }
    
    @java.lang.Override()
    public void deleteUser(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.UserModel user) {
    }
    
    @java.lang.Override()
    public void createHillfort(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel hillfortModel, @org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.UserModel user) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> findAllHillforts(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.UserModel user) {
        return null;
    }
    
    @java.lang.Override()
    public void updateHillfort(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel hillfortModel, @org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.UserModel user) {
    }
    
    @java.lang.Override()
    public void deleteHillfort(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel hillfortModel, @org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.UserModel user) {
    }
    
    private final void serialize() {
    }
    
    private final void deserialize() {
    }
    
    public UserJSONStore(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLoggerTag() {
        return null;
    }
}