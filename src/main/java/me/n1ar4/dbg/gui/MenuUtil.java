/*
 * GPLv3 License
 *
 * Copyright (c) 2023-2025 4ra1n (Jar Analyzer Team)
 *
 * This project is distributed under the GPLv3 license.
 *
 * https://github.com/jar-analyzer/jar-analyzer/blob/master/LICENSE
 */

package me.n1ar4.dbg.gui;

import javax.swing.*;

public class MenuUtil {
    public static JMenuBar createMenuBar() {
        JMenuBar menuBar = new JMenuBar();
        menuBar.add(createAboutMenu());
        return menuBar;
    }

    private static JMenu createAboutMenu() {
        try {
            JMenu newMenu = new JMenu("new");

            JMenuItem connectItem = new JMenuItem("connect");
            connectItem.addActionListener(e -> {
                ConnectForm.start();
            });
            newMenu.add(connectItem);

            return newMenu;
        } catch (Exception ex) {
            return null;
        }
    }
}
