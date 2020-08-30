package com.ymym.service;

import com.ymym.dao.GoodsDao;
import com.ymym.dao.SaleDao;
import com.ymym.domain.Goods;
import com.ymym.domain.Sale;
import com.ymym.excep.NotSuccessException;

/**
 * @author ymyoo
 * @date 2020-08-30 15:43
 */
public class BuyImpl implements Buy {

    private SaleDao saleDao;
    private GoodsDao goodsDao;


    @Override
    public void buy(Integer goodId, Integer nums) {
        //记录销售信息，向sale表中添加数据
        System.out.println("=========BUY方法开始=========");
        Sale sale = new Sale();
        sale.setId(goodId);
        sale.setNums(nums);
        saleDao.insertSale(sale);

        //更新库存
        Goods goods =goodsDao.selectGoods(goodId);
        if (goods==null){
            throw new NullPointerException("编号是:"+goodId+"商品不存在");
        }else if(goods.getAmount()<nums){
            throw new NotSuccessException("编号是:"+goodId+"商品库存不足");

        }
        //修改库存
        Goods goods1 = new Goods();
        goods1.setId(goodId);
        goods1.setAmount(nums);
        goodsDao.updatGoods(goods1);
        System.out.println("=========BUY方法结束=========");



    }

    public void setSaleDao(SaleDao saleDao) {
        this.saleDao = saleDao;
    }

    public void setGoodsDao(GoodsDao goodsDao) {
        this.goodsDao = goodsDao;
    }
}
