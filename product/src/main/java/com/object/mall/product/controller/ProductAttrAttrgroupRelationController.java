package com.object.mall.product.controller;

import com.object.mall.common.utils.APIResult;
import com.object.mall.product.domain.ProductAttrAttrgroupRelation;
import com.object.mall.product.service.ProductAttrAttrgroupRelationService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;


/**
 * 属性&属性分组关联(ProductAttrAttrgroupRelation)表控制层
 *
 * @author makejava
 * @since 2023-02-27 12:24:25
 */
@Tag(name = "属性&属性分组关联")
@RestController
@RequestMapping("productAttrAttrgroupRelation")
public class ProductAttrAttrgroupRelationController {

    @Resource
    private ProductAttrAttrgroupRelationService productAttrAttrgroupRelationService;

    @Operation(summary = "分页查询")
    @GetMapping
    public APIResult queryByPage() {
        return APIResult.success();
    }

    /**
     * 通过主键查询单条数据
     *
     * @param id 主键
     * @return 单条数据
     */
    @GetMapping("{id}")
    public APIResult queryById(@PathVariable("id") Long id) {
        return APIResult.success();
    }

    /**
     * 新增数据
     *
     * @param productAttrAttrgroupRelation 实体
     * @return 新增结果
     */
    @PostMapping
    public APIResult<ProductAttrAttrgroupRelation> add(ProductAttrAttrgroupRelation productAttrAttrgroupRelation) {
        return APIResult.success();
    }

    /**
     * 编辑数据
     *
     * @param productAttrAttrgroupRelation 实体
     * @return 编辑结果
     */
    @PutMapping
    public APIResult<ProductAttrAttrgroupRelation> edit(ProductAttrAttrgroupRelation productAttrAttrgroupRelation) {
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