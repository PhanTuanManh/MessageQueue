class SendMessageCommand extends Command {
    private MessageQueue queue;
    private String message;

    public SendMessageCommand(MessageQueue queue, String message) {
        this.queue = queue;
        this.message = message;
    }

    @Override
    public void execute() {
        queue.enqueue(message);
    }
}