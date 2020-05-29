package com.adp.system.service.impl;

import java.util.List;
import com.adp.common.utils.DateUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import com.adp.system.mapper.SysModelMapper;
import com.adp.system.domain.SysModel;
import com.adp.system.service.ISysModelService;
import com.adp.common.core.text.Convert;

/**
 * 系统内置模型Service业务层处理
 * 
 * @author admin
 * @date 2020-05-29
 */
@Service
public class SysModelServiceImpl implements ISysModelService 
{
    @Autowired
    private SysModelMapper sysModelMapper;

    /**
     * 查询系统内置模型
     * 
     * @param modelId 系统内置模型ID
     * @return 系统内置模型
     */
    @Override
    public SysModel selectSysModelById(Integer modelId)
    {
        return sysModelMapper.selectSysModelById(modelId);
    }

    /**
     * 查询系统内置模型列表
     * 
     * @param sysModel 系统内置模型
     * @return 系统内置模型
     */
    @Override
    public List<SysModel> selectSysModelList(SysModel sysModel)
    {
        return sysModelMapper.selectSysModelList(sysModel);
    }

    /**
     * 新增系统内置模型
     * 
     * @param sysModel 系统内置模型
     * @return 结果
     */
    @Override
    public int insertSysModel(SysModel sysModel)
    {
        sysModel.setCreateTime(DateUtils.getNowDate());
        return sysModelMapper.insertSysModel(sysModel);
    }

    /**
     * 修改系统内置模型
     * 
     * @param sysModel 系统内置模型
     * @return 结果
     */
    @Override
    public int updateSysModel(SysModel sysModel)
    {
        sysModel.setUpdateTime(DateUtils.getNowDate());
        return sysModelMapper.updateSysModel(sysModel);
    }

    /**
     * 删除系统内置模型对象
     * 
     * @param ids 需要删除的数据ID
     * @return 结果
     */
    @Override
    public int deleteSysModelByIds(String ids)
    {
        return sysModelMapper.deleteSysModelByIds(Convert.toStrArray(ids));
    }

    /**
     * 删除系统内置模型信息
     * 
     * @param modelId 系统内置模型ID
     * @return 结果
     */
    @Override
    public int deleteSysModelById(Integer modelId)
    {
        return sysModelMapper.deleteSysModelById(modelId);
    }
}
