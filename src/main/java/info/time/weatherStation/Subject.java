package info.time.weatherStation;

public interface Subject {

    /**
     * Registra observadores para a lista do subject.
     * @param o observador que será registrado
     */
    void registerObserver(Observer o);

    /**
     * Remove observadores da lista do subject.
     * @param o observador que será removido
     */
    void removeObserver(Observer o);

    /**
     * Notifica todos os observadores sobre as mudanças no subject.
     */
    void notifyObservers();
}
