package defpackage;

import android.os.Handler;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٜۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11861e {
    public static volatile HandlerC9134e license;
    public final InterfaceC17023e ad;
    public volatile long metrica;
    public final RunnableC17144e vip;

    public AbstractC11861e(InterfaceC17023e interfaceC17023e) {
        AbstractC9528e.startapp(interfaceC17023e);
        this.ad = interfaceC17023e;
        this.vip = new RunnableC17144e(this, interfaceC17023e, false, 27);
    }

    public abstract void ad();

    public final Handler license() {
        HandlerC9134e handlerC9134e;
        if (license != null) {
            return license;
        }
        synchronized (AbstractC11861e.class) {
            try {
                if (license == null) {
                    license = new HandlerC9134e(this.ad.mo2258e().getMainLooper(), 4);
                }
                handlerC9134e = license;
            } catch (Throwable th) {
                throw th;
            }
        }
        return handlerC9134e;
    }

    public final void metrica() {
        this.metrica = 0L;
        license().removeCallbacks(this.vip);
    }

    public final void vip(long j) {
        metrica();
        if (j >= 0) {
            InterfaceC17023e interfaceC17023e = this.ad;
            interfaceC17023e.mo2259e().getClass();
            this.metrica = System.currentTimeMillis();
            if (license().postDelayed(this.vip, j)) {
                return;
            }
            interfaceC17023e.mo2261e().f27502e.vip(Long.valueOf(j), "Failed to schedule delayed post. time");
        }
    }
}
