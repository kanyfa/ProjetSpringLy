package sn.edu.isepdiamniadio.ticket.TicketProjet.domain;

public class Ticket {
    private Long id;
    private int position;

    public Ticket(Long id, int position) {
        this.id = id;
        this.position = position;
    }

    public Long getId() {
        return id;
    }

    public int getPosition() {
        return position;
    }

    public int getPersonnesDevant() {
        return position - 1;
    }

    public int setPosition(int i) {
        return position;
    }
}
