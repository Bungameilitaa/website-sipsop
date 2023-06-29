package comp.finalproject.user.controller;

import comp.finalproject.user.entity.*;
import comp.finalproject.user.repository.*;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.security.Principal;
import java.util.List;

@Controller
public class RadioTransactionController {
    @Autowired
    private RadioTransactionRepository radioTransactionRepository;

    @Autowired
    private RadioRepository radioRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/radiopages")
    public  String radioimepage(Model model){
        List<Radio> listradio=radioRepository.findAll();
        model.addAttribute("listradio",listradio);
        return "radiopages";
    }

    /*@RequestMapping("/newsales/{idtv}")
    public String showNewForm2(@PathVariable(name = "idtv") long idtv) {
       Tv tv = tvRepository.findById(idtv);
       TvTransaction tvTrans = new TvTransaction();
       tvTrans.setTv(tv);

        tvTransactionRepository.save(tvTrans);

        return "tvpages";
    }*/

    @RequestMapping("/radiosales/{id}")
    public String showEditForm(@PathVariable(name = "id") long id, Principal principal) {
        //ModelAndView mav = new ModelAndView("form_edit_tv");
        Radio radio=radioRepository.findById(id);
        String email=principal.getName();
        User user=userRepository.findByEmail(email);
        //mav.addObject("tv", tv);
        RadioTransaction radioTransaction=new RadioTransaction();
        radioTransaction.setHarga(radio.getBudget_radio());
        radioTransaction.setRadio(radio);
        //tvTrans.setUser(user.getId());

        radioTransactionRepository.save(radioTransaction);

        return "transaksinew";
    }

}
