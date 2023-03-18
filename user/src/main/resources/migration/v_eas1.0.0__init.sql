CREATE TABLE `usm_user`
(
    `id`              varchar(32) NOT NULL COMMENT '主键',
    `create_time`     timestamp   NOT NULL COMMENT '创建时间',
    `update_time`     timestamp   NOT NULL COMMENT '更新时间',
    `level_id`        varchar(32) NOT NULL COMMENT '用户等级id',
    `code`            varchar(32)          DEFAULT NULL COMMENT '用户编号',
    `name`            varchar(32)          DEFAULT NULL COMMENT '用户名',
    `profile_picture` varchar(255)         DEFAULT NULL COMMENT '头像',
    `gender`          tinyint(1) DEFAULT NULL COMMENT '性别(0男,1女,2未知)',
    `birth`           timestamp            DEFAULT NULL COMMENT '出生年月',
    `country`         varchar(32)          DEFAULT NULL COMMENT '所在国家',
    `city`            varchar(32)          DEFAULT NULL COMMENT '所在城市',
    `job`             varchar(32)          DEFAULT NULL COMMENT '职业',
    `mobile`          varchar(16)          DEFAULT NULL COMMENT '联系电话',
    `email`           varchar(32)          DEFAULT NULL COMMENT '联系邮箱',
    `sign`            varchar(255)         DEFAULT NULL COMMENT '个性签名',
    `integration`     varchar(32)          DEFAULT NULL COMMENT '积分',
    `growth`          varchar(32)          DEFAULT NULL COMMENT '成长值',
    `free_freight`    char(1)     NOT NULL default 0 COMMENT '已享受到免邮次数',
    `status`          tinyint(1) not null default 1 COMMENT '状态(0禁用,1启用,2停用,3锁定)',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户信息表';

CREATE TABLE `usm_user_level`
(
    `id`                   varchar(32) NOT NULL COMMENT '主键',
    `create_time`          timestamp   NOT NULL COMMENT '创建时间',
    `update_time`          timestamp   NOT NULL COMMENT '更新时间',
    `name`                 varchar(32) NOT NULL COMMENT '等级名称',
    `growth_point`         varchar(32) NOT NULL default 0 COMMENT '等级需要的成长值',
    `comment_growth_point` varchar(32) NOT NULL default 0 COMMENT '每次评价获取的成长值',
    `default_status`       tinyint (1) NOT NULL DEFAULT 0 COMMENT '是否为默认等级(0不是,1是)',
    `free_freight`         char(1)     NOT NULL default 0 COMMENT '免邮特权次数',
    `user_price`           tinyint (1) NOT NULL default 0 COMMENT '是否享受会员价',
    `birthday_gift`        tinyint (1) NOT NULL default 0 COMMENT '是否享受生日特权(0不享受,1享受)',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户等级';

CREATE TABLE `usm_growth_change_history`
(
    `id`            varchar(32) NOT NULL COMMENT '主键',
    `create_time`   timestamp   NOT NULL COMMENT '创建时间',
    `update_time`   timestamp   NOT NULL COMMENT '更新时间',
    `user_id`       varchar(32) NOT NULL COMMENT '用户id',
    `change_point`  varchar(8)  DEFAULT NULL COMMENT '改变的值',
    `change_type`   tinyint (1) NOT NULL default 1 COMMENT '加或减(0减,1加)',
    `change_before` varchar(32) DEFAULT NULL COMMENT '改变前',
    `comment`       varchar(32) DEFAULT NULL COMMENT '备注',
    `source_type`   tinyint (1) DEFAULT NULL COMMENT '来源(0-购物,1-管理员修改,2活动)',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='成长值变化历史记录';

CREATE TABLE `usm_integration_change_history`
(
    `id`            varchar(32) NOT NULL COMMENT '主键',
    `create_time`   timestamp   NOT NULL COMMENT '创建时间',
    `update_time`   timestamp   NOT NULL COMMENT '更新时间',
    `user_id`       varchar(32) NOT NULL COMMENT '用户id',
    `change_point`  varchar(8)  DEFAULT NULL COMMENT '改变的值',
    `change_type`   tinyint (1) NOT NULL default 1 COMMENT '加或减(0减,1加)',
    `change_before` varchar(32) DEFAULT NULL COMMENT '改变前',
    `comment`       varchar(32) DEFAULT NULL COMMENT '备注',
    `source_type`   tinyint (1) DEFAULT NULL COMMENT '来源(0-购物,1-管理员修改,2活动)',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='积分变化历史记录';

CREATE TABLE `usm_user_collect_sku`
(
    `id`          varchar(32)  NOT NULL COMMENT '主键',
    `create_time` timestamp    NOT NULL COMMENT '创建时间',
    `update_time` timestamp    NOT NULL COMMENT '更新时间',
    `user_id`     varchar(32)  NOT NULL COMMENT '用户id',
    `spu_id`      varchar(32)  NOT NULL COMMENT 'spuId',
    `sku_id`      varchar(32)  NOT NULL COMMENT 'skuId',
    `sku_name`    varchar(255) NOT NULL COMMENT '商品名称',
    `sku_img`     varchar(255) DEFAULT NULL COMMENT '商品默认图片',
    `sku_url`     varchar(255) NOT NULL COMMENT '商品链接',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户收藏的sku';

CREATE TABLE `usm_user_collect_subject`
(
    `id`           varchar(32) NOT NULL COMMENT '主键',
    `create_time`  timestamp   NOT NULL COMMENT '创建时间',
    `update_time`  timestamp   NOT NULL COMMENT '更新时间',
    `user_id`      varchar(32) NOT NULL COMMENT '用户id',
    `subject_id`   varchar(32)  DEFAULT NULL COMMENT '活动id',
    `subject_name` varchar(255) DEFAULT NULL COMMENT '活动名称',
    `subject_img`  varchar(255) DEFAULT NULL COMMENT '活动默认图片',
    `subject_url`  varchar(255) DEFAULT NULL COMMENT '活动url',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户收藏的活动';

CREATE TABLE `user_auth`
(
    `id`          varchar(32)  NOT NULL COMMENT '主键',
    `create_time` timestamp    NOT NULL COMMENT '创建时间',
    `update_time` timestamp    NOT NULL COMMENT '更新时间',
    `user_id`     varchar(32)  NOT NULL COMMENT '用户id',
    `type`        tinyint(1) NOT NULL COMMENT '授权平台类型(0系统,1邮箱,2手机号,3Google,4Twitter,5iPhone,6QQ,7微信,8微博)',
    `auth_id`     varchar(32)  NOT NULL COMMENT '授权平台id',
    `verified`    tinyint(1) NOT NULL DEFAULT 0 COMMENT '是否已验证(0未验证,1已验证)',
    `credential`  varchar(255) NOT NULL COMMENT '授权凭证',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户授权表';

CREATE TABLE `usm_user_login_log`
(
    `id`          varchar(32) NOT NULL COMMENT '主键',
    `create_time` timestamp   NOT NULL COMMENT '创建时间',
    `update_time` timestamp   NOT NULL COMMENT '更新时间',
    `user_id`     varchar(32) NOT NULL COMMENT '用户id',
    `ip`          varchar(64) DEFAULT NULL COMMENT '登录ip',
    `city`        varchar(64) DEFAULT NULL COMMENT '登录城市',
    `login_type`  tinyint(1) DEFAULT NULL COMMENT '登录类型(0web,1app)',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户登录记录';

CREATE TABLE `usm_user_receive_address`
(
    `id`             varchar(32) NOT NULL COMMENT '主键',
    `create_time`    timestamp   NOT NULL COMMENT '创建时间',
    `update_time`    timestamp   NOT NULL COMMENT '更新时间',
    `user_id`        varchar(32) NOT NULL COMMENT '用户id',
    `name`           varchar(32) NOT NULL COMMENT '收货人姓名',
    `phone`          varchar(16) NOT NULL COMMENT '电话',
    `post_code`      varchar(8) DEFAULT NULL COMMENT '邮政编码',
    `province`       varchar(16) NOT NULL COMMENT '省份/直辖市',
    `city`           varchar(16) NOT NULL COMMENT '城市',
    `region`         varchar(16) NOT NULL COMMENT '区',
    `detail_address` varchar(64) NOT NULL COMMENT '详细地址(街道)',
    `area_code`      varchar(8) DEFAULT NULL COMMENT '地区编码',
    `default_status` tinyint(1) DEFAULT NULL COMMENT '是否为默认地址(0否,1是)',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户收货地址';

CREATE TABLE `usm_user_statistics_info`
(
    `id`                    varchar(32) NOT NULL COMMENT '主键',
    `create_time`           timestamp   NOT NULL COMMENT '创建时间',
    `update_time`           timestamp   NOT NULL COMMENT '更新时间',
    `user_id`               varchar(32) NOT NULL COMMENT '用户id',
    `consume_amount`        decimal(18, 4)       DEFAULT NULL COMMENT '累计消费金额',
    `coupon_amount`         decimal(18, 4)       DEFAULT NULL COMMENT '累计优惠金额',
    `order_count`           varchar(16) NOT NULL DEFAULT '0' COMMENT '订单数量',
    `coupon_count`          varchar(16) NOT NULL DEFAULT '0' COMMENT '优惠券数量',
    `comment_count`         varchar(16) NOT NULL DEFAULT '0' COMMENT '评价数',
    `return_order_count`    varchar(16) NOT NULL DEFAULT '0' COMMENT '退货数量',
    `login_count`           varchar(16) NOT NULL DEFAULT '0' COMMENT '登录次数',
    `attend_count`          varchar(16) NOT NULL DEFAULT '0' COMMENT '关注数量',
    `fans_count`            varchar(16) NOT NULL DEFAULT '0' COMMENT '粉丝数量',
    `collect_product_count` varchar(16) NOT NULL DEFAULT '0' COMMENT '收藏的商品数量',
    `collect_subject_count` varchar(16) NOT NULL DEFAULT '0' COMMENT '收藏的活动数量',
    `collect_comment_count` varchar(16) NOT NULL DEFAULT '0' COMMENT '收藏的评论数量',
    `invite_friend_count`   varchar(16) NOT NULL DEFAULT '0' COMMENT '邀请的朋友数量',
    PRIMARY KEY (`id`)
) ENGINE=InnoDB DEFAULT CHARSET=utf8mb4 COLLATE=utf8mb4_0900_ai_ci COMMENT='用户统计信息';