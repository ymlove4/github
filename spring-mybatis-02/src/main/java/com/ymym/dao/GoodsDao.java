package com.ymym.dao;

import com.ymym.domain.Goods;

/**
 * @author ymyoo
 * @date 2020-08-29 22:36
 */
public interface GoodsDao {

    int updatGoods(Goods goods);

    Goods selectGoods(Integer id);

    void updatGoods();
}
