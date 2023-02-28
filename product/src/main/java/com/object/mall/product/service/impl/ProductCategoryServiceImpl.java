package com.object.mall.product.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.object.mall.product.domain.ProductCategory;
import com.object.mall.product.mapper.ProductCategoryMapper;
import com.object.mall.product.service.ProductCategoryService;
import org.springframework.stereotype.Service;

/**
* @author yefuc
* @description 针对表【product_category(商品三级分类)】的数据库操作Service实现
* @createDate 2023-02-27 12:41:08
*/
@Service
public class ProductCategoryServiceImpl extends ServiceImpl<ProductCategoryMapper, ProductCategory>
    implements ProductCategoryService {

}




