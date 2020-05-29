package com.adp.system.domain;

import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;
import com.adp.common.annotation.Excel;
import com.adp.common.core.domain.BaseEntity;

/**
 * 系统内置模型对象 sys_model
 * 
 * @author admin
 * @date 2020-05-29
 */
public class SysModel extends BaseEntity
{
    private static final long serialVersionUID = 1L;

    /** 模型主键 */
    private Integer modelId;

    /** 模型名称 */
    @Excel(name = "模型名称")
    private String modelName;

    /** 模型描述 */
    @Excel(name = "模型描述")
    private String modelMark;

    /** 模型类型 */
    @Excel(name = "模型类型")
    private String modelType;

    /** 模型基本信息 */
    @Excel(name = "模型基本信息")
    private String modelInfo;

    public void setModelId(Integer modelId) 
    {
        this.modelId = modelId;
    }

    public Integer getModelId() 
    {
        return modelId;
    }
    public void setModelName(String modelName) 
    {
        this.modelName = modelName;
    }

    public String getModelName() 
    {
        return modelName;
    }
    public void setModelMark(String modelMark) 
    {
        this.modelMark = modelMark;
    }

    public String getModelMark() 
    {
        return modelMark;
    }
    public void setModelType(String modelType) 
    {
        this.modelType = modelType;
    }

    public String getModelType() 
    {
        return modelType;
    }
    public void setModelInfo(String modelInfo) 
    {
        this.modelInfo = modelInfo;
    }

    public String getModelInfo() 
    {
        return modelInfo;
    }

    @Override
    public String toString() {
        return new ToStringBuilder(this,ToStringStyle.MULTI_LINE_STYLE)
            .append("modelId", getModelId())
            .append("modelName", getModelName())
            .append("modelMark", getModelMark())
            .append("modelType", getModelType())
            .append("modelInfo", getModelInfo())
            .append("createBy", getCreateBy())
            .append("createTime", getCreateTime())
            .append("updateBy", getUpdateBy())
            .append("updateTime", getUpdateTime())
            .append("remark", getRemark())
            .toString();
    }
}
