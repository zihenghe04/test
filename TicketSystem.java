
public class TicketSystem {
    private int ticketId = 0; // 票的初始ID
    private final int MAX_TICKET_NUM = 200; // 最大票数

    // 同步方法，用于售票
    public synchronized Integer sellTicket() {
        if (ticketId < MAX_TICKET_NUM) {
            // 打印当前售票信息，并增加票的ID
            System.out.println("售票点 " + Thread.currentThread().getName() + " 正在售出火车票 No." + (++ticketId));
            return ticketId;
        } else {
            // 如果票已售完，返回null
            return null;
        }
    }
}