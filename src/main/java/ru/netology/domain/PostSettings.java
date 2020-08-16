package ru.netology.domain;

public class PostSettings {

    private boolean disableComments;
    private boolean disableNotifications;
    private boolean addSignature;
    private boolean advertisement;

    public boolean isDisableComments() {
        return disableComments;
    }

    public void setDisableComments(boolean disableComments) {
        this.disableComments = disableComments;
    }

    public boolean isDisableNotifications() {
        return disableNotifications;
    }

    public void setDisableNotifications(boolean disableNotifications) {
        this.disableNotifications = disableNotifications;
    }

    public boolean isAddSignature() {
        return addSignature;
    }

    public void setAddSignature(boolean addSignature) {
        this.addSignature = addSignature;
    }

    public boolean isAdvertisement() {
        return advertisement;
    }

    public void setAdvertisement(boolean advertisement) {
        this.advertisement = advertisement;
    }
}
