package org.wit.archaeologicalfieldwork.models;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\bf\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H&J\u0010\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u0010\u0010\u0007\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&J\u000e\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00060\tH&J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u000b\u001a\u00020\fH&J\u0010\u0010\r\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0006H&\u00a8\u0006\u000e"}, d2 = {"Lorg/wit/archaeologicalfieldwork/models/HillfortStore;", "", "clear", "", "createHillfort", "hillfort", "Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "deleteHillfort", "findAllHillforts", "", "findHillfortById", "id", "", "updateHillfort", "app_debug"})
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
}