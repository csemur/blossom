package fr.mgargadennec.blossom.core.user.configuration.root.business;

import org.springframework.boot.orm.jpa.EntityScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@EntityScan(basePackages = "fr.mgargadennec.blossom.core.user.model")
public class BlossomUserEntityConfiguration {

}
