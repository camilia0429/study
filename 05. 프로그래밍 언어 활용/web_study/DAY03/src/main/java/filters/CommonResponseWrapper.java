package filters;

import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpServletResponseWrapper;

public class CommonResponseWrapper extends HttpServletResponseWrapper {
    public CommonResponseWrapper(HttpServletResponse response) { // 응답 후 공통 기능
        super(response);
        System.out.println("공통기능 정의");
    }
}
