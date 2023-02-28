package com.object.mall.product.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

import java.io.Serializable;

/**
 * 属性分组
 *
 * @TableName product_attr_group
 */
@TableName(value = "product_attr_group")
@Data
public class ProductAttrGroup implements Serializable {
    /**
     * 分组id
     */
    @TableId(value = "attr_group_id", type = IdType.AUTO)
    private Long attr_group_id;

    /**
     * 组名
     */
    @TableField(value = "attr_group_name")
    private String attr_group_name;

    /**
     * 排序
     */
    @TableField(value = "sort")
    private Integer sort;

    /**
     * 描述
     */
    @TableField(value = "descript")
    private String descript;

    /**
     * 组图标
     */
    @TableField(value = "icon")
    private String icon;

    /**
     * 所属分类id
     */
    @TableField(value = "catelog_id")
    private Long catelog_id;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}