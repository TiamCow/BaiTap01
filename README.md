#BaiTap01
# Baitap01 - Bài tập Android Cơ bản

![Platform](https://img.shields.io/badge/Platform-Android-brightgreen.svg)
![Language](https://img.shields.io/badge/Language-Java%2FKotlin-blue.svg)
![IDE](https://img.shields.io/badge/IDE-Android%20Studio-green.svg)

`Baitap01` là một dự án Android cơ bản nhằm mục đích thực hành các kỹ năng thiết lập môi trường, xây dựng giao diện người dùng (UI) với `Activity`, và xử lý logic sự kiện đơn giản. Dự án này hiển thị thông tin sinh viên và thực hiện hai chức năng: đảo ngược thứ tự từ trong chuỗi và phân loại mảng số chẵn/lẻ.

## 📋 Mục lục

* [Ảnh chụp màn hình](#-ảnh-chụp-màn-hình)
* [Tính năng](#-tính-năng)
* [Yêu cầu kỹ thuật](#-yêu-cầu-kỹ-thuật)
* [Hướng dẫn cài đặt](#-hướng-dẫn-cài-đặt)
* [Tác giả](#-tác-giả)

## 🖼️ Ảnh chụp màn hình

Giao diện chính của ứng dụng, hiển thị thông tin sinh viên và các chức năng.
<img width="484" height="886" alt="image" src="https://github.com/user-attachments/assets/515e859a-eb19-4053-9bbf-85973572b96d" />


## ✨ Tính năng

Dự án này bao gồm một `Activity` duy nhất với các chức năng được yêu cầu sau:

1.  **Thiết kế Giao diện:**
    * Hiển thị thông tin cá nhân (Tên, Lớp, Trường) và avatar của sinh viên.
    * Sử dụng thư viện `de.hdodenhof.circleimageview.CircleImageView` để bo tròn hình ảnh avatar.
    * Ẩn thanh tiêu đề (Action Bar) mặc định của Android để có giao diện toàn màn hình, gọn gàng hơn.

2.  **Đảo ngược chuỗi:**
    * **Đầu vào:** Người dùng nhập một chuỗi ký tự bất kỳ từ `EditText`.
    * **Xử lý:** Khi nhấn nút "Đảo chuỗi", chương trình sẽ đảo ngược thứ tự các **từ** trong chuỗi (ví dụ: "I LOVE YOU" → "YOU LOVE I") và chuyển toàn bộ kết quả sang **chữ IN HOA**.
    * **Đầu ra:** Hiển thị chuỗi kết quả lên `TextView` và một thông báo `Toast`.
<img width="431" height="547" alt="image" src="https://github.com/user-attachments/assets/b0a5d94d-6079-4257-aacc-bb79cf152baa" />

3.  **Kiểm tra Chẵn/Lẻ:**
    * **Đầu vào:** Người dùng nhập một chuỗi các số, cách nhau bằng dấu cách (ví dụ: `1 2 3 4 5 6`).
    * **Xử lý:** Khi nhấn nút "Kiểm tra Chẵn/Lẻ", chương trình phân tích chuỗi, lưu các số vào một `ArrayList<Integer>`, sau đó duyệt mảng để phân loại số chẵn và số lẻ.
    * **Đầu ra:** In danh sách số chẵn và số lẻ riêng biệt ra **Log.d** (trong cửa sổ Logcat của Android Studio).
<img width="432" height="882" alt="image" src="https://github.com/user-attachments/assets/5be423b4-5fa3-4639-b223-e4a41ba97cac" />
<img width="1244" height="164" alt="image" src="https://github.com/user-attachments/assets/25f9f282-e088-485d-9ed1-345384560700" />


## 🛠️ Yêu cầu kỹ thuật

* **IDE:** Android Studio (Bumblebee | 2021.1.1 hoặc mới hơn).
* **Ngôn ngữ:** Java hoặc Kotlin.
* **Thư viện bên ngoài:**
    * `de.hdodenhof.circleimageview:circleimageview:3.1.0` (Dùng để bo tròn ảnh).

## 🚀 Hướng dẫn cài đặt

Làm theo các bước sau để chạy dự án trên máy của bạn.

1.  **Clone Repository**
    ```bash
    git clone [https://your-repository-url.git](https://your-repository-url.git)
    ```
    (Hoặc tải file ZIP và giải nén).

2.  **Mở dự án**
    * Mở Android Studio.
    * Chọn "Open an Existing Project" và trỏ đến thư mục `Baitap01` bạn vừa giải nén.

3.  **Đồng bộ Gradle**
    * Đợi Android Studio đồng bộ (sync) và tải về các thư viện cần thiết.
    * Đảm bảo thư viện `CircleImageView` đã được thêm vào tệp `build.gradle` (Module: app):
        ```groovy
        dependencies {
            // ... các dependencies khác
            implementation 'de.hdodenhof:circleimageview:3.1.0'
        }
        ```

4.  **Chạy ứng dụng**
    * Kết nối thiết bị Android thật (đã bật USB Debugging) hoặc khởi động một máy ảo (Emulator).
    * Nhấn nút **Run 'app'** (▶️) để biên dịch và cài đặt ứng dụng.

## 🧑‍💻 Tác giả

* **Họ và tên:** Cao Đẳng Huy
* **MSSV:**23162028
* **Thông tin:** Sinh viên năm 3
* **Ngành:** An Toàn Thông Tin
* **Trường:** Đại Học Sư Phạm Kỹ Thuật
