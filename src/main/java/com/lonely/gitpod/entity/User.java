package com.lonely.gitpod.entity;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;
import lombok.experimental.Accessors;

import java.io.Serializable;

/**
 * @date: 2022-07-12 19:10
 * @author: ztkj-hzb
 * @description:
 **/
@Data
@Accessors(chain = true)
@TableName("t_user")
public class User implements Serializable {

    /**
     * 主键id
     */
    @TableId(type = IdType.NONE)
    private Integer id;

    /**
     * name
     */
    private String name;

}
