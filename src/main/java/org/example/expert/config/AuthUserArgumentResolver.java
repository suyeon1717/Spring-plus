package org.example.expert.config;

//public class AuthUserArgumentResolver implements HandlerMethodArgumentResolver {
public class AuthUserArgumentResolver {

//    @Override
//    public boolean supportsParameter(MethodParameter parameter) {
//        boolean hasAuthAnnotation = parameter.getParameterAnnotation(Auth.class) != null;
//        boolean isAuthUserType = parameter.getParameterType().equals(AuthUser.class);
//
//        // @Auth 어노테이션과 AuthUser 타입이 함께 사용되지 않은 경우 예외 발생
//        if (hasAuthAnnotation != isAuthUserType) {
//            throw new AuthException("@Auth와 AuthUser 타입은 함께 사용되어야 합니다.");
//        }
//
//        return hasAuthAnnotation;
//    }
//
//    @Override
//    public Object resolveArgument(
//            @Nullable MethodParameter parameter,
//            @Nullable ModelAndViewContainer mavContainer,
//            NativeWebRequest webRequest,
//            @Nullable WebDataBinderFactory binderFactory
//    ) {
//        HttpServletRequest request = (HttpServletRequest) webRequest.getNativeRequest();
//
//        // JwtFilter 에서 set 한 userId, email, userRole 값을 가져옴 + nickname
//        Long userId = (Long) request.getAttribute("userId");
//        String email = (String) request.getAttribute("email");
//        UserRole userRole = UserRole.of((String) request.getAttribute("userRole"));
//        String nickname = (String) request.getAttribute("nickname");
//
//        return new AuthUser(userId, email, userRole, nickname);
//    }
}
