package com.object.mall.product.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.object.mall.common.utils.APIResult;
import com.object.mall.product.domain.ProductSkuImages;
import com.object.mall.product.service.ProductSkuImagesService;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

/**
 * sku图片(ProductSkuImages)表控制层
 *
 * @author makejava
 * @since 2023-02-27 12:24:25
 */
@RestController
@RequestMapping("productSkuImages")
public class ProductSkuImagesController {
    /**
     * 服务对象
     */
    @Resource
    private ProductSkuImagesService productSkuImagesService;

    /**
     * 分页查询
     *
     * @param productSkuImages 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public APIResult<Page<ProductSkuImages>> queryByPage(ProductSkuImages productSkuImages) {
        return APIResult.success();
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public APIResult<ProductSkuImages> queryById(@PathVariable("id") Long id) {
        return APIResult.success();
    }

    /**
     * 新增数据
     *
     * @param productSkuImages 实体
     * @return 新增结果
     */
    @PostMapping
    public APIResult<ProductSkuImages> add(ProductSkuImages productSkuImages) {
        return APIResult.success();
    }

    /**
     * 编辑数据
     *
     * @param productSkuImages 实体
     * @return 编辑结果
     */
    @PutMapping
    public APIResult<ProductSkuImages> edit(ProductSkuImages productSkuImages) {
        return APIResult.success();
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public APIResult<Boolean> deleteById(Long id) {
        return APIResult.success();
    }

}

