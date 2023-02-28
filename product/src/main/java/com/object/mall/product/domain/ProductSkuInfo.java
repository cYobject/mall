package com.object.mall.product.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import lombok.Data;

/**
 * sku信息
 * @TableName product_sku_info
 */
@TableName(value ="product_sku_info")
@Data
public class ProductSkuInfo implements Serializable {
    /**
     * skuId
     */
    @TableId(value = "sku_id", type = IdType.AUTO)
    private Long sku_id;

    /**
     * spuId
     */
    @TableField(value = "spu_id")
    private Long spu_id;

    /**
     * sku名称
     */
    @TableField(value = "sku_name")
    private String sku_name;

    /**
     * sku介绍描述
     */
    @TableField(value = "sku_desc")
    private String sku_desc;

    /**
     * 所属分类id
     */
    @TableField(value = "catalog_id")
    private Long catalog_id;

    /**
     * 品牌id
     */
    @TableField(value = "brand_id")
    private Long brand_id;

    /**
     * 默认图片
     */
    @TableField(value = "sku_default_img")
    private String sku_default_img;

    /**
     * 标题
     */
    @TableField(value = "sku_title")
    private String sku_title;

    /**
     * 副标题
     */
    @TableField(value = "sku_subtitle")
    private String sku_subtitle;

    /**
     * 价格
     */
    @TableField(value = "price")
    private BigDecimal price;

    /**
     * 销量
     */
    @TableField(value = "sale_count")
    private Long sale_count;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}