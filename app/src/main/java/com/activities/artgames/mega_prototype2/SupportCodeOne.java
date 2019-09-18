package com.activities.artgames.mega_prototype2;

import android.widget.Button;



public class SupportCodeOne {
    public void basement(int x, int y, int a[][], Button btn[][], boolean pressed[]) {

        if (pressed[0]) {
            if ((a[y + 1][x] == 2) && (a[y + 1][x] != 6)) {
                a[y][x] = 1;
                a[y + 1][x] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons8);
                btn[y][x - 1].setBackgroundResource(R.mipmap.cons3);
            } else if ((a[y + 1][x] == 3) && (a[y + 1][x] != 7)) {
                a[y][x] = 1;
                a[y + 1][x] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons8);
                btn[y][x - 1].setBackgroundResource(R.mipmap.cons2);
            } else if ((a[y + 1][x] == 4) && (a[y + 1][x] != 8)) {
                a[y][x] = 1;
                a[y + 1][x] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons8);
                btn[y][x - 1].setBackgroundResource(R.mipmap.cons6);
            }

            if ((a[y][x + 1] == 2) && (a[y][x + 1] != 6)){
                a[y][x] = 2;
                a[y][x + 1] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons10);
                btn[y - 1][x].setBackgroundResource(R.mipmap.cons1);
            } else if ((a[y][x + 1] == 1) && (a[y][x + 1] != 5)) {
                a[y][x] = 2;
                a[y][x + 1] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons10);
                btn[y - 1][x].setBackgroundResource(R.mipmap.cons6);
            } else if ((a[y][x + 1] == 3) && (a[y][x + 1] != 7)) {
                a[y][x] = 2;
                a[y][x + 1] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons10);
                btn[y - 1][x].setBackgroundResource(R.mipmap.cons2);
            }

            if ((a[y - 1][x] == 2) && (a[y - 1][x] != 6)) {
                a[y][x] = 1;
                a[y - 1][x] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons7);
                btn[y - 2][x - 1].setBackgroundResource(R.mipmap.cons4);
            } else if ((a[y - 1][x] == 4) && (a[y - 1][x] != 8)){
                a[y][x] = 1;
                a[y - 1][x] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons7);
                btn[y - 2][x - 1].setBackgroundResource(R.mipmap.cons5);
            } else if ((a[y - 1][x] == 1) && (a[y - 1][x] != 5)) {
                a[y][x] = 1;
                a[y - 1][x] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons7);
                btn[y - 2][x - 1].setBackgroundResource(R.mipmap.cons2);
            }

            if ((a[y][x - 1] == 3) && (a[y][x - 1] != 7)){
                a[y][x] = 4;
                a[y][x - 1] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons9);
                btn[y - 1][x - 2].setBackgroundResource(R.mipmap.cons4);
            } else if ((a[y][x - 1] == 1) && (a[y][x - 1] != 5)) {
                a[y][x] = 4;
                a[y][x - 1] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons9);
                btn[y - 1][x - 2].setBackgroundResource(R.mipmap.cons3);
            } else if ((a[y][x - 1] == 4) && (a[y][x - 1] != 8)) {
                if ((y == 5) && (x == 2)) {
                    a[y][x] = 9;
                    a[y][x - 1] = 9;
                    btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons6);
                    btn[y - 1][x - 2].setBackgroundResource(R.mipmap.finish_black_opened);
                    btn[0][0].setBackgroundResource(R.mipmap.start_black_opened);
                    pressed[0] = false;
                } else if ((y == 1)&& (x == 2)) {
                    a[y][x] = 4;
                    a[y][x - 1] = 9;
                    btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons9);
                } else {
                    a[y][x] = 4;
                    a[y][x - 1] = 9;
                    btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons9);
                    btn[y - 1][x - 2].setBackgroundResource(R.mipmap.cons1);
                }
            }
        }

        if (pressed[4]) {

            if (a[y + 1][x] == 6) {
                a[y][x] = 5;
                a[y + 1][x] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons8b);
                btn[y][x - 1].setBackgroundResource(R.mipmap.cons3b);
            } else if (a[y + 1][x] == 7) {
                a[y][x] = 5;
                a[y + 1][x] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons8b);
                btn[y][x - 1].setBackgroundResource(R.mipmap.cons2b);
            } else if (a[y + 1][x] == 8) {
                a[y][x] = 5;
                a[y + 1][x] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons8b);
                btn[y][x - 1].setBackgroundResource(R.mipmap.cons6b);
            }

            if (a[y][x + 1] == 6) {

                if ((y == 1) && (x == 4)) {
                    a[y][x] = 6;
                    a[y][x + 1] = 9;
                    btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons10b);
                } else if ((y == 5) && (x == 4)) {
                    a[y][x] = 9;
                    a[y][x + 1] = 9;
                    btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons3b);
                    btn[y - 1][x].setBackgroundResource(R.mipmap.finish_blue_opened);
                    btn[0][4].setBackgroundResource(R.mipmap.start_blue_opened);
                    pressed[4] = false;
                } else {
                    a[y][x] = 6;
                    a[y][x + 1] = 9;
                    btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons10b);
                    btn[y - 1][x].setBackgroundResource(R.mipmap.cons1b);
                }

            } else if (a[y][x + 1] == 5) {
                a[y][x] = 6;
                a[y][x + 1] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons10b);
                btn[y - 1][x].setBackgroundResource(R.mipmap.cons6b);
            } else if (a[y][x + 1] == 7) {
                a[y][x] = 6;
                a[y][x + 1] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons10b);
                btn[y - 1][x].setBackgroundResource(R.mipmap.cons2b);
            }

            if (a[y - 1][x] == 6) {
                a[y][x] = 5;
                a[y - 1][x] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons7b);
                btn[y - 2][x - 1].setBackgroundResource(R.mipmap.cons4b);
            } else if (a[y - 1][x] == 8) {
                a[y][x] = 5;
                a[y - 1][x] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons7b);
                btn[y - 2][x - 1].setBackgroundResource(R.mipmap.cons5b);
            } else if (a[y - 1][x] == 5) {
                a[y][x] = 5;
                a[y - 1][x] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons7b);
                btn[y - 2][x - 1].setBackgroundResource(R.mipmap.cons2b);
            }

            if (a[y][x - 1] == 7) {
                a[y][x] = 8;
                a[y][x - 1] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons9b);
                btn[y - 1][x - 2].setBackgroundResource(R.mipmap.cons4b);
            } else if (a[y][x - 1] == 5) {
                a[y][x] = 8;
                a[y][x - 1] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons9b);
                btn[y - 1][x - 2].setBackgroundResource(R.mipmap.cons3b);
            } else if (a[y][x - 1] == 8) {
                a[y][x] = 8;
                a[y][x - 1] = 9;
                btn[y - 1][x - 1].setBackgroundResource(R.mipmap.cons9b);
                btn[y - 1][x - 2].setBackgroundResource(R.mipmap.cons1b);
            }
        }
    }
}
