package com.example.springcollege.CollegeAppSpring.audit;

import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component("AuditAwareBean")
public class AuditAwareBean implements AuditorAware<String> {

    @Override
    public Optional<String> getCurrentAuditor() {

        return Optional.ofNullable(
                SecurityContextHolder.getContext()
                        .getAuthentication()
                        .getName()
        );

    }
}
