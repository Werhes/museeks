package defpackage;

import android.util.Log;
import com.google.android.gms.common.api.Status;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۤؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C12075e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ C9407e vip;

    public /* synthetic */ C12075e(C9407e c9407e, int i) {
        this.ad = i;
        this.vip = c9407e;
    }

    public final void ad(InterfaceC18082e interfaceC18082e) {
        C18444e c18444e = (C18444e) interfaceC18082e;
        switch (this.ad) {
            case 0:
                C9407e c9407e = this.vip;
                c9407e.getClass();
                Status appmetrica = c18444e.appmetrica();
                int i = appmetrica.f733e;
                if (i != 0) {
                    C18482e c18482e = c9407e.ad;
                    Log.w(c18482e.ad, c18482e.license("Error fetching queue items, statusCode=" + i + ", statusMessage=" + appmetrica.f731e, new Object[0]));
                }
                c9407e.mopub = null;
                if (c9407e.yandex.isEmpty()) {
                    return;
                }
                HandlerC9134e handlerC9134e = c9407e.startapp;
                C11922e c11922e = c9407e.adcel;
                handlerC9134e.removeCallbacks(c11922e);
                handlerC9134e.postDelayed(c11922e, 500L);
                return;
            default:
                Status appmetrica2 = c18444e.appmetrica();
                int i2 = appmetrica2.f733e;
                C9407e c9407e2 = this.vip;
                if (i2 != 0) {
                    C18482e c18482e2 = c9407e2.ad;
                    Log.w(c18482e2.ad, c18482e2.license("Error fetching queue item ids, statusCode=" + i2 + ", statusMessage=" + appmetrica2.f731e, new Object[0]));
                }
                c9407e2.advert = null;
                if (c9407e2.yandex.isEmpty()) {
                    return;
                }
                HandlerC9134e handlerC9134e2 = c9407e2.startapp;
                C11922e c11922e2 = c9407e2.adcel;
                handlerC9134e2.removeCallbacks(c11922e2);
                handlerC9134e2.postDelayed(c11922e2, 500L);
                return;
        }
    }
}
