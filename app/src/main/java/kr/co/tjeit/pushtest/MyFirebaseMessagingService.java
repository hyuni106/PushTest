package kr.co.tjeit.pushtest;

import android.util.Log;

import com.google.firebase.messaging.FirebaseMessagingService;
import com.google.firebase.messaging.RemoteMessage;

/**
 * Created by the on 2017-09-08.
 */

public class MyFirebaseMessagingService extends FirebaseMessagingService{
//    1. Service : 백그라운드에서 돌아가는 모듈
//     백그라운드 > 앱이 종료되어도 안드로이드 OS에 붙어서 돌아가는것

//    서비스가 하는 일 : 이벤트를 감지하는 역할
//     => 푸시 메시지가 날아오는 이벤트 감지

//    2. Messaging : 포시 메시지가 날아오늘 상황 명시

    @Override
    public void onMessageReceived(RemoteMessage remoteMessage) {
        super.onMessageReceived(remoteMessage);
        Log.d("푸시", "누군가의 푸시를 받음");
    }
}
