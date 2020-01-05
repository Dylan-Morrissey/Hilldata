package org.wit.archaeologicalfieldwork.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\b\u0010\u0004\u001a\u00020\u0003H&J\u0010\u0010\u0005\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&J\u000e\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00070\nH&J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u00072\u0006\u0010\f\u001a\u00020\rH&J \u0010\u000e\u001a\u0012\u0012\u0004\u0012\u00020\u00070\u000fj\b\u0012\u0004\u0012\u00020\u0007`\u00102\u0006\u0010\u0011\u001a\u00020\u0012H&J\u000e\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00070\nH&J\u0010\u0010\u0014\u001a\u00020\u00032\u0006\u0010\u0006\u001a\u00020\u0007H&\u00a8\u0006\u0015"}, d2 = {"Lorg/wit/archaeologicalfieldwork/models/HillfortStore;", "", "clear", "", "clearSearch", "createHillfort", "hillfort", "Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "deleteHillfort", "findAllHillforts", "", "findHillfortById", "id", "", "findHillfortName", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "name", "", "findSearchedHillforts", "updateHillfort", "app_debug"})
public abstract interface HillfortStore {
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.wit.archaeologicalfieldwork.models.HillfortModel findHillfortById(long id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> findAllHillforts();
    
    public abstract void createHillfort(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel hillfort);
    
    public abstract void updateHillfort(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel hillfort);
    
    public abstract void deleteHillfort(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel hillfort);
    
    public abstract void clear();
    
    public abstract void clearSearch();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> findSearchedHillforts();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.ArrayList<org.wit.archaeologicalfieldwork.models.HillfortModel> findHillfortName(@org.jetbrains.annotations.NotNull()
    java.lang.String name);
}