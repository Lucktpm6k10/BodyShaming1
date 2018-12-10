package com.example.vanluc.bodyshaming.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.vanluc.bodyshaming.Adapter.ConceptAdapter;
import com.example.vanluc.bodyshaming.Model.ConceptBDS;
import com.example.vanluc.bodyshaming.R;

import java.util.ArrayList;

public class FisActivity extends AppCompatActivity {

    ArrayList<ConceptBDS> listConcept;
    RecyclerView rcvFist;
    ConceptAdapter adapter;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fis);
        initView();
        initData();
        initRecyclerview();
    }

    private void initView() {
        rcvFist = findViewById(R.id.rcv_Fist);
        listConcept = new ArrayList<>();
    }
    private void initData() {
        listConcept.add(new ConceptBDS(1,"Lường trước khả năng khi bị “Body Shaming”","  Nếu mọi người thường chú ý đến một bộ phận nào trên cơ thẻ bạn, săm soi “nhận xét” tiêu cực khiếm nhã về nó bạn sẽ dần hình thành phản ứng với lời nhận xét cho bạn.\n" +
                "Ví dụ: nếu mọi người thường nhận xét tiêu cực về cân nặng của bạn, hãy nghĩ ra các câu trả lời bạn có thể sử dụng lần sau khi rơi vào trường hợp ấy. Bằng cách đó, bạn sẽ không bị mất cảnh giác, lúng túng hoang mang, xấu hổ khi bị “Body Shaming”. Bạn có thể nói dõng dạc và tự tin rằng: “Cân nặng của tôi không phải là việc của bạn”, hoặc “Tôi thích tóc của tôi theo cách của nó, cảm ơn bạn đã để ý chúng nhé.”\n"));
        listConcept.add(new ConceptBDS(1,"Gọi tên người đó lên","  Một cách bạn có thể đối phó với “Body Shaming” từ người lạ là chỉ đơn giản gọi tên người đó ra. Bạn không cần phải đưa ra nhận xét thô lỗ, ngay cả khi họ là người lạ, và gọi tên họ ra có thể làm cho bạn cảm thấy tốt hơn về tình hình bởi vì bạn đang nắm quyền kiểm soát.\n" +
                "Ví dụ, nếu ai đó nói, “Bạn có nên đặt hàng món này không? Món này béo lắm bạn chắc thừa nhiều calo lắm rồi?” bạn có thể trả lời: “(Tên người đó), Tôi không đánh giá cao bình luận của bạn về thói quen ăn uống của tôi. Cơ thể của tôi, lựa chọn của tôi.”\n" +
                "Tuy nhiên, nếu người đó có vẻ hung hăng, tốt nhất là nên bỏ qua chúng, đặc biệt nếu bạn đang ở một nơi hẻo lánh (ít người). An toàn nên luôn luôn là trên hết.\n"));
        listConcept.add(new ConceptBDS(1,"Bỏ qua chúng","  Thêm một lựa chọn nữa là hãy bỏ qua những nhận xét thô lỗ. Bạn không cần phải trả lời và trả lời cho người đó như họ muốn xem phản ứng của bạn. Ngoài ra, khi bạn chọn  không trả lời, bạn đang cho người đó cơ hội suy nghĩ về những gì họ nói.\n" +
                "Khi bỏ qua một người, thậm chí không nhìn theo hướng của họ. Giả vờ như bạn thậm chí không nghe thấy những gì họ đang nói, họ sẽ thấy những lời “Body Shaming” của họ không tác động được đến bạn, vô nghĩa nên việc “Body Shaming” sẽ sớm chấm dứt tại đây.\n"));
        listConcept.add(new ConceptBDS(1,"Tránh điều tiêu cực","  Mặc dù không ai có thể cấm ai đó bình luận về cơ thể bạn, nhưng bạn có thể quyết định xem liệu bạn có muốn cho sự tiêu cực của họ đến với bạn hay không. Hãy nhớ rằng, điều tiêu cực thường xuất phát từ người khác nhiều hơn là từ bạn. Vì vậy hãy cố gắng tách mình ra khỏi những bình luận và tiêu cực từ người khác. Nhớ là đừng cho họ biết là bạn hài lòng khi tách ra được khỏi những điều xấu xa đó nhé!"));
        listConcept.add(new ConceptBDS(1,"Đừng khiến mình xấu tính như họ","  Trên internet, nếu bạn phản ứng lại thật gay gắt và tấn công trực diện lại với tư cách cá nhân thì điều này càng lôi kéo sự chú. Và điều đó không giúp bạn giải quyết điều gì cả; nó chỉ khiến bạn xuống đẳng cấp của những người xấu tính như họ mà thôi. Để đáp trả những gì họ nói, không tấn công họ hoặc gọi tên họ lên.\n" +
                "Ví dụ, nếu ai đó nói, “Bạn có một cái mũi xấu xí,” Bạn không nên phản ứng thô lỗ, mất lịch sự. Thay vào đó, bạn có thể nói, “Cảm ơn, tôi thích mũi của tôi. Rất may, ý kiến của tôi về bản thân tôi không phụ thuộc vào ý kiến của bạn về tôi.” Câu nói này sẽ khiến đối phương không đạt được mục đích mà bạn còn thoải mái tâm lý và tự tin hơn.\n"));
        listConcept.add(new ConceptBDS(1,"Cố gắng không tra tấn bản thân bằng cách đọc các bình luận","  Nếu bạn bị “Body Shaming” trực tuyến, bạn có thể sẽ muốn đi sâu vào phần bình luận. Tuy nhiên, nếu bạn đọc và đọc lại những nhận xét đó, bạn sẽ chỉ tự làm tổn thương bản thân. Thay vào đó, cố gắng bỏ qua việc đọc những bình luận bạn biết sẽ kinh khủng từ kinh nghiệm quá khứ. Và nếu bạn bắt gặp một nhận xét tiêu cực, hãy ngừng đọc ngay khi bạn nhận ra đó là sự “Body Shaming”."));
        listConcept.add(new ConceptBDS(1,"Xử lý các tin nhắn riêng tư","  Một số người không thể đưa bạn lên các diễn đàn chung, thay vào đó, họ sẽ sử dụng tin nhắn riêng để “Body Shaming” bạn. Hãy giữ bình tĩnh, yêu cầu người đó ngừng nhắn tin cho bạn. Bạn có thể nói, “Đó là một ý kiến tuyệt vời, nhưng tôi hài lòng với tôi của bây giờ. Việc bạn nhắn tin cho tôi không khiến tôi ngừng yêu bản thân hơn đâu.”\n" +
                "Nếu họ không dừng lại, hãy thử chặn người đó. Bạn có thể chặn mọi người trên hầu hết các nền tảng truyền thông xã hội. Bạn cũng có thể thêm người đó vào danh sách email bị chặn trên tài khoản email của bạn để họ không thể gửi email cho bạn.\n" +
                "Một lựa chọn khác là báo cáo lạm dụng. Hầu hết các trang web sẽ bắt đầu người dùng lạm dụng các thành viên khác của trang web. Điều này sẽ giúp bạn tránh những kẻ “kém duyên rảnh rỗi” tiếp cận vào cuộc đời tươi đẹp của bạn\n"));
        listConcept.add(new ConceptBDS(1,"Đừng nuôi mơ mộng cho những kẻ xấu tính",  "  Không để cho những kẻ xấu tính kia đạt được những gì họ muốn: sự chú ý. Một số người chỉ đang cố gắng khuấy động rắc rối, vì vậy họ hy vọng nhận được phản hồi sự chú ý. Cách tốt nhất để đối phó với những người như thế chỉ đơn giản là bỏ đi, mặc kệ họ. Dĩ nhiên về lâu về dài nếu những “ảo mộng xấu xí” kia không được thực hiện họ sẽ sớm bỏ cuộc thôi."));
        listConcept.add(new ConceptBDS(1,"Chiến đấu với sự tích cực","  Trên internet, việc lan truyền thông tin là điều vô cùng dễ dàng. Nếu sự “Body Shaming” xuất phát từ chính vì sự tự ti của cơ thể bạn thì trước tiên phải giải quyết chướng ngại tâm lý của bạn đã. Cơ thể đó là của bạn, mọi bộ phận cơ thể là của bạn, và bạn yêu quý chúng. Thật may mắn khi nó vẫn lành lặn và vẫn thực hiện được chức năng của nó phải không nào. Hãy biến sự xấu hổ không đáng có đó bằng bức hình thể hiện sự tự tin của mình.\n" +
                "Ví dụ, nếu ai đó nói rằng mái tóc của bạn trông thật nực cười, bạn có thể đăng một bức ảnh thể hiện những gì bạn yêu thích, bao gồm chú thích, chẳng hạn như “Những người khác có thể không yêu thích nó, nhưng tôi nghĩ đó tóc của tôi!”\n" +
                "Trong mọi trường hợp bạn hãy luôn nhìn theo hướng tích cực, những lo lắng sợ hãi, xấu hổ sẽ khiến những “kẻ xấu tính” kia thỏa mãn hơn. Và những lời chê bai kỳ thị người khác chỉ khiến họ “xấu xí” về nhân cách hơn thôi, không việc gì chúng ta phải để ý tới những người như vậy. Luôn tích cực tự tin để tỏa sáng, rèn luyện trau dồi bản thân. Sự thay đổi tích cực lối sống của bạn sẽ là câu đáp trả mạnh mẽ nhất cho những kẻ thích Body Shaming!\n"));

    }
    private void initRecyclerview() {
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rcvFist.setLayoutManager(linearLayoutManager);
        adapter = new ConceptAdapter(listConcept,getApplicationContext());
        rcvFist.setAdapter(adapter);
    }
}
