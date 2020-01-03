package org.wit.archaeologicalfieldwork.models.room;

import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.RoomOpenHelper;
import androidx.room.RoomOpenHelper.Delegate;
import androidx.room.util.DBUtil;
import androidx.room.util.TableInfo;
import androidx.room.util.TableInfo.Column;
import androidx.room.util.TableInfo.ForeignKey;
import androidx.room.util.TableInfo.Index;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Callback;
import androidx.sqlite.db.SupportSQLiteOpenHelper.Configuration;
import java.lang.IllegalStateException;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

@SuppressWarnings({"unchecked", "deprecation"})
public final class Database_Impl extends Database {
  private volatile HillfortDao _hillfortDao;

  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration configuration) {
    final SupportSQLiteOpenHelper.Callback _openCallback = new RoomOpenHelper(configuration, new RoomOpenHelper.Delegate(1) {
      @Override
      public void createAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("CREATE TABLE IF NOT EXISTS `HillfortModel` (`id` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `fbId` TEXT NOT NULL, `name` TEXT NOT NULL, `description` TEXT NOT NULL, `visited` INTEGER NOT NULL, `date` TEXT NOT NULL, `notes` TEXT NOT NULL, `image` TEXT NOT NULL, `lat` REAL NOT NULL, `lng` REAL NOT NULL, `zoom` REAL NOT NULL)");
        _db.execSQL("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        _db.execSQL("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, '4a199097652282bd8371e5f35ac21ca0')");
      }

      @Override
      public void dropAllTables(SupportSQLiteDatabase _db) {
        _db.execSQL("DROP TABLE IF EXISTS `HillfortModel`");
      }

      @Override
      protected void onCreate(SupportSQLiteDatabase _db) {
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onCreate(_db);
          }
        }
      }

      @Override
      public void onOpen(SupportSQLiteDatabase _db) {
        mDatabase = _db;
        internalInitInvalidationTracker(_db);
        if (mCallbacks != null) {
          for (int _i = 0, _size = mCallbacks.size(); _i < _size; _i++) {
            mCallbacks.get(_i).onOpen(_db);
          }
        }
      }

      @Override
      public void onPreMigrate(SupportSQLiteDatabase _db) {
        DBUtil.dropFtsSyncTriggers(_db);
      }

      @Override
      public void onPostMigrate(SupportSQLiteDatabase _db) {
      }

      @Override
      protected void validateMigration(SupportSQLiteDatabase _db) {
        final HashMap<String, TableInfo.Column> _columnsHillfortModel = new HashMap<String, TableInfo.Column>(11);
        _columnsHillfortModel.put("id", new TableInfo.Column("id", "INTEGER", true, 1));
        _columnsHillfortModel.put("fbId", new TableInfo.Column("fbId", "TEXT", true, 0));
        _columnsHillfortModel.put("name", new TableInfo.Column("name", "TEXT", true, 0));
        _columnsHillfortModel.put("description", new TableInfo.Column("description", "TEXT", true, 0));
        _columnsHillfortModel.put("visited", new TableInfo.Column("visited", "INTEGER", true, 0));
        _columnsHillfortModel.put("date", new TableInfo.Column("date", "TEXT", true, 0));
        _columnsHillfortModel.put("notes", new TableInfo.Column("notes", "TEXT", true, 0));
        _columnsHillfortModel.put("image", new TableInfo.Column("image", "TEXT", true, 0));
        _columnsHillfortModel.put("lat", new TableInfo.Column("lat", "REAL", true, 0));
        _columnsHillfortModel.put("lng", new TableInfo.Column("lng", "REAL", true, 0));
        _columnsHillfortModel.put("zoom", new TableInfo.Column("zoom", "REAL", true, 0));
        final HashSet<TableInfo.ForeignKey> _foreignKeysHillfortModel = new HashSet<TableInfo.ForeignKey>(0);
        final HashSet<TableInfo.Index> _indicesHillfortModel = new HashSet<TableInfo.Index>(0);
        final TableInfo _infoHillfortModel = new TableInfo("HillfortModel", _columnsHillfortModel, _foreignKeysHillfortModel, _indicesHillfortModel);
        final TableInfo _existingHillfortModel = TableInfo.read(_db, "HillfortModel");
        if (! _infoHillfortModel.equals(_existingHillfortModel)) {
          throw new IllegalStateException("Migration didn't properly handle HillfortModel(org.wit.archaeologicalfieldwork.models.HillfortModel).\n"
                  + " Expected:\n" + _infoHillfortModel + "\n"
                  + " Found:\n" + _existingHillfortModel);
        }
      }
    }, "4a199097652282bd8371e5f35ac21ca0", "815a7a37c99fa43b0d19bcefeeea2339");
    final SupportSQLiteOpenHelper.Configuration _sqliteConfig = SupportSQLiteOpenHelper.Configuration.builder(configuration.context)
        .name(configuration.name)
        .callback(_openCallback)
        .build();
    final SupportSQLiteOpenHelper _helper = configuration.sqliteOpenHelperFactory.create(_sqliteConfig);
    return _helper;
  }

  @Override
  protected InvalidationTracker createInvalidationTracker() {
    final HashMap<String, String> _shadowTablesMap = new HashMap<String, String>(0);
    HashMap<String, Set<String>> _viewTables = new HashMap<String, Set<String>>(0);
    return new InvalidationTracker(this, _shadowTablesMap, _viewTables, "HillfortModel");
  }

  @Override
  public void clearAllTables() {
    super.assertNotMainThread();
    final SupportSQLiteDatabase _db = super.getOpenHelper().getWritableDatabase();
    try {
      super.beginTransaction();
      _db.execSQL("DELETE FROM `HillfortModel`");
      super.setTransactionSuccessful();
    } finally {
      super.endTransaction();
      _db.query("PRAGMA wal_checkpoint(FULL)").close();
      if (!_db.inTransaction()) {
        _db.execSQL("VACUUM");
      }
    }
  }

  @Override
  public HillfortDao placemarkDao() {
    if (_hillfortDao != null) {
      return _hillfortDao;
    } else {
      synchronized(this) {
        if(_hillfortDao == null) {
          _hillfortDao = new HillfortDao_Impl(this);
        }
        return _hillfortDao;
      }
    }
  }
}
