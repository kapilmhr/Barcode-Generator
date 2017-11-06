package app.frantic.barcodegenerator;

import android.graphics.Bitmap;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ImageView;

import app.frantic.barcode.Code128;

public class MainActivity extends AppCompatActivity {
    ImageView imageView;
    String barcode = "7761010114033430";
    Code128 code;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView)findViewById(R.id.barcode);
        code = new Code128(this);
        code.setData(barcode);

    }

    private void drawBarcode() {
        Bitmap bitmap = code.getBitmap(680, 300);
        imageView.setImageBitmap(bitmap);
    }

    private void drawBarcodeHexBackgroundColor() {
        Bitmap bitmap = code.getBitmap(680, 300,"#4286f4");
        imageView.setImageBitmap(bitmap);
    }
    private void drawBarcodeRGBBackgroundColor() {
        Bitmap bitmap = code.getBitmap(680, 300,66, 134, 244);
        imageView.setImageBitmap(bitmap);
    }
}
