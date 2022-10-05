
package demoapp.controller;

        import demoapp.service.NumeroParService;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Controller;
        import org.springframework.ui.Model;
        import org.springframework.validation.BindingResult;
        import org.springframework.web.bind.annotation.*;

        import javax.validation.Valid;

@Controller
public class NumeroParControllerForm {

    @Autowired
    private NumeroParService service;

    @GetMapping("/numeroparform")
    public String numeroParForm(NumData numData) {
        return "formRegistro";
    }

    @PostMapping("/numeroparform")
    public String checkPersonInfo(@ModelAttribute @Valid NumData numData, BindingResult bindingResult, Model model) {
        if (bindingResult.hasErrors()) {
            return "formRegistro";
        }
        model.addAttribute("mensaje", service.par(numData.getNum()));
        return "numeroPar";
    }
}
