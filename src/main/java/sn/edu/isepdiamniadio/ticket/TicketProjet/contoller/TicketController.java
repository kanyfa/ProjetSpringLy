package sn.edu.isepdiamniadio.ticket.TicketProjet.contoller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.GetMapping;
import sn.edu.isepdiamniadio.ticket.TicketProjet.service.TicketService;

@Controller
public class TicketController {

    @Autowired
    private TicketService ticketService;

    @GetMapping("/tickets")
    public String afficherTickets(Model model) {
        model.addAttribute("tickets", ticketService.listerTickets());
        return "tickets";
    }

    @PostMapping("/ajouter")
    public String ajouterTicket() {
        ticketService.genererTicket();
        return "redirect:/tickets";
    }

    @PostMapping("/avancer")
    public String avancerFile() {
        ticketService.avancerFile();
        return "redirect:/tickets";
    }

    @PostMapping("/reculer")
    public String reculerFile() {
        ticketService.reculerFile();
        return "redirect:/tickets";
    }
}
