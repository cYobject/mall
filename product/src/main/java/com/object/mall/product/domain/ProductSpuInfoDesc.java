package com.object.mall.product.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * spu信息介绍
 * @TableName product_spu_info_desc
 */
@TableName(value ="product_spu_info_desc")
@Data
public class ProductSpuInfoDesc implements Serializable {
    /**
     * 商品id
     */
    @TableId(value = "spu_id")
    private Long spu_id;

    /**
     * 商品介绍
     */
    @TableField(value = "decript")
    private String decript;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}