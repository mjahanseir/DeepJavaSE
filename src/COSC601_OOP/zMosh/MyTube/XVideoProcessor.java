package zMosh.MyTube;

public class XVideoProcessor implements VideoProcessor {
    private VideoEncoder encoder;

    public XVideoProcessor(VideoEncoder encoder) {
        this.encoder = encoder;
    }

    @Override
    public void process(Video video) {
        encoder.encode(video);

        var database = new XVideoDatabase();
        database.store(video);

        var emailService = new EmailService();
        emailService.sendEmail(video.getUser());



    }
}

