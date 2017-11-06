# Barcode-Generator
1.Add Dependency

	```java
	allprojects {
			repositories {
				...
				maven { url 'https://jitpack.io' }
			}
		}

	  dependencies {
			compile 'com.github.kapilmhr:Barcode-Generator:1.0'
		}

2. Add to your design Layout
	```xml
    <ImageView
        android:id="@+id/barcode"
        android:layout_width="match_parent"
        android:layout_height="wrap_content"/>

3. Add to your code
	```java
	 ImageView imageView;
	    String barcode = "7761010114033430";
	    Code128 code;

        imageView = (ImageView)findViewById(R.id.barcode);
        code = new Code128(this);
        code.setData(barcode);
        Bitmap bitmap = code.getBitmap(680, 300);
        imageView.setImageBitmap(bitmap);

4. Customization
Change Background color
  a. Hexcolor
  
  
  	```java
      private void drawBarcodeHexBackgroundColor() {
        Bitmap bitmap = code.getBitmap(680, 300,"#4286f4");
        imageView.setImageBitmap(bitmap);
    }

  b. RGB color
  
  	```java
       private void drawBarcodeRGBBackgroundColor() {
        Bitmap bitmap = code.getBitmap(680, 300,66, 134, 244);
        imageView.setImageBitmap(bitmap);
    }

