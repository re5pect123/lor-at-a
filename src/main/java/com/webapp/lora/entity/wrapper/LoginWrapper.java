package com.webapp.lora.entity.wrapper;

import com.webapp.lora.entity.Device;
import com.webapp.lora.entity.User;

public class LoginWrapper {

    User user;
    Device device;

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Device getDevice() {
        return device;
    }

    public void setDevice(Device device) {
        this.device = device;
    }
}
