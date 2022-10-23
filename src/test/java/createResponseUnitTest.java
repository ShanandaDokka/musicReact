//package songSuggestion.test;
//
//import app.src.songSuggestion.createResponse;
//import com.google.firebase.ml.naturallanguage.FirebaseNaturalLanguage;
//import com.google.firebase.ml.naturallanguage.smartreply.FirebaseSmartReply;
//import com.google.firebase.ml.naturallanguage.smartreply.FirebaseTextMessage;
//import com.google.firebase.ml.naturallanguage.smartreply.SmartReplySuggestion;
//import com.google.firebase.ml.naturallanguage.smartreply.SmartReplySuggestionResult;
//
//public class createResponseUnitTest {
//
//    public class createResponseTest {
//        private ArrayList<FirebaseTextMessage> conversation;
//        private createResponse reply = new createResponse();
//
//        private String test1 = "how are you today";
//
//        @Before
//        public void setUp {
//            conversation.add(FirebaseTextMessage.createForRemoteUser(test1,
//                    System.currentTimeMillis(), "user0"));
//        }
//
//        @Test
//        public void testReplySuccess() {
//            String replyText = reply.getSuggestion(conversation);
//            assertDoesNotThrow(() -> Exception.class);
//        }
//    }
//}
