package dubbo.server.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import dubbo.server.dao.SUserRepo;
import dubbo.server.entity.SUserEntity;
import dubbo.server.service.SUserService;
import lombok.extern.slf4j.Slf4j;

import javax.annotation.Resource;

/**
 * @Description: s_user serviceImpl
 * @Param:
 * @return:
 * @Author: wangliang
 * @Date: 2019/10/11
 */
@Service
@org.springframework.stereotype.Service
@Slf4j
public class SUserServiceImpl implements SUserService {

    @Resource
    SUserRepo sUserRepo;

    @Override
    public SUserEntity findByPhoneAndPassword(String phone, String password) {
        return sUserRepo.findByPhoneAndPassword(phone, password);
    }

    @Override
    public SUserEntity findByPhone(String phone) {
        return sUserRepo.findByPhone(phone);
    }

    @Override
    public SUserEntity findByName(String name) {
        return sUserRepo.findByName(name);
    }
}
