package org.wit.archaeologicalfieldwork.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\bf\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\b\u0010\u0006\u001a\u00020\u0003H&J\b\u0010\u0007\u001a\u00020\u0003H&J\u0010\u0010\b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u0010\u0010\t\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&J\u000e\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH&J\u000e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH&J\u0012\u0010\r\u001a\u0004\u0018\u00010\u00052\u0006\u0010\u000e\u001a\u00020\u000fH&J \u0010\u0010\u001a\u0012\u0012\u0004\u0012\u00020\u00050\u0011j\b\u0012\u0004\u0012\u00020\u0005`\u00122\u0006\u0010\u0013\u001a\u00020\u0014H&J\u000e\u0010\u0015\u001a\b\u0012\u0004\u0012\u00020\u00050\u000bH&J\u0010\u0010\u0016\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H&\u00a8\u0006\u0017"}, d2 = {"Lorg/wit/archaeologicalfieldwork/models/HillfortStore;", "", "addFavorite", "", "hillfort", "Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "clear", "clearSearch", "createHillfort", "deleteHillfort", "findAllFavorites", "", "findAllHillforts", "findHillfortById", "id", "", "findHillfortName", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "name", "", "findSearchedHillforts", "updateHillfort", "app_debug"})
public abstract interface HillfortStore {
    
    @org.jetbrains.annotations.Nullable()
    public abstract org.wit.archaeologicalfieldwork.models.HillfortModel findHillfortById(long id);
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> findAllHillforts();
    
    @org.jetbrains.annotations.NotNull()
    public abstract java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> findAllFavorites();
    
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
    
    public abstract void addFavorite(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel hillfort);
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public final class DefaultImpls {
        
        public static void addFavorite(org.wit.archaeologicalfieldwork.models.HillfortStore $this, @org.jetbrains.annotations.NotNull()
        org.wit.archaeologicalfieldwork.models.HillfortModel hillfort) {
        }
    }
}