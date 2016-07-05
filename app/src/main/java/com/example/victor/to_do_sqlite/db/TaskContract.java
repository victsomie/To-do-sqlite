package com.example.victor.to_do_sqlite.db;

import android.provider.BaseColumns;

/**
 * Created by victor on 7/5/16.
 */
public class TaskContract {
    public static final String DB_NAME = "com.example.victor.to_do_sqlite.db";
    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";

        public static final String COL_TASK_TITLE = "title";
    }
}