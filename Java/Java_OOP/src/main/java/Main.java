public class Main {
    //у каждого персонажа уникальное свойство (доступно 2 конструктора), одно действие, и 4 общих свойства
    public static void main(String[] args) {
        Character peasant = new Peasant(1,100,5,5,5 );
        Character bandit = new Bandit(2,80,20,10, 3);
        Character sniper = new Sniper(3,50,35, 5, 6);
        Character warlock = new Warlock(2,150,23,10);
        Character legionary = new Legionary(3,250,15,25);
        Character crossbowman = new Crossbowman(3, 65, 37,7);
        Character monk = new Monk(4,120,30,18);
    }
}