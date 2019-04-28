package com.sample.demo.v1.user;

import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.util.Date;

@Entity
//  加unique约束 没用，除非数据库是 hibernate 自己创建的，所以还是自己去数据库端检查
@Table(name="user",
//        uniqueConstraints={@UniqueConstraint(columnNames="phone_num")},
        indexes = {@Index(columnList = "user_id, phone_num, creat_time, update_time")}
)
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "user_id")
    private Integer userId;

    @Column(name = "nick_name")
    public String nickName;

    @Column(name = "phone_num", length = 20)
    public String phoneNum;

    @Column(name = "pass_word")
    public String passWord;

    public String avatar;

    public Integer sex;

    @Column(name = "creat_time")
    @CreationTimestamp
    public Date createTime;

    @Column(name = "update_time")
    @UpdateTimestamp
    public Date updateTime;

    public String platform;

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setAvatar(String avatar) {
        this.avatar = avatar;
    }

    public String getAvatar() {
        return avatar;
    }

    public void setSex(Integer sex) {
        this.sex = sex;
    }

    public Integer getSex() {
        return sex;
    }

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

    public void setPlatform(String platform) {
        this.platform = platform;
    }

    public String getPlatform() {
        return platform;
    }
}
