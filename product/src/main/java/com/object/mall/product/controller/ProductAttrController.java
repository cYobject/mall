package com.object.mall.product.controller;

import com.object.mall.common.utils.APIResult;
import com.object.mall.product.domain.ProductAttr;
import com.object.mall.product.service.ProductAttrService;
import jakarta.annotation.Resource;
import org.springframework.web.bind.annotation.*;


/**
 * 商品属性(ProductAttr)表控制层
 *
 * @author makejava
 * @since 2023-02-27 12:24:22
 */
@RestController
@RequestMapping("productAttr")
public class ProductAttrController {
    /**
     * 服务对象
     */
    @Resource
    private ProductAttrService productAttrService;

    /**
     * 分页查询
     *
     * @param productAttr 筛选条件
     * @param pageRequest 分页对象
     * @return 查询结果
     */
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
     * @param productAttr 实体
     * @return 新增结果
     */
    @PostMapping
    public APIResult add(ProductAttr productAttr) {
        return APIResult.success();
    }

    /**
     * 编辑数据
     *
     * @param productAttr 实体
     * @return 编辑结果
     */
    @PutMapping
    public APIResult edit(ProductAttr productAttr) {
        return APIResult.success();
    }

    /**
     * 删除数据
     *
     * @param id 主键
     * @return 删除是否成功
     */
    @DeleteMapping
    public APIResult deleteById(Long id) {
        return APIResult.success();
    }

}

