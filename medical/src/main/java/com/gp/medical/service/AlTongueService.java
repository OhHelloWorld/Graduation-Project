package com.gp.medical.service;

import com.gp.medical.entity.AlTongue;

/**
 * Created by Administrator on 2018/3/22 0022.
 */
public interface AlTongueService {

    /**
     * 存储自免肝舌脉象信息
     * @param tongue
     */
    void saveTongue(AlTongue tongue);

    AlTongue findByPersonId(Integer personId);

    void updateAlTongue(AlTongue alTongue);
}
