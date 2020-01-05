package org.wit.archaeologicalfieldwork.views.settings;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0006\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0014\u001a\u00020\u0015J\u0006\u0010\u0016\u001a\u00020\u0017J\u0006\u0010\u0018\u001a\u00020\u0019J\u0006\u0010\u001a\u001a\u00020\u0019J\u0006\u0010\u001b\u001a\u00020\u0019R\u001a\u0010\u0005\u001a\u00020\u0006X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0007\u0010\b\"\u0004\b\t\u0010\nR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\fX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0011\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013\u00a8\u0006\u001c"}, d2 = {"Lorg/wit/archaeologicalfieldwork/views/settings/SettingsPresenter;", "", "view", "Lorg/wit/archaeologicalfieldwork/views/settings/SettingsView;", "(Lorg/wit/archaeologicalfieldwork/views/settings/SettingsView;)V", "app", "Lorg/wit/archaeologicalfieldwork/main/MainApp;", "getApp", "()Lorg/wit/archaeologicalfieldwork/main/MainApp;", "setApp", "(Lorg/wit/archaeologicalfieldwork/main/MainApp;)V", "hillforts", "", "Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "getHillforts", "()Ljava/util/List;", "setHillforts", "(Ljava/util/List;)V", "getView", "()Lorg/wit/archaeologicalfieldwork/views/settings/SettingsView;", "doDeleteUser", "", "getAverageRate", "", "getFavourites", "", "getImages", "getVisited", "app_debug"})
public final class SettingsPresenter {
    @org.jetbrains.annotations.NotNull()
    private org.wit.archaeologicalfieldwork.main.MainApp app;
    @org.jetbrains.annotations.NotNull()
    private java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> hillforts;
    @org.jetbrains.annotations.NotNull()
    private final org.wit.archaeologicalfieldwork.views.settings.SettingsView view = null;
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.main.MainApp getApp() {
        return null;
    }
    
    public final void setApp(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.main.MainApp p0) {
    }
    
    public final void doDeleteUser() {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> getHillforts() {
        return null;
    }
    
    public final void setHillforts(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> p0) {
    }
    
    public final double getAverageRate() {
        return 0.0;
    }
    
    public final int getFavourites() {
        return 0;
    }
    
    public final int getVisited() {
        return 0;
    }
    
    public final int getImages() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.views.settings.SettingsView getView() {
        return null;
    }
    
    public SettingsPresenter(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.views.settings.SettingsView view) {
        super();
    }
}