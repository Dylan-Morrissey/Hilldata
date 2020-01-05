package org.wit.archaeologicalfieldwork.views.hillfortlist;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\u0006\u0010\u0014\u001a\u00020\u0013J\u0006\u0010\u0015\u001a\u00020\u0013J\u000e\u0010\u0016\u001a\u00020\u00132\u0006\u0010\u0017\u001a\u00020\u0007J\u0006\u0010\u0018\u001a\u00020\u0013J\u000e\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u001a\u001a\u00020\u001bJ\u0006\u0010\u001c\u001a\u00020\u0013J\u0006\u0010\u001d\u001a\u00020\u0013J\u0006\u0010\u001e\u001a\u00020\u0013R \u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u000bR\u001c\u0010\f\u001a\u0004\u0018\u00010\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011\u00a8\u0006\u001f"}, d2 = {"Lorg/wit/archaeologicalfieldwork/views/hillfortlist/HillfortListPresenter;", "Lorg/wit/archaeologicalfieldwork/views/Base/BasePresenter;", "view", "Lorg/wit/archaeologicalfieldwork/views/Base/BaseView;", "(Lorg/wit/archaeologicalfieldwork/views/Base/BaseView;)V", "currentHillforts", "", "Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "getCurrentHillforts", "()Ljava/util/List;", "setCurrentHillforts", "(Ljava/util/List;)V", "fireStore", "Lorg/wit/archaeologicalfieldwork/models/firebase/HillfortFireStore;", "getFireStore", "()Lorg/wit/archaeologicalfieldwork/models/firebase/HillfortFireStore;", "setFireStore", "(Lorg/wit/archaeologicalfieldwork/models/firebase/HillfortFireStore;)V", "clear", "", "clearSearch", "doAddHillfort", "doEditHillfort", "hillfort", "doLogout", "doSearchHillforts", "name", "", "doSettings", "doShowHillfortsMap", "loadHillforts", "app_debug"})
public final class HillfortListPresenter extends org.wit.archaeologicalfieldwork.views.Base.BasePresenter {
    @org.jetbrains.annotations.Nullable()
    private org.wit.archaeologicalfieldwork.models.firebase.HillfortFireStore fireStore;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> currentHillforts;
    
    @org.jetbrains.annotations.Nullable()
    public final org.wit.archaeologicalfieldwork.models.firebase.HillfortFireStore getFireStore() {
        return null;
    }
    
    public final void setFireStore(@org.jetbrains.annotations.Nullable()
    org.wit.archaeologicalfieldwork.models.firebase.HillfortFireStore p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> getCurrentHillforts() {
        return null;
    }
    
    public final void setCurrentHillforts(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> p0) {
    }
    
    public final void doSearchHillforts(@org.jetbrains.annotations.NotNull()
    java.lang.String name) {
    }
    
    public final void doAddHillfort() {
    }
    
    public final void doEditHillfort(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel hillfort) {
    }
    
    public final void doShowHillfortsMap() {
    }
    
    public final void clearSearch() {
    }
    
    public final void clear() {
    }
    
    public final void loadHillforts() {
    }
    
    public final void doLogout() {
    }
    
    public final void doSettings() {
    }
    
    public HillfortListPresenter(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.views.Base.BaseView view) {
        super(null);
    }
}