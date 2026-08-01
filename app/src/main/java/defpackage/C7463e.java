package defpackage;

import android.os.Handler;
import android.util.Log;
import android.webkit.JavascriptInterface;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚۛۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7463e implements InterfaceC11687e {
    public final Handler ad;
    public boolean license = true;
    public final C16364e metrica;
    public final C16364e vip;

    public C7463e(Handler handler, C16364e c16364e, C16364e c16364e2) {
        this.ad = handler;
        this.vip = c16364e;
        this.metrica = c16364e2;
    }

    @Override // defpackage.InterfaceC11687e
    @JavascriptInterface
    public void VKCaptchaCloseCaptcha(String str) {
        this.metrica.invoke(Boolean.valueOf(this.license));
    }

    @Override // defpackage.InterfaceC11687e
    @JavascriptInterface
    public void VKCaptchaGetResult(String str) {
        try {
            String string = new JSONObject(str).getString("token");
            this.license = false;
            this.ad.post(new RunnableC11247e(this, string, 13));
        } catch (JSONException e) {
            Log.e("VKCaptchaWebView", "Error when parsing json\n Error:" + e);
        }
    }

    @Override // defpackage.InterfaceC11687e
    @JavascriptInterface
    public void VKCaptchaListenSensorsStart(String str) {
    }

    @Override // defpackage.InterfaceC11687e
    @JavascriptInterface
    public void VKCaptchaListenSensorsStop(String str) {
    }
}
