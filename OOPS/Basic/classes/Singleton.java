package OOPS.Basic.classes;

/*
Singleton class are class that create only one object and provide global access to that instance
in all method constructor wil be private
1. Eager initialization
2. Lazy initialization
3. Synchronization block
4. Double check lock
5. Enum singleton
6. Bill pugh solution
*/

/* 
 * Eager initialization (Advance creation)
 * Instance is created when loading class hence lazy initialize came
*/

class DBConnection {
    private static DBConnection db = new DBConnection();

    private DBConnection() {
    };

    public static DBConnection getInstance() {
        return db;
    }
}

class DBConnectionWithLazy {
    private static DBConnectionWithLazy db;

    private DBConnectionWithLazy() {
    };

    public static DBConnectionWithLazy getInstance() {
        if (db == null) {
            db = new DBConnectionWithLazy();
        }
        return db;
    }
}

/*
 * Synchronized class will put lock and unlock assume 2 threads are calling to
 * get instance
 * only one thread will allow inside to create instance then lock,
 * again another thread will create instance and lock for that particular thread
 * but synchronized will very slow thats why double pin locking system came
 */
class DBConnectionWithSync {
    private static DBConnectionWithSync db;

    private DBConnectionWithSync() {
    };

    public static synchronized DBConnectionWithSync getInstance() {
        if (db == null) {
            db = new DBConnectionWithSync();
        }
        return db;
    }
}

/*
 * suppose thread 1 calling to create instance, thread 2 will see its already
 * created so it will get
 * but there will be memory issue
 */
class DBConnectionWithDoublePin {
    private static volatile DBConnectionWithDoublePin db; // volatile is read from memory

    private DBConnectionWithDoublePin() {
    };

    public static DBConnectionWithDoublePin getInstance() {
        if (db == null) {
            synchronized (DBConnectionWithDoublePin.class) {
                if (db == null) {
                    db = new DBConnectionWithDoublePin();
                }
            }
        }
        return db;
    }
}

// Bill pugh solution
class DBConnectionWithBP {
    private DBConnectionWithBP() {
    };

    private static class DBConnectionWithBPHelper {
        private static DBConnectionWithBP INSTANCE_OBJECT = new DBConnectionWithBP();
    }

    public DBConnectionWithBP getInstance() {
        return DBConnectionWithBPHelper.INSTANCE_OBJECT;
    }
}

public class Singleton {

    public static void main(String[] args) {
        DBConnection db = DBConnection.getInstance();
    }
}
