package com.xxx.demo.service;

import com.xxx.demo.model.IP;

import javax.enterprise.context.ApplicationScoped;
import java.util.ArrayList;
import java.util.List;

/**
 * Created by slobolai on 8/22/2016.
 */
@ApplicationScoped
public class IPService {

    public List<IP> getAllIP() {
        List<IP> ipList = new ArrayList<>();

        ipList.add(new IP("0.0.0.0.0"));
        ipList.add(new IP("localhost"));
        ipList.add(new IP("1.0.0.1"));
        return ipList;
    }
}
