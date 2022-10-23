//import com.google.firebase.ml.naturallanguage.FirebaseNaturalLanguage;
//import com.google.firebase.ml.naturallanguage.smartreply.FirebaseSmartReply;
//import com.google.firebase.ml.naturallanguage.smartreply.FirebaseTextMessage;
//import com.google.firebase.ml.naturallanguage.smartreply.SmartReplySuggestion;
//import com.google.firebase.ml.naturallanguage.smartreply.SmartReplySuggestionResult;
//
//public class createResponse {
//    private FirebaseSmartReply SMART_REPLY = FirebaseNaturalLanguage.getInstance().smartReply;
//
//    public String getSuggestion(List<FirebaseTextMessage> conversation) {
//        try {
//            smartReply.suggestReplies(conversation)
//                    .addOnSuccessListener(new OnSuccessListener<SmartReplySuggestionResult>() {
//                        @SuppressLint("SetTextI18n")
//                        @Override
//                        public void onSuccess(SmartReplySuggestionResult result) {
//                            if (result.getStatus() == SmartReplySuggestionResult.STATUS_NOT_SUPPORTED_LANGUAGE) {
//                                replyText.setText("Language not supported");
//                            } else if (result.getStatus() == SmartReplySuggestionResult.STATUS_SUCCESS) {
//                                //If the operation succeeds, a SmartReplySuggestionResult object is passed to the success handler.
//                                // This object contains a list of up to 3 suggested replies, which you can present to your user
//                                replyText.setText("Suggestions: " + "\n\n");
//                                for (SmartReplySuggestion suggestion : result.getSuggestions()) {
//                                    String replyMessage = suggestion.getText();
//                                    replyText.append("*" + replyMessage + ",\n\n");
//                                    break;
//                                }
//                            }
//                        }
//                    });
//        } catch (Exception e) {
//            System.out.println("Generating smart reply threw an exception " + e.getMessage());
//        }
//        return replyText;
//    }
//
//}