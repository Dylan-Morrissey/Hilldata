package org.wit.archaeologicalfieldwork.views.editlocation;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0006\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eJ\u0006\u0010\u000f\u001a\u00020\fJ\u0016\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012J\u000e\u0010\u0014\u001a\u00020\f2\u0006\u0010\u0015\u001a\u00020\u0016R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\n\u00a8\u0006\u0017"}, d2 = {"Lorg/wit/archaeologicalfieldwork/views/editlocation/EditLocationPresenter;", "Lorg/wit/archaeologicalfieldwork/views/Base/BasePresenter;", "view", "Lorg/wit/archaeologicalfieldwork/views/Base/BaseView;", "(Lorg/wit/archaeologicalfieldwork/views/Base/BaseView;)V", "location", "Lorg/wit/archaeologicalfieldwork/models/LocationModel;", "getLocation", "()Lorg/wit/archaeologicalfieldwork/models/LocationModel;", "setLocation", "(Lorg/wit/archaeologicalfieldwork/models/LocationModel;)V", "doConfigureMap", "", "map", "Lcom/google/android/gms/maps/GoogleMap;", "doSave", "doUpdateLocation", "lat", "", "lng", "doUpdateMarker", "marker", "Lcom/google/android/gms/maps/model/Marker;", "app_debug"})
public final class EditLocationPresenter extends org.wit.archaeologicalfieldwork.views.Base.BasePresenter {
    @org.jetbrains.annotations.NotNull()
    private org.wit.archaeologicalfieldwork.models.LocationModel location;
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.models.LocationModel getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.LocationModel p0) {
    }
    
    public final void doConfigureMap(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.GoogleMap map) {
    }
    
    public final void doUpdateLocation(double lat, double lng) {
    }
    
    public final void doSave() {
    }
    
    public final void doUpdateMarker(@org.jetbrains.annotations.NotNull()
    com.google.android.gms.maps.model.Marker marker) {
    }
    
    public EditLocationPresenter(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.views.Base.BaseView view) {
        super(null);
    }
}