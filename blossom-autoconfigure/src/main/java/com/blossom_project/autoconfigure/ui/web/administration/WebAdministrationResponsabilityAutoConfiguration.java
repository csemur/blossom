package com.blossom_project.autoconfigure.ui.web.administration;

import com.blossom_project.autoconfigure.ui.common.privileges.ResponsabilityPrivilegesConfiguration;
import com.blossom_project.autoconfigure.ui.web.WebInterfaceAutoConfiguration;
import com.blossom_project.core.association_user_role.AssociationUserRoleService;
import com.blossom_project.core.role.RoleService;
import com.blossom_project.core.user.UserService;
import com.blossom_project.ui.web.administration.responsability.ResponsabilitiesController;
import org.springframework.boot.autoconfigure.AutoConfigureAfter;
import org.springframework.boot.autoconfigure.condition.ConditionalOnBean;
import org.springframework.boot.autoconfigure.condition.ConditionalOnClass;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

@Configuration
@ConditionalOnClass({ResponsabilitiesController.class})
@ConditionalOnBean({AssociationUserRoleService.class, UserService.class, RoleService.class})
@AutoConfigureAfter(WebInterfaceAutoConfiguration.class)
@Import(ResponsabilityPrivilegesConfiguration.class)
public class WebAdministrationResponsabilityAutoConfiguration {

    @Bean
    public ResponsabilitiesController responsabilityController(UserService userService, AssociationUserRoleService associationUserRoleService, RoleService roleService) {
        return new ResponsabilitiesController(userService, associationUserRoleService, roleService);
    }

}