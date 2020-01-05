package org.wit.archaeologicalfieldwork.models.room;

import java.lang.System;

@androidx.room.Database(entities = {org.wit.archaeologicalfieldwork.models.HillfortModel.class}, version = 1, exportSchema = false)
@kotlin.Metadata(mv = {1, 1, 15}, bv = {1, 0, 3}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\'\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0003\u001a\u00020\u0004H&\u00a8\u0006\u0005"}, d2 = {"Lorg/wit/archaeologicalfieldwork/models/room/Database;", "Landroidx/room/RoomDatabase;", "()V", "hillfortDao", "Lorg/wit/archaeologicalfieldwork/models/room/HillfortDao;", "app_debug"})
public abstract class Database extends androidx.room.RoomDatabase {
    
    @org.jetbrains.annotations.NotNull()
    public abstract org.wit.archaeologicalfieldwork.models.room.HillfortDao hillfortDao();
    
    public Database() {
        super();
    }
}