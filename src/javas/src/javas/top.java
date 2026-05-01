package javas.src.javas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import javax.swing.Box;
import javax.swing.border.Border;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class top {
    public static void main(String[] args) {
        JFrame jFrame=new JFrame();//窗体
        JPanel p=new JPanel();
        p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));

        JPanel texts=new JPanel();
        texts.setLayout(new BoxLayout(texts,BoxLayout.Y_AXIS));

        JPanel p1=new JPanel();
        JPanel p3=new JPanel();
        p1.setLayout(new FlowLayout(FlowLayout.CENTER));
        p3.setLayout(new FlowLayout(FlowLayout.CENTER));
        JLabel tex= new JLabel("欢迎光临");
        JLabel text= new JLabel("软件2201");

        p1.setBackground(Color.LIGHT_GRAY);
        p3.setBackground(Color.LIGHT_GRAY);
        p1.add(tex);
        p1.add(text);
        texts.add(p1);
        texts.add(p3);
        texts.setForeground(Color.LIGHT_GRAY);

        JPanel p2=new JPanel();//设置窗体的子容器
        p2.setLayout(new GridLayout(5,2));//设置子容器p2的网格布局

        String[] imgArray={"src/javas/src/javas/pn/新建文件夹/(1).jpg",
        "src/javas/src/javas/pn/新建文件夹 - 副本/(4).jpg",
        "src/javas/src/javas/pn/新建文件夹 - 副本 (2)/(5).jpg",
        "src/javas/src/javas/pn/新建文件夹 - 副本 (3)/(5).jpg",
        "src/javas/src/javas/pn/新建文件夹 - 副本 (4)/(2).jpg",
        "src/javas/src/javas/pn/新建文件夹 - 副本 (5)/(6).jpg",
        "src/javas/src/javas/pn/新建文件夹 - 副本 (6)/(6).jpg",
        "src/javas/src/javas/pn/新建文件夹 - 副本 (7)/(2).jpg",
        "src/javas/src/javas/pn/新建文件夹 - 副本 (8)/(1).jpg",
        "src/javas/src/javas/pn/新建文件夹 - 副本 (9)/(6).jpg",};

        String[] tex1={"<html><p><span style=\"background-color: red; color: white;font-size: 8px;float: left;\">热卖</span ><span style=\"color: black;font-size: 10px;\">" +
                "农夫山泉 饮用水 饮用天然水5L*4桶 整箱装<br> 桶装水<br>" +
                "<span style=\"color: red;font-size: 8px;\">一年最低价</span><span style=\"color: red;font-size: 12px;\">￥39.9</span>" +
                "</span><span style=\"color: gray;font-size: 9px;\">月销6000+</span></p></html>",

                "<html><p><span style=\"background-color: red; color: white;font-size: 8px;float: left;\">秒杀</span ><span style=\"color: black;font-size: 10px;\">" +
                        "【农夫山泉官方旗舰店】农夫山泉长白雪天<br>然雪山矿泉水535ml*24瓶<br>" +
                        "<span style=\"color: red;font-size: 8px;\">30天最低价</span><span style=\"color: red;font-size: 12px;\">￥49.9</span>" +
                        "</span><span style=\"color: gray;font-size: 9px;\">月销5000+</span></p></html>",

                "<html><p><span style=\"background-color: red; color: white;font-size: 8px;float: left;\">新品</span ><span style=\"color: black;font-size: 10px;\">" +
                        "【农夫山泉官方旗舰店】农夫山泉饮用天然<br>水（适合婴幼儿）1L*12<br>" +
                        "<span style=\"color: red;font-size: 8px;\">30天最低价</span><span style=\"color: red;font-size: 12px;\">￥111</span>" +
                        "</span><span style=\"color: gray;font-size: 9px;\">月销1000+</span></p></html>",

                "<html><p><span style=\"background-color: red; color: white;font-size: 8px;float: left;\">热卖</span ><span style=\"color: black;font-size: 10px;\">" +
                        "【农夫山泉官方旗舰店】农夫山泉泡茶水山泉<br>水饮用水桶装水4L*4<br>" +
                        "<span style=\"color: red;font-size: 8px;\">7天最低价</span><span style=\"color: red;font-size: 12px;\">￥299.9</span>" +
                        "</span><span style=\"color: gray;font-size: 9px;\">月销2000+</span></p></html>",

                "<html><p><span style=\"background-color: red; color: white;font-size: 8px;float: left;\">秒杀</span ><span style=\"color: black;font-size: 10px;\">" +
                        "【农夫山泉官方旗舰店】农夫山泉苏打天然水<br>饮品苏打水410ml*15<br>" +
                        "<span style=\"color: red;font-size: 8px;\">60天最低价</span><span style=\"color: red;font-size: 12px;\">￥62</span>" +
                        "</span><span style=\"color: gray;font-size: 9px;\">月销6000+</span></p></html>",

                "<html><p><span style=\"background-color: red; color: white;font-size: 8px;float: left;\">秒杀</span ><span style=\"color: black;font-size: 10px;\">" +
                        "【农夫山泉官方旗舰店】农夫山泉100%NFC橙<br>汁300mlx10瓶<br>" +
                        "<span style=\"color: red;font-size: 8px;\">60天最低价</span><span style=\"color: red;font-size: 12px;\">￥69.9</span>" +
                        "</span><span style=\"color: gray;font-size: 9px;\">月销6000+</span></p></html>",

                "<html><p><span style=\"background-color: red; color: white;font-size: 8px;float: left;\">热卖</span ><span style=\"color: black;font-size: 10px;\">" +
                        "农夫山泉水溶C100饮料445ml*15瓶满足每日<br>维生素C 多种口味可选<br>" +
                        "<span style=\"color: red;font-size: 8px;\">60天最低价</span><span style=\"color: red;font-size: 12px;\">￥72.5</span>" +
                        "</span><span style=\"color: gray;font-size: 9px;\">月销5000+</span></p></html>",

                "<html><p><span style=\"background-color: red; color: white;font-size: 8px;float: left;\">秒杀</span ><span style=\"color: black;font-size: 10px;\">" +
                        "农夫山泉官方旗舰店】农夫果园30%混合口味<br>450ml*15（新口味）<br>" +
                        "<span style=\"color: red;font-size: 8px;\">50天最低价</span><span style=\"color: red;font-size: 12px;\">￥69.9</span>" +
                        "</span><span style=\"color: gray;font-size: 9px;\">月销8000+</span></p></html>",

                "<html><p><span style=\"background-color: red; color: white;font-size: 8px;float: left;\">秒杀</span ><span style=\"color: black;font-size: 10px;\">" +
                        "农夫山泉官方旗舰店大柠檬鲜榨柠檬汁汽水38<br>0ml<br>" +
                        "<span style=\"color: red;font-size: 8px;\">60天最低价</span><span style=\"color: red;font-size: 12px;\">￥29.9</span>" +
                        "</span><span style=\"color: gray;font-size: 9px;\">月销6000+</span></p></html>",

                "<html><p><span style=\"background-color: red; color: white;font-size: 8px;float: left;\">秒杀</span ><span style=\"color: black;font-size: 10px;\">" +
                        "农夫山泉官方旗舰店维他命水功能饮料500ml<br>*15柑橘西梅味等<br>" +
                        "<span style=\"color: red;font-size: 8px;\">60天最低价</span><span style=\"color: red;font-size: 12px;\">￥72.5</span>" +
                        "</span><span style=\"color: gray;font-size: 9px;\">月销6000+</span></p></html>",
        };



        JScrollPane js=new JScrollPane();
        js.setLayout(new ScrollPaneLayout());


        JButton[] btn=new JButton[10];
        sp2[] s = new sp2[10];
        String[] arr1={"sp1 s=new sp1()","sp2 s=new sp2()","sp3 s=new sp3()"};
        String[] arr = {"sp1", "sp2", "sp3"};
        for (int i=0;i<=9;i++) {

            JPanel s1 =new JPanel();//给网格布局里面的第一个
            s1.setLayout(new BoxLayout(s1,BoxLayout.Y_AXIS));//盒子布局
            JPanel s2=new JPanel();
            //****************流式布局以便居中美观*******************
            s2.setLayout(new FlowLayout(FlowLayout.CENTER));
            JPanel s3=new JPanel();
            s3.setLayout(new FlowLayout(FlowLayout.CENTER));
            JPanel s4=new JPanel();
            s4.setLayout(new FlowLayout(FlowLayout.CENTER));
            JPanel s5=new JPanel();
            s5.setLayout(new FlowLayout(FlowLayout.CENTER));
            //****************流式布局以便居中美观*******************


            ImageIcon img1= new ImageIcon(imgArray[i]);
            img1.setImage(img1.getImage().getScaledInstance(300,300,Image.SCALE_DEFAULT));
            btn[i] = new JButton(String.valueOf(i));
            btn[i].setVerticalTextPosition(SwingConstants.BOTTOM);
            btn[i].setHorizontalTextPosition(JButton.CENTER);
            btn[i].setIcon(img1);

            btn[i].setText(tex1[i]);
            btn[i].setFont(new Font(Font.DIALOG,Font.PLAIN,16));
            btn[i].setForeground(Color.RED);
            btn[i].setBackground(Color.white);
            //btn.setBorder(null);
            btn[i].setContentAreaFilled(true);
            btn[i].setBorder(null);
           // Border border=BorderFactory.createLineBorder(Color.red);
            //btn.setBorder(border);



            int finalI1 = i;
            btn[i].addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    if (finalI1 == 0){
                        sp1 s=new sp1(finalI1);

                    }
                    if (finalI1 == 1){
                        sp2 s=new sp2(finalI1);
                    }
                    if (finalI1 == 2){
                        sp3 s=new sp3(finalI1);
                    }
                    if (finalI1 == 3){
                        sp4 s=new sp4(finalI1);
                    }
                    if (finalI1 == 4){
                        sp5 s=new sp5(finalI1);
                    }
                    if (finalI1 == 5){
                        sp6 s=new sp6(finalI1);
                    }
                    if (finalI1 == 6){
                        sp7 s=new sp7(finalI1);
                    }
                    if (finalI1 == 7){
                        sp8 s=new sp8(finalI1);
                    }
                    if (finalI1 == 8){
                        sp9 s=new sp9(finalI1);
                    }
                    if (finalI1 == 9){
                        sp10 s=new sp10(finalI1);
                    }

                }
            });

            JButton btn1=new JButton();
            ImageIcon img2= new ImageIcon("src/javas/src/png/1.png");
            img2.setImage(img2.getImage().getScaledInstance(300,50,Image.SCALE_DEFAULT));
            btn1.setIcon(img2);
            btn1.setPreferredSize(new Dimension(300,50));
            //btn1.setBorder(null);
            btn1.setContentAreaFilled(false);
            btn1.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ImageIcon icon = new ImageIcon("src/javas/src/png/成功1.png");
                    icon.setImage(icon.getImage().getScaledInstance(400,200,Image.SCALE_DEFAULT));//图片的大小需要调整到合适程度
                    JOptionPane.showMessageDialog(null, "","其实根本没有购物车",JOptionPane.ERROR_MESSAGE,icon);

                }
            });

            s3.add(btn1);
            s5.add(btn[i]);

//            s3.add(new JLabel(tex1[i]));
//            s4.add(new JLabel("价格"));
            s1.add(s2);

            s1.add(s4);
            s1.add(s5);
            s1.add(s3);

            p2.add(s1);
        }

        js.setViewportView(p2);
        jFrame.add(p);
        p.add(texts);
        p.add(js);


        jFrame.setVisible(true);//设置窗体可见
        jFrame.setBounds(new Rectangle(700,1000));//窗体大小；


    }
}
//            JPanel x1=new JPanel();
//            x1.setLayout(new FlowLayout(FlowLayout.CENTER));
//
//        JPanel x2=new JPanel();
//        x2.setLayout(new FlowLayout(FlowLayout.CENTER));
//        JPanel x3=new JPanel();
//        x3.setLayout(new FlowLayout(FlowLayout.CENTER));
