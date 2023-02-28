package com.object.mall.product.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * sku销售属性&值
 * @TableName product_sku_sale_attr_value
 */
@TableName(value ="product_sku_sale_attr_value")
@Data
public class ProductSkuSaleAttrValue implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * sku_id
     */
    @TableField(value = "sku_id")
    private Long sku_id;

    /**
     * attr_id
     */
    @TableField(value = "attr_id")
    private Long attr_id;

    /**
     * 销售属性名
     */
    @TableField(value = "attr_name")
    private String attr_name;

    /**
     * 销售属性值
     */
    @TableField(value = "attr_value")
    private String attr_value;

    /**
     * 顺序
     */
    @TableField(value = "attr_sort")
    private Integer attr_sort;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}