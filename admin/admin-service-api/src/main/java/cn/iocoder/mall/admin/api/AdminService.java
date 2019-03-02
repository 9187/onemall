package cn.iocoder.mall.admin.api;

import cn.iocoder.common.framework.vo.CommonResult;
import cn.iocoder.mall.admin.api.bo.AdminBO;
import cn.iocoder.mall.admin.api.bo.AdminPageBO;
import cn.iocoder.mall.admin.api.dto.AdminAddDTO;
import cn.iocoder.mall.admin.api.dto.AdminPageDTO;
import cn.iocoder.mall.admin.api.dto.AdminUpdateDTO;

public interface AdminService {

    CommonResult<AdminPageBO> getAdminPage(AdminPageDTO adminPageDTO);

    CommonResult<AdminBO> addAdmin(Integer adminId, AdminAddDTO adminAddDTO);

    CommonResult<Boolean> updateAdmin(Integer adminId, AdminUpdateDTO adminUpdateDTO);

    CommonResult<Boolean> updateAdminStatus(Integer adminId, Integer updateAdminId, Integer status);

    CommonResult<Boolean> deleteAdmin(Integer adminId, Integer updateAdminId);

}