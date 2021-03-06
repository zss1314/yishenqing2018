

package com.cmct.common.dao.impl;


import com.cmct.common.dao.IJdbcDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * 名  称:JdbcDaoImpl
 * 类  型: class
 * 描  述: 用一句话描述类的作用
 * 路  径:com.hongdee.dao
 * 作  者:zhangkai
 * 日  期:2016/12/20 20:56
 */
@Service
public class JdbcDaoImpl implements IJdbcDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    /**
     * 方法名称: queryForMapBySql
     * 方法描述: 根据 sql 语句返回单条记录，并转为 Map 类型
     * 参数说明: String sql
     * 返回内容: Map<String,Object> 返回记录的Map 型式
     * 异常说明: Exception
     * 创建用户:
     * 创建时间:
     * 修改用户:
     * 修改时间:
     * 修改内容:
     *
     * @param sqlStr
     */
    @Override
    public Map<String, Object> queryForMapBySql(String sqlStr) throws Exception {
        return this.jdbcTemplate.queryForMap(sqlStr);
    }

    /**
     * 方法名称: queryForMapBySqlWithParams
     * 方法描述: 根据 sql ，参数查询 语句返回单条记录，并转为 Map 类型
     * 参数说明: String sql
     * 参数说明: Object ...params,查询参数数组，需与 sql 语句中的占位符一一对应
     * 返回内容: Map<String,Object> 返回记录的Map 型式
     * 异常说明: Exception
     * 创建用户:
     * 创建时间:
     * 修改用户:
     * 修改时间:
     * 修改内容:
     *
     * @param sqlStr
     * @param params
     */
    @Override
    public Map<String, Object> queryForMapBySqlWithParams(String sqlStr, Object... params) throws Exception {
        return this.jdbcTemplate.queryForMap(sqlStr, params);
    }

    /**
     * 方法名称: queryForMapListBySql
     * 方法描述: 根据 sql 语句返回记录的 Map集合
     * 参数说明: String sql
     * 返回内容: List<Map<String,Object>> 返回记录的Map集合
     * 异常说明: Exception
     * 创建用户:
     * 创建时间:
     * 修改用户:
     * 修改时间:
     * 修改内容:
     *
     * @param sqlStr
     */
    @Override
    public List<Map<String, Object>> queryForMapListBySql(String sqlStr) throws Exception {
        return this.jdbcTemplate.queryForList(sqlStr);
    }

    /**
     * 方法名称: queryForMapListBySqlWithParams
     * 方法描述: 根据 sql ，参数查询 语句返回记录的 map 集合
     * 参数说明: String sql
     * 参数说明: Object ...params,查询参数数组，需与 sql 语句中的占位符一一对应
     * 返回内容: List<Map<String,Object>> 返回记录的Map 型式的集合
     * 异常说明: Exception
     * 创建用户:
     * 创建时间:
     * 修改用户:
     * 修改时间:
     * 修改内容:
     *
     * @param sqlStr
     * @param param
     */
    @Override
    public List<Map<String, Object>> queryForMapListBySqlWithParams(String sqlStr, Object... param) throws Exception {
        return this.jdbcTemplate.queryForList(sqlStr, param);
    }

    /**
     * 方法名称: queryForEntityListBySql
     * 方法描述: 根据 sql ，参数 查询指定的实体对象
     * 参数说明: String sql，sql 语句
     * 参数说明: Class<T> entityClass,@Entity 注解标注的实体class类型
     * 返回内容: T @Entity注解的实体对象实例集合
     * 异常说明: Exception
     * 创建用户:
     * 创建时间:
     * 修改用户:
     * 修改时间:
     * 修改内容:
     *
     * @param sqlStr
     * @param entityClass
     */
    @Override
    public Object queryForEntityBySql(String sqlStr, Class entityClass) throws Exception {
        return this.jdbcTemplate.queryForObject(sqlStr, entityClass);
    }

    /**
     * 方法名称: queryForEntityBySqlWithParams
     * 方法描述: 根据 sql ，参数 查询指定的实体对象
     * 参数说明: String sql，sql 语句
     * 参数说明: Class<T> entityClass,@Entity 注解标注的实体class类型
     * 参数说明: Object ...params,查询参数数组，需与 sql 语句中的占位符一一对应
     * 返回内容: T @Entity注解的实体对象实例
     * 异常说明: Exception
     * 创建用户:
     * 创建时间:
     * 修改用户:
     * 修改时间:
     * 修改内容:
     *
     * @param sqlStr
     * @param entityClass
     * @param params
     */
    @Override
    public Object queryForEntityBySqlWithParams(String sqlStr, Class entityClass, Object... params) throws Exception {
        return this.jdbcTemplate.queryForObject(sqlStr, entityClass, params);
    }

    /**
     * 方法名称: queryForEntityListBySql
     * 方法描述: 根据 sql ，参数 查询指定的实体对象
     * 参数说明: String sql，sql 语句
     * 参数说明: Class<T> entityClass,@Entity 注解标注的实体class类型
     * 返回内容: List<T> @Entity注解的实体对象实例集合
     * 异常说明: Exception
     * 创建用户:
     * 创建时间:
     * 修改用户:
     * 修改时间:
     * 修改内容:
     *
     * @param sqlStr
     * @param entityClass
     */
    @Override
    public List queryForEntityListBySql(String sqlStr, Class entityClass) throws Exception {
        return this.jdbcTemplate.queryForList(sqlStr, entityClass);
    }

    /**
     * 方法名称: queryForEntityListBySqlWithParams
     * 方法描述: 根据 sql ，参数 查询指定的实体对象集合
     * 参数说明: String sql，sql 语句
     * 参数说明: Class<T> entityClass,@Entity 注解标注的实体class类型
     * 参数说明: Object ...params,查询参数数组，需与 sql 语句中的占位符一一对应
     * 返回内容: List<T> @Entity注解的实体对象实例集合
     * 异常说明: Exception
     * 创建用户:
     * 创建时间:
     * 修改用户:
     * 修改时间:
     * 修改内容:
     *
     * @param sqlStr
     * @param entityClass
     * @param params
     */
    @Override
    public List queryForEntityListBySqlWithParams(String sqlStr, Class entityClass, Object... params) throws Exception {
        return this.jdbcTemplate.queryForList(sqlStr, entityClass, params);
    }
}
