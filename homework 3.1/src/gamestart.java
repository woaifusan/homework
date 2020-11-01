import java.util.Scanner;

class lead extends monster {

    private int defence;

    public int getDefence() {
        return defence;
    }

    public void setDefence(int defence) {
        this.defence = defence;
    }


}

class monster {
    private String name ;
    private int hp;
    private int attack;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getAttack() {
        return attack;
    }

    public void setAttack(int attack) {
        this.attack = attack;
    }
}

public class gamestart {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        monster monster1 = new monster();
        lead lead1 = new lead();
        System.out.println("输入怪物的名字");
        String name1 = in.nextLine();
        monster1.setName(name1);
        System.out.println("输入主角的名字");
        String name2 = in.nextLine();
        lead1.setName(name2);
        System.out.println("输入主角的生命值");
        int hp2 = in.nextInt();
        lead1.setHp(hp2);
        System.out.println("输入主角的攻击力");
        int attack2 = in.nextInt();
        lead1.setAttack(attack2);
        System.out.println("输入主角的防御力");
        int defence2 = in.nextInt();
        lead1.setDefence(defence2);
       
        System.out.println("输入怪物的生命值");
        int hp1 = in.nextInt();
        monster1.setHp(hp1);
        System.out.println("输入怪物的攻击力");
        int attack1 = in.nextInt();
        monster1.setAttack(attack1);
        while (true) {
            if (lead1.getHp() > 0) {
                System.out.println(lead1.getName() + "对" + monster1.getName() + "造成了" + lead1.getAttack() + "点伤害");
                monster1.setHp(monster1.getHp() - lead1.getAttack());
                System.out.println(monster1.getName() + "还剩" + monster1.getHp() + "点生命值");
            }
            if (monster1.getHp() > 0) {

                System.out.println(monster1.getName() + "对" + lead1.getName() + "造成了" + (monster1.getAttack() - lead1.getDefence()) + "点伤害");
                lead1.setHp(lead1.getHp() - (monster1.getAttack() - lead1.getDefence()));
                System.out.println(lead1.getName() + "还剩" + lead1.getHp() + "点生命值");
            }
            if (monster1.getHp() <= 0) {
                System.out.println(monster1.getName() + "死亡");
                break;
            }
            if (lead1.getHp() <= 0) {
                System.out.println(lead1.getName() + "死亡");
                break;
            }
        }
    }
}


