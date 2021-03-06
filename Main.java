import java.util.Scanner;

public class Main {

  private Scanner in = new Scanner(System.in);
  private HashMap<String,Double> cat = new HashMap<String,Double>;
  private HashMap<String,Double> shop = new HashMap<String,Double>;

  private void details(String[] parts) {
    if(parts.length < 2){
      invalid();
      return null;
    }
  }


  private void report(String[] parts) {
    if(parts.length < 2){
      invalid();
      return null;
    }
  }

  // FIXME: Diese Methode implementieren
  private void add(String[] parts) {
    // Prüfen: parts hat 4 Elemente
    // 0 ist "add", 1 und 2 sind String, 3 ist ein String, in dem ein Double Wert steht
    // Bei Fehlern invalid() aufrufen und die Methode mit return beenden
  }

  // FIXME: Diese Methode implementieren
  private void exit() {

  }

  // FIXME: Diese Methode implementieren
  public void run() {
    // Hier muss in geeigneter Weise readAndProcess aufgerufen werden
  }


  /**
   * Diese Methode soll aufgerufen werden, wenn es einen Fehler bei den Parametern gibt
   */
  private void invalid() {
    System.out.println("Ungültige Eingabe.");
  }


  /**
   * Liest eine Zeile von der Eingabeaufforderung
   * Ruft je nach erstem Wort die passende Methode auf
   * @return Die Methode gibt true zurück, wenn das Programm
   * nach der Verarbeitung des Kommandos weiterlaufen soll
   */
  private boolean readAndProcess() {
    String line;
    line = in.nextLine();
    String[] parts = line.split(" ");
    switch (parts[0]) {
      case "add": {
        add(parts);
        return true;
      }
      case "report": {
        report(parts);
        return true;
      }
      case "details": {
        details(parts);
        return true;
      }
      case "exit": {
        exit();
        return false;
      }
      default: {
        invalid();
        return true;
      }
    }
  }

  public static void main(String[] args) {
    Main main = new Main();
    main.run();
  }

}
