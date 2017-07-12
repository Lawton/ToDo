package ca.lawtonspelliscy.todo.db;

import android.provider.BaseColumns;

/**
 * Created by lawton on 2017-07-02.
 */

public class TaskContract {
    public static final String DB_NAME ="ca.lawtonspelliscy.todo.db";

    public static final int DB_VERSION = 1;

    public class TaskEntry implements BaseColumns {
        public static final String TABLE = "tasks";
        public static final String COL_TASK_TITLE = "title";

    }
}
