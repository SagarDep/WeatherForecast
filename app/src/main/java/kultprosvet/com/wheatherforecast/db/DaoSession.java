package kultprosvet.com.wheatherforecast.db;

import android.database.sqlite.SQLiteDatabase;

import java.util.Map;

import de.greenrobot.dao.AbstractDao;
import de.greenrobot.dao.AbstractDaoSession;
import de.greenrobot.dao.identityscope.IdentityScopeType;
import de.greenrobot.dao.internal.DaoConfig;

import kultprosvet.com.wheatherforecast.db.CityDb;

import kultprosvet.com.wheatherforecast.db.CityDbDao;

// THIS CODE IS GENERATED BY greenDAO, DO NOT EDIT.

/**
 * {@inheritDoc}
 * 
 * @see de.greenrobot.dao.AbstractDaoSession
 */
public class DaoSession extends AbstractDaoSession {

    private final DaoConfig cityDbDaoConfig;

    private final CityDbDao cityDbDao;

    public DaoSession(SQLiteDatabase db, IdentityScopeType type, Map<Class<? extends AbstractDao<?, ?>>, DaoConfig>
            daoConfigMap) {
        super(db);

        cityDbDaoConfig = daoConfigMap.get(CityDbDao.class).clone();
        cityDbDaoConfig.initIdentityScope(type);

        cityDbDao = new CityDbDao(cityDbDaoConfig, this);

        registerDao(CityDb.class, cityDbDao);
    }
    
    public void clear() {
        cityDbDaoConfig.getIdentityScope().clear();
    }

    public CityDbDao getCityDbDao() {
        return cityDbDao;
    }

}
