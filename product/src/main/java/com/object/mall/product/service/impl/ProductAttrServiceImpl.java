package com.object.mall.product.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.object.mall.product.domain.ProductAttr;
import com.object.mall.product.mapper.ProductAttrMapper;
import com.object.mall.product.service.ProductAttrService;
import org.springframework.stereotype.Service;

/**
* @author yefuc
* @description 针对表【product_attr(商品属性)】的数据库操作Service实现
* @createDate 2023-02-27 12:41:08
*/
@Service
public class ProductAttrServiceImpl extends ServiceImpl<ProductAttrMapper, ProductAttr>
    implements ProductAttrService {

}




