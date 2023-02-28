package com.object.mall.product.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * spu图片
 * @TableName product_spu_images
 */
@TableName(value ="product_spu_images")
@Data
public class ProductSpuImages implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * spu_id
     */
    @TableField(value = "spu_id")
    private Long spu_id;

    /**
     * 图片名
     */
    @TableField(value = "img_name")
    private String img_name;

    /**
     * 图片地址
     */
    @TableField(value = "img_url")
    private String img_url;

    /**
     * 顺序
     */
    @TableField(value = "img_sort")
    private Integer img_sort;

    /**
     * 是否默认图
     */
    @TableField(value = "default_img")
    private Integer default_img;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}