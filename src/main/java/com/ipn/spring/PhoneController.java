package com.ipn.spring;

import com.ipn.spring.model.Phone;
import com.ipn.spring.service.IPhoneService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;

@Controller
public class PhoneController {

    private IPhoneService phoneService;

    @Autowired(required = true)
    @Qualifier(value = "phoneService")
    public void setPhoneService(IPhoneService ps) {
        this.phoneService = ps;
    }

    @RequestMapping(value = "/phones", method = RequestMethod.GET)
    public ResponseEntity<List<Phone>> listPhones(Model model) {
        List<Phone> phoneList = null;
        phoneList = this.phoneService.listPhones();

        for (Phone phone : phoneList) {
            System.out.println(phoneList);
        }

        return new ResponseEntity<>(phoneList, HttpStatus.ACCEPTED);
    }

    @RequestMapping(value = "/phone/add", method = RequestMethod.POST)
    public ResponseEntity addPhone(@ModelAttribute("phone") Phone p) {
        this.phoneService.addPhone(p);

        return new ResponseEntity(HttpStatus.ACCEPTED);
    }

}
