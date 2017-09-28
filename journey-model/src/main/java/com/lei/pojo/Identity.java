package com.lei.pojo;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;


@MappedSuperclass
public class Identity implements Serializable {

    private static final long serialVersionUID = -5920468694922507313L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Integer id;

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getId() {
        return id;
    }

    @Column(name = "fk_crt_user_id")
    private Integer crtUserId;
    public Integer getCrtUserId() {
        return crtUserId;
    }
    public void setCrtUserId(Integer crtUserId) {
        this.crtUserId = crtUserId;
    }

    @Column(name = "fk_upd_user_id")
    private Integer updUserId;
    public Integer getUpdUserId() {
        return updUserId;
    }
    public void setUpdUserId(Integer updUserId) {
        this.updUserId = updUserId;
    }

    @Column(name = "dt_create_time")
    private Date createTime;
    public Date getCreateTime() {
        return createTime;
    }
    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Column(name = "dt_update_time")
    private Date updateTime;
    public Date getUpdateTime() {
        return updateTime;
    }
    public void setUpdateTime(Date updateTime) {
        this.updateTime = updateTime;
    }


}