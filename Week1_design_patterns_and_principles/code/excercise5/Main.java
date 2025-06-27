public class Main {
    public static void main(String[] args) {
        Notifier baseNotifier = new EmailNotifier();

        // Add SMS and Slack functionality using decorators
        Notifier multiChannelNotifier = new SlackNotifierDecorator(
                                           new SMSNotifierDecorator(baseNotifier));

        multiChannelNotifier.send("System Alert: Server down!");
    }
}
