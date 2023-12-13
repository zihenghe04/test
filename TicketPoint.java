public class TicketPoint extends Thread {
    private TicketSystem ticketSystem;

    public TicketPoint(TicketSystem ticketSystem, String name) {
        super(name); // 设置线程名称，即售票点编号
        this.ticketSystem = ticketSystem;
    }

    @Override
    public void run() {
        while (true) {
            Integer ticketId = ticketSystem.sellTicket();
            if (ticketId == null) {
                System.out.println("售票点 " + getName() + " 售罄");
                break;
            }
            // 模拟售票时间间隔
            try {
                Thread.sleep((long) (Math.random() * 100));
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}