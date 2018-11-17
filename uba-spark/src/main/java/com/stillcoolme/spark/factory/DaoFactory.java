package com.stillcoolme.spark.factory;

import com.stillcoolme.spark.dao.ISessionAggrStatDao;
import com.stillcoolme.spark.dao.ISessionDetailDao;
import com.stillcoolme.spark.dao.ISessionRandomExtractDao;
import com.stillcoolme.spark.dao.ITaskDao;
import com.stillcoolme.spark.dao.impl.SessionAggrStatDaoImpl;
import com.stillcoolme.spark.dao.impl.SessionDetailDaoImpl;
import com.stillcoolme.spark.dao.impl.ISessionRandomExtractDaoImpl;
import com.stillcoolme.spark.dao.impl.TaskDaoImpl;

public class DaoFactory {
    /**
     * 使用工厂模式
     * @return
     */
    public static ITaskDao getTaskDao()
    {
        return new TaskDaoImpl();
    }

    public static ISessionAggrStatDao getSessionAggrStatDao()
    {
        return new SessionAggrStatDaoImpl();
    }

    public static ISessionRandomExtractDao getSessionRandomExtractDao(){
        return new ISessionRandomExtractDaoImpl();
    }

    public  static ISessionDetailDao getSessionDetailDao()
    {
        return new SessionDetailDaoImpl();
    }
}
