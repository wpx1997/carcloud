package com.joinwe.carcloud.service;

import org.springframework.stereotype.Service;
import java.util.HashMap;
import java.util.Map;

/**
 * created by 小case on 2020/5/18 14:23
 */
@Service
public class ResultService {

    public Map<String,Object> mapPutWithList(String mapKey,Object object){
        Map<String,Object> map = new HashMap<>();
        map.put(mapKey,object);
        return map;
    }

}
