package com.zzk.freshman.service.impl;

import com.zzk.freshman.entity.Stewardess;
import com.zzk.freshman.repository.StewardessRepository;
import com.zzk.freshman.service.StewardessService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StewardessServiceImpl implements StewardessService {

    @Autowired
    private StewardessRepository stewardessRepository;

    @Override
    public Stewardess findStewardessByIdentity(String identity) {
        Stewardess stewardess = stewardessRepository.findByIdentity(identity);
        return stewardess;
    }
}
