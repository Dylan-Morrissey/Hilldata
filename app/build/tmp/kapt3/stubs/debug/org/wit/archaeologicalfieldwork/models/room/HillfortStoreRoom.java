package org.wit.archaeologicalfieldwork.models.room;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\b\u0010\r\u001a\u00020\u000eH\u0016J\b\u0010\u000f\u001a\u00020\u000eH\u0016J\u0010\u0010\u0010\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u0010\u0010\u0013\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\u000e\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015H\u0016J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u0018H\u0016J \u0010\u0019\u001a\u0012\u0012\u0004\u0012\u00020\u00120\u001aj\b\u0012\u0004\u0012\u00020\u0012`\u001b2\u0006\u0010\u001c\u001a\u00020\u001dH\u0016J\u000e\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u00120\u0015H\u0016J\u0010\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0011\u001a\u00020\u0012H\u0016R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u001a\u0010\u0007\u001a\u00020\bX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f\u00a8\u0006 "}, d2 = {"Lorg/wit/archaeologicalfieldwork/models/room/HillfortStoreRoom;", "Lorg/wit/archaeologicalfieldwork/models/HillfortStore;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "getContext", "()Landroid/content/Context;", "dao", "Lorg/wit/archaeologicalfieldwork/models/room/HillfortDao;", "getDao", "()Lorg/wit/archaeologicalfieldwork/models/room/HillfortDao;", "setDao", "(Lorg/wit/archaeologicalfieldwork/models/room/HillfortDao;)V", "clear", "", "clearSearch", "createHillfort", "placemark", "Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "deleteHillfort", "findAllHillforts", "", "findHillfortById", "id", "", "findHillfortName", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "name", "", "findSearchedHillforts", "updateHillfort", "app_debug"})
public final class HillfortStoreRoom implements org.wit.archaeologicalfieldwork.models.HillfortStore {
    @org.jetbrains.annotations.NotNull()
    private org.wit.archaeologicalfieldwork.models.room.HillfortDao dao;
    @org.jetbrains.annotations.NotNull()
    private final android.content.Context context = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.ArrayList<org.wit.archaeologicalfieldwork.models.HillfortModel> findHillfortName(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
        return null;
    }
    
    @java.lang.Override()
    public void clearSearch() {
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> findSearchedHillforts() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.models.room.HillfortDao getDao() {
        return null;
    }
    
    public final void setDao(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.room.HillfortDao p0) {
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
    org.wit.archaeologicalfieldwork.models.HillfortModel placemark) {
    }
    
    @java.lang.Override()
    public void updateHillfort(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel placemark) {
    }
    
    @java.lang.Override()
    public void deleteHillfort(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel placemark) {
    }
    
    @java.lang.Override()
    public void clear() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final android.content.Context getContext() {
        return null;
    }
    
    public HillfortStoreRoom(@org.jetbrains.annotations.NotNull()
    android.content.Context context) {
        super();
    }
    
    public void addFavorite(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel hillfort) {
    }
}