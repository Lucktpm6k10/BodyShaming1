package com.example.vanluc.bodyshaming.Activity;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.vanluc.bodyshaming.Adapter.ConceptAdapter;
import com.example.vanluc.bodyshaming.Model.ConceptBDS;
import com.example.vanluc.bodyshaming.R;
import com.example.vanluc.bodyshaming.Ultil.InterfaceConcept;

import java.util.ArrayList;

public class TotalActivity extends AppCompatActivity {

    ArrayList<ConceptBDS> listConcept;
    RecyclerView rcvConcept;
    ConceptAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_total);
        initView();
        initData();
        initRecyclerview();
    }

    private void initRecyclerview() {

        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        rcvConcept.setLayoutManager(linearLayoutManager);
        adapter = new ConceptAdapter(listConcept,getApplicationContext());
        rcvConcept.setAdapter(adapter);
    }

    private void initData() {
        listConcept.add(new ConceptBDS(1,"Body shaming là gì?"," Theo từ điển Macmillan, Body-shaming là hành động chỉ trích người khác, thường dựa vào việc người đó quá béo hoặc gầy. (Một dạng phổ biến của body-shaming là fat-shaming, là hành động chỉ trích một người vì họ quá nặng cân). Những câu nói như “con đó thật béo ú”, “anh kia gầy gò như thằng nghiện” có thể coi là những ví dụ cho hành vi này. \n" +
                "Body shaming (miệt thị hình thể, miệt thị ngoại hình) chính là việc sử dụng những lời lẽ và hành động mang tính chê bai, lăng mạ và giễu cợt về ngoại hình của bản thân hay người khác, làm cho người bị miệt thị hình thể (body-shamed) cảm thấy bị xúc phạm và hình thành những cảm xúc tiêu cực.\n" +
                "Body-shaming có thể gồm nhiều hành vi khác nhau, bao gồm sự tự phê phán về hình thể của mình, phê phán hình thể của người khác gián tiếp hoặc trực tiếp trước họ. Như vậy, body-shaming có thể là chủ quan và khách quan. \n" +
                "Có nhiều loại miệt thị cơ thể: miệt thị thân hình, miệt thị làn da, miệt thị màu da, miệt thị phẫu thuật thẩm mỹ… Tất cả những loại body shaming trên có thể được biểu thị qua lời nói trực tiếp hoặc nói xấu sau lưng. Nhưng phổ biến nhất hiện nay chính là miệt thị ngoại hình qua mạng xã hội.\n" +
                "Xét theo những ảnh hưởng mà body shaiming gây ra, có thể khẳng định body shaming cũng là một dạng bạo lực – đó là bạo lực tâm lí, gây ảnh hưởng trầm trọng đến tâm lí các nạn nhân của nó.\n"));
        listConcept.add(new ConceptBDS(1,"Các biểu hiện của Body shaming ?","“ Body shaming” được biểu hiện dưới 2 hình thức đơn giản mà chúng ta thường hay bỏ qua hoặc cho rằng là bình thường: Tự miệt thị ngoại hình mình và so sánh mình với người khác; miệt thị ngoại hình người khác trước mặt họ hay đánh giá người khác sau lưng họ \n" +
                "1. Miệt thị ngoại hình người khác\n" +
                "- Hình thức: ngôn ngữ nói hoặc ngôn ngữ viết để miệt thị, chê bai ngoại hình người khác khiến họ cảm thấy khó chịu hay bị xúc phạm.\n" +
                "- Biểu hiện:\n" +
                "+ Chỉ trích ngoại hình người khác trước mặt họ\n" +
                "+ Đánh giá người khác sau lưng họ: Đó có thể là những lời nói xấu sau lưng và nói ẩn ý mà nạn nhân body shaming nghe được hoặc Dùng điện thoại/internet đưa tin nói xấu, châm biếm, bằng những lời lẽ không tốt đẹp hoặc từ ngữ mang tính xúc phạm về ngoại hình người khác, công kích thông qua mạng xã hội, tin nhắn, cái bài viết hay bình luận ác ý.\n" +
                "2. Tự miệt thị ngoại hình chính mình\n" +
                "Chúng ta vừa đề cập về vấn nạn body-shaming ở góc độ từ bên ngoài nhìn vào, thế nhưng nó còn được biều hiện ở việc nạn nhân body shaming tự miệt thị ngoại hình chính mình dù trực tiếp hay gián tiếp với các biểu hiện như sau:\n" +
                "- Tự đánh giá thấp về ngoại hình bản thân: “:sao mình mập thế?” hay “chân mình sao đen như vậy”\n" +
                "- Ước muốn cơ thể mình thay đổi: \"Ước gì mình mập lên một xíu/gầy hơn một xíu, diện đồ sẽ đẹp lắm đây.\" \n" +
                "- Cảm giác bất an giữa đám đông: Mỗi lần người khác nhìn bạn, bạn sẽ nghĩ rằng họ nhìn chằm chằm vào cơ thể, ngoại hình của bạn. Đó chính là bạn đang tự ti với ngoại hình của mình.\n" +
                "- So sánh ngoại hình của mình với người khác  So sánh bản thân quá nhiều cũng phần nào thể hiện rằng bạn đang chưa chấp nhận nhiều vẻ đẹp. \"Da cô ấy trắng quá\", \"Môi cô ấy đẹp quá\", Dù cho nó chỉ đơn thuần là lời khen, là động lực, khi so sánh nhiều có khả năng sẽ cảm thấy tủi thân. \"Da tôi không trắng như cô ấy, môi tôi không đẹp như cô ấy.\" Và có thể \"Tôi sẽ làm sao để có được làn da/đôi môi ấy.\"\n" +
                "- Tìm cách che đi cơ thể: Che đi những bộ phận chưa-tự-tin của bản thân cũng thể hiện bạn đang tự body shaming: Vì mọc mụn nên đeo khẩu trang, vì chân không trắng và mượt nên không mặc váy, vì đùi to nên không mặc quần jean.\n"));
        listConcept.add(new ConceptBDS(1,"Nguyên nhân của body shaming là gì ?"," 1.Nguyên nhân khách quan:  \n" +
                "\tTrước hết, body shaming xuất phát từ khuôn mẫu, chuẩn mực cái đẹp ăn sâu vào nhận thức của con người hiện nay. Xã hội mỗi thời đại luôn có một chuẩn mực nhất định về cái đẹp, về ngoại hình lí tưởng mà con người muốn vươn đến. Nếu quan sát tổng thể, chúng ta có thể dễ dàng nhận ra, lý do phần lớn của body shaming là những người bị miệt thị có ngoại hình khác biệt so với chuẩn mực hoặc quan điểm của người miệt thị. Ai cũng có thể trở thành mục tiêu của người miệt thị nếu có một điểm khác biệt nào đó. Như vậy, body shaming bắt nguồn từ sự thiếu tôn trọng sự khác biệt của con người hiện nay.\n" +
                "Thậm chí, có những người miệt thị ngoại hình người khác bởi họ bị căn bệnh tâm lí “quan trọng hình thức”. Căn bệnh \"quan trọng hình thức\" hay nặng hơn là \"ám ảnh hình thức\" đã đẩy những người này vào lối suy nghĩ tiêu cực không lối thoát. Việc dùng ngôn từ để miệt thị ai khác chính là một biểu hiện hay một hình thái của căn bệnh tâm lí khó chữa này.\n" +
                "Bên cạnh đó, body shaming còn bắt nguồn từ chủ nghĩa vị kỷ quá lớn trong mỗi con người. Đôi khi, để thỏa mãn tính ích kỷ của bản thân khi cảm thấy người khác “hơn” mình về một điểm nào đó, nhiều người sẵn sàng dùng ngôn từ để hạ thấp đối tượng mục tiêu. Hay đơn giản hơn, có những bạn trẻ buông lời miệt thị ngoại hình chỉ vì đùa vui, thoả mãn nhu cầu giải trí của bản thân.\n" +
                "Hơn nữa, trong xu thế bùng nổ thông tin với sự phát triển mạnh mẽ của mạng xã hội như hiện nay, dường như càng làm cho body shaming ảnh hưởng ngày càng mạnh mẽ và sâu rộng. Trong một góc độ nào đó, truyền thông ảnh hưởng tiêu cực đến nhận thức của con người về ngoại hình, mà hệ quả chính là nạn body shaming. Có thể kể đến một số trường hợp điển hình như:1, Trends (các xu hướng, trào lưu): Điển hình là “thigh gap” (khoảng cách khi bạn đứng khép hai chân lại, nếu như không thấy được khoảng cách đó thì là \"ngoại cỡ\") hay trào lưu \"vòng tay chạm rốn\". Trào lưu này có thể tăng sự tự ti đối với một vài người, và góp phần làm chúng ta suy nghĩ rằng \"à, đó là đẹp, là thân hình chuẩn, ai có nó thì sẽ đẹp còn ai khác nó hoàn toàn là xấu xí\" (2 chân không có khoảng cách hay vòng eo lớn). 2/Sự đối lập trong quan điểm về thông tin: Một vài trang thông tin điện tử lớn lên án về vấn nạn body-shaming rất gay gắt, nhưng chính họ thường xuyên đưa những tiêu đề \"bí quyết luôn giữ thân hình thon gọn như Abcxy\", \"làm sao sở hữu làn da trắng sáng\",... Một, tạo ra một tiêu chuẩn vẻ đẹp định hướng người đọc. Hai, khiến những người kém tự tin về ngoại hình cảm thấy vô giá trị, và lao vào các bí quyết ấy để \"bình thường\". Ảnh hưởng của truyền thông là có, tuy nhiên, đó cũng là phương thức họ kiếm tiền. Chỉ cần nắm bắt được tâm lý đám đông, một bài báo view cao, chia sẻ nhiều sẽ lan tỏa cho nhiều người về những quan niệm hạn hẹp về vẻ đẹp (da trắng, đùi thon, eo gọn, bụng 6 múi...). 3/Văn hóa bình luận: Việc truyền thông bình luận về ngoại hình của một ai đó có thể cổ súy cho việc bình luận tiêu cực về ngoại hình người khác. Hơn nữa, truyền thông ở đây còn trực tiếp kích thích độc giả body-shaming người khác. Cách đây vài tháng, các trang báo mạng liên tục đưa tin về một cô nữ sinh có kích cỡ bộ ngực lớn, từ đó rất nhiều người đã chế giễu, đùa giỡn và đi đến body-shaming hay slut-shaming (một dạng miệt thị phụ nữ) cô ấy. Thông tin này có quan trọng đến mức hàng loạt hàng loạt các bài báo đều đưa tin về một cô gái, điều tra về tung tích danh tính, thông tin cá nhân. Khán giả vui, cười, body-shaming, họ kiếm được tiền, nạn nhân buồn, tự ti, tự miệt thị.\n" +
                "Trong phạm vi học đường, một trong những nguyên nhân gây body shaming chính là do gia đình và nhà trường chưa thực sự quan tâm và uốn nắn kịp thời. Những nạn nhân body shaming chưa tìm được điểm tựa tinh thần nên hậu quả càng trầm trọng. Những học sinh body shaming người khác lại chưa được uốn nắn, giáo dục để nâng cao nhận thức về body shaming và có ý thức điều chỉnh hành vi của bản thân.\n" +
                ".2. Nguyên nhân chủ quan\n" +
                "- Ở góc độ người body shaming người khác, dễ dàng nhận thấy các bạn nhận thức thấp về body shaming, chưa thấy được mực độ ảnh hưởng nghiêm trọng của nó đến người khác. Đôi khi, các bạn cho đó là đùa vui, không gây hại cho ai cả, chưa phân biệt được đùa vui và miệt thị. Mặt khác, có khi body shaming xuất phát từ sự thiếu linh hoạt trong ứng xử. Dẫn đến hệ quả là những lời nói hay hành động làm tổn thương đến người khác dù đôi khi chỉ là vô tình. Vì vậy, nâng cao nhận thức về body shaming là một trong những hành động thiết thực nhằm loại bỏ vấn nạn này.\n" +
                "\n" +
                "- Từ phía nạn nhân của body shaming: các bạn còn thiếu tự tin về bản thân, thậm chí là ám ảnh về sự thua kém nhan sắc kèm theo đó là sự yếu đuối về tâm lý dẫn đến rất khó chống đỡ với tác động bên ngoài, dễ bị ảnh hưởng tiêu cực từ những lời nói miệt thị ngoại hình của người khác. Chính điều đó làm cho nạn nhân body shaming ngày càng chịu ảnh hưởng nặng nề từ vấn nạn này.\n"));
        listConcept.add(new ConceptBDS(1,"Hậu quả của việc body shaming"," Về phần những người bị body shaming, nhiều người sẽ dành phần lớn thời gian để soi xét những khiếm khuyết của bản thân mình, liên tục cảm thấy khó chịu và bực bội. Dần dần những cảm xúc ấy sẽ lại thành những tủi hổ, luôn cảm thấy thua kém. Những cảm xúc này hình thành tâm lí tự ti hoặc ngại giao tiếp, tự cách li mình khỏi xã hội. Ở một mức độ phức tạp hơn, những người này sẽ rơi vào trầm cảm do không muốn đi ra ngoài, không muốn xuất hiện trước bất kì ai. Nguy hiểm hơn, những mặc cảm về ngoại hình sẽ dẫn đến tự tử.\n" +
                "Một câu chuyện đau lòng được đăng tên tờ The Guardian gần đây: Jessica Laney, một cô bé đáng yêu, trở thành nạn nhân của nạn bắt nạt trên Internet khi tự kết liễu cuộc sống của mình ở tuổi 16. Không chỉ bị chế giễu về ngoại hình, bị gọi là \"mập ú\", \"lẳng lơ\", Jessica còn nhận được những câu nói khủng khiếp hơn như \"cô có thể chết đi được không?\" hay \"chẳng ai thèm quan tâm đến cô đâu\".\n" +
                "Những năm tháng đầu tiên đến trường, khuyết tật tứ chi đã khiến Nick Vujicic trở thành mục tiêu châm chọc của bạn bè. Anh bị chỉ trỏ, chê cười, bị chọc phá vì \"khác người\". Lúc đó Nick cảm thấy cô đơn, thất vọng triền miên và chỉ muốn tan biến khỏi cõi đời thật sớm, để thoát khỏi đau khổ. Cậu bé Nick lúc đó dự định ném mình từ trên cao xuống và liên tục vật lộn với cảm giác tuyệt vọng rằng cuộc đời rồi đây sẽ vô cùng khó khăn.\n" +
                "\n" +
                "Như vậy, có thể dễ dàng nhận thấy rằng, việc dùng một khuôn mẫu về hình thể làm thước đo để phê phán người khác có thể gây ra tổn thương về tâm lý cho người bị chỉ trích. Trong một số trường hợp, điều này có thể là động lực cho người bị chỉ trích cải thiện bản thân, nhưng con số này quá ít ỏi. Việc chỉ trích ngoại hình có thể dẫn tới sự tự ti và xấu hổ về ngoại hình cho người bị chỉ trích, từ đó gây ra ảnh hưởng xấu về tâm lý. Nạn nhân body shaming có thể nảy sinh suy nghĩ, hành động tiêu cực như \"muốn trốn cả thế giới\", \"tuyệt vọng muốn trốn ở nhà luôn hoặc đi phẫu thuật\"... Thậm chí có người đã tìm đến cái chết như một giải thoát: Bạn Brandy Vela đáng lẽ đã có thể tốt nghiệp vào năm cô ấy 18 tuổi, nhưng lại lựa chọn nổ súng kết liễu đời mình ngay trước mặt gia đình và người thân vì phải chịu miệt thị nặng nề về ngoại hình cả trên mạng lẫn ở lớp học trong nhiều tháng. (Emily Shuggerman 2016). \n" +
                "Người có sự xấu hổ về cơ thể có thể chịu tổn thương sức khỏe. Tờ Huffington Post giới thiệu một nghiên cứu của nhà nghiên cứu Jean Lamont, đại học Bucknell, về ảnh hưởng của body-shame tới phụ nữ. Nghiên cứu chỉ ra rằng những phụ nữ có cường độ body-shame cao có biểu hiện giảm sức khỏe và một số gia tăng các bệnh nhiễm trùng từ độ tuổi teen. Tự xấu hổ về hình thể dẫn đến sức khỏe thể chất kém, vì những cảm xúc tiêu cực có thể làm phụ nữ là thiếu chú tâm với cơ thể của họ và khó chăm lo sức khỏe hơn. Dù chỉ là nghiên cứu quy mô nhỏ, những nghiên cứu này báo động về ảnh hưởng tiêu cực của việc xấu hổ về hình thể lên chính sức khỏe. (Adams, 2015). \n"));
        listConcept.add(new ConceptBDS(1,"Làm sao để đẩy lùi nạn Body shaming ?"," Cách tốt nhất để giải quyết vấn đề này đó là hãy lên tiếng. Chúng ta cần lên tiếng khi bản thân bị miệt thị ngoại hình; lên tiếng khi nhìn thấy người khác bị đùa cợt, bởi vì khi im lặng, chính là vô tình tạo cơ hội cho những kẻ bắt nạt làm tổn thương chúng ta nhiều hơn.\n" +
                "Và cuối cùng, điều cốt yếu nhất là chúng ta cần có “kháng thể” trước nạn body shaming-chính là  sự tự tin về bản thân, yêu thương bản thân nhiều hơn. Các em hãy biết trân trọng chính mình. Bởi vì mỗi chúng ta là một cá thể duy nhất, khác biệt, không bắt buộc phải giống với ai khác. Cũng vì thế, chúng ta hãy trân trọng sự khác biệt của bản thân và tôn trọng sự khác biệt của người khác.\n" +
                "Hãy tìm một điểm mà bạn thích trên cơ thể của bạn, có thể không cần phải theo một tiêu chuẩn nào cả, miễn là đặc điểm đó khiến bạn cảm thấy mình đặc biệt, khác biệt, độc đáo và giúp bạn tự tin hơn, tự hào về chính mình hơn. Có thể là một nốt ruồi duyên, một kiểu tóc mới hoặc một làn da nâu “gia truyền”,… hãy tìm và chia sẻ về điều đó với những người xung quanh để biến vẻ đẹp độc đáo đó trở thành đặc điểm nhận dạng “không lẫn vào đâu được” của chính mình.\n" +
                "Và tuyệt hơn nữa, nếu có thể, hãy tìm một nét đặc trưng của những người mà bạn yêu thương và khen ngợi điều đó. Bằng cách này, những lời chân thật và tốt đẹp về vẻ ngoài sẽ tạo nên sức mạnh cộng hưởng, kết nối tư dung tích cực cho cả vòng tròn giao tiếp xung quanh chúng ta.\n"));

    }


    private void initView() {
        rcvConcept = findViewById(R.id.rcv_Concept);
        listConcept = new ArrayList<>();

    }
}
