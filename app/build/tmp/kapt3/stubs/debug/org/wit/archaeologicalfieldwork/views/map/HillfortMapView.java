package org.wit.archaeologicalfieldwork.views.map;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\u0012\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0013H\u0014J\b\u0010\u0014\u001a\u00020\u0011H\u0014J\b\u0010\u0015\u001a\u00020\u0011H\u0016J\u0010\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0018\u001a\u00020\u0019H\u0016J\b\u0010\u001a\u001a\u00020\u0011H\u0014J\b\u0010\u001b\u001a\u00020\u0011H\u0014J\u0010\u0010\u001c\u001a\u00020\u00112\u0006\u0010\u001d\u001a\u00020\u0013H\u0014J\u0010\u0010\u001e\u001a\u00020\u00112\u0006\u0010\u001f\u001a\u00020 H\u0016J\u0016\u0010!\u001a\u00020\u00112\f\u0010\"\u001a\b\u0012\u0004\u0012\u00020 0#H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006$"}, d2 = {"Lorg/wit/archaeologicalfieldwork/views/map/HillfortMapView;", "Lorg/wit/archaeologicalfieldwork/views/Base/BaseView;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;", "()V", "map", "Lcom/google/android/gms/maps/GoogleMap;", "getMap", "()Lcom/google/android/gms/maps/GoogleMap;", "setMap", "(Lcom/google/android/gms/maps/GoogleMap;)V", "presenter", "Lorg/wit/archaeologicalfieldwork/views/map/HillfortMapPresenter;", "getPresenter", "()Lorg/wit/archaeologicalfieldwork/views/map/HillfortMapPresenter;", "setPresenter", "(Lorg/wit/archaeologicalfieldwork/views/map/HillfortMapPresenter;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onDestroy", "onLowMemory", "onMarkerClick", "", "marker", "Lcom/google/android/gms/maps/model/Marker;", "onPause", "onResume", "onSaveInstanceState", "outState", "showHillfort", "hillfort", "Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "showHillforts", "hillforts", "", "app_debug"})
public final class HillfortMapView extends org.wit.archaeologicalfieldwork.views.Base.BaseView implements com.google.android.gms.maps.GoogleMap.OnMarkerClickListener {
    @org.jetbrains.annotations.NotNull()
    public org.wit.archaeologicalfieldwork.views.map.HillfortMapPresenter presenter;
    @org.jetbrains.annotations.NotNull()
    public com.google.android.gms.maps.GoogleMap map;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.views.map.HillfortMapPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.views.map.HillfortMapPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final com.google.android.gms.maps.GoogleMap getMap() {
        return null;
    }
    
    public final void setMap(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void showHillfort(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel hillfort) {
    }
    
    @java.lang.Override()
    public void showHillforts(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> hillforts) {
    }
    
    @java.lang.Override()
    public boolean onMarkerClick(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.Marker marker) {
        return false;
    }
    
    @java.lang.Override()
    protected void onDestroy() {
    }
    
    @java.lang.Override()
    public void onLowMemory() {
    }
    
    @java.lang.Override()
    protected void onPause() {
    }
    
    @java.lang.Override()
    protected void onResume() {
    }
    
    @java.lang.Override()
    protected void onSaveInstanceState(@org.jetbrains.annotations.NotNull()
    android.os.Bundle outState) {
    }
    
    public HillfortMapView() {
        super();
    }
}