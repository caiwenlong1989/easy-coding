package dao;

import java.util.List;

// 1-1.1-17 【参考】各层命名规约
public interface CustomerDAO<T> {
    // 获取单个对象
    T get();
    // 获取多个对象
    List<T> list();
    // 获取统计值
    int count();
    // 插入
    int insert();
    // 删除
    int delete();
    // 修改
    int update();
}
