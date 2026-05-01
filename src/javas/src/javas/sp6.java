package javas.src.javas;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.util.Arrays;

public class sp6 extends JFrame {
    public sp6(int finalI) throws HeadlessException {
        JScrollPane js=new JScrollPane();
        js.setLayout(new ScrollPaneLayout());
        JPanel p=new JPanel();
        p.setLayout(new BoxLayout(p,BoxLayout.Y_AXIS));
        JPanel t=new JPanel();
        t.setLayout(new BoxLayout(t,BoxLayout.Y_AXIS));

        JPanel t1=new JPanel();
        t1.setLayout(new GridLayout(1,1));
        JPanel left=new JPanel();
        left.setLayout(new BoxLayout(left,BoxLayout.Y_AXIS));
        //*************创建数组************************
        String[] imgArray={"src/javas/src/javas/pn/新建文件夹 - 副本 (5)/(6).jpg",
                "src/javas/src/javas/pn/新建文件夹 - 副本 (5)/(1).jpg",
                "src/javas/src/javas/pn/新建文件夹 - 副本 (5)/(5).jpg"};
//**********************头部左边*********************************
        JPanel img=new JPanel();
        img.setLayout(new BoxLayout(img,BoxLayout.X_AXIS));
        ImageIcon img1= new ImageIcon("src/javas/src/javas/pn/新建文件夹 - 副本 (5)/(6).jpg");
        img1.setImage(img1.getImage().getScaledInstance(530,530,Image.SCALE_DEFAULT));
        JLabel im=new JLabel(img1);
        img.add(im);
        JLabel tex7=new JLabel("<html><span>&emsp;&emsp;&emsp;&ensp;</span></html>");
        img.add(tex7);
        JPanel bt =new JPanel();
        bt.setLayout(new BoxLayout(bt,BoxLayout.X_AXIS));
        for (int i=0;i<3;i++) {
            JButton btn=new JButton();
            btn.setContentAreaFilled(false);
            btn.setBackground(Color.white);
            ImageIcon img2= new ImageIcon(imgArray[i]);
            img2.setImage(img2.getImage().getScaledInstance(80,80,Image.SCALE_DEFAULT));
            btn.setIcon(img2);
            int finalI12 = i;
            btn.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent e) {
                    ImageIcon img3= new ImageIcon(imgArray[finalI12]);
                    img3.setImage(img3.getImage().getScaledInstance(530,530,Image.SCALE_DEFAULT));
                    im.setIcon(img3);
                }
            });

            bt.add(btn);
        }
        JLabel tex8=new JLabel("<html><span>&emsp;&emsp;&emsp;&ensp;</span></html>");
        bt.add(tex8);
        left.add(img);
        left.add(bt);
//**********************头部左边*********************************
        JPanel right=new JPanel();
        //right.setLayout(new FlowLayout());
        right.setLayout(new BoxLayout(right,BoxLayout.Y_AXIS));
        JPanel righttop=new JPanel();
        righttop.setLayout(new BoxLayout(righttop,BoxLayout.X_AXIS));
        JLabel tex=new JLabel("<html>\n" +
                "\t\t<p style=\"font-size: 20px;\">农夫山泉100%NFC橙汁300mlx10瓶</p>\n" +
                "\t\t<p style=\"color: gray;font-size: 10px;\">月销 20万+</p>\n" +
                "\t\t<p>品牌力荐<span style=\"color: red;font-size: 30px;\">￥69.9</span></p>\n" +
                "\t\t<p style=\"color: black;font-size: 15px;\"><span style=\"color: gray;font-size: 12px;\">" +
                "配送：</span>&ensp;广东广州——南平市延平区<br>&emsp;&emsp;&ensp;&ensp;" +
                "<span style=\"color: red;font-size: 11px;\">快递: 免运费</span></p>\n" +
                "\t</html>");
        righttop.add(tex);
        //*************按钮数组*******************************
        String[] btnbannearr={"nfc橙汁300ml*5","nfc橙汁300ml*2","nfc橙汁300ml*3"};
        String[] btnbannearr1={"nfc橙汁300ml*4","nfc橙汁300ml*12","nfc橙汁300ml*7"};
        //*************按钮数组*******************************
        JLabel tex1=new JLabel("<html><span style=\"color: gray;font-size: 12px;\">规格：</span></html>");
        JLabel tex2=new JLabel("<html><span>&emsp;&emsp;&emsp;&ensp;</span></html>");
        JPanel btnbanne =new JPanel();
        btnbanne.setLayout(new BoxLayout(btnbanne,BoxLayout.Y_AXIS));
        JPanel btnbanne1 =new JPanel();
        btnbanne1.setLayout(new BoxLayout(btnbanne1,BoxLayout.X_AXIS));
        btnbanne1.add(tex1);
        for (int i=0;i<3;i++) {
            JButton btn1=new JButton(btnbannearr[i]);
            btn1.setContentAreaFilled(false);
            // btn1.setBounds(0, 0, 80, 30);
            btnbanne1.add(btn1);
        }
        btnbanne1.add(tex2);
        JLabel tex6=new JLabel("<html><span>&emsp;&emsp;&emsp;&ensp;</span></html>");
        btnbanne1.add(tex6);



        JPanel btnbanne2 =new JPanel();
        btnbanne2.setLayout(new BoxLayout(btnbanne2,BoxLayout.X_AXIS));
        JLabel tex3=new JLabel("<html><span>&emsp;&emsp;&emsp;&ensp;</span></html>");
        btnbanne2.add(tex3);
        for (int i=0;i<3;i++) {
            JButton btn2=new JButton(btnbannearr1[i]);
            btn2.setContentAreaFilled(false);
            btn2.setBounds(0, 0, 80, 30);
            btnbanne2.add(btn2);
        }
        JLabel tex4=new JLabel("<html><span>&emsp;&emsp;&emsp;&ensp;</span></html>");
        btnbanne2.add(tex4);
        JLabel tex5=new JLabel("<html><span>&emsp;&emsp;&emsp;&ensp;</span></html>");
        btnbanne2.add(tex5);


        //btnbanne.add(btnbanne1);
        //btnbanne.add(btnbanne2);
        JLabel texshu=new JLabel("<html><span style=\"color: gray;font-size: 12px;\">数量：</span></html>");






        //JTextField textField=new JTextField();
        //textField.setSize(50,50);

        JLabel tex11=new JLabel("<html><span>&emsp;&emsp;&emsp;&ensp;</span></html>");
        JLabel tex12=new JLabel("<html><span>&emsp;&emsp;&emsp;&ensp;</span></html>");
        JLabel tex13=new JLabel("<html><span>&emsp;&emsp;&emsp;&ensp;</span></html>");
        JLabel tex14=new JLabel("<html><span>&emsp;&emsp;&emsp;&ensp;</span></html>");
        JLabel tex15=new JLabel("<html><span>&emsp;&emsp;&emsp;&ensp;</span></html>");
        JPanel shuliang= new JPanel();
        shuliang.setLayout(new BoxLayout(shuliang,BoxLayout.X_AXIS));
        shuliang.add(texshu);

        JButton btnJian = new JButton("-");
        JButton btnJia = new JButton("+");
        final int[] a = {0};
        JLabel texshu1 = new JLabel(String.valueOf(a[0]));
        final double[] b = {69.9};
        JLabel jiage = new JLabel("    总价格为：￥"+String.valueOf(b[0]));
        shuliang.add(btnJian);
        shuliang.add(texshu1);
        shuliang.add(btnJia);
        shuliang.add(jiage);
        btnJian.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                if (a[0] >0){
                    a[0]--;}
                else {
                    a[0]=0;
                }double c=b[0]*a[0];
                jiage.setText("    总价格为：￥"+String.valueOf(c));

                texshu1.setText(String.valueOf(a[0]));
            }
        });
        btnJia.addActionListener(new AbstractAction() {
            @Override
            public void actionPerformed(ActionEvent e) {
                a[0]++;
                double c=b[0]*a[0];
                jiage.setText("    总价格为：￥"+String.valueOf(c));
                texshu1.setText(String.valueOf(a[0]));

            }
        });





        shuliang.add(tex11);
        shuliang.add(tex12);
        shuliang.add(tex13);
        shuliang.add(tex14);

        JLabel tex111=new JLabel("<html><span>&emsp;&emsp;&emsp;&ensp;</span></html>");
        JLabel tex112=new JLabel("<html><span>&emsp;&emsp;&emsp;&ensp;</span></html>");
        JPanel btn=new JPanel();
        btn.setLayout(new BoxLayout(btn,BoxLayout.X_AXIS));
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
        btn.add(btn1);
        btn.add(new JLabel("<html><span>&emsp;&emsp;&emsp;&ensp;</span></html>"));

        right.add(righttop);
        right.add(btnbanne1);
        right.add(tex112);
        right.add(btnbanne2);
        right.add(tex111);
        right.add(new JLabel("<html><span>&emsp;&emsp;&emsp;&ensp;</span></html>"));
        right.add(shuliang);
        right.add(new JLabel("<html><span>&emsp;&emsp;&emsp;&ensp;</span></html>"));
        right.add(new JLabel("<html><span>&emsp;&emsp;&emsp;&ensp;</span></html>"));
        right.add(btn);

        JPanel tomm=new JPanel();
        tomm.setLayout(new GridLayout(3,1));

        String[] imgArra={"src/javas/src/javas/pn/新建文件夹 - 副本 (5)/(2).jpg",
                "src/javas/src/javas/pn/新建文件夹 - 副本 (5)/(3).jpg",
                "src/javas/src/javas/pn/新建文件夹 - 副本 (5)/(4).jpg"};
        for (int i=0;i<3;i++) {
            ImageIcon img11= new ImageIcon(imgArra[i]);
            img11.setImage(img11.getImage().getScaledInstance(900,1920,Image.SCALE_DEFAULT));
            JLabel img111=new JLabel(img11);
            tomm.add(img111);
        }
        JPanel tommm=new JPanel();
        tommm.setLayout(new GridLayout(1,1));
        JLabel wo=new JLabel("<html>\n" +
                "\t\t<div style=\"border:2px solid #000;height:20px;width: 897px;\">\n" +
                "\t\t\t<p style=\"color: red;font-size: 10px;text-align: center;\">我这一生如履薄冰，你说我能走到对岸吗</p>\n" +
                "\t\t</div>\n" +
                "\t</html>");
        tommm.add(wo);



        t1.add(left);
        t1.add(right);
        js.setViewportView(t);
        t.add(t1);
        t.add(tommm);
        t.add(tomm);

        this.add(js);
        //this.add(p);
        this.setVisible(true);//设置窗体可见
        this.setBounds(new Rectangle(1200,900));//窗体大小；
    }
}


