package com.object.mall.product.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * sku图片
 * @TableName product_sku_images
 */
@TableName(value ="product_sku_images")
@Data
public class ProductSkuImages implements Serializable {
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
     * 图片地址
     */
    @TableField(value = "img_url")
    private String img_url;

    /**
     * 排序
     */
    @TableField(value = "img_sort")
    private Integer img_sort;

    /**
     * 默认图[0 - 不是默认图，1 - 是默认图]
     */
    @TableField(value = "default_img")
    private Integer default_img;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}