package daebaksong.org.firstProject;

import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;

@RestController
public class HelloController {

    public HelloController() {
        System.out.println("Hello Controller!!");
    }

    @GetMapping("/hello")
    public String sayHello() {
        return "hello";
    }

    // 3보단 이게 낫다
    @GetMapping("/hello2")
    public String sayHello2(@RequestParam(name = "name", required = true)String name,
                            @RequestParam(name = "age", required = false, defaultValue = "0")int age) {
        return "hello " + name + " , " + age;
    }

    // 별로 안좋은 방법
    @GetMapping("/hello3")
    public String sayHello3(HttpServletRequest req) {
        String name = req.getParameter("name");
        String age = req.getParameter("age");
        return "hello " + name + " , " + age;
    }

    // 2를하긴 빡쌜때가 있으니 이걸 사용해도됨
    @GetMapping("/hello4")
    public String sayHello4(@ModelAttribute HelloDTO helloDTO) {
        return "hello " + helloDTO.getName() + " , " + helloDTO.getAge();
    }

    @PostMapping(path = "/hello5")
    public String sayHello5() {
        return "hello";
    }

    @PostMapping(path = "/hello6")
    public String sayHello6(@RequestParam(name = "name", required = true)String name,
                            @RequestParam(name = "age", required = false, defaultValue = "0")int age) {
        return "hello " + name + " , " + age;
    }

    @PostMapping(path = "/hello7")
    public String sayHello7(@RequestBody HelloDTO helloDTO) {
        return "hello " + helloDTO.getName() + " , " + helloDTO.getAge();
    }

    @GetMapping(path = "/hello8")
    public HelloDTO sayHello8() {
        HelloDTO helloDTO = new HelloDTO();
        helloDTO.setName("lee");
        helloDTO.setAge(40);
        return helloDTO;
    }
}
