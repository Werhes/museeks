package defpackage;

import android.os.Bundle;
import android.webkit.WebView;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٜؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15584e implements Function2 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30750e;

    public /* synthetic */ C15584e(int i) {
        this.f30750e = i;
    }

    public /* synthetic */ C15584e(int i, int i2) {
        this.f30750e = i2;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f30750e) {
            case 0:
                return Unit.INSTANCE;
            case 1:
                ((Integer) obj2).getClass();
                AbstractC9764e.vip((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 2:
                ((Integer) obj2).getClass();
                AbstractC9764e.appmetrica((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC7890e.appmetrica((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 4:
                ((Integer) obj2).getClass();
                AbstractC10558e.billing((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 5:
                ((Integer) obj2).getClass();
                AbstractC10509e.metrica((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            case 6:
                ((Integer) obj2).getClass();
                AbstractC10509e.vip((C13770e) obj, AbstractC5190e.advert(1));
                return Unit.INSTANCE;
            default:
                C8921e c8921e = (C8921e) obj2;
                Bundle bundle = new Bundle();
                WebView webView = (WebView) c8921e.yandex.getValue();
                if (webView != null) {
                    webView.saveState(bundle);
                }
                return AbstractC10064e.purchase(new C6571e("pagetitle", (String) c8921e.license.getValue()), new C6571e("lastloaded", (String) c8921e.ad.getValue()), new C6571e("bundle", bundle));
        }
    }
}
