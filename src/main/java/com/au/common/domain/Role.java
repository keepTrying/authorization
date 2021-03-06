package com.au.common.domain;

import java.util.LinkedList;
import java.util.List;

public class Role {
    private Long id;

    private String name;

    private String type;

    private List<Permission> permissions = new LinkedList<Permission>();
    
    public List<Permission> getPermissions() {
		return permissions;
	}

	public void setPermissions(List<Permission> permissions) {
		this.permissions = permissions;
	}

	public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name == null ? null : name.trim();
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type == null ? null : type.trim();
    }
}