package daebaksong.org.firstProject;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/boards")
public class BoardAPIController {
    @GetMapping
    public String boards() {
        return "boards all";
    }

    @GetMapping("/{id}")
    public String boards(@PathVariable(name = "id", required = false) int id) {
        return "Rboard " + id;
    }

}
