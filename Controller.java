import java.util.Scanner;
abstract class Controller extends Armazem {
    public void carregarEstoque() {
        try (Scanner sc = new Scanner(arquivo))
        { while (sc.hasNextLine()) { data.add(sc.nextLine());} 
        } 
        catch (Exception e) { System.out.println(e + " On thePovoador class class!"); }
        
    }
    public void start() 
    {
        Scanner sc = new Scanner(System.in);
        boolean foo = true;
        System.out.println("Digite 1 para criar a comp ou 0 para sair.");
        while (foo) {
            int choice = sc.nextInt();
            switch (choice) {
                case 1:
                    System.out.printf("Play TOP with: %s\n", data.get((int)(Math.random() * 165)));
                    System.out.printf("Play MID with: %s\n", data.get((int)(Math.random() * 165)));
                    System.out.printf("Play JUNGLE with: %s\n", data.get((int)(Math.random() * 165)));
                    System.out.printf("Play SUP with: %s\n", data.get((int)(Math.random() * 165)));
                    System.out.printf("Play ADC with: %s\n", data.get((int)(Math.random() * 165)));
                    System.out.println("Para gerar novamente pressione 1.");
                    break;
            
                case 0:
                    sc.close();
                    foo = false;
                    break;
        }
            
        }  
    }
}
