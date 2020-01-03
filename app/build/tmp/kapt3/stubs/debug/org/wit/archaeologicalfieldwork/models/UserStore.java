package org.wit.archaeologicalfieldwork.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0018\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0018\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\n\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0016\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\f2\u0006\u0010\u0006\u001a\u00020\u0007H&J\u000e\u0010\r\u001a\b\u0012\u0004\u0012\u00020\u00070\fH&J\u001a\u0010\u000e\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u0006\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000f\u001a\u00020\u0010H&J\u0012\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u0013\u001a\u00020\u0014H&J\u0018\u0010\u0015\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\u0017"}, d2 = {"Lorg/wit/archaeologicalfieldwork/models/UserStore;", "", "createHillfort", "", "hillfort", "Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "user", "Lorg/wit/archaeologicalfieldwork/models/UserModel;", "createUser", "deleteHillfort", "deleteUser", "findAllHillforts", "", "findAllUsers", "findHillfortById", "id", "", "findUser", "findUserEmail", "email", "", "updateHillfort", "updateUser", "app_debug"})
public abstract interface UserStore {
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wit.archaeologicalfieldwork.models.UserModel> findAllUsers();
    
    public abstract void createUser(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.UserModel user);
    
    public abstract void updateUser(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.UserModel user);
    
    public abstract void deleteUser(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.UserModel user);
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.wit.archaeologicalfieldwork.models.UserModel findUser(long id);
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.wit.archaeologicalfieldwork.models.UserModel findUserEmail(@org.jetbrains.annotations.NotNull()
    java.lang.String email);
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.wit.archaeologicalfieldwork.models.HillfortModel findHillfortById(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.UserModel user, long id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> findAllHillforts(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.UserModel user);
    
    public abstract void createHillfort(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel hillfort, @org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.UserModel user);
    
    public abstract void updateHillfort(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel hillfort, @org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.UserModel user);
    
    public abstract void deleteHillfort(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel hillfort, @org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.UserModel user);
}