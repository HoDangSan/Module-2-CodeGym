<!-- <%--
  Created by IntelliJ IDEA.
  User: SanArima
  Date: 16-Jul-19
  Time: 14:10
  To change this template use File | Settings | File Templates.
--%>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
-->
<!doctype html>
<html lang="en">

<head>
    <title>Trang tin tức</title>
    <!-- Required meta tags -->
    <meta charset="utf-8">
    <meta name="viewport" content="width=device-width, initial-scale=1, shrink-to-fit=no">

    <!-- Bootstrap CSS -->
    <link rel="stylesheet" href="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/css/bootstrap.min.css" integrity="sha384-ggOyR0iXCbMQv3Xipma34MD+dH/1fQ784/j6cY/iJTQUOhcWr7x9JvoRxT2MZw1T" crossorigin="anonymous">
    <link href="<c:url value=" /resources/css/style.css " />" rel="stylesheet">

</head>

<body>
    <header>
        <div id="demo" class="carousel slide" data-ride="carousel">
            <!-- Indicators -->
            <ul class="carousel-indicators">
                <li data-target="#demo" data-slide-to="0" class="active"></li>
                <li data-target="#demo" data-slide-to="1"></li>
                <li data-target="#demo" data-slide-to="2"></li>
            </ul>
            <!-- The slideshow -->
            <div class="carousel-inner" style="height: 600px">
                <div class="carousel-item active">
                    <img src="https://www.flc.vn/wp-content/uploads/2019/02/3_1200.jpg" alt="Los Angeles" width="100%">
                </div>
                <div class="carousel-item">
                    <img src="https://photo-1-baomoi.zadn.vn/w1000_r1/2019_05_30_23_30908187/766794a198e171bf28f0.jpg" alt="Chicago" width="100%">
                </div>
                <div class="carousel-item">
                    <img src="http://image.sggp.org.vn/w1200/Uploaded/2019/dudbexqdre/2018_11_24/bao_ssli.jpg" alt="New York" width="100%">
                </div>
            </div>

            <!-- Left and right controls -->
            <a class="carousel-control-prev" href="#demo" data-slide="prev">
                <span class="carousel-control-prev-icon"></span>
            </a>
            <a class="carousel-control-next" href="#demo" data-slide="next">
                <span class="carousel-control-next-icon"></span>
            </a>
        </div>
    </header>
    <div class="container-fluid p-5">
        <nav class="navbar navbar-expand-lg navbar-light bg-light position-fixed fixed-top">
            <button class="navbar-toggler" type="button" data-toggle="collapse" data-target="#navbarTogglerDemo01" aria-controls="navbarTogglerDemo01" aria-expanded="false" aria-label="Toggle navigation">
            <span class="navbar-toggler-icon"></span>
        </button>
            <div class="collapse navbar-collapse" id="navbarTogglerDemo01">
                <a class="navbar-brand" href="#">San Arima</a>
                <ul class="navbar-nav mr-auto mt-2 mt-lg-0">
                    <li class="nav-item active">
                        <a class="nav-link" href="#">Trang chủ</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Chính trị-xã hội</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Quân sự</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Công nghệ</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Thể thao</a>
                    </li>
                    <li class="nav-item">
                        <a class="nav-link" href="#">Giáo dục</a>
                    </li>
                </ul>
                <form class="form-inline my-2 my-lg-0">
                    <input class="form-control mr-sm-2" type="search" placeholder="Search" aria-label="Search">
                    <button class="btn btn-outline-success my-2 my-sm-0" type="submit">Search</button>
                </form>
            </div>
        </nav>
        <div class="row">
            <article class="col-md-3">
                <h3 style="color: rgb(194, 26, 26)">Tin tức nổi bật</h3>
                <div>
                    <img src="https://image.anninhthudo.vn/150x100/Uploaded/141/2019_07_16/1.jpg" alt="" width="260px"> <br>
                    <em>Nổ cực lớn ở nhà máy chế tạo vũ khí hàng đầu Israel</em>
                </div>
                <div>
                    <img src="https://image.anninhthudo.vn/150x100/Uploaded/206/2019_07_16/asylum.jpg" alt="" width="260px">
                    <br>
                    <em>Dòng người Trung Mỹ nhập cư sắp bị chặn bởi quyết định của Tổng thống Trump</em>
                </div>
                <div>
                    <img src="https://image.anninhthudo.vn/150x100/Uploaded/130/2019_07_16/102653078e0fb1fc4-c5e4-4dd7-a81d-4cbfc9561864.jpg" alt="" width="260px"> <br>
                    <em>Anh khẳng định vẫn còn cơ hội cứu vãn thỏa thuận hạt nhân Iran</em>
                </div>
                <div>
                    <img src="https://image.anninhthudo.vn/140x92/Uploaded/69/2019_07_15/ttdt_thumb.jpg" alt="" width="260px"> <br>
                    <em>Triển khai giải pháp xử lý các "điểm nóng" giao thông, đô thị</em>
                </div>
            </article>
            <aside class="col-md-9 bg-warring">
                <h2>Dấu ấn 4 Tổng thống Mỹ với 5 lần thăm Việt Nam</h2>
                <br>
                <div class="clearfix cms-body">
                    <p><b>ANTD.VN - Theo lịch trình, Tổng thống Mỹ Donald Trump đến Việt Nam tham dự Hội nghị Thượng đỉnh Mỹ
                    - Triều Tiên lần thứ hai diễn ra trong 2 ngày 27 và 28-2. Như vậy, đến nay đã có 4 Tổng thống Mỹ với
                    5 lần thăm Việt Nam và mỗi chuyến thăm đều có những mục đích cũng như dấu ấn riêng.</b></p>
                    <br>
                    <p style="text-align: center;"><img class="center-img cms-photo" src="https://image.anninhthudo.vn/w700/uploaded/170/2019_02_26/bill-clinton-2000.jpg" alt="ảnh 1" data-photo-original-src="https://image.anninhthudo.vn/uploaded/170/2019_02_26/bill-clinton-2000.jpg"
                            data-desc="Cựu Tổng thống Bill Clinton, người tuyên bố dỡ bỏ lệnh cấm vận Việt Nam và thực hiện chuyến thăm lịch sử Hà Nội năm 2000" cms-photo-caption="Cựu Tổng thống Bill Clinton, người tuyên bố dỡ bỏ lệnh cấm vận Việt Nam và thực hiện chuyến thăm lịch sử Hà Nội năm 2000"><br><em>Cựu
                    Tổng thống Bill Clinton, người tuyên bố dỡ bỏ lệnh cấm vận Việt Nam và thực hiện chuyến thăm lịch sử
                    Hà Nội năm 2000</em></p>
                    <p><strong>Tháng 11-2000: Tổng thống Bill Clinton với chuyến đi “phá băng”</strong></p>
                    <p>Từ ngày 16 đến 19-11-2000, ông Bill Clinton là Tổng thống Mỹ đầu tiên tới Việt Nam, 25 năm sau khi chiến tranh kết thúc. Đây là chuyến thăm lịch sử, nhằm làm chuyển biến quan hệ giữa Mỹ với Việt Nam sau chiến tranh. Chính Tổng thống
                        Bill Clinton là người đã quyết định bỏ cấm vận, tiến tới bình thường hóa quan hệ hai nước năm 1995 và ký Hiệp định thương mại song phương.&nbsp;</p>
                    <p>Hình ảnh đọng lại trong chuyến đi này là khi ông Clinton tới thăm Văn Miếu - Quốc Tử Giám, trò chuyện với các sinh viên Đại học Quốc gia Hà Nội. Gia đình Tổng thống Bill Clinton còn tới vùng nông thôn Việt Nam để theo dõi các dự án
                        tín dụng vi mô, cung cấp các khoản vay nhỏ để giúp phụ nữ nông thôn thoát nghèo. Ở đó, cựu Đệ nhất phu nhân Mỹ Hillary Clinton và con gái Chelsea đã rất thích thú khi đội chiếc nón lá truyền thống của Việt Nam.</p>
                    <p>Hãng Thông tấn AP (Mỹ) nhận định, chuyến đi lịch sử này giúp hàn gắn những vết thương, nghi ngờ do chiến tranh để lại; giúp hai bên phát triển, đẩy mạnh quan hệ song phương trên nhiều lĩnh vực. Chẳng hạn, theo số liệu Tổng cục Thống
                        kê Việt Nam, năm 1995, thương mại giữa hai nước chỉ 200 triệu USD. Năm 2015, con số ấy lên tới 43,5 tỷ USD. Đặc biệt, từ năm 2005, Mỹ đã trở thành thị trường xuất khẩu lớn nhất của Việt Nam.</p>
                    <p>Nhiều nhà nghiên cứu về chiến lược ngoại giao cho rằng, quan hệ Việt Nam - Mỹ chắc chắn sẽ không phát triển, gần gũi, thân thiện như hôm nay nếu như Tổng thống Mỹ Bill Clinton không dám mạnh dạn bỏ lệnh cấm vận, thiết lập quan hệ ngoại
                        giao với Việt Nam hơn 20 năm trước. Là người đóng góp quan trọng vào quá trình bình thường hóa quan hệ Việt Nam - Mỹ, ông Bill Clinton còn tiếp tục sang thăm Việt Nam nhiều lần sau.&nbsp;</p>
                    <p style="text-align: center;"><img class="center-img cms-photo" src="https://image.anninhthudo.vn/w700/uploaded/170/2019_02_26/bush-2006.jpg" alt="ảnh 2" data-photo-original-src="https://image.anninhthudo.vn/uploaded/170/2019_02_26/bush-2006.jpg" data-desc="Tổng thống Mỹ George W. Bush cùng Thủ tướng Australia John Howard được người dân TP.HCM chào đón trong chuyến thăm tháng 11-2016"
                            cms-photo-caption="Tổng thống Mỹ George W. Bush cùng Thủ tướng Australia John Howard được người dân TP.HCM chào đón trong chuyến thăm tháng 11-2016"><br><em>Tổng
                    thống Mỹ George W. Bush cùng Thủ tướng Australia John Howard được người dân TP.HCM chào đón trong
                    chuyến thăm tháng 11-2016</em></p>
                    <p><strong>Tháng 11-2006: Tổng thống George W. Bush đến Việt Nam dự Hội nghị APEC</strong></p>
                    <p>So với chuyến thăm của ông Bill Clinton năm 2000, chuyến đi của Tổng thống George W. Bush đến Việt Nam được đánh giá là ít quan trọng, ý nghĩa hơn do ông Bush đến để tham dự Hội nghị Cấp cao Diễn đàn Hợp tác kinh tế châu Á - Thái Bình
                        Dương APEC tại Việt Nam. Tuy nhiên, bản thân ông George W. Bush khi trả lời phỏng vấn báo chí cũng nói ông thực sự ngạc nhiên và lấy làm thú vị về sự cởi mở, thân thiện, trẻ trung, năng động mà ông chứng kiến trong những ngày ở
                        Việt Nam.&nbsp;</p>
                    <p>Có thể so với Tổng thống Bill Clinton, ông Bush không có tác động nhiều lên quan hệ Mỹ - Việt Nam nhưng ông cũng đóng một vai trò quan trọng trong việc giúp Việt Nam gia nhập Tổ chức Thương mại Thế giới năm đó.</p>
                    <p style="text-align: center;"><img class="center-img cms-photo" src="https://image.anninhthudo.vn/w700/uploaded/170/2019_02_26/obama-2016.jpg" alt="ảnh 3" data-photo-original-src="https://image.anninhthudo.vn/uploaded/170/2019_02_26/obama-2016.jpg" data-desc="Tổng thống Mỹ Barack Obama được người dân Hà Nội nồng nhiệt chào đón vào tháng 5-2016"
                            cms-photo-caption="Tổng thống Mỹ Barack Obama được người dân Hà Nội nồng nhiệt chào đón vào tháng 5-2016"><br><em>Tổng
                    thống Mỹ Barack Obama được người dân Hà Nội nồng nhiệt chào đón vào tháng 5-2016</em></p>
                    <p><strong>Tháng 5-2016: “Chuyến công du vì tương lai” của Tổng thống Barack Obama&nbsp;</strong></p>
                    <p>Ông Barack Obama là Tổng thống Mỹ thứ 3 liên tiếp thăm Việt Nam khi còn đương nhiệm. Chuyến thăm của Tổng thống Barack Obama tới Việt Nam từ ngày 23 tới 25-5-2016 được coi là “chuyến công du vì tương lai”. Báo chí Mỹ nhận định, chuyến
                        thăm này không chỉ giúp Washington củng cố chính sách xoay trục sang châu Á mà còn là cơ hội để thắt chặt mối quan hệ về an ninh, kinh tế với một đối tác.</p>
                    <p>Theo phân tích của tờ Washington Times, thời điểm đó, Việt Nam và Mỹ ngày càng chia sẻ lợi ích chiến lược và có thể điều chỉnh mối quan hệ hợp tác an ninh để đảm bảo lợi ích chung. Hơn nữa, chuyến thăm Việt Nam lần này là cơ hội cuối
                        cùng để ông Barack Obama đưa ra các ưu tiên thảo luận vốn bị trì hoãn từ lâu, đó là sự thay đổi trọng tâm của Mỹ từ khu vực Trung Đông bất ổn sang khu vực có nền kinh tế năng động nhất thế giới, đồng thời cũng là một trong những
                        vũ đài chính trị tới đây cho các siêu cường cạnh tranh quyền lực.&nbsp;&nbsp;</p>
                    <p>Có thể nói, Tổng thống Barack Obama đã tạo ra một “cơn sốt” ở Việt Nam khi ông tới thăm Hà Nội và TP.HCM. Ấn tượng nhất trong chuyến thăm này của ông Barack Obama là bài diễn văn với những cam kết mạnh mẽ tại Trung tâm Hội nghị Quốc
                        gia tại Hà Nội vào buổi trưa 24-5: “Để đối thoại với nhau, cả hai bên (Việt Nam - Mỹ) đều cùng phải thay đổi... Với khung quan hệ Đối tác toàn diện, hai nước chưa bao giờ gần nhau hơn thế... Nước Mỹ có lợi ích khi Việt Nam thành
                        công. Mối quan hệ Việt Nam - Mỹ sẽ giúp định hình quan hệ quốc tế”.</p>
                    <p>Điểm nhấn của chuyến thăm này là việc Mỹ gỡ bỏ hoàn toàn cấm vận vũ khí với Việt Nam, thiết lập hoạt động của Đoàn Hòa Bình (Peace Corps) và đặc biệt là sự đón tiếp nồng hậu của nhân dân Việt Nam, đây là nền tảng vững chắc để phát
                        triển quan hệ trong tương lai.</p>
                    <p style="text-align: center;"><img class="center-img cms-photo" src="https://image.anninhthudo.vn/w700/uploaded/170/2019_02_26/trump-20171.jpg" alt="ảnh 4" data-photo-original-src="https://image.anninhthudo.vn/uploaded/170/2019_02_26/trump-20171.jpg" data-desc="Tổng thống Mỹ Donald Trump thăm chính thức Việt Nam hồi tháng 11-2017"
                            cms-photo-caption="Tổng thống Mỹ Donald Trump thăm chính thức Việt Nam hồi tháng 11-2017"><br><em>Tổng
                    thống Mỹ Donald Trump thăm chính thức Việt Nam hồi tháng 11-2017</em></p>
                    <p><strong>Tháng 11-2017: Bất ngờ từ chuyến thăm của Tổng thống Donald Trump&nbsp;</strong><br>
                    </p>
                    <p>Nói là bất ngờ vì Tổng thống Donald Trump không chỉ tham dự Hội nghị Cấp cao của các lãnh đạo nền kinh tế APEC tại Đà Nẵng, mà còn ra Hà Nội để thăm chính thức Việt Nam. Cần phải nhấn mạnh rằng, Việt Nam là quốc gia Đông Nam Á đầu
                        tiên mà Tổng thống Donald Trump đến thăm ngay trong năm đầu tiên của nhiệm kỳ. Việc Tổng thống Mỹ đến thăm Việt Nam ngay từ rất sớm một mặt thể hiện sự coi trọng của Mỹ với mối quan hệ với Việt Nam, mặt khác, sẽ thuận lợi hơn trong
                        việc triển khai những thỏa thuận mà 2 bên đã đạt được trong những năm còn lại.&nbsp;</p>
                    <p>Trong 3 bài phát biểu của mình tại Việt Nam, Tổng thống Mỹ Donald Trump thể hiện sự ấn tượng với Việt Nam, cũng như thiện chí xây dựng mối quan hệ tại Ấn Độ - Thái Bình Dương. Điều đó cho thấy, nhà lãnh đạo Mỹ vẫn muốn Việt Nam đóng
                        vai trò quan trọng trong cán cân lực lượng châu Á, muốn tiếp tục làm sâu sắc quan hệ vì lợi ích nhân dân hai nước và lợi ích khu vực.</p>
                    <p><strong>Tháng 2-2019: Hội nghị Thượng đỉnh giữa Tổng thống Mỹ Donald Trump và Chủ tịch Triều Tiên Kim
                    Jong-un tại Hà Nội</strong></p>
                    <p>Tổng thống Mỹ Donald Trump và Chủ tịch Triều Tiên Kim Jong-un sẽ gặp nhau tại Hà Nội vào ngày 27 và 28-2, chỉ 8 tháng sau Hội nghị Thượng đỉnh lịch sử tại Singapore hồi tháng 6-2018. Tại cuộc gặp lần này, hai nhà lãnh đạo dự kiến sẽ
                        thảo luận về các vấn đề liên quan đến Chiến tranh Triều Tiên, phi hạt nhân hóa, nới lỏng các lệnh trừng phạt và hỗ trợ kinh tế…</p>
                    <p>Được biết, Việt Nam - Hà Nội chính là địa điểm được hai bên Mỹ và Triều Tiên cùng đề nghị tổ chức cuộc gặp thượng đỉnh lần thứ hai. Trước chuyến thăm, Tổng thống Donald Trump đăng tải trên Twitter: “Tôi sẽ khởi hành tới Hà Nội, Việt
                        Nam, vào ngày mai để tham dự Hội nghị Thượng đỉnh với ông Kim Jong-un của Triều Tiên, nơi cả hai chúng tôi đều mong đợi tiếp tục tiến trình tại Hội nghị Thượng đỉnh đầu tiên ở Singapore. Phi hạt nhân hóa?”.</p>
                    <p>Cuộc gặp giữa Tổng thống Mỹ Donald Trump và Chủ tịch Triều Tiên Kim Jong-un tại Hà Nội được kỳ vọng sẽ chấm dứt cuộc chiến kéo dài gần 70 năm qua, tạo ra một cột mốc mới cho việc phi hạt nhân hóa hoàn toàn của Triều Tiên và hòa bình
                        vĩnh viễn trên bán đảo Triều Tiên.</p>

                </div>
            </aside>
        </div>
    </div>

    <div class="floating-chat">
        <i class="fa fa-comments" aria-hidden="true"></i>
        <div class="chat">
            <div class="header">
                <span class="title">
                what's on your mind?
            </span>
                <button>
                <i class="fa fa-times" aria-hidden="true"></i>
            </button>

            </div>
            <ul class="messages">
                <li class="other">asdasdasasdasdasasdasdasasdasdasasdasdasasdasdasasdasdas</li>
                <li class="other">Are we dogs??? 🐶</li>
                <li class="self">no... we're human</li>
                <li class="other">are you sure???</li>
                <li class="self">yes.... -___-</li>
                <li class="other">if we're not dogs.... we might be monkeys 🐵</li>
                <li class="self">i hate you</li>
                <li class="other">don't be so negative! here's a banana 🍌</li>
                <li class="self">......... -___-</li>
            </ul>
            <div class="footer">
                <div class="text-box" contenteditable="true" disabled="true"></div>
                <button id="sendMessage">send</button>
            </div>
        </div>
    </div>

    <footer class="container-fluid page-footer font-small blue bg-light">
        <!-- Copyright -->
        <div class="footer-copyright text-center py-3">© 2019 Copyright:
            <a href="https://mdbootstrap.com/education/bootstrap/"> sanarimablog.com</a>

        </div>
        <!-- Copyright -->
    </footer>
    <!-- Footer -->
    <!-- Optional JavaScript -->
    <!-- jQuery first, then Popper.js, then Bootstrap JS -->
    <script src="https://code.jquery.com/jquery-3.3.1.slim.min.js" integrity="sha384-q8i/X+965DzO0rT7abK41JStQIAqVgRVzpbzo5smXKp4YfRvH+8abtTE1Pi6jizo" crossorigin="anonymous"></script>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/popper.js/1.14.7/umd/popper.min.js" integrity="sha384-UO2eT0CpHqdSJQ6hJty5KVphtPhzWj9WO1clHTMGa3JDZwrnQq4sF86dIHNDz0W1" crossorigin="anonymous"></script>
    <script src="https://stackpath.bootstrapcdn.com/bootstrap/4.3.1/js/bootstrap.min.js" integrity="sha384-JjSmVgyd0p3pXB1rRibZUAYoIIy6OrQ6VrjIEaFf/nJGzIxFDsf4x0xIM+B07jRM" crossorigin="anonymous"></script>
    <script src="<c:url value=" /resources/js/script.js " />"></script>
</body>

</html>