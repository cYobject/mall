package com.object.mall.product.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.Data;

import java.io.Serializable;

@Schema(defaultValue = "商品属性")
@TableName(value = "pms_attr")
@Data
public class ProductAttr implements Serializable {

    private static final long serialVersionUID = 1L;

    @Schema(defaultValue = "属性id")
    @TableId(value = "attr_id", type = IdType.AUTO)
    private Long attr_id;

    /**
     * 属性名
     */
    @TableField(value = "attr_name")
    private String attr_name;

    /**
     * 是否需要检索[0-不需要，1-需要]
     */
    @TableField(value = "search_type")
    private Integer search_type;

    /**
     * 属性图标
     */
    @TableField(value = "icon")
    private String icon;

    /**
     * 可选值列表[用逗号分隔]
     */
    @TableField(value = "value_select")
    private String value_select;

    /**
     * 属性类型[0-销售属性，1-基本属性，2-既是销售属性又是基本属性]
     */
    @TableField(value = "attr_type")
    private Integer attr_type;

    /**
     * 启用状态[0 - 禁用，1 - 启用]
     */
    @TableField(value = "enable")
    private Long enable;

    /**
     * 所属分类
     */
    @TableField(value = "catelog_id")
    private Long catelog_id;

    /**
     * 快速展示【是否展示在介绍上；0-否 1-是】，在sku中仍然可以调整
     */
    @TableField(value = "show_desc")
    private Integer show_desc;

}