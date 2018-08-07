package examples.boot.myshop.controller.api;

import examples.boot.myshop.security.MemberInfo;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/members")
public class MemberApiController {
    @GetMapping
    public String members(MemberInfo memberInfo) {
        // dispatcher servlet이 이 메소드를 호출하기 때문에 이 파라미터를 채어넣어줘서 호출을 해주도록 한다.
        // memberInfo에 id = 1, email = 이메일주소를 셋팅해서 넣어주도록 하고 싶다.
        System.out.println("member : " + memberInfo);
        return "members";
    }
}
