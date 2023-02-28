package com.object.mall.product.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * spu属性值
 * @TableName product_product_attr_value
 */
@TableName(value ="product_product_attr_value")
@Data
public class ProductProductAttrValue implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品id
     */
    @TableField(value = "spu_id")
    private Long spu_id;

    /**
     * 属性id
     */
    @TableField(value = "attr_id")
    private Long attr_id;

    /**
     * 属性名
     */
    @TableField(value = "attr_name")
    private String attr_name;

    /**
     * 属性值
     */
    @TableField(value = "attr_value")
    private String attr_value;

    /**
     * 顺序
     */
    @TableField(value = "attr_sort")
    private Integer attr_sort;

    /**
     * 快速展示【是否展示在介绍上；0-否 1-是】
     */
    @TableField(value = "quick_show")
    private Integer quick_show;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}