package defpackage;

import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;
import android.view.Surface;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؙُ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6321e implements Handler.Callback {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C15960e f13150e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Handler f13151e;

    public C6321e(C15960e c15960e, InterfaceC5827e interfaceC5827e) {
        this.f13150e = c15960e;
        Handler subscription = AbstractC9413e.subscription(this);
        this.f13151e = subscription;
        interfaceC5827e.pro(this, subscription);
    }

    public final void ad(long j) {
        Surface surface;
        C15960e c15960e = this.f13150e;
        C10312e c10312e = c15960e.f31474e;
        if (this != c15960e.f31462e || c15960e.f34976e == null) {
            return;
        }
        if (j == Long.MAX_VALUE) {
            c15960e.f35017e = true;
            return;
        }
        try {
            c15960e.m4451e(j);
            C2351e c2351e = c15960e.f31433e;
            if (!c2351e.equals(C2351e.license) && !c2351e.equals(c15960e.f31459e)) {
                c15960e.f31459e = c2351e;
                c10312e.m2795goto(c2351e);
            }
            c15960e.f34987e.appmetrica++;
            C11122e c11122e = c15960e.f31450e;
            boolean z = c11122e.appmetrica != 3;
            c11122e.appmetrica = 3;
            c11122e.advert.getClass();
            c11122e.billing = AbstractC9413e.m2546case(SystemClock.elapsedRealtime());
            if (z && (surface = c15960e.f31475e) != null) {
                Handler handler = (Handler) c10312e.f20361e;
                if (handler != null) {
                    handler.post(new RunnableC5316e(2, SystemClock.elapsedRealtime(), c10312e, surface));
                }
                c15960e.f31463e = true;
            }
            c15960e.mo4093return(j);
        } catch (C5681e e) {
            c15960e.f34984e = e;
        }
    }

    @Override // android.os.Handler.Callback
    public final boolean handleMessage(Message message) {
        if (message.what != 0) {
            return false;
        }
        int i = message.arg1;
        int i2 = message.arg2;
        String str = AbstractC9413e.ad;
        ad(((i & 4294967295L) << 32) | (4294967295L & i2));
        return true;
    }
}
