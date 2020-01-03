package org.wit.archaeologicalfieldwork.models.firebase;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u001f\u001a\u00020 H\u0016J\u0010\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0010H\u0016J\u0010\u0010#\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0010H\u0016J\u0014\u0010$\u001a\u00020 2\f\u0010%\u001a\b\u0012\u0004\u0012\u00020 0&J\u000e\u0010\'\u001a\b\u0012\u0004\u0012\u00020\u00100(H\u0016J\u0012\u0010)\u001a\u0004\u0018\u00010\u00102\u0006\u0010*\u001a\u00020+H\u0016J\u0010\u0010,\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0010H\u0016J\u000e\u0010-\u001a\u00020 2\u0006\u0010\"\u001a\u00020\u0010R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R\u001a\u0010\b\u001a\u00020\tX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\n\u0010\u000b\"\u0004\b\f\u0010\rR\u0017\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0013\u001a\u00020\u0014X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0015\u0010\u0016\"\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0019\u001a\u00020\u001aX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e\u00a8\u0006."}, d2 = {"Lorg/wit/archaeologicalfieldwork/models/firebase/HillfortFireStore;", "Lorg/wit/archaeologicalfieldwork/models/HillfortStore;", "Lorg/jetbrains/anko/AnkoLogger;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "db", "Lcom/google/firebase/database/DatabaseReference;", "getDb", "()Lcom/google/firebase/database/DatabaseReference;", "setDb", "(Lcom/google/firebase/database/DatabaseReference;)V", "hillforts", "Ljava/util/ArrayList;", "Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "getHillforts", "()Ljava/util/ArrayList;", "st", "Lcom/google/firebase/storage/StorageReference;", "getSt", "()Lcom/google/firebase/storage/StorageReference;", "setSt", "(Lcom/google/firebase/storage/StorageReference;)V", "userId", "", "getUserId", "()Ljava/lang/String;", "setUserId", "(Ljava/lang/String;)V", "clear", "", "createHillfort", "hillfort", "deleteHillfort", "fetchHillforts", "placemarksReady", "Lkotlin/Function0;", "findAllHillforts", "", "findHillfortById", "id", "", "updateHillfort", "updateImage", "app_debug"})
public final class HillfortFireStore implements org.wit.archaeologicalfieldwork.models.HillfortStore, org.jetbrains.anko.AnkoLogger {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<org.wit.archaeologicalfieldwork.models.HillfortModel> hillforts = null;
    @org.jetbrains.annotations.NotNull()
    public java.lang.String userId;
    @org.jetbrains.annotations.NotNull()
    public com.google.firebase.database.DatabaseReference db;
    @org.jetbrains.annotations.NotNull()
    public com.google.firebase.storage.StorageReference st;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<org.wit.archaeologicalfieldwork.models.HillfortModel> getHillforts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getUserId() {
        return null;
    }
    
    public final void setUserId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.database.DatabaseReference getDb() {
        return null;
    }
    
    public final void setDb(@org.jetbrains.annotations.NotNull()
    com.google.firebase.database.DatabaseReference p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.firebase.storage.StorageReference getSt() {
        return null;
    }
    
    public final void setSt(@org.jetbrains.annotations.NotNull()
    com.google.firebase.storage.StorageReference p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> findAllHillforts() {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.wit.archaeologicalfieldwork.models.HillfortModel findHillfortById(long id) {
        return null;
    }
    
    @java.lang.Override()
    public void createHillfort(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel hillfort) {
    }
    
    @java.lang.Override()
    public void updateHillfort(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel hillfort) {
    }
    
    @java.lang.Override()
    public void deleteHillfort(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel hillfort) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public final void fetchHillforts(@org.jetbrains.annotations.NotNull()
    kotlin.jvm.functions.Function0<kotlin.Unit> placemarksReady) {
    }
    
    public final void updateImage(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel hillfort) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public HillfortFireStore(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLoggerTag() {
        return null;
    }
}