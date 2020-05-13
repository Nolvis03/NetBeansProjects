
public class CiclosEstructuras {

    int cicloFor1;
    int cicloWhile1;
    int cicloDoWhile1;
    int cicloSwitch1;

    CiclosEstructuras() {
        this.cicloFor1 = cicloFor1;
        this.cicloWhile1 = cicloWhile1;
        this.cicloDoWhile1 = cicloDoWhile1;
    }
// Ciclo For

    public void setFor(int cicloFor1) {
        for (cicloFor1 = 0; cicloFor1 < 10; cicloFor1 = cicloFor1 + 2) {
            System.out.println(cicloFor1);
        }
        this.cicloFor1 = cicloFor1;
    }

    public int getFor() {
        return this.cicloFor1;
    }
// Ciclo While

    public void setWhile(int cicloWhile1) {
        while (cicloWhile1 > 10) {
            System.out.println(cicloWhile1);
            cicloWhile1++;
        }
    }

    public int getWhile() {
        return this.cicloWhile1;
    }

//Switch
    public void setCicloSwitch(int cicloSwitch1) {
        switch (cicloSwitch1) {
            case 2:
                System.out.println(" es par");
                break;
            case 3:
                System.out.println(" es impar");
                break;

            default:
                System.out.println("Ni existe eso");
        }
    }

    public int getSwitch() {
        return this.cicloSwitch1;
    }

    public void setDoWhile(int cicloDoWhile1) {
        do {
            System.out.println(cicloDoWhile1);
            cicloDoWhile1++;
        } while (cicloDoWhile1 > 10);
    }

    public int getDoWhile() {
        return this.cicloDoWhile1;
    }

    public static void main(String[] args) {
        CiclosEstructuras ob = new CiclosEstructuras();
        ob.setFor(0);
        /* ob.setCicloSwitch(2);
    ob.setDoWhile(10);*/
    ob.setWhile(10);

        System.out.println("Ciclo For");
        System.out.println(ob.getFor());
        System.out.println("Ciclo While");
        System.out.println(ob.getWhile());
        /* System.out.println("Ciclo Do While");
    System.out.println(ob.getDoWhile());
    System.out.println("Condicional Switch");
    System.out.println(ob.getSwitch());*/

    }

}
