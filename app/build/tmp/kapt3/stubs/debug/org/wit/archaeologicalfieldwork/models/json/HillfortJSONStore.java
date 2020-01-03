package org.wit.archaeologicalfieldwork.models.json;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u000f\b\u0016\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\u0002\u0010\u0005J\b\u0010\u000f\u001a\u00020\u0010H\u0016J\u0010\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0016J\u0010\u0010\u0013\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0016J\b\u0010\u0014\u001a\u00020\u0010H\u0002J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\n0\tH\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\n2\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J\b\u0010\u0019\u001a\u00020\u0010H\u0002J\u0010\u0010\u001a\u001a\u00020\u00102\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0011\u0010\u0003\u001a\u00020\u0004\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007R \u0010\b\u001a\b\u0012\u0004\u0012\u00020\n0\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000b\u0010\f\"\u0004\b\r\u0010\u000e\u00a8\u0006\u001b"}, d2 = {"Lorg/wit/archaeologicalfieldwork/models/json/HillfortJSONStore;", "Lorg/wit/archaeologicalfieldwork/models/HillfortStore;", "Lorg/jetbrains/anko/AnkoLogger;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "hillforts", "", "Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "getHillforts", "()Ljava/util/List;", "setHillforts", "(Ljava/util/List;)V", "clear", "", "createHillfort", "hillfort", "deleteHillfort", "deserialize", "findAllHillforts", "findHillfortById", "id", "", "serialize", "updateHillfort", "app_debug"})
public final class HillfortJSONStore implements org.wit.archaeologicalfieldwork.models.HillfortStore, org.jetbrains.anko.AnkoLogger {
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> hillforts;
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> getHillforts() {
        return null;
    }
    
    public final void setHillforts(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> findAllHillforts() {
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
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.wit.archaeologicalfieldwork.models.HillfortModel findHillfortById(long id) {
        return null;
    }
    
    private final void serialize() {
    }
    
    private final void deserialize() {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public HillfortJSONStore(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLoggerTag() {
        return null;
    }
}