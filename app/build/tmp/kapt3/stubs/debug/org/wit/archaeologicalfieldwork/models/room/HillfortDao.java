package org.wit.archaeologicalfieldwork.models.room;

import java.lang.System;

@androidx.room.Dao()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bg\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u0010\u0010\u0006\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'J\u000e\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00050\bH\'J\u0010\u0010\t\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\u000bH\'J\u0010\u0010\f\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\'\u00a8\u0006\r"}, d2 = {"Lorg/wit/archaeologicalfieldwork/models/room/HillfortDao;", "", "create", "", "hillfort", "Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "deletePlacemark", "findAll", "", "findById", "id", "", "update", "app_debug"})
public abstract interface HillfortDao {
    
    @androidx.room.Insert(onConflict = androidx.room.OnConflictStrategy.REPLACE)
    public abstract void create(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel hillfort);
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "SELECT * FROM HillfortModel")
    public abstract java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> findAll();
    
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Query(value = "select * from HillfortModel where id = :id")
    public abstract org.wit.archaeologicalfieldwork.models.HillfortModel findById(long id);
    
    @androidx.room.Update()
    public abstract void update(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel hillfort);
    
    @androidx.room.Delete()
    public abstract void deletePlacemark(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel hillfort);
}