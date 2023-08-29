package org.koreait.configs;

import org.koreait.models.member.MemberInfo;
import org.springframework.data.domain.AuditorAware;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.stereotype.Component;

import java.lang.reflect.Member;
import java.util.Optional;

@Component
public class AuditorAwareImpl implements AuditorAware<String> {
    @Override
    public Optional<String> getCurrentAuditor() {

        String userId = null;
        Authentication auth = SecurityContextHolder.getContext().getAuthentication();

        // 미로그인 상태 - anonymousUser, 로그인상태 - UserDetails 구현객체
        if(auth != null && auth.getPrincipal() instanceof UserDetails) {
            MemberInfo memberInfo = (MemberInfo)auth.getPrincipal();
            userId = memberInfo.getUserId();
        }

        return Optional.ofNullable(userId);
    }
}
