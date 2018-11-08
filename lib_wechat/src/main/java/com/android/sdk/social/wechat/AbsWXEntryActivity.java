package com.android.sdk.social.wechat;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

import com.tencent.mm.opensdk.modelbase.BaseReq;
import com.tencent.mm.opensdk.modelbase.BaseResp;
import com.tencent.mm.opensdk.openapi.IWXAPIEventHandler;

import static com.android.sdk.social.wechat.WeChatPlatformManager.TAG;

/**
 * @author Ztiany
 * Email: ztiany3@gmail.com
 * Date : 2018-11-07 13:51
 */
public class AbsWXEntryActivity extends Activity implements IWXAPIEventHandler {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        Log.d(TAG, "onCreate() called with: savedInstanceState = [" + savedInstanceState + "]");
        // 如果分享的时候，该界面没有开启，那么微信开始这个 Activity 时会调用 onCreate，所以这里要处理微信的返回结果。
        // 注意：第三方开发者如果使用透明界面来实现 WXEntryActivity，则需要判断 handleIntent 的返回值。
        // 如果返回值为false，则说明入参不合法未被 SDK 处理，应finish当前透明界面，避免外部通过传递非法参数的 Intent 导致停留在透明界面，引起用户的疑惑。
        boolean result = WeChatPlatformManager.handleIntent(getIntent(), this);
        Log.w(TAG, "onCreate handleIntent result = " + result);
    }

    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        Log.d(TAG, "onNewIntent() called with: intent = [" + intent + "]");
        setIntent(intent);
        boolean result = WeChatPlatformManager.handleIntent(intent, this);
        Log.w(TAG, "onCreate onNewIntent result = " + result);
    }

    /**
     * 微信发送请求到第三方应用时，会回调到该方法
     */
    @Override
    public void onReq(BaseReq baseReq) {
        Log.d(TAG, "onReq() called with: baseReq = [" + baseReq + "]");
    }

    /**
     * 第三方应用发送到微信的请求处理后的响应结果，会回调到该方法
     */
    @Override
    public void onResp(BaseResp baseResp) {
        Log.d(TAG, "onResp() called with: baseResp = [" + baseResp + "]");
        WeChatPlatformManager.handleOnResp(baseResp);
        this.finish();
    }

}
