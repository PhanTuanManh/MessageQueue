class ReceiveMessageCommand extends Command {
    private MessageQueue queue;

    public ReceiveMessageCommand(MessageQueue queue) {
        this.queue = queue;
    }

    @Override
    public void execute() {
        queue.dequeue();
    }
}
