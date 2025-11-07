package com.example.baitap_01;
import android.view.Window;
import android.view.WindowManager;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    // Khai báo View cho CÂU 5 (Đảo chuỗi)
    EditText edtInput;
    TextView txtOutput;
    Button btnProcessChuoi;

    // Khai báo View cho CÂU 4 (Chẵn/Lẻ)
    EditText edtInputSo;
    Button btnProcessSo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // Ẩn thanh tiêu đề của thầy
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        this.getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);


        if (getSupportActionBar() != null) {
            getSupportActionBar().hide();
        }

        // --- Ánh xạ View CÂU 5 (Đảo chuỗi) ---
        edtInput = findViewById(R.id.edtInput);
        txtOutput = findViewById(R.id.txtOutput);
        btnProcessChuoi = findViewById(R.id.btnProcessChuoi);

        // --- Ánh xạ View CÂU 4 (Chẵn/Lẻ) ---
        edtInputSo = findViewById(R.id.edtInputSo);
        btnProcessSo = findViewById(R.id.btnProcessSo);


        // --- Lập trình cho Nút Đảo Chuỗi (Câu 5) ---
        btnProcessChuoi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                // Lấy chuỗi từ EditText
                String s = edtInput.getText().toString(); // Bỏ .trim() để giữ khoảng trắng nếu muốn

                // Kiểm tra chuỗi rỗng
                if (s.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Bạn chưa nhập chuỗi!", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Gọi hàm đảo chuỗi (đã đổi tên)
                String result = daoNguocChuoi(s);

                // Hiển thị kết quả ra TextView và Toast
                txtOutput.setText(result);
                Toast.makeText(MainActivity.this, result, Toast.LENGTH_LONG).show();
            }
        });


        // --- Lập trình cho Nút Chẵn Lẻ (Câu 4) ---
        btnProcessSo.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String s = edtInputSo.getText().toString().trim();

                if (s.isEmpty()) {
                    Toast.makeText(MainActivity.this, "Bạn chưa nhập số!", Toast.LENGTH_SHORT).show();
                    return;
                }

                // Gọi hàm xử lý mảng số từ input
                xuLyMangSoTuInput(s);

                // Thông báo cho người dùng kiểm tra Logcat
                Toast.makeText(MainActivity.this, "Đã xử lý chẵn/lẻ, vui lòng kiểm tra Logcat", Toast.LENGTH_SHORT).show();
            }
        });
    }

    private void xuLyMangSoTuInput(String input) {
        String[] arrSo = input.split(" ");
        Log.d("XULY_MANG", "===== BẮT ĐẦU KIỂM TRA =====");

        for (String s_num : arrSo) {
            try {
                int x = Integer.parseInt(s_num);
                if (x % 2 == 0) {
                    Log.d("CHAN", "Số chẵn: " + x);
                } else {
                    Log.d("LE", "Số lẻ: " + x);
                }
            } catch (NumberFormatException e) {
                Log.w("XULY_MANG", "Bỏ qua giá trị không phải số: '" + s_num + "'");
            }
        }
    }

    private String daoNguocChuoi(String input) {
        // Tách chuỗi bằng khoảng trắng, các dấu câu sẽ đi theo từ
        // Ví dụ: "Hello, world!" -> ["Hello,", "world!"]
        String[] arr = input.split(" ");
        StringBuilder reversed = new StringBuilder();

        for (int i = arr.length - 1; i >= 0; i--) {
            reversed.append(arr[i]).append(" ");
        }

        // Bỏ .toUpperCase() để giữ nguyên bản gốc
        return reversed.toString().trim(); // <--- CHỈ THAY ĐỔI DÒNG NÀY
    }
}