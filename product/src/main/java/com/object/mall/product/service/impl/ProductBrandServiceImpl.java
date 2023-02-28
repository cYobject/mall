package com.object.mall.product.service.impl;


import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.object.mall.product.domain.ProductBrand;
import com.object.mall.product.mapper.ProductBrandMapper;
import com.object.mall.product.service.ProductBrandService;
import org.springframework.stereotype.Service;

/**
* @author yefuc
* @description 针对表【product_brand(品牌)】的数据库操作Service实现
* @createDate 2023-02-27 12:41:08
*/
@Service
public class ProductBrandServiceImpl extends ServiceImpl<ProductBrandMapper, ProductBrand>
    implements ProductBrandService {

}




