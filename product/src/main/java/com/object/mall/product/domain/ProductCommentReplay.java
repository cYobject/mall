package com.object.mall.product.domain;


import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableField;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import java.io.Serializable;
import lombok.Data;

/**
 * 商品评价回复关系
 * @TableName product_comment_replay
 */
@TableName(value ="product_comment_replay")
@Data
public class ProductCommentReplay implements Serializable {
    /**
     * id
     */
    @TableId(value = "id", type = IdType.AUTO)
    private Long id;

    /**
     * 评论id
     */
    @TableField(value = "comment_id")
    private Long comment_id;

    /**
     * 回复id
     */
    @TableField(value = "reply_id")
    private Long reply_id;

    @TableField(exist = false)
    private static final long serialVersionUID = 1L;
}