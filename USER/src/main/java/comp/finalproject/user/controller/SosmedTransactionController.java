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
public class SosmedTransactionController {

    @Autowired
    private SosmedTransactionRepository sosmedTransactionRepository;

    @Autowired
    private SosmedRepository sosmedRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/sosmedpages")
    public  String sosmedpage(Model model){
        List<Sosmed> listsosmed=sosmedRepository.findAll();
        model.addAttribute("listsosmed",listsosmed);
        return "sosmedpages";
    }

    /*@RequestMapping("/newsales/{idtv}")
    public String showNewForm2(@PathVariable(name = "idtv") long idtv) {
       Tv tv = tvRepository.findById(idtv);
       TvTransaction tvTrans = new TvTransaction();
       tvTrans.setTv(tv);

        tvTransactionRepository.save(tvTrans);

        return "tvpages";
    }*/

    @RequestMapping("/sosmedsales/{id}")
    public String showEditForm(@PathVariable(name = "id") int id,Principal principal) {
        //ModelAndView mav = new ModelAndView("form_edit_tv");
        Sosmed sosmed=sosmedRepository.findById(id);
        String email=principal.getName();
        User user=userRepository.findByEmail(email);
        SosmedTransaction sosmedTransaction=new SosmedTransaction();
        sosmedTransaction.setHarga(sosmed.getBudget_sosmed());
        sosmedTransaction.setSosmed(sosmed);
        sosmedTransaction.setUser(user);
        //tvTrans.setUser(user.getId());

        sosmedTransactionRepository.save(sosmedTransaction);
        return "transaksinew";
    }

}
