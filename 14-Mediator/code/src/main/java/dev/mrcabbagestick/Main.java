package dev.mrcabbagestick;

public class Main {
    public static void main(String[] args) {
        String LOG_FILE_PATH = "/logs/logs.txt";
        String PRINTER_DEVICE_ID = "/dev/printer";

        var logger = new Logger(null, LOG_FILE_PATH);
        var resourceManager = new ResourceManager(null, PRINTER_DEVICE_ID);
        var deviceManager = new DeviceManager(null);

        deviceManager.addDevice(PRINTER_DEVICE_ID, "Printer in bathroom 2nd floor");
        deviceManager.addDevice("/dev/usb1", "USB 2TB for 2.99$");

        resourceManager.addResource(LOG_FILE_PATH, "Log File");

        var mediator = new SystemMediator(logger, resourceManager, deviceManager);

        logger.setMediator(mediator);
        resourceManager.setMediator(mediator);
        deviceManager.setMediator(mediator);

        deviceManager.doDeviceStuff("/dev/usb1", "Reading file: dancing_the_devil_away.mp4\n");

        resourceManager.useResource(LOG_FILE_PATH, true);
        resourceManager.printFileContents(LOG_FILE_PATH);

        logger.drainToFile();
    }
}