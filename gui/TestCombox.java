package gui;

import javax.swing.*;

/**
 * @Author:YuDong
 * @Description:
 * @Date:created in 17:14 2018/6/3
 * @Modified By:
 */

public class TestCombox {
    public static void main(String[] args) {

        JFrame f = new JFrame("LoL");
        f.setSize(400, 300);
        f.setLocation(580, 240);
        f.setLayout(null);

        //下拉框出现的条目
        String[] heros = new String[] { "卡特琳娜", "库奇" };
        JComboBox cb = new JComboBox(heros);

        cb.setBounds(50, 50, 80, 30);

        f.add(cb);

        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        f.setVisible(true);
    }
}
