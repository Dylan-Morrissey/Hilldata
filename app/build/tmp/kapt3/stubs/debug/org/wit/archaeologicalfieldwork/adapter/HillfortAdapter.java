package org.wit.archaeologicalfieldwork.adapter;

import java.lang.System;

@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0013B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0007\u00a2\u0006\u0002\u0010\bJ\b\u0010\t\u001a\u00020\nH\u0016J\u0018\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\nH\u0016J\u0018\u0010\u000f\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00020\nH\u0016R\u0014\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004X\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0014"}, d2 = {"Lorg/wit/archaeologicalfieldwork/adapter/HillfortAdapter;", "Landroidx/recyclerview/widget/RecyclerView$Adapter;", "Lorg/wit/archaeologicalfieldwork/adapter/HillfortAdapter$MainHolder;", "hillforts", "", "Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "listener", "Lorg/wit/archaeologicalfieldwork/adapter/HillfortListener;", "(Ljava/util/List;Lorg/wit/archaeologicalfieldwork/adapter/HillfortListener;)V", "getItemCount", "", "onBindViewHolder", "", "holder", "position", "onCreateViewHolder", "parent", "Landroid/view/ViewGroup;", "viewType", "MainHolder", "app_debug"})
public final class HillfortAdapter extends androidx.recyclerview.widget.RecyclerView.Adapter<org.wit.archaeologicalfieldwork.adapter.HillfortAdapter.MainHolder> {
    private java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> hillforts;
    private final org.wit.archaeologicalfieldwork.adapter.HillfortListener listener = null;
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public org.wit.archaeologicalfieldwork.adapter.HillfortAdapter.MainHolder onCreateViewHolder(@org.jetbrains.annotations.NotNull()
    android.view.ViewGroup parent, int viewType) {
        return null;
    }
    
    @java.lang.Override()
    public void onBindViewHolder(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.adapter.HillfortAdapter.MainHolder holder, int position) {
    }
    
    @java.lang.Override()
    public int getItemCount() {
        return 0;
    }
    
    public HillfortAdapter(@org.jetbrains.annotations.NotNull()
    java.util.List<org.wit.archaeologicalfieldwork.models.HillfortModel> hillforts, @org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.adapter.HillfortListener listener) {
        super();
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0016\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\n\u00a8\u0006\u000b"}, d2 = {"Lorg/wit/archaeologicalfieldwork/adapter/HillfortAdapter$MainHolder;", "Landroidx/recyclerview/widget/RecyclerView$ViewHolder;", "itemView", "Landroid/view/View;", "(Landroid/view/View;)V", "bind", "", "hillfort", "Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "listener", "Lorg/wit/archaeologicalfieldwork/adapter/HillfortListener;", "app_debug"})
    public static final class MainHolder extends androidx.recyclerview.widget.RecyclerView.ViewHolder {
        
        public final void bind(@org.jetbrains.annotations.NotNull()
        org.wit.archaeologicalfieldwork.models.HillfortModel hillfort, @org.jetbrains.annotations.NotNull()
        org.wit.archaeologicalfieldwork.adapter.HillfortListener listener) {
        }
        
        public MainHolder(@org.jetbrains.annotations.NotNull()
        android.view.View itemView) {
            super(null);
        }
    }
}