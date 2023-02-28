package com.object.mall.product.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 商品三级分类
 *
 * @TableName product_category
 */
@TableName(value = "product_category")
@Data
public class ProductCategory implements Serializable {
    /**
     * 分类id
     */
    @TableId(value = "cat_id", type = IdType.AUTO)
    private Long cat_id;

    /**
     * 分类名称
     */
    @TableField(value = "name")
    private String name;

    /**
     * 父分类id
     */
    @TableField(value = "parent_cid")
    private Long parent_cid;

    /**
     * 层级
     */
    @TableField(value = "cat_level")
    private Integer cat_level;

    /**
     * 是否显示[0-不显示，1显示]
     */
    @TableField(value = "show_status")
    private Integer show_status;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 图标地址
     */
    @TableField(value = "icon")
    private String icon;

    /**
     * 计量单位
     */
    @TableField(value = "product_unit")
    private String product_unit;

    /**
     * 商品数量
     */
    @TableField(value = "product_count")
    private Integer product_count;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}