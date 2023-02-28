package com.object.mall.product.mapper;


import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.object.mall.product.domain.ProductAttr;
import org.apache.ibatis.annotations.Mapper;

/**
* @author yefuc
* @description 针对表【product_attr(商品属性)】的数据库操作Mapper
* @createDate 2023-02-27 12:41:08
* @Entity .domain.ProductAttr
*/
@Mapper
public interface ProductAttrMapper extends BaseMapper<ProductAttr> {

}




