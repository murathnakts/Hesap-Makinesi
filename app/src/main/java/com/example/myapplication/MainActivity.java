package com.example.myapplication;

import androidx.annotation.ColorInt;
import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.content.res.Resources;
import android.os.Bundle;
import android.renderscript.Sampler;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private Button btn0,btn1,btn2,btn3,btn4,btn5,btn6,btn7,btn8,btn9,
    btnvirgul,btnesittir,btntopla,btneksi,btncarp,btnbol,
    btntemizle,btnsil,btnyuzde;
    private TextView sonuc,islem;

    private String s1 = "";
    private String s2 = "";
    private String s1n = "";
    private String s2n = "";
    private String h = "";
    private String s = "";
    private String sn = "";
    private int i = 0,l=0,e=0;


    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btn0 = findViewById(R.id.btn0);
        btn1 = findViewById(R.id.btn1);
        btn2 = findViewById(R.id.btn2);
        btn3 = findViewById(R.id.btn3);
        btn4 = findViewById(R.id.btn4);
        btn5 = findViewById(R.id.btn5);
        btn6 = findViewById(R.id.btn6);
        btn7 = findViewById(R.id.btn7);
        btn8 = findViewById(R.id.btn8);
        btn9 = findViewById(R.id.btn9);
        btnvirgul = findViewById(R.id.btnvirgul);
        btnesittir = findViewById(R.id.btnesittir);
        btntopla = findViewById(R.id.btntopla);
        btneksi = findViewById(R.id.btneksi);
        btncarp = findViewById(R.id.btncarp);
        btnbol = findViewById(R.id.btnbol);
        btntemizle = findViewById(R.id.btntemizle);
        btnsil = findViewById(R.id.btnsil);
        btnyuzde = findViewById(R.id.btnyuzde);
        sonuc = findViewById(R.id.sonuc);
        islem = findViewById(R.id.islem);

        btn0.setOnClickListener(new View.OnClickListener() {
            @SuppressLint("SetTextI18n")
            @Override
            public void onClick(View v) {
                if (e == 1) {
                    s1 = "";
                    s1n = "";
                    islem.setText(s1n);
                    sonuc.setText("0");
                    sonuc.setTextSize(60);
                    sonuc.setTextColor(getResources().getColor(R.color.white));
                    e = 0;
                } else {
                    if (s1.length() == 0 && s2.length() == 0) {
                        return;
                    } else {
                        islem.setTextSize(60);
                        islem.setTextColor(getResources().getColor(R.color.white));
                        sonuc.setTextSize(40);
                        sonuc.setTextColor(getResources().getColor(R.color.gray));
                        if (i == 0) {
                            if (s1.length() < 10) {
                                if (s1.length() < 3) {
                                    s1 = s1 + "0";
                                    s1n = s1;
                                } else if (s1.length() < 6) {
                                    s1 = s1 + "0";
                                    s1n = s1.substring(0, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                                } else if (s1.length() < 9) {
                                    s1 = s1 + "0";
                                    s1n = s1.substring(0, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                                } else {
                                    s1 = s1 + "0";
                                    s1n = s1.substring(0, s1.length() - 9) + "." + s1.substring(s1.length() - 9, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                                }
                                islem.setText(s1n);
                                sonuc.setText("=" + s1n);
                            }
                        } else {
                            if (s2.length() < 10) {
                                if (s2.length() < 3) {
                                    s2 = s2 + "0";
                                    s2n = s2;
                                } else if (s2.length() < 6) {
                                    s2 = s2 + "0";
                                    s2n = s2.substring(0, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                                } else if (s2.length() < 9) {
                                    s2 = s2 + "0";
                                    s2n = s2.substring(0, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                                } else {
                                    s2 = s2 + "0";
                                    s2n = s2.substring(0, s2.length() - 9) + "." + s2.substring(s2.length() - 9, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                                }
                                islem.setText(h + s2n);
                                hesapla(s1, s2);
                                sonuc.setText("=" + sn);
                            }
                        }
                    }
                }
            }
        });

        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e == 1) {
                    s1 = "1";
                    s1n = "1";
                    islem.setText(s1n);
                    sonuc.setText("=" + s1n);
                    e = 0;
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                } else {
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                    if (i == 0) {
                        if (s1.length() < 10) {
                            if (s1.length() < 3) {
                                s1 = s1 + "1";
                                s1n = s1;
                            } else if (s1.length() < 6) {
                                s1 = s1 + "1";
                                s1n = s1.substring(0, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            } else if (s1.length() < 9) {
                                s1 = s1 + "1";
                                s1n = s1.substring(0, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            } else {
                                s1 = s1 + "1";
                                s1n = s1.substring(0, s1.length() - 9) + "." + s1.substring(s1.length() - 9, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            }
                            islem.setText(s1n);
                            sonuc.setText("=" + s1n);
                        }
                    } else {
                        if (s2.length() < 10) {
                            if (s2.length() < 3) {
                                s2 = s2 + "1";
                                s2n = s2;
                            } else if (s2.length() < 6) {
                                s2 = s2 + "1";
                                s2n = s2.substring(0, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            } else if (s2.length() < 9) {
                                s2 = s2 + "1";
                                s2n = s2.substring(0, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            } else {
                                s2 = s2 + "1";
                                s2n = s2.substring(0, s2.length() - 9) + "." + s2.substring(s2.length() - 9, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            }
                            islem.setText(h + s2n);
                            hesapla(s1, s2);
                            sonuc.setText("=" + sn);
                        }
                    }
                }
            }
        });

        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e == 1) {
                    s1 = "2";
                    s1n = "2";
                    islem.setText(s1n);
                    sonuc.setText("=" + s1n);
                    e = 0;
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                } else {
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                    if (i == 0) {
                        if (s1.length() < 10) {
                            if (s1.length() < 3) {
                                s1 = s1 + "2";
                                s1n = s1;
                            } else if (s1.length() < 6) {
                                s1 = s1 + "2";
                                s1n = s1.substring(0, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            } else if (s1.length() < 9) {
                                s1 = s1 + "2";
                                s1n = s1.substring(0, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            } else {
                                s1 = s1 + "2";
                                s1n = s1.substring(0, s1.length() - 9) + "." + s1.substring(s1.length() - 9, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            }
                            islem.setText(s1n);
                            sonuc.setText("=" + s1n);
                        }
                    } else {
                        if (s2.length() < 10) {
                            if (s2.length() < 3) {
                                s2 = s2 + "2";
                                s2n = s2;
                            } else if (s2.length() < 6) {
                                s2 = s2 + "2";
                                s2n = s2.substring(0, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            } else if (s2.length() < 9) {
                                s2 = s2 + "2";
                                s2n = s2.substring(0, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            } else {
                                s2 = s2 + "2";
                                s2n = s2.substring(0, s2.length() - 9) + "." + s2.substring(s2.length() - 9, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            }
                            islem.setText(h + s2n);
                            hesapla(s1, s2);
                            sonuc.setText("=" + sn);
                        }
                    }
                }
            }
        });

        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e == 1) {
                    s1 = "3";
                    s1n = "3";
                    islem.setText(s1n);
                    sonuc.setText("=" + s1n);
                    e = 0;
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                } else {
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                    if (i == 0) {
                        if (s1.length() < 10) {
                            if (s1.length() < 3) {
                                s1 = s1 + "3";
                                s1n = s1;
                            } else if (s1.length() < 6) {
                                s1 = s1 + "3";
                                s1n = s1.substring(0, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            } else if (s1.length() < 9) {
                                s1 = s1 + "3";
                                s1n = s1.substring(0, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            } else {
                                s1 = s1 + "3";
                                s1n = s1.substring(0, s1.length() - 9) + "." + s1.substring(s1.length() - 9, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            }
                            islem.setText(s1n);
                            sonuc.setText("=" + s1n);
                        }
                    } else {
                        if (s2.length() < 10) {
                            if (s2.length() < 3) {
                                s2 = s2 + "3";
                                s2n = s2;
                            } else if (s2.length() < 6) {
                                s2 = s2 + "3";
                                s2n = s2.substring(0, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            } else if (s2.length() < 9) {
                                s2 = s2 + "3";
                                s2n = s2.substring(0, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            } else {
                                s2 = s2 + "3";
                                s2n = s2.substring(0, s2.length() - 9) + "." + s2.substring(s2.length() - 9, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            }
                            islem.setText(h + s2n);
                            hesapla(s1, s2);
                            sonuc.setText("=" + sn);
                        }
                    }
                }
            }
        });

        btn4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e == 1) {
                    s1 = "4";
                    s1n = "4";
                    islem.setText(s1n);
                    sonuc.setText("=" + s1n);
                    e = 0;
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                } else {
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                    if (i == 0) {
                        if (s1.length() < 10) {
                            if (s1.length() < 3) {
                                s1 = s1 + "4";
                                s1n = s1;
                            } else if (s1.length() < 6) {
                                s1 = s1 + "4";
                                s1n = s1.substring(0, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            } else if (s1.length() < 9) {
                                s1 = s1 + "4";
                                s1n = s1.substring(0, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            } else {
                                s1 = s1 + "4";
                                s1n = s1.substring(0, s1.length() - 9) + "." + s1.substring(s1.length() - 9, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            }
                            islem.setText(s1n);
                            sonuc.setText("=" + s1n);
                        }
                    } else {
                        if (s2.length() < 10) {
                            if (s2.length() < 3) {
                                s2 = s2 + "4";
                                s2n = s2;
                            } else if (s2.length() < 6) {
                                s2 = s2 + "4";
                                s2n = s2.substring(0, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            } else if (s2.length() < 9) {
                                s2 = s2 + "4";
                                s2n = s2.substring(0, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            } else {
                                s2 = s2 + "4";
                                s2n = s2.substring(0, s2.length() - 9) + "." + s2.substring(s2.length() - 9, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            }
                            islem.setText(h + s2n);
                            hesapla(s1, s2);
                            sonuc.setText("=" + sn);
                        }
                    }
                }
            }
        });

        btn5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e == 1) {
                    s1 = "5";
                    s1n = "5";
                    islem.setText(s1n);
                    sonuc.setText("=" + s1n);
                    e = 0;
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                } else {
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                    if (i == 0) {
                        if (s1.length() < 10) {
                            if (s1.length() < 3) {
                                s1 = s1 + "5";
                                s1n = s1;
                            } else if (s1.length() < 6) {
                                s1 = s1 + "5";
                                s1n = s1.substring(0, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            } else if (s1.length() < 9) {
                                s1 = s1 + "5";
                                s1n = s1.substring(0, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            } else {
                                s1 = s1 + "5";
                                s1n = s1.substring(0, s1.length() - 9) + "." + s1.substring(s1.length() - 9, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            }
                            islem.setText(s1n);
                            sonuc.setText("=" + s1n);
                        }
                    } else {
                        if (s2.length() < 10) {
                            if (s2.length() < 3) {
                                s2 = s2 + "5";
                                s2n = s2;
                            } else if (s2.length() < 6) {
                                s2 = s2 + "5";
                                s2n = s2.substring(0, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            } else if (s2.length() < 9) {
                                s2 = s2 + "5";
                                s2n = s2.substring(0, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            } else {
                                s2 = s2 + "5";
                                s2n = s2.substring(0, s2.length() - 9) + "." + s2.substring(s2.length() - 9, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            }
                            islem.setText(h + s2n);
                            hesapla(s1, s2);
                            sonuc.setText("=" + sn);
                        }
                    }
                }
            }
        });

        btn6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e == 1) {
                    s1 = "6";
                    s1n = "6";
                    islem.setText(s1n);
                    sonuc.setText("=" + s1n);
                    e = 0;
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                } else {
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                    if (i == 0) {
                        if (s1.length() < 10) {
                            if (s1.length() < 3) {
                                s1 = s1 + "6";
                                s1n = s1;
                            } else if (s1.length() < 6) {
                                s1 = s1 + "6";
                                s1n = s1.substring(0, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            } else if (s1.length() < 9) {
                                s1 = s1 + "6";
                                s1n = s1.substring(0, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            } else {
                                s1 = s1 + "6";
                                s1n = s1.substring(0, s1.length() - 9) + "." + s1.substring(s1.length() - 9, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            }
                            islem.setText(s1n);
                            sonuc.setText("=" + s1n);
                        }
                    } else {
                        if (s2.length() < 10) {
                            if (s2.length() < 3) {
                                s2 = s2 + "6";
                                s2n = s2;
                            } else if (s2.length() < 6) {
                                s2 = s2 + "6";
                                s2n = s2.substring(0, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            } else if (s2.length() < 9) {
                                s2 = s2 + "6";
                                s2n = s2.substring(0, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            } else {
                                s2 = s2 + "6";
                                s2n = s2.substring(0, s2.length() - 9) + "." + s2.substring(s2.length() - 9, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            }
                            islem.setText(h + s2n);
                            hesapla(s1, s2);
                            sonuc.setText("=" + sn);
                        }
                    }
                }
            }
        });

        btn7.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e == 1) {
                    s1 = "7";
                    s1n = "7";
                    islem.setText(s1n);
                    sonuc.setText("=" + s1n);
                    e = 0;
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                } else {
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                    if (i == 0) {
                        if (s1.length() < 10) {
                            if (s1.length() < 3) {
                                s1 = s1 + "7";
                                s1n = s1;
                            } else if (s1.length() < 6) {
                                s1 = s1 + "7";
                                s1n = s1.substring(0, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            } else if (s1.length() < 9) {
                                s1 = s1 + "7";
                                s1n = s1.substring(0, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            } else {
                                s1 = s1 + "7";
                                s1n = s1.substring(0, s1.length() - 9) + "." + s1.substring(s1.length() - 9, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            }
                            islem.setText(s1n);
                            sonuc.setText("=" + s1n);
                        }
                    } else {
                        if (s2.length() < 10) {
                            if (s2.length() < 3) {
                                s2 = s2 + "7";
                                s2n = s2;
                            } else if (s2.length() < 6) {
                                s2 = s2 + "7";
                                s2n = s2.substring(0, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            } else if (s2.length() < 9) {
                                s2 = s2 + "7";
                                s2n = s2.substring(0, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            } else {
                                s2 = s2 + "7";
                                s2n = s2.substring(0, s2.length() - 9) + "." + s2.substring(s2.length() - 9, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            }
                            islem.setText(h + s2n);
                            hesapla(s1, s2);
                            sonuc.setText("=" + sn);
                        }
                    }
                }
            }
        });

        btn8.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e == 1) {
                    s1 = "8";
                    s1n = "8";
                    islem.setText(s1n);
                    sonuc.setText("=" + s1n);
                    e = 0;
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                } else {
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                    if (i == 0) {
                        if (s1.length() < 10) {
                            if (s1.length() < 3) {
                                s1 = s1 + "8";
                                s1n = s1;
                            } else if (s1.length() < 6) {
                                s1 = s1 + "8";
                                s1n = s1.substring(0, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            } else if (s1.length() < 9) {
                                s1 = s1 + "8";
                                s1n = s1.substring(0, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            } else {
                                s1 = s1 + "8";
                                s1n = s1.substring(0, s1.length() - 9) + "." + s1.substring(s1.length() - 9, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            }
                            islem.setText(s1n);
                            sonuc.setText("=" + s1n);
                        }
                    } else {
                        if (s2.length() < 10) {
                            if (s2.length() < 3) {
                                s2 = s2 + "8";
                                s2n = s2;
                            } else if (s2.length() < 6) {
                                s2 = s2 + "8";
                                s2n = s2.substring(0, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            } else if (s2.length() < 9) {
                                s2 = s2 + "8";
                                s2n = s2.substring(0, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            } else {
                                s2 = s2 + "8";
                                s2n = s2.substring(0, s2.length() - 9) + "." + s2.substring(s2.length() - 9, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            }
                            islem.setText(h + s2n);
                            hesapla(s1, s2);
                            sonuc.setText("=" + sn);
                        }
                    }
                }
            }
        });

        btn9.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (e == 1) {
                    s1 = "9";
                    s1n = "9";
                    islem.setText(s1n);
                    sonuc.setText("=" + s1n);
                    e = 0;
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                } else {
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                    if (i == 0) {
                        if (s1.length() < 10) {
                            if (s1.length() < 3) {
                                s1 = s1 + "9";
                                s1n = s1;
                            } else if (s1.length() < 6) {
                                s1 = s1 + "9";
                                s1n = s1.substring(0, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            } else if (s1.length() < 9) {
                                s1 = s1 + "9";
                                s1n = s1.substring(0, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            } else {
                                s1 = s1 + "9";
                                s1n = s1.substring(0, s1.length() - 9) + "." + s1.substring(s1.length() - 9, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            }
                            islem.setText(s1n);
                            sonuc.setText("=" + s1n);
                        }
                    } else {
                        if (s2.length() < 10) {
                            if (s2.length() < 3) {
                                s2 = s2 + "9";
                                s2n = s2;
                            } else if (s2.length() < 6) {
                                s2 = s2 + "9";
                                s2n = s2.substring(0, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            } else if (s2.length() < 9) {
                                s2 = s2 + "9";
                                s2n = s2.substring(0, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            } else {
                                s2 = s2 + "9";
                                s2n = s2.substring(0, s2.length() - 9) + "." + s2.substring(s2.length() - 9, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                            }
                            islem.setText(h + s2n);
                            hesapla(s1, s2);
                            sonuc.setText("=" + sn);
                        }
                    }
                }
            }
        });

        btnvirgul.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

        btnesittir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                islem.setTextSize(40);
                islem.setTextColor(getResources().getColor(R.color.gray));
                sonuc.setTextSize(60);
                sonuc.setTextColor(getResources().getColor(R.color.white));
                s1 = s;
                s2 = "";
                s1n = sn;
                s2n = "";
                h = "";
                s = "";
                sn = "";
                i = 0;
                l=0;
                e = 1;
            }
        });

        btntopla.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s1.length() == 0) {
                    return;
                } else {
                    e = 0;
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                    if (l == 0) {
                        i = 1;
                        h = s1n + "+";
                        islem.setText(h);
                    } else {
                        i = 1;
                        s1 = s;
                        s1n = sn;
                        s2 = "";
                        s2n = "";
                        h = sn + "+";
                        islem.setText(h);
                    }
                }
            }
        });

        btneksi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s1.length() == 0) {
                    return;
                } else {
                    e = 0;
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                    if (l == 0) {
                        i = 2;
                        h = s1n + "-";
                        islem.setText(h);
                    } else {
                        i = 2;
                        s1 = s;
                        s1n = sn;
                        s2 = "";
                        s2n = "";
                        h = sn + "-";
                        islem.setText(h);
                    }
                }
            }
        });

        btncarp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s1.length() == 0) {
                    return;
                } else {
                    e = 0;
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                    if (l == 0) {
                        i = 3;
                        h = s1n + "x";
                        islem.setText(h);
                    } else {
                        i = 3;
                        s1 = s;
                        s1n = sn;
                        s2 = "";
                        s2n = "";
                        h = sn + "x";
                        islem.setText(h);
                    }
                }
            }
        });

        btnbol.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s1.length() == 0) {
                    return;
                } else {
                    e = 0;
                    islem.setTextSize(60);
                    islem.setTextColor(getResources().getColor(R.color.white));
                    sonuc.setTextSize(40);
                    sonuc.setTextColor(getResources().getColor(R.color.gray));
                    if (l == 0) {
                        i = 4;
                        h = s1n + "÷";
                        islem.setText(h);
                    } else {
                        i = 4;
                        s1 = s;
                        s1n = sn;
                        s2 = "";
                        s2n = "";
                        h = sn + "÷";
                        islem.setText(h);
                    }
                }
            }
        });

        btntemizle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                s1 = "";
                s2 = "";
                s1n = "";
                s2n = "";
                h = "";
                s = "";
                sn = "";
                i = 0;
                l=0;
                e=0;
                islem.setText("");
                sonuc.setText("0");
                sonuc.setTextSize(60);
                sonuc.setTextColor(getResources().getColor(R.color.white));
            }
        });

        btnsil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (s1.length() == 0) {
                    return;
                } else {
                    if (i == 0) {
                        if (s1.length() == 1) {
                            s1 = "";
                            s2 = "";
                            s1n = "";
                            s2n = "";
                            h = "";
                            s = "";
                            i = 0;
                            l = 0;
                            e = 0;
                            islem.setText("");
                            sonuc.setText("0");
                            sonuc.setTextSize(60);
                            sonuc.setTextColor(getResources().getColor(R.color.white));
                        } else {
                            s1 = s1.substring(0, s1.length() - 1);
                            if (s1.length() < 4) {
                                s1n = s1;
                            } else if (s1.length() < 7) {
                                s1n = s1.substring(0, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            } else if (s1.length() < 10) {
                                s1n = s1.substring(0, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            } else {
                                s1n = s1.substring(0, s1.length() - 9) + "." + s1.substring(s1.length() - 9, s1.length() - 6) + "." + s1.substring(s1.length() - 6, s1.length() - 3) + "." + s1.substring(s1.length() - 3, s1.length());
                            }
                            islem.setText(s1n);
                            sonuc.setText("=" + s1n);
                        }
                    } else if (s2.length() == 0) {
                        i = 0;
                        s = s1;
                        sn = s1n;
                        islem.setText(s1n);
                        sonuc.setText("=" + s1n);
                    } else {
                        if (s2.length() == 1) {
                            s = s1;
                            sn = s1n;
                        }
                        s2 = s2.substring(0, s2.length() - 1);
                        if (s2.length() < 4) {
                            s2n = s2;
                        } else if (s2.length() < 7) {
                            s2n = s2.substring(0, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                        } else if (s2.length() < 10) {
                            s2n = s2.substring(0, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                        } else {
                            s2n = s2.substring(0, s2.length() - 9) + "." + s2.substring(s2.length() - 9, s2.length() - 6) + "." + s2.substring(s2.length() - 6, s2.length() - 3) + "." + s2.substring(s2.length() - 3, s2.length());
                        }
                        hesapla(s1, s2);
                        sonuc.setText("=" + sn);
                        islem.setText(h + s2n);
                    }
                }
            }
        });

        btnyuzde.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });
    }

    void hesapla(String x,String y){
        if (s1.length() == 0 || s2.length() == 0) {
            s = s1;
            return;
        } {
            l++;
            double a,b,c;
            String j,q,p;
            a = Double.parseDouble(x);
            b = Double.parseDouble(y);
            switch (i) {
                case 1:
                    c = a + b;
                    s = String.valueOf(c);
                    if (s.contains("E")) {
                        sn = s.replace(".",",");
                        } else {
                        if ((int) c == c) {
                            j = String.valueOf(c);
                            s = j.substring(0, j.indexOf('.'));
                            if (s.length() < 4) {
                                sn = s;
                            } else if (s.length() < 7) {
                                sn = s.substring(0, s.length() - 3) + "." + s.substring(s.length() - 3, s.length());
                            } else {
                                sn = s.substring(0, s.length() - 6) + "." + s.substring(s.length() - 6, s.length() - 3) + "." + s.substring(s.length() - 3, s.length());
                            }
                        } else {
                            sn = s;
                        }
                    }
                    break;
                case 2:
                    c = a - b;
                    s = String.valueOf(c);
                    if (s.contains("E")) {
                        sn = s.replace(".",",");
                    } else {
                        if ((int) c == c) {
                            j = String.valueOf(c);
                            s = j.substring(0, j.indexOf('.'));
                            if (s.length() < 4) {
                                sn = s;
                            } else if (s.length() < 7) {
                                sn = s.substring(0, s.length() - 3) + "." + s.substring(s.length() - 3, s.length());
                            } else {
                                sn = s.substring(0, s.length() - 6) + "." + s.substring(s.length() - 6, s.length() - 3) + "." + s.substring(s.length() - 3, s.length());
                            }
                        } else {
                            sn = s;
                        }
                    }
                    break;
                case 3:
                    c = a * b;
                    s = String.valueOf(c);
                    if (s.contains("E")) {
                        sn = s.replace(".",",");
                    } else {
                        if ((int) c == c) {
                            j = String.valueOf(c);
                            s = j.substring(0, j.indexOf('.'));
                            if (s.length() < 4) {
                                sn = s;
                            } else if (s.length() < 7) {
                                sn = s.substring(0, s.length() - 3) + "." + s.substring(s.length() - 3, s.length());
                            } else {
                                sn = s.substring(0, s.length() - 6) + "." + s.substring(s.length() - 6, s.length() - 3) + "." + s.substring(s.length() - 3, s.length());
                            }
                        } else {
                            sn = s;
                        }
                    }
                    break;
                case 4:
                    c = a / b;
                    s = String.valueOf(c);
                    if (s.contains("E")) {
                        sn = s.replace(".",",");
                    } else {
                        if ((int) c == c) {
                            j = String.valueOf(c);
                            s = j.substring(0, j.indexOf('.'));
                            if (s.length() < 4) {
                                sn = s;
                            } else if (s.length() < 7) {
                                sn = s.substring(0, s.length() - 3) + "." + s.substring(s.length() - 3, s.length());
                            } else {
                                sn = s.substring(0, s.length() - 6) + "." + s.substring(s.length() - 6, s.length() - 3) + "." + s.substring(s.length() - 3, s.length());
                            }
                        } else {
                            sn = s;
                        }
                    }
                    break;
            }
        }
    }
}