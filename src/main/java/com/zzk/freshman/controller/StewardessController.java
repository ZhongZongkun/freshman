package com.zzk.freshman.controller;

import com.zzk.freshman.entity.Result;
import com.zzk.freshman.entity.Stewardess;
import com.zzk.freshman.enums.ResultEnum;
import com.zzk.freshman.exception.StewardessException;
import com.zzk.freshman.service.StewardessService;
import com.zzk.freshman.utils.ResultUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/stewardess")
public class StewardessController {

    @Autowired
    private StewardessService stewardessService;

    @GetMapping("/findByIdentity/{identity}")
    public Result<Stewardess> findStewardessByIdentity(
            @PathVariable(value = "identity",required = true) String identity) {
        if (15 > identity.length() || 18 < identity.length()) {
            throw new StewardessException(ResultEnum.EMPTY_CONDITION);
        }
        Stewardess stewardess = stewardessService.findStewardessByIdentity(identity);
        if (null == stewardess) {
            throw new StewardessException(ResultEnum.NONE_RESULT);
        }
        return ResultUtil.success(stewardess);
    }

}
