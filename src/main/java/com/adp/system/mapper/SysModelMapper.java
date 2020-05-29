package com.adp.system.mapper;

import java.util.List;
import com.adp.system.domain.SysModel;

/**
 * 系统内置模型Mapper接口
 * 
 * @author admin
 * @date 2020-05-29
 */
public interface SysModelMapper 
{
    /**
     * 查询系统内置模型
     * 
     * @param modelId 系统内置模型ID
     * @return 系统内置模型
     */
    public SysModel selectSysModelById(Integer modelId);

    /**
     * 查询系统内置模型列表
     * 
     * @param sysModel 系统内置模型
     * @return 系统内置模型集合
     */
    public List<SysModel> selectSysModelList(SysModel sysModel);

    /**
     * 新增系统内置模型
     * 
     * @param sysModel 系统内置模型
     * @return 结果
     */
    public int insertSysModel(SysModel sysModel);

    /**
     * 修改系统内置模型
     * 
     * @param sysModel 系统内置模型
     * @return 结果
     */
    public int updateSysModel(SysModel sysModel);

    /**
     * 删除系统内置模型
     * 
     * @param modelId 系统内置模型ID
     * @return 结果
     */
    public int deleteSysModelById(Integer modelId);

    /**
     * 批量删除系统内置模型
     * 
     * @param modelIds 需要删除的数据ID
     * @return 结果
     */
    public int deleteSysModelByIds(String[] modelIds);
}
