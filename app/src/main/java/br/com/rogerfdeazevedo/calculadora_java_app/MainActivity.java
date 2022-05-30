package br.com.rogerfdeazevedo.calculadora_java_app;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import net.objecthunter.exp4j.Expression;
import net.objecthunter.exp4j.ExpressionBuilder;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private TextView txtView_expressao, txtView_resultado;

    private Button btn_limpar, btn_ponto, btn_backspace;

    private Button btn_operador_divisao, btn_operador_multiplicacao, btn_operador_subtracao,
                   btn_operador_adicao, btn_operador_igual;

    private Button btn_num_0, btn_num_1, btn_num_2, btn_num_3, btn_num_4,
                   btn_num_5, btn_num_6, btn_num_7, btn_num_8, btn_num_9;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        setComponentes();

        btn_limpar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                txtView_expressao.setText("");
                txtView_resultado.setText("");
            }
        });
        btn_ponto.setOnClickListener(this);
        btn_backspace.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                TextView txtView_expressaoAtual = findViewById(R.id.txtView_expressao);
                String expressaoAtual = txtView_expressaoAtual.getText().toString();
                if(!expressaoAtual.isEmpty()){
                    byte startIndex = 0;
                    int endIndex = expressaoAtual.length();
                    String backspaceResult = expressaoAtual.substring(startIndex, endIndex - 1);
                    txtView_expressaoAtual.setText(backspaceResult);
                }
                txtView_resultado.setText("");
            }
        });

        btn_operador_divisao.setOnClickListener(this);
        btn_operador_multiplicacao.setOnClickListener(this);
        btn_operador_subtracao.setOnClickListener(this);
        btn_operador_adicao.setOnClickListener(this);
        btn_operador_igual.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                try {
                    Expression expression =
                            new ExpressionBuilder(txtView_expressao.getText().toString()).build();
                    double resultado = expression.evaluate();
                    long longResultado = (long) resultado;
                    if(resultado == longResultado){
                        txtView_resultado.setText((CharSequence) String.valueOf(longResultado));
                    } else {
                        txtView_resultado.setText((CharSequence) String.valueOf(resultado));
                    }
                } catch (Exception e) {
                    e.printStackTrace();
                }
            }
        });

        btn_num_0.setOnClickListener(this);
        btn_num_1.setOnClickListener(this);
        btn_num_2.setOnClickListener(this);
        btn_num_3.setOnClickListener(this);
        btn_num_4.setOnClickListener(this);
        btn_num_5.setOnClickListener(this);
        btn_num_6.setOnClickListener(this);
        btn_num_7.setOnClickListener(this);
        btn_num_8.setOnClickListener(this);
        btn_num_9.setOnClickListener(this);

    }

    private void setComponentes(){

        txtView_expressao = findViewById(R.id.txtView_expressao);
        txtView_resultado = findViewById(R.id.txtView_resultado);

        btn_limpar = findViewById(R.id.btn_limpar);
        btn_ponto = findViewById(R.id.btn_ponto);
        btn_backspace = findViewById(R.id.btn_backspace);

        btn_operador_divisao = findViewById(R.id.btn_operador_divisao);
        btn_operador_multiplicacao = findViewById(R.id.btn_operador_multiplicacao);
        btn_operador_subtracao = findViewById(R.id.btn_operador_subtracao);
        btn_operador_adicao = findViewById(R.id.btn_operador_adicao);
        btn_operador_igual = findViewById(R.id.btn_operador_igual);

        btn_num_0 = findViewById(R.id.btn_num_0);
        btn_num_1 = findViewById(R.id.btn_num_1);
        btn_num_2 = findViewById(R.id.btn_num_2);
        btn_num_3 = findViewById(R.id.btn_num_3);
        btn_num_4 = findViewById(R.id.btn_num_4);
        btn_num_5 = findViewById(R.id.btn_num_5);
        btn_num_6 = findViewById(R.id.btn_num_6);
        btn_num_7 = findViewById(R.id.btn_num_7);
        btn_num_8 = findViewById(R.id.btn_num_8);
        btn_num_9 = findViewById(R.id.btn_num_9);

    }

    private void setExpressao(String entrada, boolean limpar){

        if(txtView_resultado.getText().equals("")){
            txtView_expressao.setText("");
        }

        if(limpar){
            txtView_resultado.setText("");
            txtView_expressao.append(entrada);
        } else {
            txtView_expressao.append(txtView_resultado.getText());
            txtView_expressao.append(entrada.replace("x", "*"));
            txtView_resultado.setText("");
        }

    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.btn_ponto:
                setExpressao(".", false);
                break;
            case R.id.btn_operador_divisao:
                setExpressao("/", false);
                break;
            case R.id.btn_operador_multiplicacao:
                setExpressao("x", false);
                break;
            case R.id.btn_operador_subtracao:
                setExpressao("-", false);
                break;
            case R.id.btn_operador_adicao:
                setExpressao("+", false);
                break;
            case R.id.btn_num_0:
                setExpressao("0", true);
                break;
            case R.id.btn_num_1:
                setExpressao("1", true);
                break;
            case R.id.btn_num_2:
                setExpressao("2", true);
                break;
            case R.id.btn_num_3:
                setExpressao("3", true);
                break;
            case R.id.btn_num_4:
                setExpressao("4", true);
                break;
            case R.id.btn_num_5:
                setExpressao("5", true);
                break;
            case R.id.btn_num_6:
                setExpressao("6", true);
                break;
            case R.id.btn_num_7:
                setExpressao("7", true);
                break;
            case R.id.btn_num_8:
                setExpressao("8", true);
                break;
            case R.id.btn_num_9:
                setExpressao("9", true);
                break;
        }
    }

}