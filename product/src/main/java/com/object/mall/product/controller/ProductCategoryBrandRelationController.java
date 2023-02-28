package com.object.mall.product.controller;

import com.baomidou.mybatisplus.extension.plugins.pagination.Page;
import com.object.mall.common.utils.APIResult;
import com.object.mall.product.domain.ProductCategoryBrandRelation;
import com.object.mall.product.service.ProductCategoryBrandRelationService;
import org.springframework.web.bind.annotation.*;

import jakarta.annotation.Resource;

/**
 * 品牌分类关联(ProductCategoryBrandRelation)表控制层
 *
 * @author makejava
 * @since 2023-02-27 12:24:25
 */
@RestController
@RequestMapping("productCategoryBrandRelation")
public class ProductCategoryBrandRelationController {
    /**
     * 服务对象
     */
    @Resource
    private ProductCategoryBrandRelationService productCategoryBrandRelationService;

    /**
     * 分页查询
     *
     * @param productCategoryBrandRelation 筛选条件
     * @param pageRequest      分页对象
     * @return 查询结果
     */
    @GetMapping
    public APIResult<Page<ProductCategoryBrandRelation>> queryByPage(ProductCategoryBrandRelation productCategoryBrandRelation) {
        return APIResult.success();
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public APIResult<ProductCategoryBrandRelation> queryById(@PathVariable("id") Long id) {
        return APIResult.success();
    }

    /**
     * 新增数据
     *
     * @param productCategoryBrandRelation 实体
     * @return 新增结果
     */
    @PostMapping
    public APIResult<ProductCategoryBrandRelation> add(ProductCategoryBrandRelation productCategoryBrandRelation) {
        return APIResult.success();
    }

    /**
     * 编辑数据
     *
     * @param productCategoryBrandRelation 实体
     * @return 编辑结果
     */
    @PutMapping
    public APIResult<ProductCategoryBrandRelation> edit(ProductCategoryBrandRelation productCategoryBrandRelation) {
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

