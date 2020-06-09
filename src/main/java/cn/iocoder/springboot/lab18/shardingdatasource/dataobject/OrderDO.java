package cn.iocoder.springboot.lab18.shardingdatasource.dataobject;

// OrderDO.java

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@TableName(value = "orders")
@Data
public class OrderDO {

    /**
     * 订单编号
     */
    private Long id;
    /**
     * 用户编号
     */
    private Integer userId;

    // ... 省略 setting/getting 方法

}
