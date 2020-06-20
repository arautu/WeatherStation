package info.time.weatherStation;

public interface Observer {

    /**
     * Atualiza os observadores com os parâmetros, temperatura, humidade e pressão
     * @param temp
     * @param humidity
     * @param pressure
     */
    public void update(float temp, float humidity, float pressure);
}
