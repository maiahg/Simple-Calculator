package com.example.simplecalculator;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;


public class MainActivity extends AppCompatActivity {
    private enum Operator {none, add, minus, multiply, divide};
    private double data1 = 0, data2 = 0;
    private Operator optr = Operator.none;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    /*
    public void btn00Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"0");
    }

    public void btn01Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"1");
    }

    public void btn02Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"2");
    }

    public void btn03Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"3");
    }

    public void btn04Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"4");
    }

    public void btn05Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"5");
    }

    public void btn06Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"6");
    }

    public void btn07Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"7");
    }

    public void btn08Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"8");
    }

    public void btn09Click(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+"9");
    }

    public void btnAddClick(View view) {
        optr = Operator.add;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 =Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnMinusClick(View view) {
        optr = Operator.minus;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 =Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnMultiplyClick(View view) {
        optr = Operator.multiply;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 =Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnDivideClick(View view) {
        optr = Operator.divide;
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        data1 =Double.parseDouble(eText.getText().toString());
        eText.setText("");
    }

    public void btnClearClick(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText("");
    }

    public void btnDotClick(View view) {
        EditText eText = (EditText) findViewById(R.id.resultEdit);
        eText.setText(eText.getText()+".");
    }

*/

    public void onClickNumericalButton(View view) {
        int viewId = view.getId();
        TextView curText = (TextView) findViewById(R.id.resultEdit);

        if (viewId == R.id.btn00) {
            curText.setText(curText.getText() + "0");
        } else if (viewId == R.id.btn01) {
            curText.setText(curText.getText() + "1");
        } else if (viewId == R.id.btn02) {
            curText.setText(curText.getText() + "2");
        } else if (viewId == R.id.btn03) {
            curText.setText(curText.getText() + "3");
        } else if (viewId == R.id.btn04) {
            curText.setText(curText.getText() + "4");
        } else if (viewId == R.id.btn05) {
            curText.setText(curText.getText() + "5");
        } else if (viewId == R.id.btn06) {
            curText.setText(curText.getText() + "6");
        } else if (viewId == R.id.btn07) {
            curText.setText(curText.getText() + "7");
        } else if (viewId == R.id.btn08) {
            curText.setText(curText.getText() + "8");
        } else if (viewId == R.id.btn09) {
            curText.setText(curText.getText() + "9");
        } else if (viewId == R.id.btnDot) {
            curText.setText(curText.getText() + ".");
        } else if (viewId == R.id.btnClear) {
            curText.setText("");
        }
    }

    public void onClickOperatorButton(View view) {
        int viewId = view.getId();
        TextView curText = (TextView) findViewById(R.id.resultEdit);

        if (viewId == R.id.btnAdd) {
            optr = Operator.add;
            data1 =Double.parseDouble(curText.getText().toString());
            curText.setText("");
        } else if (viewId == R.id.btnMinus) {
            optr = Operator.minus;
            data1 =Double.parseDouble(curText.getText().toString());
            curText.setText("");
        } else if (viewId == R.id.btnMultiply) {
            optr = Operator.multiply;
            data1 =Double.parseDouble(curText.getText().toString());
            curText.setText("");
        } else if (viewId == R.id.btnDivide) {
            optr = Operator.divide;
            data1 =Double.parseDouble(curText.getText().toString());
            curText.setText("");
        }
    }

    public void btnResultClick(View view) {
        if (optr != Operator.none) {
            EditText eText = (EditText) findViewById(R.id.resultEdit);
            data2 = Double.parseDouble(eText.getText().toString());
            double result = 0;
            if (optr == Operator.add) {
                result = data1 + data2;
            }
            else if (optr == Operator.minus) {
                result = data1 - data2;
            }
            else if (optr == Operator.multiply) {
                result = data1*data2;
            }
            else if (optr == Operator.divide) {
                result = data1/data2;
            }

            optr = Operator.none;
            data1 = result;
            if (result - (int)result != 0) {
                eText.setText(String.valueOf(result));
            } else {
                eText.setText(String.valueOf((int)result));
            }
        }
    }
}