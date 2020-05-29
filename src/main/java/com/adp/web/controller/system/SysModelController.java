package com.adp.web.controller.system;

import java.util.List;
import org.apache.shiro.authz.annotation.RequiresPermissions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import com.adp.common.annotation.Log;
import com.adp.common.enums.BusinessType;
import com.adp.system.domain.SysModel;
import com.adp.system.service.ISysModelService;
import com.adp.common.core.controller.BaseController;
import com.adp.common.core.domain.AjaxResult;
import com.adp.common.utils.poi.ExcelUtil;
import com.adp.common.core.page.TableDataInfo;

/**
 * 系统内置模型Controller
 * 
 * @author admin
 * @date 2020-05-29
 */
@Controller
@RequestMapping("/system/model")
public class SysModelController extends BaseController
{
    private String prefix = "system/model";

    @Autowired
    private ISysModelService sysModelService;

    @RequiresPermissions("system:model:view")
    @GetMapping()
    public String model()
    {
        return prefix + "/model";
    }

    /**
     * 查询系统内置模型列表
     */
    @RequiresPermissions("system:model:list")
    @PostMapping("/list")
    @ResponseBody
    public TableDataInfo list(SysModel sysModel)
    {
        startPage();
        List<SysModel> list = sysModelService.selectSysModelList(sysModel);
        return getDataTable(list);
    }

    /**
     * 导出系统内置模型列表
     */
    @RequiresPermissions("system:model:export")
    @Log(title = "系统内置模型", businessType = BusinessType.EXPORT)
    @PostMapping("/export")
    @ResponseBody
    public AjaxResult export(SysModel sysModel)
    {
        List<SysModel> list = sysModelService.selectSysModelList(sysModel);
        ExcelUtil<SysModel> util = new ExcelUtil<SysModel>(SysModel.class);
        return util.exportExcel(list, "model");
    }

    /**
     * 新增系统内置模型
     */
    @GetMapping("/add")
    public String add()
    {
        return prefix + "/add";
    }

    /**
     * 新增保存系统内置模型
     */
    @RequiresPermissions("system:model:add")
    @Log(title = "系统内置模型", businessType = BusinessType.INSERT)
    @PostMapping("/add")
    @ResponseBody
    public AjaxResult addSave(SysModel sysModel)
    {
        return toAjax(sysModelService.insertSysModel(sysModel));
    }

    /**
     * 修改系统内置模型
     */
    @GetMapping("/edit/{modelId}")
    public String edit(@PathVariable("modelId") Integer modelId, ModelMap mmap)
    {
        SysModel sysModel = sysModelService.selectSysModelById(modelId);
        mmap.put("sysModel", sysModel);
        return prefix + "/edit";
    }

    /**
     * 修改保存系统内置模型
     */
    @RequiresPermissions("system:model:edit")
    @Log(title = "系统内置模型", businessType = BusinessType.UPDATE)
    @PostMapping("/edit")
    @ResponseBody
    public AjaxResult editSave(SysModel sysModel)
    {
        return toAjax(sysModelService.updateSysModel(sysModel));
    }

    /**
     * 删除系统内置模型
     */
    @RequiresPermissions("system:model:remove")
    @Log(title = "系统内置模型", businessType = BusinessType.DELETE)
    @PostMapping( "/remove")
    @ResponseBody
    public AjaxResult remove(String ids)
    {
        return toAjax(sysModelService.deleteSysModelByIds(ids));
    }
}
