public class Main {
    public static void main(String[] args) {
        TicketSystem ticketSystem = new TicketSystem();

        // 创建并启动10个售票点线程
        for (int i = 1; i <= 10; i++) {
            new TicketPoint(ticketSystem, String.valueOf(i)).start();
        }
    }
}