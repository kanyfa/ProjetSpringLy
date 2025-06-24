package sn.edu.isepdiamniadio.ticket.TicketProjet.service;

import org.springframework.stereotype.Service;
import sn.edu.isepdiamniadio.ticket.TicketProjet.domain.Ticket;

import java.util.ArrayList;
import java.util.List;

@Service
public class TicketService {

    private final List<Ticket> fileAttente = new ArrayList<>();
    private long compteur = 0;

    public void genererTicket() {
        fileAttente.add(new Ticket(++compteur, fileAttente.size() + 1));
    }

    public List<Ticket> listerTickets() {
        return fileAttente;
    }

    public void avancerFile() {
        if (fileAttente.size() > 1) {
            fileAttente.add(fileAttente.remove(0));
            reordonner();
        }
    }

    public void reculerFile() {
        if (fileAttente.size() > 1) {
            fileAttente.add(0, fileAttente.remove(fileAttente.size() - 1));
            reordonner();
        }
    }

    private void reordonner() {
        for (int i = 0; i < fileAttente.size(); i++) {
            fileAttente.get(i).setPosition(i + 1);
        }
    }
}
