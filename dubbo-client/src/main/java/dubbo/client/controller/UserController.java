package dubbo.client.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import dubbo.server.entity.SUserEntity;
import dubbo.server.service.SUserService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: user controller
 * @Param:
 * @return:
 * @Author: wangliang
 * @Date: 2019/10/11
 */
@Api(tags = "用户接口controller")
@Slf4j
@RestController
@RequestMapping("/user")
public class UserController {

    @Reference
    private SUserService sUserService;

    @ApiOperation(value = "根据手机号查找用户")
    @GetMapping("/findByPhone")
    public SUserEntity findByPhone(@ApiParam(value = "手机号码", required = true) @RequestParam String phone) {
        return sUserService.findByPhone(phone);
    }
}
