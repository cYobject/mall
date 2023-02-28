package com.object.mall.product.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 品牌分类关联
 * @TableName product_category_brand_relation
 */
@TableName(value ="product_category_brand_relation")
@Data
public class ProductCategoryBrandRelation implements Serializable {
    /**
     * 
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 品牌id
     */
    @TableField(value = "brand_id")
    private Long brand_id;

    /**
     * 分类id
     */
    @TableField(value = "catelog_id")
    private Long catelog_id;

    /**
     * 
     */
    @TableField(value = "brand_name")
    private String brand_name;

    /**
     * 
     */
    @TableField(value = "catelog_name")
    private String catelog_name;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}