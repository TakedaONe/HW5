public class Main {
    public static void main(String[] args) {

        Boss boss = new Boss();

        boss.setDefence("magic");
        boss.setHealth(1000);
        boss.setDamage(50);

        System.out.println("BOSS STATS: " + "\n"+ boss.getDefence() +"\n" + boss.getDamage() +"\n" + boss.getHealth());

        Hero[] heroes = createHeroes();
        for (Hero hero : heroes) {
            System.out.println("Hero Stats: " +
                    "\nHealth: " + hero.getHealth() +
                    "\nDamage: " + hero.getDamage() +
                    "\nPower: " + (hero.getPower() != null ? hero.getPower() : "No power"));
        }
    }

    public static Hero[] createHeroes() {
        Hero hero1 = new Hero(100, 50, "Fire");
        Hero hero2 = new Hero(200, 75, "Ice");
        Hero hero3 = new Hero(150, 60);

        Hero[] heroes = {hero1, hero2, hero3};
        return heroes;
    }
}