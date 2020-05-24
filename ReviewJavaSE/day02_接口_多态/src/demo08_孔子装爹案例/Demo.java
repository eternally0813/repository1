package demo08_孔子装爹案例;

public class Demo {
    public static void main(String[] args) {
        //有一天，有人请孔爹去讲语文，但是孔爹没在家，于是孔子决定打扮成孔爹的样子去讲课
        KongDie kd=new KongZi();
        //孔子给大家介绍自己的年龄
        System.out.println("大家好，我叫孔子，我今年"+kd.age);  //70
        //开始讲课
        kd.teach();  // 讲数学

        //课间休息，孔子想玩游戏
       // kd.play(); 编译错误

        //讲完课，孔子回家脱去装束，变回孔子
        KongZi kz=(KongZi) kd;
        //玩游戏
        kz.play();

    }
}
