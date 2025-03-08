package com.crma.entities;
import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import lombok.Data;

import java.io.Serializable;

@Embeddable
@Data
public class RolePermissionId implements Serializable {

    @Column(name = "role_id")
    private Integer roleId;

    @Column(name = "permission_id")
    private Integer permissionId;

    // Default constructor and equals/hashCode (provided by Lombok)
}
