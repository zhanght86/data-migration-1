package com.sinosoft.datamigration.dao;

import com.sinosoft.datamigration.po.Dmuserinfo;

/**
 * Created by Elvis on 2017/8/30.
 */
public interface IUserDAO extends IBaseDAO{

    Dmuserinfo queryUserByUsername(String usercode);
}
