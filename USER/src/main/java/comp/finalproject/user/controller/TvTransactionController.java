package comp.finalproject.user.controller;

import comp.finalproject.user.entity.Tv;
import comp.finalproject.user.entity.TvTransaction;
import comp.finalproject.user.entity.User;
import comp.finalproject.user.repository.TvRepository;
import comp.finalproject.user.repository.TvTransactionRepository;
import comp.finalproject.user.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import java.security.Principal;
import java.util.List;

@Controller
public class TvTransactionController {

    @Autowired
    private TvTransactionRepository tvTransactionRepository;

    @Autowired
    private TvRepository tvRepository;

    @Autowired
    private UserRepository userRepository;

    @RequestMapping("/tvpages")
    public  String tvhimepage(Model model){
        List<Tv> listTv=tvRepository.findAll();
        model.addAttribute("listTv",listTv);
        return "tvpages";
    }

    /*@RequestMapping("/newsales/{idtv}")
    public String showNewForm2(@PathVariable(name = "idtv") long idtv) {
       Tv tv = tvRepository.findById(idtv);
       TvTransaction tvTrans = new TvTransaction();
       tvTrans.setTv(tv);

        tvTransactionRepository.save(tvTrans);

        return "tvpages";
    }*/

    /*@RequestMapping("/tvsales/{id}")
    public String showEditForm(@PathVariable(name = "id") int id) {
        //ModelAndView mav = new ModelAndView("form_edit_tv");
        Tv tv=tvRepository.findById(id);
        //User user ;
        //mav.addObject("tv", tv);
        TvTransaction tvTrans = new TvTransaction();
        tvTrans.setHarga(tv.getBudget_tv());
        tvTrans.setTv(tv);
        //tvTrans.setUser(user);
        //tvTrans.setUser(user.getId());

        tvTransactionRepository.save(tvTrans);
        return "transaksinew";
    }*/

    @RequestMapping("/tvsales/{id}")
    public String showEditForm(@PathVariable(name = "id") int id,Principal principal) {
        //ModelAndView mav = new ModelAndView("form_edit_tv");
        Tv tv=tvRepository.findById(id);
        String email=principal.getName();
        User user=userRepository.findByEmail(email);
        //mav.addObject("tv", tv);
        TvTransaction tvTrans = new TvTransaction();
        tvTrans.setHarga(tv.getBudget_tv());
        tvTrans.setTv(tv);
        tvTrans.setUser(user);
        //tvTrans.setUser(user.getId());

        tvTransactionRepository.save(tvTrans);
        return "transaksinew";
    }

}
