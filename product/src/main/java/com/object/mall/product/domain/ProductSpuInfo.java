package com.object.mall.product.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import java.math.BigDecimal;
import java.time.LocalDateTime;
import lombok.Data;

/**
 * spu信息
 * @TableName product_spu_info
 */
@TableName(value ="product_spu_info")
@Data
public class ProductSpuInfo implements Serializable {
    /**
     * 商品id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 商品名称
     */
    @TableField(value = "spu_name")
    private String spu_name;

    /**
     * 商品描述
     */
    @TableField(value = "spu_description")
    private String spu_description;

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
     * 
     */
    @TableField(value = "weight")
    private BigDecimal weight;

    /**
     * 上架状态[0 - 下架，1 - 上架]
     */
    @TableField(value = "publish_status")
    private Integer publish_status;

    /**
     * 
     */
    @TableField(value = "create_time")
    private LocalDateTime create_time;

    /**
     * 
     */
    @TableField(value = "update_time")
    private LocalDateTime update_time;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}