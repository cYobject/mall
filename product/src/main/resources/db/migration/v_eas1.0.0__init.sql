CREATE TABLE `psm_category`
(
    `id`            varchar(32) NOT NULL COMMENT '主键',
    `create_time`   timestamp   NOT NULL COMMENT '创建时间',
    `update_time`   timestamp   NOT NULL COMMENT '更新时间',
    `name`          varchar(32) NOT NULL COMMENT '分类名称',
    `parent_id`     varchar(32) NOT NULL COMMENT '父分类id(顶层为-1)',
    `level`         varchar(4)  NOT NULL COMMENT '层级(顶层为0)',
    `sort`          varchar(4)  NOT NULL COMMENT '排序',
    `icon`          varchar(255) DEFAULT NULL COMMENT '图标',
    `product_unit`  varchar(4)   DEFAULT NULL COMMENT '商品计量单位',
    `product_count` varchar(16)  DEFAULT NULL COMMENT '商品数量',
    `show_status`   tinyint (1) NOT NULL DEFAULT 0 COMMENT '是否显示(0-不显示，1显示)',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='三级分类';

CREATE TABLE `psm_brand`
(
    `id`           varchar(32) NOT NULL COMMENT '主键',
    `create_time`  timestamp   NOT NULL COMMENT '创建时间',
    `update_time`  timestamp   NOT NULL COMMENT '更新时间',
    `name`         varchar(32)  DEFAULT NULL COMMENT '品牌名',
    `logo`         varchar(255) DEFAULT NULL COMMENT '品牌logo',
    `description`  longtext     DEFAULT NULL COMMENT '品牌介绍',
    `first_letter` char(1)      DEFAULT NULL COMMENT '检索首字母',
    `sort`         varchar(4)  NOT NULL COMMENT '排序',
    `show_status`  tinyint (1) NOT NULL DEFAULT 0 COMMENT '是否显示(0-不显示，1显示)',
    PRIMARY KEY (`id`) USING BTREE
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='品牌';

CREATE TABLE `psm_spu`
(
    `id`             varchar(32)  NOT NULL COMMENT '主键',
    `create_time`    timestamp    NOT NULL COMMENT '创建时间',
    `update_time`    timestamp    NOT NULL COMMENT '更新时间',
    `name`           varchar(32)    DEFAULT NULL COMMENT '名称',
    `description`    varchar(2048)  DEFAULT NULL COMMENT '描述',
    `category_id`    varchar(32)  NOT NULL COMMENT '分类id',
    `brand_id`       varchar(32)  NOT NULL COMMENT '品牌id',
    `weight`         decimal(18, 4) DEFAULT NULL,
    `default_img`    varchar(255) NOT NULL COMMENT '默认图片(冗余)',
    `publish_status` tinyint (1) NOT NULL DEFAULT 0 COMMENT '上架状态(0下架,1上架)',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='spu信息';

CREATE TABLE `psm_spu_images`
(
    `id`          varchar(32)  NOT NULL COMMENT '主键',
    `create_time` timestamp    NOT NULL COMMENT '创建时间',
    `update_time` timestamp    NOT NULL COMMENT '更新时间',
    `spu_id`      varchar(32)  NOT NULL COMMENT 'spuId',
    `name`        varchar(32)  NOT NULL COMMENT '图片名',
    `url`         varchar(255) NOT NULL COMMENT '图片地址',
    `sort`        varchar(4)   NOT NULL COMMENT '顺序',
    `default_img` tinyint (1) DEFAULT 0 COMMENT '是否默认图(0否,1是)',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='spu图片';

CREATE TABLE `psm_sku`
(
    `id`             varchar(32)    NOT NULL COMMENT '主键',
    `create_time`    timestamp      NOT NULL COMMENT '创建时间',
    `update_time`    timestamp      NOT NULL COMMENT '更新时间',
    `spu_id`         varchar(32)    NOT NULL COMMENT 'spuId',
    `name`           varchar(32)   DEFAULT NULL COMMENT '名称',
    `description`    varchar(2048) DEFAULT NULL COMMENT '描述',
    `category_id`    varchar(32)    NOT NULL COMMENT '分类id',
    `brand_id`       varchar(32)    NOT NULL COMMENT '品牌id',
    `default_img`    varchar(255)   NOT NULL COMMENT '默认图片(冗余)',
    `title`          varchar(255)   NOT NULL COMMENT '标题',
    `subtitle`       varchar(2000)  NOT NULL COMMENT '副标题',
    `price`          decimal(18, 4) NOT NULL COMMENT '价格',
    `sale_count`     varchar(32)    NOT NULL COMMENT '销量',
    `publish_status` tinyint (1) NOT NULL DEFAULT 0 COMMENT '上架状态(0下架,1上架)',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='sku信息';

CREATE TABLE `psm_sku_images`
(
    `id`          varchar(32)  NOT NULL COMMENT '主键',
    `create_time` timestamp    NOT NULL COMMENT '创建时间',
    `update_time` timestamp    NOT NULL COMMENT '更新时间',
    `sku_id`      varchar(32)  NOT NULL COMMENT 'skuId',
    `name`        varchar(32)  NOT NULL COMMENT '图片名',
    `url`         varchar(255) NOT NULL COMMENT '图片地址',
    `sort`        varchar(4)   NOT NULL COMMENT '顺序',
    `default_img` tinyint (1) DEFAULT 0 COMMENT '是否默认图(0否,1是)',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='sku图片';

CREATE TABLE `psm_spec_group`
(
    `id`          varchar(32) NOT NULL COMMENT '主键',
    `create_time` timestamp   NOT NULL COMMENT '创建时间',
    `update_time` timestamp   NOT NULL COMMENT '更新时间',
    `category_id` varchar(32) NOT NULL COMMENT '所属分类id',
    `name`        varchar(20)  DEFAULT NULL COMMENT '规格组名',
    `sort`        varchar(4)  NOT NULL COMMENT '顺序',
    `description` varchar(255) DEFAULT NULL COMMENT '描述',
    `icon`        varchar(255) DEFAULT NULL COMMENT '组图标',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='规格分组';

CREATE TABLE `psm_spec_group_relation`
(
    `id`            varchar(32) NOT NULL COMMENT '主键',
    `create_time`   timestamp   NOT NULL COMMENT '创建时间',
    `update_time`   timestamp   NOT NULL COMMENT '更新时间',
    `spec_id`       varchar(32) NOT NULL COMMENT '规格id',
    `spec_group_id` varchar(32) NOT NULL COMMENT '规格分组id',
    `sort`          varchar(4)  NOT NULL COMMENT '规格组内排序',
    `category_id`   varchar(32) NOT NULL COMMENT '商品分类id(冗余)',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='规格&规格分组关联';

CREATE TABLE `psm_spec`
(
    `id`           varchar(32) NOT NULL COMMENT '主键',
    `create_time`  timestamp   NOT NULL COMMENT '创建时间',
    `update_time`  timestamp   NOT NULL COMMENT '更新时间',
    `name`         varchar(32)  DEFAULT NULL COMMENT '规格名称',
    `icon`         varchar(255) DEFAULT NULL COMMENT '规格图标',
    `value_select` char(255)    DEFAULT NULL COMMENT '可选值列表(用英文,分隔)',
    `type`         tinyint      DEFAULT NULL COMMENT '属性类型(0销售属性，1基本属性，2销售属性&基本属性)',
    `search_type`  tinyint (1) NOT NULL DEFAULT 0 COMMENT '是否可以检索(0不可以，1可以)',
    `show_desc`    tinyint      DEFAULT NULL COMMENT '快速展示(是否展示在介绍上:0否 1是),在sku中仍然可以调整',
    `enable`       tinyint(1) NOT NULL DEFAULT 0 COMMENT '启用状态(0禁用,1启用)',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='商品规格';

CREATE TABLE `psm_spu_spec_value`
(
    `id`          varchar(32) NOT NULL COMMENT '主键',
    `create_time` timestamp   NOT NULL COMMENT '创建时间',
    `update_time` timestamp   NOT NULL COMMENT '更新时间',
    `spu_id`      varchar(32) NOT NULL COMMENT 'spuId',
    `spec_id`     varchar(32) NOT NULL COMMENT '规格id',
    `spec_name`   varchar(32) NOT NULL COMMENT '规格名',
    `spec_value`  varchar(32) NOT NULL COMMENT '规格值',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='spu规格值';

CREATE TABLE `psm_sku_spec_value`
(
    `id`          varchar(32) NOT NULL COMMENT '主键',
    `create_time` timestamp   NOT NULL COMMENT '创建时间',
    `update_time` timestamp   NOT NULL COMMENT '更新时间',
    `sku_id`      varchar(32) NOT NULL COMMENT 'skuId',
    `spec_id`     varchar(32) NOT NULL COMMENT '规格id',
    `spec_name`   varchar(32) NOT NULL COMMENT '规格名',
    `spec_value`  varchar(32) NOT NULL COMMENT '规格值',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='sku销售属性的值';

CREATE TABLE `psm_comment`
(
    `id`             varchar(32) NOT NULL COMMENT '主键',
    `create_time`    timestamp   NOT NULL COMMENT '创建时间',
    `update_time`    timestamp   NOT NULL COMMENT '更新时间',
    `sku_id`         varchar(32) NOT NULL COMMENT 'sku_id',
    `spu_id`         varchar(32) NOT NULL COMMENT 'spu_id',
    `user_id`        varchar(32) NOT NULL COMMENT '用户id',
    `star`           tinyint(1) NOT NULL COMMENT '星级',
    `user_city`      varchar(64) NOT NULL DEFAULT NULL COMMENT '会员所在城市',
    `spu_attributes` varchar(255)         DEFAULT NULL COMMENT '购买时属性组合',
    `like_count`     varchar(32) NOT NULL DEFAULT 0 COMMENT '点赞数',
    `dislike_count`  varchar(32) NOT NULL DEFAULT 0 COMMENT '点踩数',
    `reply_count`    varchar(32)          DEFAULT NULL COMMENT '回复数',
    `resources`      longtext             DEFAULT NULL COMMENT '评论图片/视频内容[json数据；[{type:文件类型,url:资源路径}]]',
    `content`        text                 DEFAULT NULL COMMENT '文字内容',
    `comment_type`   tinyint(1) NOT NULL DEFAULT 0 COMMENT '评论类型(0对商品的直接评论,1对评论的回复)',
    `show_status`    tinyint(1) NOT NULL DEFAULT 0 COMMENT '显示状态(0不显示,1显示)',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='商品评价';

CREATE TABLE `psm_comment_replay`
(
    `id`         varchar(32) NOT NULL COMMENT 'id',
    `comment_id` varchar(32) NOT NULL COMMENT '评论id',
    `reply_id`   varchar(32) NOT NULL COMMENT '回复id',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='商品评价回复关系';