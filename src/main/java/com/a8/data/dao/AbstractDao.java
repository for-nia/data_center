package com.a8.data.dao;

import com.a8.data.Manager;

/**
 * Created by fornia on 17-1-19.
 */
abstract class AbstractDao {

    private Class clazz;

    protected void initMapper(Class clazz){
        this.clazz=clazz;
    }
    public Object getMapper(){
        return Manager.getInstance().getInjector().getInstance(this.clazz);
    }


}
