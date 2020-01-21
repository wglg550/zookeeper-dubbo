package dubbo.server.service;

import dubbo.server.entity.SUserEntity;

/**
 * @Description: s_user service
 * @Param:
 * @return:
 * @Author: wangliang
 * @Date: 2019/10/11
 */
public interface SUserService {

    /**
     * 根据手机号码和密码查询登录用户
     *
     * @param phone
     * @param password
     * @return
     */
    SUserEntity findByPhoneAndPassword(String phone, String password);

    /**
     * 根据手机号码查询登录用户
     *
     * @param phone
     * @return
     */
    SUserEntity findByPhone(String phone);

    /**
     * 根据姓名查询登录用户
     *
     * @param name
     * @return
     */
    SUserEntity findByName(String name);
}
