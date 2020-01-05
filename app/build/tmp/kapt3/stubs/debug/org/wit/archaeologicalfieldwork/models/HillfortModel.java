package org.wit.archaeologicalfieldwork.models;

import java.lang.System;

@androidx.room.Entity()
@kotlinx.android.parcel.Parcelize()
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b0\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001Bs\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000b\u001a\u00020\u0005\u0012\b\b\u0002\u0010\f\u001a\u00020\r\u0012\b\b\u0002\u0010\u000e\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u000f\u001a\u00020\t\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u0011\u00a2\u0006\u0002\u0010\u0012J\t\u00103\u001a\u00020\u0003H\u00c6\u0003J\t\u00104\u001a\u00020\tH\u00c6\u0003J\t\u00105\u001a\u00020\u0011H\u00c6\u0003J\t\u00106\u001a\u00020\u0005H\u00c6\u0003J\t\u00107\u001a\u00020\u0005H\u00c6\u0003J\t\u00108\u001a\u00020\u0005H\u00c6\u0003J\t\u00109\u001a\u00020\tH\u00c6\u0003J\t\u0010:\u001a\u00020\u0005H\u00c6\u0003J\t\u0010;\u001a\u00020\u0005H\u00c6\u0003J\t\u0010<\u001a\u00020\rH\u00c6\u0003J\t\u0010=\u001a\u00020\u0005H\u00c6\u0003Jw\u0010>\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\t2\b\b\u0002\u0010\n\u001a\u00020\u00052\b\b\u0002\u0010\u000b\u001a\u00020\u00052\b\b\u0002\u0010\f\u001a\u00020\r2\b\b\u0002\u0010\u000e\u001a\u00020\u00052\b\b\u0002\u0010\u000f\u001a\u00020\t2\b\b\u0002\u0010\u0010\u001a\u00020\u0011H\u00c6\u0001J\t\u0010?\u001a\u00020\rH\u00d6\u0001J\u0013\u0010@\u001a\u00020\t2\b\u0010A\u001a\u0004\u0018\u00010BH\u00d6\u0003J\t\u0010C\u001a\u00020\rH\u00d6\u0001J\t\u0010D\u001a\u00020\u0005H\u00d6\u0001J\u0019\u0010E\u001a\u00020F2\u0006\u0010G\u001a\u00020H2\u0006\u0010I\u001a\u00020\rH\u00d6\u0001R\u001a\u0010\n\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0007\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0014\"\u0004\b\u0018\u0010\u0016R\u001a\u0010\u000f\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001d\u0010\u0014\"\u0004\b\u001e\u0010\u0016R\u001e\u0010\u0002\u001a\u00020\u00038\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b\u001f\u0010 \"\u0004\b!\u0010\"R\u001a\u0010\u000e\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b#\u0010\u0014\"\u0004\b$\u0010\u0016R\u001e\u0010\u0010\u001a\u00020\u00118\u0006@\u0006X\u0087\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b%\u0010&\"\u0004\b\'\u0010(R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b)\u0010\u0014\"\u0004\b*\u0010\u0016R\u001a\u0010\u000b\u001a\u00020\u0005X\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b+\u0010\u0014\"\u0004\b,\u0010\u0016R\u001a\u0010\f\u001a\u00020\rX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u001a\u0010\b\u001a\u00020\tX\u0086\u000e\u00a2\u0006\u000e\n\u0000\u001a\u0004\b1\u0010\u001a\"\u0004\b2\u0010\u001c\u00a8\u0006J"}, d2 = {"Lorg/wit/archaeologicalfieldwork/models/HillfortModel;", "Landroid/os/Parcelable;", "id", "", "fbId", "", "name", "description", "visited", "", "date", "notes", "rating", "", "image", "favorite", "location", "Lorg/wit/archaeologicalfieldwork/models/LocationModel;", "(JLjava/lang/String;Ljava/lang/String;Ljava/lang/String;ZLjava/lang/String;Ljava/lang/String;ILjava/lang/String;ZLorg/wit/archaeologicalfieldwork/models/LocationModel;)V", "getDate", "()Ljava/lang/String;", "setDate", "(Ljava/lang/String;)V", "getDescription", "setDescription", "getFavorite", "()Z", "setFavorite", "(Z)V", "getFbId", "setFbId", "getId", "()J", "setId", "(J)V", "getImage", "setImage", "getLocation", "()Lorg/wit/archaeologicalfieldwork/models/LocationModel;", "setLocation", "(Lorg/wit/archaeologicalfieldwork/models/LocationModel;)V", "getName", "setName", "getNotes", "setNotes", "getRating", "()I", "setRating", "(I)V", "getVisited", "setVisited", "component1", "component10", "component11", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "describeContents", "equals", "other", "", "hashCode", "toString", "writeToParcel", "", "parcel", "Landroid/os/Parcel;", "flags", "app_debug"})
public final class HillfortModel implements android.os.Parcelable {
    @androidx.room.PrimaryKey(autoGenerate = true)
    private long id;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String fbId;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String name;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String description;
    private boolean visited;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String date;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String notes;
    private int rating;
    @org.jetbrains.annotations.NotNull()
    private java.lang.String image;
    private boolean favorite;
    @org.jetbrains.annotations.NotNull()
    @androidx.room.Embedded()
    private org.wit.archaeologicalfieldwork.models.LocationModel location;
    public static final android.os.Parcelable.Creator CREATOR = null;
    
    public final long getId() {
        return 0L;
    }
    
    public final void setId(long p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getFbId() {
        return null;
    }
    
    public final void setFbId(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getName() {
        return null;
    }
    
    public final void setName(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDescription() {
        return null;
    }
    
    public final void setDescription(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getVisited() {
        return false;
    }
    
    public final void setVisited(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getDate() {
        return null;
    }
    
    public final void setDate(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getNotes() {
        return null;
    }
    
    public final void setNotes(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final int getRating() {
        return 0;
    }
    
    public final void setRating(int p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String getImage() {
        return null;
    }
    
    public final void setImage(@org.jetbrains.annotations.NotNull()
    java.lang.String p0) {
    }
    
    public final boolean getFavorite() {
        return false;
    }
    
    public final void setFavorite(boolean p0) {
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.models.LocationModel getLocation() {
        return null;
    }
    
    public final void setLocation(@org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.LocationModel p0) {
    }
    
    public HillfortModel(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String fbId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String description, boolean visited, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String notes, int rating, @org.jetbrains.annotations.NotNull()
    java.lang.String image, boolean favorite, @org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.LocationModel location) {
        super();
    }
    
    public HillfortModel() {
        super();
    }
    
    public final long component1() {
        return 0L;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component2() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component3() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component4() {
        return null;
    }
    
    public final boolean component5() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component6() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component7() {
        return null;
    }
    
    public final int component8() {
        return 0;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final java.lang.String component9() {
        return null;
    }
    
    public final boolean component10() {
        return false;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.models.LocationModel component11() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    public final org.wit.archaeologicalfieldwork.models.HillfortModel copy(long id, @org.jetbrains.annotations.NotNull()
    java.lang.String fbId, @org.jetbrains.annotations.NotNull()
    java.lang.String name, @org.jetbrains.annotations.NotNull()
    java.lang.String description, boolean visited, @org.jetbrains.annotations.NotNull()
    java.lang.String date, @org.jetbrains.annotations.NotNull()
    java.lang.String notes, int rating, @org.jetbrains.annotations.NotNull()
    java.lang.String image, boolean favorite, @org.jetbrains.annotations.NotNull()
    org.wit.archaeologicalfieldwork.models.LocationModel location) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull()
    @java.lang.Override()
    public java.lang.String toString() {
        return null;
    }
    
    @java.lang.Override()
    public int hashCode() {
        return 0;
    }
    
    @java.lang.Override()
    public boolean equals(@org.jetbrains.annotations.Nullable()
    java.lang.Object p0) {
        return false;
    }
    
    @java.lang.Override()
    public int describeContents() {
        return 0;
    }
    
    @java.lang.Override()
    public void writeToParcel(@org.jetbrains.annotations.NotNull()
    android.os.Parcel parcel, int flags) {
    }
    
    @kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 3)
    public static final class Creator implements android.os.Parcelable.Creator {
        
        public Creator() {
            super();
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object[] newArray(int size) {
            return null;
        }
        
        @org.jetbrains.annotations.NotNull()
        public final java.lang.Object createFromParcel(@org.jetbrains.annotations.NotNull()
        android.os.Parcel in) {
            return null;
        }
    }
}