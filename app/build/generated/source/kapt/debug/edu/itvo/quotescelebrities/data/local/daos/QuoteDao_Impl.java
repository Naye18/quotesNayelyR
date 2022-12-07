package edu.itvo.quotescelebrities.data.local.daos;

import android.database.Cursor;
import androidx.room.CoroutinesRoom;
import androidx.room.EntityDeletionOrUpdateAdapter;
import androidx.room.EntityInsertionAdapter;
import androidx.room.RoomDatabase;
import androidx.room.RoomSQLiteQuery;
import androidx.room.SharedSQLiteStatement;
import androidx.room.util.CursorUtil;
import androidx.room.util.DBUtil;
import androidx.sqlite.db.SupportSQLiteStatement;
import edu.itvo.quotescelebrities.data.local.entities.QuoteEntity;
import java.lang.Class;
import java.lang.Exception;
import java.lang.Object;
import java.lang.Override;
import java.lang.String;
import java.lang.SuppressWarnings;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.concurrent.Callable;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlinx.coroutines.flow.Flow;

@SuppressWarnings({"unchecked", "deprecation"})
public final class QuoteDao_Impl implements QuoteDao {
  private final RoomDatabase __db;

  private final EntityInsertionAdapter<QuoteEntity> __insertionAdapterOfQuoteEntity;

  private final EntityInsertionAdapter<QuoteEntity> __insertionAdapterOfQuoteEntity_1;

  private final EntityDeletionOrUpdateAdapter<QuoteEntity> __updateAdapterOfQuoteEntity;

  private final SharedSQLiteStatement __preparedStmtOfDeleteAll;

  private final SharedSQLiteStatement __preparedStmtOfDelete;

  public QuoteDao_Impl(RoomDatabase __db) {
    this.__db = __db;
    this.__insertionAdapterOfQuoteEntity = new EntityInsertionAdapter<QuoteEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR ABORT INTO `quote` (`id`,`quote`,`author`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, QuoteEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getQuote() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getQuote());
        }
        if (value.getAuthor() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAuthor());
        }
      }
    };
    this.__insertionAdapterOfQuoteEntity_1 = new EntityInsertionAdapter<QuoteEntity>(__db) {
      @Override
      public String createQuery() {
        return "INSERT OR REPLACE INTO `quote` (`id`,`quote`,`author`) VALUES (?,?,?)";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, QuoteEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getQuote() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getQuote());
        }
        if (value.getAuthor() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAuthor());
        }
      }
    };
    this.__updateAdapterOfQuoteEntity = new EntityDeletionOrUpdateAdapter<QuoteEntity>(__db) {
      @Override
      public String createQuery() {
        return "UPDATE OR REPLACE `quote` SET `id` = ?,`quote` = ?,`author` = ? WHERE `id` = ?";
      }

      @Override
      public void bind(SupportSQLiteStatement stmt, QuoteEntity value) {
        stmt.bindLong(1, value.getId());
        if (value.getQuote() == null) {
          stmt.bindNull(2);
        } else {
          stmt.bindString(2, value.getQuote());
        }
        if (value.getAuthor() == null) {
          stmt.bindNull(3);
        } else {
          stmt.bindString(3, value.getAuthor());
        }
        stmt.bindLong(4, value.getId());
      }
    };
    this.__preparedStmtOfDeleteAll = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM quote";
        return _query;
      }
    };
    this.__preparedStmtOfDelete = new SharedSQLiteStatement(__db) {
      @Override
      public String createQuery() {
        final String _query = "DELETE FROM quote WHERE id=? ";
        return _query;
      }
    };
  }

  @Override
  public Object insert(final QuoteEntity quote, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfQuoteEntity.insert(quote);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object insertAll(final List<QuoteEntity> quotes,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __insertionAdapterOfQuoteEntity_1.insert(quotes);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object updateQuote(final QuoteEntity quote,
      final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        __db.beginTransaction();
        try {
          __updateAdapterOfQuoteEntity.handle(quote);
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
        }
      }
    }, continuation);
  }

  @Override
  public Object deleteAll(final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDeleteAll.acquire();
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDeleteAll.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Object delete(final int quoteId, final Continuation<? super Unit> continuation) {
    return CoroutinesRoom.execute(__db, true, new Callable<Unit>() {
      @Override
      public Unit call() throws Exception {
        final SupportSQLiteStatement _stmt = __preparedStmtOfDelete.acquire();
        int _argIndex = 1;
        _stmt.bindLong(_argIndex, quoteId);
        __db.beginTransaction();
        try {
          _stmt.executeUpdateDelete();
          __db.setTransactionSuccessful();
          return Unit.INSTANCE;
        } finally {
          __db.endTransaction();
          __preparedStmtOfDelete.release(_stmt);
        }
      }
    }, continuation);
  }

  @Override
  public Flow<List<QuoteEntity>> getQuotes() {
    final String _sql = "SELECT * FROM quote ORDER BY author ASC";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"quote"}, new Callable<List<QuoteEntity>>() {
      @Override
      public List<QuoteEntity> call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfQuote = CursorUtil.getColumnIndexOrThrow(_cursor, "quote");
          final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
          final List<QuoteEntity> _result = new ArrayList<QuoteEntity>(_cursor.getCount());
          while(_cursor.moveToNext()) {
            final QuoteEntity _item;
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpQuote;
            if (_cursor.isNull(_cursorIndexOfQuote)) {
              _tmpQuote = null;
            } else {
              _tmpQuote = _cursor.getString(_cursorIndexOfQuote);
            }
            final String _tmpAuthor;
            if (_cursor.isNull(_cursorIndexOfAuthor)) {
              _tmpAuthor = null;
            } else {
              _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
            }
            _item = new QuoteEntity(_tmpId,_tmpQuote,_tmpAuthor);
            _result.add(_item);
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<QuoteEntity> getQuote(final int quoteId) {
    final String _sql = "SELECT * FROM quote WHERE id = ?";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 1);
    int _argIndex = 1;
    _statement.bindLong(_argIndex, quoteId);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"quote"}, new Callable<QuoteEntity>() {
      @Override
      public QuoteEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfQuote = CursorUtil.getColumnIndexOrThrow(_cursor, "quote");
          final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
          final QuoteEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpQuote;
            if (_cursor.isNull(_cursorIndexOfQuote)) {
              _tmpQuote = null;
            } else {
              _tmpQuote = _cursor.getString(_cursorIndexOfQuote);
            }
            final String _tmpAuthor;
            if (_cursor.isNull(_cursorIndexOfAuthor)) {
              _tmpAuthor = null;
            } else {
              _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
            }
            _result = new QuoteEntity(_tmpId,_tmpQuote,_tmpAuthor);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  @Override
  public Flow<QuoteEntity> getQuoteRandom() {
    final String _sql = "SELECT * FROM quote ORDER BY random() LIMIT 1";
    final RoomSQLiteQuery _statement = RoomSQLiteQuery.acquire(_sql, 0);
    return CoroutinesRoom.createFlow(__db, false, new String[]{"quote"}, new Callable<QuoteEntity>() {
      @Override
      public QuoteEntity call() throws Exception {
        final Cursor _cursor = DBUtil.query(__db, _statement, false, null);
        try {
          final int _cursorIndexOfId = CursorUtil.getColumnIndexOrThrow(_cursor, "id");
          final int _cursorIndexOfQuote = CursorUtil.getColumnIndexOrThrow(_cursor, "quote");
          final int _cursorIndexOfAuthor = CursorUtil.getColumnIndexOrThrow(_cursor, "author");
          final QuoteEntity _result;
          if(_cursor.moveToFirst()) {
            final int _tmpId;
            _tmpId = _cursor.getInt(_cursorIndexOfId);
            final String _tmpQuote;
            if (_cursor.isNull(_cursorIndexOfQuote)) {
              _tmpQuote = null;
            } else {
              _tmpQuote = _cursor.getString(_cursorIndexOfQuote);
            }
            final String _tmpAuthor;
            if (_cursor.isNull(_cursorIndexOfAuthor)) {
              _tmpAuthor = null;
            } else {
              _tmpAuthor = _cursor.getString(_cursorIndexOfAuthor);
            }
            _result = new QuoteEntity(_tmpId,_tmpQuote,_tmpAuthor);
          } else {
            _result = null;
          }
          return _result;
        } finally {
          _cursor.close();
        }
      }

      @Override
      protected void finalize() {
        _statement.release();
      }
    });
  }

  public static List<Class<?>> getRequiredConverters() {
    return Collections.emptyList();
  }
}
