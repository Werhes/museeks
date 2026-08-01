package defpackage;

import android.os.SystemClock;
import com.google.common.util.concurrent.ListenableFuture;
import java.util.ArrayList;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؚۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9664e {
    public final String ad;
    public final C2532e appmetrica;
    public final C14742e metrica;
    public final C12183e vip;
    public final C2532e purchase = new C2532e(new C0642e(8, this));
    public final Object billing = new Object();
    public List startapp = new ArrayList();
    public final C16911e license = new C16911e(22);
    public final C9838e yandex = new Object();

    /* JADX WARN: Type inference failed for: r4v2, types: [java.lang.Object, eٍٖۢ] */
    public C9664e(C14742e c14742e, C12183e c12183e) {
        this.metrica = c14742e;
        this.vip = c12183e;
        this.ad = (String) c14742e.vip;
        this.appmetrica = new C2532e(new C8383e(c14742e));
        ad(new C2169e(4, this));
    }

    public final void ad(InterfaceC18244e interfaceC18244e) {
        synchronized (this.billing) {
            this.startapp.add(interfaceC18244e);
        }
    }

    /* JADX WARN: Type inference failed for: r0v10, types: [java.lang.Object, eًۜؐ] */
    public final C9590e vip(C2713e c2713e, InterfaceScheduledExecutorServiceC1678e interfaceScheduledExecutorServiceC1678e) {
        C2111e vip = AbstractC9855e.vip(new C2169e(3, c2713e));
        C14155e c14155e = AbstractC8204e.ad;
        AbstractC2301e.amazon(c14155e, "ticker");
        switch (c14155e.ad) {
            case 0:
                SystemClock.elapsedRealtimeNanos();
                break;
            default:
                SystemClock.elapsedRealtime();
                break;
        }
        RunnableC1156e license = this.yandex.license("Update ".concat(String.valueOf(this.ad)));
        try {
            AbstractC0586e m909e = this.purchase.m909e();
            C16911e c16911e = this.license;
            C16452e c16452e = new C16452e(m909e);
            EnumC3320e enumC3320e = EnumC3320e.f7489e;
            c16911e.m4223while(c16452e, enumC3320e);
            try {
                ListenableFuture m4223while = c16911e.m4223while(AbstractC9855e.ad(new C11980e(this, m909e, vip, interfaceScheduledExecutorServiceC1678e, 25)), enumC3320e);
                AbstractC2017e.propagateCancellation(m4223while, m909e);
                AbstractC2017e.appmetrica(this.vip);
                C9590e purchase = AbstractC2017e.purchase(m4223while, new Object(), enumC3320e);
                license.ad(purchase);
                license.close();
                return purchase;
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                try {
                    license.close();
                    throw th2;
                } catch (Throwable th3) {
                    th2.addSuppressed(th3);
                    throw th2;
                }
            }
        } catch (Throwable th4) {
            th = th4;
        }
    }
}
