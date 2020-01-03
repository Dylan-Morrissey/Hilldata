package org.wit.archaeologicalfieldwork.models.room;

import android.database.Cursor;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.List;
import org.wit.archaeologicalfieldwork.models.HillfortModel;
import org.wit.archaeologicalfieldwork.models.LocationModel;

@SuppressWarnings({"unchecked", "deprecation"})
public final class HillfortDao_Impl implements HillfortDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter __insertionAdapterOfHillfortModel;

  private final EntityDeletionOrUpdateAdapter __deletionAdapterOfHillfortModel;

  private final EntityDeletionOrUpdateAdapter __updateAdapterOfHillfortModel;

  public HillfortDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfHillfortModel = new EntityInsertionAdapter<HillfortModel>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `HillfortModel`(`id`,`fbId`,`name`,`description`,`visited`,`date`,`notes`,`image`,`lat`,`lng`,`zoom`) VALUES (nullif(?, 0),?,?,?,?,?,?,?,?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HillfortModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getFbId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFbId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        final int _tmp;
        _tmp = value.getVisited() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        if (value.getDate() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDate());
        }
        if (value.getNotes() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getNotes());
        }
        if (value.getImage() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getImage());
        }
        final LocationModel _tmpLocation = value.getLocation();
        if(_tmpLocation != null) {
          stmt.bindDouble(9, _tmpLocation.getLat());
          stmt.bindDouble(10, _tmpLocation.getLng());
          stmt.bindDouble(11, _tmpLocation.getZoom());
        } else {
          stmt.bindNull(9);
          stmt.bindNull(10);
          stmt.bindNull(11);
        }
      }
    };
    this.__deletionAdapterOfHillfortModel = new EntityDeletionOrUpdateAdapter<HillfortModel>(__db) {
      @Override
      public String createQuery() {
        return "DELETE FROM `HillfortModel` WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HillfortModel value) {
        stmt.bindLong(1, value.getId());
      }
    };
    this.__updateAdapterOfHillfortModel = new EntityDeletionOrUpdateAdapter<HillfortModel>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR ABORT `HillfortModel` SET `id` = ?,`fbId` = ?,`name` = ?,`description` = ?,`visited` = ?,`date` = ?,`notes` = ?,`image` = ?,`lat` = ?,`lng` = ?,`zoom` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, HillfortModel value) {
        stmt.bindLong(1, value.getId());
        if (value.getFbId() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getFbId());
        }
        if (value.getName() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getName());
        }
        if (value.getDescription() == null) {
          stmt.bindNull(4);
        } else {
          stmt.bindString(4, value.getDescription());
        }
        final int _tmp;
        _tmp = value.getVisited() ? 1 : 0;
        stmt.bindLong(5, _tmp);
        if (value.getDate() == null) {
          stmt.bindNull(6);
        } else {
          stmt.bindString(6, value.getDate());
        }
        if (value.getNotes() == null) {
          stmt.bindNull(7);
        } else {
          stmt.bindString(7, value.getNotes());
        }
        if (value.getImage() == null) {
          stmt.bindNull(8);
        } else {
          stmt.bindString(8, value.getImage());
        }
        final LocationModel _tmpLocation = value.getLocation();
        if(_tmpLocation != null) {
          stmt.bindDouble(9, _tmpLocation.getLat());
          stmt.bindDouble(10, _tmpLocation.getLng());
          stmt.bindDouble(11, _tmpLocation.getZoom());
        } else {
          stmt.bindNull(9);
          stmt.bindNull(10);
          stmt.bindNull(11);
        }
        stmt.bindLong(12, value.getId());
      }
    };
  }

  @Override
  public void create(final HillfortModel hillfort) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __insertionAdapterOfHillfortModel.insert(hillfort);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void deletePlacemark(final HillfortModel hillfort) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __deletionAdapterOfHillfortModel.handle(hillfort);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public void update(final HillfortModel hillfort) {
    __db.assertNotSuspendingTransaction();
    __db.beginTransaction();
    try {
      __updateAdapterOfHillfortModel.handle(hillfort);
      __db.setTransactionSuccessful();
    } finally {
      __db.endTransaction();
    }
  }

  @Override
  public List<HillfortModel> findAll() {
    final String _sql = "SELECT * FROM HillfortModel";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfFbId = CursorUtil.getColumnIndexOrThrow(_cursor, "fbId");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfVisited = CursorUtil.getColumnIndexOrThrow(_cursor, "visited");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
      final int _cursorIndexOfLng = CursorUtil.getColumnIndexOrThrow(_cursor, "lng");
      final int _cursorIndexOfZoom = CursorUtil.getColumnIndexOrThrow(_cursor, "zoom");
      final List<HillfortModel> _result = new ArrayList<HillfortModel>(_cursor.getCount());
      while(_cursor.moveToNext()) {
        final HillfortModel _item;
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpFbId;
        _tmpFbId = _cursor.getString(_cursorIndexOfFbId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final boolean _tmpVisited;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfVisited);
        _tmpVisited = _tmp != 0;
        final String _tmpDate;
        _tmpDate = _cursor.getString(_cursorIndexOfDate);
        final String _tmpNotes;
        _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
        final String _tmpImage;
        _tmpImage = _cursor.getString(_cursorIndexOfImage);
        final LocationModel _tmpLocation;
        if (! (_cursor.isNull(_cursorIndexOfLat) && _cursor.isNull(_cursorIndexOfLng) && _cursor.isNull(_cursorIndexOfZoom))) {
          final double _tmpLat;
          _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
          final double _tmpLng;
          _tmpLng = _cursor.getDouble(_cursorIndexOfLng);
          final float _tmpZoom;
          _tmpZoom = _cursor.getFloat(_cursorIndexOfZoom);
          _tmpLocation = new LocationModel(_tmpLat,_tmpLng,_tmpZoom);
        }  else  {
          _tmpLocation = null;
        }
        _item = new HillfortModel(_tmpId,_tmpFbId,_tmpName,_tmpDescription,_tmpVisited,_tmpDate,_tmpNotes,_tmpImage,_tmpLocation);
        _result.add(_item);
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }

  @Override
  public HillfortModel findById(final long id) {
    final String _sql = "select * from HillfortModel where id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, id);
    __db.assertNotSuspendingTransaction();
    final Cursor _cursor = DBUtil.query(__db, _statement, false);
    try {
      final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
      final int _cursorIndexOfFbId = CursorUtil.getColumnIndexOrThrow(_cursor, "fbId");
      final int _cursorIndexOfName = CursorUtil.getColumnIndexOrThrow(_cursor, "name");
      final int _cursorIndexOfDescription = CursorUtil.getColumnIndexOrThrow(_cursor, "description");
      final int _cursorIndexOfVisited = CursorUtil.getColumnIndexOrThrow(_cursor, "visited");
      final int _cursorIndexOfDate = CursorUtil.getColumnIndexOrThrow(_cursor, "date");
      final int _cursorIndexOfNotes = CursorUtil.getColumnIndexOrThrow(_cursor, "notes");
      final int _cursorIndexOfImage = CursorUtil.getColumnIndexOrThrow(_cursor, "image");
      final int _cursorIndexOfLat = CursorUtil.getColumnIndexOrThrow(_cursor, "lat");
      final int _cursorIndexOfLng = CursorUtil.getColumnIndexOrThrow(_cursor, "lng");
      final int _cursorIndexOfZoom = CursorUtil.getColumnIndexOrThrow(_cursor, "zoom");
      final HillfortModel _result;
      if(_cursor.moveToFirst()) {
        final long _tmpId;
        _tmpId = _cursor.getLong(_cursorIndexOfId);
        final String _tmpFbId;
        _tmpFbId = _cursor.getString(_cursorIndexOfFbId);
        final String _tmpName;
        _tmpName = _cursor.getString(_cursorIndexOfName);
        final String _tmpDescription;
        _tmpDescription = _cursor.getString(_cursorIndexOfDescription);
        final boolean _tmpVisited;
        final int _tmp;
        _tmp = _cursor.getInt(_cursorIndexOfVisited);
        _tmpVisited = _tmp != 0;
        final String _tmpDate;
        _tmpDate = _cursor.getString(_cursorIndexOfDate);
        final String _tmpNotes;
        _tmpNotes = _cursor.getString(_cursorIndexOfNotes);
        final String _tmpImage;
        _tmpImage = _cursor.getString(_cursorIndexOfImage);
        final LocationModel _tmpLocation;
        if (! (_cursor.isNull(_cursorIndexOfLat) && _cursor.isNull(_cursorIndexOfLng) && _cursor.isNull(_cursorIndexOfZoom))) {
          final double _tmpLat;
          _tmpLat = _cursor.getDouble(_cursorIndexOfLat);
          final double _tmpLng;
          _tmpLng = _cursor.getDouble(_cursorIndexOfLng);
          final float _tmpZoom;
          _tmpZoom = _cursor.getFloat(_cursorIndexOfZoom);
          _tmpLocation = new LocationModel(_tmpLat,_tmpLng,_tmpZoom);
        }  else  {
          _tmpLocation = null;
        }
        _result = new HillfortModel(_tmpId,_tmpFbId,_tmpName,_tmpDescription,_tmpVisited,_tmpDate,_tmpNotes,_tmpImage,_tmpLocation);
      } else {
        _result = null;
      }
      return _result;
    } finally {
      _cursor.close();
      _statement.release();
    }
  }
}
