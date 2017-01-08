package task13;

/**
 * Created by Владимир on 08.01.2017.
 */
public class Car implements Auto {
    @Override
    public String unlockDoor() {
        return "Двери разблокированы";
    }

    @Override
    public String onOrOff() {
        boolean onOff = true;
        if (onOff) return "Машина заведена";
        else return "Машина выключена";
    }

    @Override
    public String plusSpeed() {
        return null;
    }

    @Override
    public String minusSpeed() {
        return null;
    }

    @Override
    public String changeGear() {
        return "Изменена передача";
    }

    @Override
    public String fillCar() {
        return "Машина заправлена";
    }
}
