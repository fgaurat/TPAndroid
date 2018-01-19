package fr.dmr.tpfragmentcommunication.tproom.db;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.RoomDatabase;

import fr.dmr.tpfragmentcommunication.tproom.entity.User;
import fr.dmr.tpfragmentcommunication.tproom.entity.UserDao;

/**
 * Created by fgaurat on 19/01/2018.
 */

@Database(entities = {User.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract UserDao userDao();
}