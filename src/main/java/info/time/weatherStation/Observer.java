package info.time.weatherStation;

public interface Observer {

    /**
     * Atualiza os observadores com os parâmetros, temperatura, humidade e pressão
     * @param temp temperatura
     * @param humidity Humidade
     * @param pressure Pressão
     */
    void update(float temp, float humidity, float pressure);
}
