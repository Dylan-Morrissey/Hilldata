package org.wit.archaeologicalfieldwork.models.mem;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0003\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\b\u0010\t\u001a\u00020\nH\u0016J\u0010\u0010\u000b\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016J\u0010\u0010\r\u001a\u00020\n2\u0006\u0010\u000e\u001a\u00020\u0006H\u0016J\u000e\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u0010H\u0016J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0012\u001a\u00020\u0013H\u0016J\u0006\u0010\u0014\u001a\u00020\nJ\u0010\u0010\u0015\u001a\u00020\n2\u0006\u0010\f\u001a\u00020\u0006H\u0016R\u0017\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b\u00a8\u0006\u0016"}, d2 = {"Lorg/wit/archaeologicalfieldwork/models/mem/HillfortMemStore;", "Lorg/wit/archaeologicalfieldwork/models/HillfortStore;", "Lorg/jetbrains/anko/AnkoLogger;", "()V", "hillforts", "Ljava/util/ArrayList;", "Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "getHillforts", "()Ljava/util/ArrayList;", "clear", "", "createHillfort", "hillfort", "deleteHillfort", "placemark", "findAllHillforts", "", "findHillfortById", "id", "", "logAll", "updateHillfort", "app_debug"})
public final class HillfortMemStore implements org.wit.archaeologicalfieldwork.models.HillfortStore, org.jetbrains.anko.AnkoLogger {
    @org.jetbrains.annotations.NotNull()
    private final java.util.ArrayList<org.wit.archaeologicalfieldwork.models.HillfortModel> hillforts = null;
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.ArrayList<org.wit.archaeologicalfieldwork.models.HillfortModel> getHillforts() {
        return null;
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
    org.wit.archaeologicalfieldwork.models.HillfortModel placemark) {
    }
    
    @org.jetbrains.annotations.Nullable()
    @java.lang.Override()
    public org.wit.archaeologicalfieldwork.models.HillfortModel findHillfortById(long id) {
        return null;
    }
    
    public final void logAll() {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    public HillfortMemStore() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull()
    public java.lang.String getLoggerTag() {
        return null;
    }
}