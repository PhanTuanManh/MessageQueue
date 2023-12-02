class DisplayQueueCommand extends Command {
    private MessageQueue queue;

    public DisplayQueueCommand(MessageQueue queue) {
        this.queue = queue;
    }

    @Override
    public void execute() {
        queue.display();
    }
}