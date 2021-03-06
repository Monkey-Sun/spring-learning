package com.sample.demo.base;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;
/**
 * 实体基类:
 * 子类继承即可获得创建时间和更新时间
 * */
@MappedSuperclass
public class BaseEntity implements Serializable {
    @Column(name = "creat_time")
    @CreationTimestamp
    public Date createTime;

    @Column(name = "update_time")
    @UpdateTimestamp
    public Date updateTime;

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }

    public Date getUpdateTime() {
        return updateTime;
    }
}
