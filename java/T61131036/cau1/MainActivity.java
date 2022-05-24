package T61131036.cau1;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    //khai báo sẵn các đối tượng sẽ làm việc
    EditText editSoA, editSoB, editSoH;
    TextView textViewKetQua;
    Button nutChuvi, nutDientich;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TimWidget();
    }

    void TimWidget(){
        editSoA= (EditText)findViewById(R.id.edSoA);
        editSoB= (EditText)findViewById(R.id.edSoB);
        editSoH= (EditText)findViewById(R.id.edSoH);
        textViewKetQua= (TextView)findViewById(R.id.tvKetQua);
        nutChuvi= (Button) findViewById(R.id.btnChuvi);
        nutDientich= (Button) findViewById(R.id.btnDientich);
    }
    //hàm xử lý
    public void XuLyChuvi(View v){
        // Lấy dữ liệu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        //Chuyển sang kiểu số
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        //Tính chuvi
        int C = 2*(a+b);
        //Chuyển đáp số thành chuỗi
        String chuoiC = String.valueOf(C);
        // Xuất kết quả
        textViewKetQua.setText("=" + chuoiC);
    }

    public void XuLyDientich(View v){
        // Lấy dữ liệu
        String sA = editSoA.getText().toString();
        String sB = editSoB.getText().toString();
        String sH = editSoH.getText().toString();
        //Chuyển sang kiểu số
        int a = Integer.parseInt(sA);
        int b = Integer.parseInt(sB);
        int h = Integer.parseInt(sH);
        //Tính Diện tích
        int S =a*h;
        //Chuyển đáp số thành chuỗi
        String chuoiS = String.valueOf(S);
        // Xuất kết quả
        textViewKetQua.setText("=" + chuoiS);
    }

}