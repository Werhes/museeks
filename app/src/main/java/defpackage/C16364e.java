package defpackage;

import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16364e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C5980e f32155e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f32156e;

    public /* synthetic */ C16364e(C5980e c5980e, int i) {
        this.f32156e = i;
        this.f32155e = c5980e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f32156e) {
            case 0:
                C5980e c5980e = this.f32155e;
                c5980e.f12580e = true;
                c5980e.f12583e.invoke((String) obj);
                c5980e.purchase();
                return Unit.INSTANCE;
            case 1:
                boolean z = !((Boolean) obj).booleanValue();
                C5980e c5980e2 = this.f32155e;
                c5980e2.f12580e = z;
                c5980e2.purchase();
                return Unit.INSTANCE;
            default:
                WebView webView = (WebView) obj;
                webView.setBackgroundColor(0);
                webView.setVerticalScrollBarEnabled(false);
                webView.setOverScrollMode(2);
                webView.getSettings().setJavaScriptEnabled(true);
                webView.addJavascriptInterface(this.f32155e.f12578e, "AndroidBridge");
                return Unit.INSTANCE;
        }
    }
}
