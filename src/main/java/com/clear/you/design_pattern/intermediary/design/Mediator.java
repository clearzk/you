package com.clear.you.design_pattern.intermediary.design;



public class Mediator extends AbstractMediator{

    @Override
    public void execute(String str, Object... objects) {
        if(str.equals("purchase.buy")){ //采购电脑
            this.buyComputer((Integer)objects[0]);
        }else if(str.equals("sale.sell")){ //销售电脑
            this.sellComputer((Integer)objects[0]);
        }else if(str.equals("sale.offsell")){ //折价销售
            this.offSell();
        }else if(str.equals("stock.clear")){ //清仓处理
            this.clearStock();
        }
    }

    private void clearStock() {
        super.sale.offSale();
        super.purchase.refuseBuyIBM();
    }

    //折价销售
    private void offSell() {
        System.out.println("折价销售IBM电脑"+super.stock.getStockNumber()+"台");
    }

    //卖电脑(销售)
    private void sellComputer(Integer number) {
        //判断库存是否够
        if (number > super.stock.getStockNumber()) {
            //不够则采购
            super.purchase.buyIBMcomputer(number);
        }
        //减库存
        super.stock.decrease(number);
    }

    //采购电脑
    private void buyComputer(Integer number) {
        int saleStatus = super.sale.getSaleStatus();
        if (saleStatus > 80) {//销售情况良好
            System.out.println("采购" + number + "台电脑");
            //加库存
            super.stock.increase(number);
        } else { //销售情况不好，采购一半
            int halfNumber=number/2;
            System.out.println("采购" + halfNumber + "台电脑");
            //加库存
            super.stock.increase(halfNumber);
        }
    }


}
