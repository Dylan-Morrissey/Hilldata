package org.wit.archaeologicalfieldwork.views.hillfort;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u00012\u00020\u0002B\u0005\u00a2\u0006\u0002\u0010\u0003J\"\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\u00132\u0006\u0010\u0014\u001a\u00020\u00132\b\u0010\u0015\u001a\u0004\u0018\u00010\u0016H\u0014J\u0012\u0010\u0017\u001a\u00020\u00112\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\u0012\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dH\u0016J\b\u0010\u001e\u001a\u00020\u0011H\u0014J\b\u0010\u001f\u001a\u00020\u0011H\u0016J\u0012\u0010 \u001a\u00020\u001b2\b\u0010!\u001a\u0004\u0018\u00010\"H\u0016J\b\u0010#\u001a\u00020\u0011H\u0014J\b\u0010$\u001a\u00020\u0011H\u0014J\u0010\u0010%\u001a\u00020\u00112\u0006\u0010&\u001a\u00020\u0019H\u0014J\u0010\u0010\'\u001a\u00020\u00112\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u0010\u0010(\u001a\u00020\u00112\u0006\u0010)\u001a\u00020*H\u0016R\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001a\u0010\n\u001a\u00020\u000bX\u0086.\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u00a8\u0006+"}, d2 = {"Lorg/wit/archaeologicalfieldwork/views/hillfort/HillfortView;", "Lorg/wit/archaeologicalfieldwork/views/Base/BaseView;", "Lorg/jetbrains/anko/AnkoLogger;", "()V", "hillfort", "Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "getHillfort", "()Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "setHillfort", "(Lorg/wit/archaeologicalfieldwork/models/HillfortModel;)V", "presenter", "Lorg/wit/archaeologicalfieldwork/views/hillfort/HillfortPresenter;", "getPresenter", "()Lorg/wit/archaeologicalfieldwork/views/hillfort/HillfortPresenter;", "setPresenter", "(Lorg/wit/archaeologicalfieldwork/views/hillfort/HillfortPresenter;)V", "onActivityResult", "", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onCreateOptionsMenu", "", "menu", "Landroid/view/Menu;", "onDestroy", "onLowMemory", "onOptionsItemSelected", "item", "Landroid/view/MenuItem;", "onPause", "onResume", "onSaveInstanceState", "outState", "showHillfort", "showLocation", "location", "Lorg/wit/archaeologicalfieldwork/models/LocationModel;", "app_debug"})
public final class HillfortView extends org.wit.archaeologicalfieldwork.views.Base.BaseView implements org.jetbrains.anko.AnkoLogger {
    @org.jetbrains.annotations.NotNull()
    public org.wit.archaeologicalfieldwork.views.hillfort.HillfortPresenter presenter;
    @org.jetbrains.annotations.NotNull()
    private org.wit.archaeologicalfieldwork.models.HillfortModel hillfort;
    private java.util.HashMap _$_findViewCache;
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.views.hillfort.HillfortPresenter getPresenter() {
        return null;
    }
    
    public final void setPresenter(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.views.hillfort.HillfortPresenter p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.models.HillfortModel getHillfort() {
        return null;
    }
    
    public final void setHillfort(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.HillfortModel p0) {
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
    public boolean onCreateOptionsMenu(@org.jetbrains.annotations.Nullable()
    android.view.Menu menu) {
        return false;
    }
    
    @java.lang.Override()
    public void showLocation(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.LocationModel location) {
    }
    
    @java.lang.Override()
    public boolean onOptionsItemSelected(@org.jetbrains.annotations.Nullable()
    android.view.MenuItem item) {
        return false;
    }
    
    @java.lang.Override()
    protected void onActivityResult(int requestCode, int resultCode, @org.jetbrains.annotations.Nullable()
    android.content.Intent data) {
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
    
    public HillfortView() {
        super();
    }
}