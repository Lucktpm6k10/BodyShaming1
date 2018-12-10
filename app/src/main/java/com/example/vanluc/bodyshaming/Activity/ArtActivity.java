package com.example.vanluc.bodyshaming.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;
import android.widget.TabHost;

import com.example.vanluc.bodyshaming.Adapter.ConceptAdapter;
import com.example.vanluc.bodyshaming.Adapter.MovieAdapter;
import com.example.vanluc.bodyshaming.Adapter.MusicAdapter;
import com.example.vanluc.bodyshaming.Model.MovieModel;
import com.example.vanluc.bodyshaming.Model.MusicModel;
import com.example.vanluc.bodyshaming.R;

import java.util.ArrayList;

public class ArtActivity extends AppCompatActivity {
    TabHost tabHost;
    RecyclerView rcvMusic, rcvMovie;
    ArrayList<MovieModel> listMovie = new ArrayList<>();
    ArrayList<MusicModel> listMusic = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_art);

        initView();
        initDataMovie();
        initDataMusic();
        initRecyclerView();
        //initTabhost();

    }



    private void initDataMusic(){
        listMusic.add(new MusicModel("All About That Bass","- Meghan Trainor ","https://www.nhaccuatui.com/bai-hat/all-about-that-bass-megan-nicole-ft-jason-chen.ySUXypKbAiIk.html"));
        listMusic.add(new MusicModel("Beautiful","Christina Aguirela ","https://mp3.zing.vn/bai-hat/Beautiful-Christina-Aguilera/ZWZ9CC98.html"));
        listMusic.add(new MusicModel("Secrets","Mary Lambert",""));
        listMusic.add(new MusicModel("You & I (Nobody In The World"," John Legend","- https://www.nhaccuatui.com/bai-hat/you-i-nobody-in-the-world-john-legend.451Hu9lcoFGY.html"));
        listMusic.add(new MusicModel("Video","India.Arie ","https://www.nhaccuatui.com/bai-hat/video-indiaarie.jteDck3H6Bqg.html"));
        listMusic.add(new MusicModel("Unpretty","TLC","https://www.nhaccuatui.com/bai-hat/unpretty-tlc.sZyAHwghktCA.html"));
        listMusic.add(new MusicModel("Work That","Mary J. Blige ","https://www.nhaccuatui.com/bai-hat/work-that-mary-j-blige.cWVkBrFi8hus.html"));
        listMusic.add(new MusicModel("Ugly","Sugababes","https://www.nhaccuatui.com/bai-hat/ugly-sugababes.ywvJxlGcKo.html"));
        listMusic.add(new MusicModel("Pretty Hurts","Beyoncé","https://www.nhaccuatui.com/bai-hat/pretty-hurts-elastic-heart-try-andywumusicland-mashup-beyonce-ft-sia-ft-the-weeknd-ft-colbie-caillat.QoYHr7lQ1t19.html"));
        listMusic.add(new MusicModel("Who Said ","Selena Gomez","https://www.nhaccuatui.com/bai-hat/who-says-selena-gomez-the-scene.svISi4g1obZw.html"));
        listMusic.add(new MusicModel("Try ","Colbie Caillat","https://www.nhaccuatui.com/bai-hat/try-colbie-caillat.qAkQvt5JEXt7.html"));
        listMusic.add(new MusicModel("Just the Way You Are ","Bruno Mars","https://mp3.zing.vn/bai-hat/Just-The-Way-You-Are-Bruno-Mars/ZW6OC89D.html"));
        listMusic.add(new MusicModel("Play Ugly","Akdong Musician","https://www.nhaccuatui.com/bai-hat/play-ugly-akdong-musician.QqcrZEMbaLU4.html"));
    }

    private void initRecyclerView() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rcvMovie.setLayoutManager(linearLayoutManager);
        MovieAdapter movieAdapter = new MovieAdapter(listMovie, getApplicationContext());
        rcvMovie.setAdapter(movieAdapter);




    }

    private void initDataMovie() {
        listMovie.add(new MovieModel(R.drawable.movie1, "Time – Thời gian", "Yêu nhau 2 năm nhưng lo sợ bản thân sẽ không đẹp, không đủ hấp dẫn người yêu, Seh Hee (Park Ji Yun) đã tìm đến dao kéo để cải thiện ngoại hình. Tuy nhiên, định mệnh trớ trêu, dù có cố gắng bao nhiêu, thì Seh Hee với một vẻ ngoài long lanh hơn vẫn không thể thay thế Seh Hee trong quá khứ mà bạn trai cô từng yêu. Câu chuyện ngày càng tồi tệ hơn, khi bạn trai của Seh Hee cũng quyết định dùng đến dao kéo nhằm mục đích trả thù bạn gái. Lạm dụng phẫu thuật thẩm mỹ, tình yêu của cả hai đã trở thành bi kịch.\n" +
                "Nhận được nhiều phản ứng tốt từ phía khán giả, “Thời gian” là lời cảnh tỉnh đến những ai đang muốn lạm dụng dao kéo một cách quá đà.\n", "http://www.phimmoi.net/phim/thoi-gian-con-lai-7039/"));
        listMovie.add(new MovieModel(R.drawable.movie2, "My Id Is Gangnam Beauty – Người đẹp Gangnam", "Đề cập đến vấn đề phẫu thuật thẩm mỹ, bộ phim cũng đã lên án một thực trạng hết sức mâu thuẫn của Hàn Quốc: Coi trọng cái đẹp, dè bỉu kẻ xấu xí nhưng lại phê phán cái đẹp nhân tạo. Chính thực trạng này cũng đã đẩy nhiều con người đến bước đường cùng, để rồi buộc họ phải đánh mất cả bản chất của chính mình.", "http://www.phimmoi.net/phim/nguoi-dep-gangnam-i1-7266/"));
        listMovie.add(new MovieModel(R.drawable.movie3, "Lời Nguyền Giảm Cân - Thinner 1996 ", "  là bộ phim về giảm cân kể về câu chuyện về một luật sư béo phì đang nỗ lực giảm cân vì thân hình \"quá khổ\".\n" +
                "Nhưng chính vì điều này nên ông đã vướng vào lời nguyền của một mụ già tinh quái. Thế rồi ông cứ giảm cân dần…dần…dần…trong hoang mang... \n", "http://phimnhanh.com/phim/loi-nguyen-giam-can-thinner-1996-vietsub-1996"));
        listMovie.add(new MovieModel(R.drawable.movie4, "Bridget Jones's Diary - Nhật ký tiểu thư Jones ", "  bộ phim được xây dựng dựa trên tiểu thuyết cùng tên của nhà văn Helen Fielding. Phim kể về cuộc đời của nhân vật cô tiểu Jones (Reneé Zellweger) đã ngoài 30 tuổi, độc thân, có dáng vẻ mập mạp, vụng về nhưng lại rất đáng yêu, hồn nhiên và thường viết lại nhất ký để nói lên những nỗi băn khoăn trong lòng về tình yêu và cuộc sống. Chính vì thế mà Jones đã khiến cho bao cô gái phải ghen tị khi cô đã chiếm được tình yêu của cả hai quý ông Anh Quốc hào hoa: Mark Darcy (Colin Firth) - một luật sư trầm tĩnh, nghiêm túc - và Daniel Cleaver (Hugh Grant) - một ông sếp đẹp trai lăng nhăng. Cả hai người đàn ông này cùng thích Jones ở những khía cạnh khác nhau của cô.Năm 2001, khi Bridget Jones's Diary ra rạp đã trở thành một trong số những tác phẩm lãng mạn gây sốt đầu thế kỷ.", "http://www.phimmoi.net/phim/nhat-ky-tieu-thu-jones-4145/"));
        listMovie.add(new MovieModel(R.drawable.movie5, "The Fat Boy Chronicles", "Một cậu bé 14 tuổi mập mạp đang cố gắng hết sức mình để có được thân hình cân đối hơn và gây ấn tượng với các bạn cùng lớp. Cậu ấy luôn phải đối mặt với sự bắt nạt không ngừng nghỉ ở trường học do thân hình quá khổ và trông có vẻ ngu ngốc của cậu ấy. Bộ phim được lấy ý tưởng từ những câu chuyện bạo lực học đường có thật xảy ra ở Mỹ. Jimmy chỉ cao năm thước, thế nhưng cậu ấy nặng 187 cân Anh, và mỗi ngày đến trường là mỗi ngày cậu ấy bị đem ra trêu chọc. Cậu ta thậm chí liên tục bị những bạn học cùng độc ác của mình đánh đập, và không có đủ năng lượng để tham gia các môn thể thao của trường. Nhưng khi Jimmy gặp một người bạn rất tâm huyết của anh ấy ở lớp, vì muốn gây ấn tượng với cô ấy anh ta quyết định rằng đã đến lúc cần thay đổi để cải thiện cuộc sống của mình.", "null"));
        listMovie.add(new MovieModel(R.drawable.movie6, "Tiến Sĩ Điên", "Giáo sư Sherman Klump là người tài giỏi nhưng phải tội lại rất béo do di truyền. Sherman mặc cảm vì sự quá khổ luôn tạo rắc rối cho anh, nhất là trong tình yêu. Dù cố gắng ăn kiêng, tập thể dục, nhưng Sherman vẫn không thành công. Quyết tâm giảm cân cho bằng được, anh lao vào nghiên cứu công thức giảm béo. Sau nhiều lần thử nghiệm trên chuột bạch, Sherman lấy bản thân mình làm vật thí nghiệm và kết quả thành công mỹ mãn. Tuy nhiên, trạng thái sụt cân lại chỉ tồn tại trong thời gian ngắn. Thế là mỗi lần hẹn hò với cô đồng nghiệp trẻ đẹp Carla Purty, Sherman lại phải dùng thuốc. Nhưng liệu anh có trốn tránh được điều đó mãi mãi?", "https://khoai.tv/xemphim/the-nutty-professor-tien-si-dien-4287"));
        listMovie.add(new MovieModel(R.drawable.movie7, "Shallow Hal ", "Mô tả: Hal Larson là cậu trai sắp bước sang tuổi băm nhưng vẫn say đắm những cô gái có thân hình nóng bỏng và chẳng bao giờ thèm để ý tới những cô nàng mũm mĩm. Đến một ngày Hal đắm chìm vẻ đẹp và thân hình nóng bỏng của một nữ huấn luyện viên thể dục Rosemary, mà không biết rằng đó là kế hoạch của anh bạn thân giúp Hal nhận ra sự nông cạn trong suy nghĩ và tìm ra vẻ đẹp nội tâm của những người phụ nữ. Bộ phim hài lãng mạn có sự tham gia diễn xuất của ngôi sao Jack Black và cô đào xinh đẹo Gwyneth Paltrow...", "http://xemphim24h.net/play-movie/yeu-phai-nang-beo-film361665"));
        listMovie.add(new MovieModel(R.drawable.movie8, "Cô nàng xinh đẹp - She Was Pretty", "  Phim Cô nàng xinh đẹp - She Was Pretty là bộ phim truyền hình lãng mạn kể về cuộc gặp gỡ giữa hai người bạn thủa nhỏ gặp lại nhau sau nhiều năm. Những biến cố của cuộc đời khiến họ thay đổi và khác xa với vẻ ngoài trước kia. Nếu như cậu nhóc béo ú ngày nào giờ trở thành một anh chàng thành đạt và điển trai thì cô bé đáng yêu xinh đẹp trước kia bỗng chốc trở thành một cô nàng xấu xí. Nhưng cô vẫn luôn là một cô gái năng động, bề ngoài lạc quan, nhiệt tình. Cuối cùng cô cũng tìm được tình yêu đích thực và niềm tin vào ngoại hình của mình.", "http://www.phimmoi.net/phim/xua-roi-em-3103/"));

    }

    private void initView() {
        /*tabHost = findViewById(R.id.tabHost);
        rcvMovie = findViewById(R.id.rcv_Movie);
        rcvMusic = findViewById(R.id.rcv_Music);*/
        rcvMovie = findViewById(R.id.rcv_MovieTab);
    }
}
