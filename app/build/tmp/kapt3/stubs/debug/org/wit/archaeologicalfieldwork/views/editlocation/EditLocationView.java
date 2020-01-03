package org.wit.archaeologicalfieldwork.views.editlocation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u00022\u00020\u0003B\u0005\u00a2\u0006\u0002\u0010\u0004J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0014J\u0010\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\fH\u0014J\b\u0010\u0014\u001a\u00020\fH\u0016J\u0010\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0018\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u0019\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0010\u0010\u001a\u001a\u00020\f2\u0006\u0010\u0016\u001a\u00020\u0017H\u0016J\u0012\u0010\u001b\u001a\u00020\u00102\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\fH\u0014J\b\u0010\u001f\u001a\u00020\fH\u0014J\u0010\u0010 \u001a\u00020\f2\u0006\u0010!\u001a\u00020\u000eH\u0014J\u0010\u0010\"\u001a\u00020\f2\u0006\u0010#\u001a\u00020$H\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006%"}, d2 = {"Lorg/wit/archaeologicalfieldwork/views/editlocation/EditLocationView;", "Lorg/wit/archaeologicalfieldwork/views/Base/BaseView;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerDragListener;", "Lcom/google/android/gms/maps/GoogleMap$OnMarkerClickListener;", "()V", "presenter", "Lorg/wit/archaeologicalfieldwork/views/editlocation/EditLocationPresenter;", "getPresenter", "()Lorg/wit/archaeologicalfieldwork/views/editlocation/EditLocationPresenter;", "setPresenter", "(Lorg/wit/archaeologicalfieldwork/views/editlocation/EditLocationPresenter;)V", "onCreate", "", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onDestroy", "onLowMemory", "onMarkerClick", "marker", "Lcom/google/android/gms/maps/model/Marker;", "onMarkerDrag", "onMarkerDragEnd", "onMarkerDragStart", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "onSaveInstanceState", "outState", "showLocation", "location", "Lorg/wit/archaeologicalfieldwork/models/Location;", "app_debug"})
public final class EditLocationView extends org.wit.archaeologicalfieldwork.views.Base.BaseView implements com.google.android.gms.maps.GoogleMap.OnMarkerDragListener, com.google.android.gms.maps.GoogleMap.OnMarkerClickListener {
    @org.jetbrains.annotations.NotNull()
    public org.wit.archaeologicalfieldwork.views.editlocation.EditLocationPresenter presenter;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.views.editlocation.EditLocationPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.views.editlocation.EditLocationPresenter p0) {
    }
    
    @java.lang.Override()
    protected void onCreate(@org.jetbrains.annotations.Nullable()
    android.os.Bundle savedInstanceState) {
    }
    
    @java.lang.Override()
    public void showLocation(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.Location location) {
    }
    
    @java.lang.Override()
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.NotNull()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    public void onMarkerDragStart(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.Marker marker) {
    }
    
    @java.lang.Override()
    public void onMarkerDrag(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.Marker marker) {
    }
    
    @java.lang.Override()
    public void onMarkerDragEnd(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.Marker marker) {
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
    
    public EditLocationView() {
        super();
    }
}