package com.neobis.hub.models;

import org.springframework.security.core.GrantedAuthority;

public enum Role implements GrantedAuthority {
    NEWBIE,
    MENTOR,
    TEAM_LEADER,
    PROJECT_MANAGER,
    HQ;

    @Override
    public String getAuthority() {
        return name();
    }
}
