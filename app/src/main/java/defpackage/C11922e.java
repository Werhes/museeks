package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;
import java.util.ArrayDeque;
import java.util.TimerTask;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِؚۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11922e extends TimerTask {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ C9407e f23889e;

    public C11922e(C9407e c9407e) {
        this.f23889e = c9407e;
    }

    @Override // java.util.TimerTask, java.lang.Runnable
    public final void run() {
        BasePendingResult basePendingResult;
        C9407e c9407e = this.f23889e;
        ArrayDeque arrayDeque = c9407e.yandex;
        if (arrayDeque.isEmpty() || c9407e.mopub != null || c9407e.vip == 0) {
            return;
        }
        C5710e c5710e = c9407e.metrica;
        int[] license = AbstractC5942e.license(arrayDeque);
        c5710e.getClass();
        AbstractC9528e.appmetrica();
        if (c5710e.admob()) {
            C3722e c3722e = new C3722e(c5710e, license);
            C5710e.subscription(c3722e);
            basePendingResult = c3722e;
        } else {
            basePendingResult = C5710e.Signature();
        }
        c9407e.mopub = basePendingResult;
        basePendingResult.mopub(new C12075e(c9407e, 0));
        arrayDeque.clear();
    }
}
