package defpackage;

import com.google.common.util.concurrent.ListenableFuture;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٟؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC4127e implements Runnable {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C18405e f9092e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f9093e;

    public /* synthetic */ RunnableC4127e(C18405e c18405e, int i) {
        this.f9093e = i;
        this.f9092e = c18405e;
    }

    @Override // java.lang.Runnable
    public final void run() {
        ListenableFuture c4065e;
        switch (this.f9093e) {
            case 0:
                C18405e c18405e = this.f9092e;
                if (c18405e.inmobi) {
                    AbstractC9464e.remoteconfig(c18405e.ad, "The data didn't reach the expected timestamp before timeout, stop the codec.");
                    c18405e.isPro = null;
                    c18405e.startapp();
                    c18405e.inmobi = false;
                    return;
                }
                return;
            case 1:
                C18405e c18405e2 = this.f9092e;
                ExecutorC12245e executorC12245e = c18405e2.yandex;
                AbstractC9464e.yandex(c18405e2.ad, "signalEndOfInputStream");
                switch (AbstractC8703e.m2467class(c18405e2.f36090class)) {
                    case 0:
                        c4065e = new C4065e(1, new IllegalStateException("Encoder is not started yet."));
                        break;
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                    case 5:
                    case 6:
                        AtomicReference atomicReference = new AtomicReference();
                        c4065e = AbstractC5750e.purchase(new C17678e(atomicReference, 1));
                        C7169e c7169e = (C7169e) atomicReference.get();
                        c7169e.getClass();
                        c18405e2.advert.offer(c7169e);
                        RunnableC2623e runnableC2623e = new RunnableC2623e(c18405e2, c7169e, 12);
                        C4001e c4001e = c7169e.metrica;
                        if (c4001e != null) {
                            c4001e.ad(runnableC2623e, executorC12245e);
                        }
                        c18405e2.vip();
                        break;
                    case 7:
                        c4065e = new C4065e(1, new IllegalStateException("Encoder is in error state."));
                        break;
                    case 8:
                        c4065e = new C4065e(1, new IllegalStateException("Encoder is released."));
                        break;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(AbstractC4653e.m1645goto(c18405e2.f36090class)));
                }
                c4065e.ad(new RunnableC17144e(c4065e, new C7988e(9, c18405e2), 0), executorC12245e);
                return;
            case 2:
                C18405e c18405e3 = this.f9092e;
                int m2467class = AbstractC8703e.m2467class(c18405e3.f36090class);
                if (m2467class == 1) {
                    c18405e3.appmetrica();
                    return;
                } else {
                    if (m2467class == 6 || m2467class == 8) {
                        throw new IllegalStateException("Encoder is released");
                    }
                    return;
                }
            case 3:
                C18405e c18405e4 = this.f9092e;
                switch (AbstractC8703e.m2467class(c18405e4.f36090class)) {
                    case 0:
                    case 1:
                    case 2:
                    case 7:
                        c18405e4.license();
                        return;
                    case 3:
                    case 4:
                    case 5:
                        c18405e4.yandex(7);
                        return;
                    case 6:
                    case 8:
                        return;
                    default:
                        throw new IllegalStateException("Unknown state: ".concat(AbstractC4653e.m1645goto(c18405e4.f36090class)));
                }
            case 4:
                C18405e c18405e5 = this.f9092e;
                c18405e5.subs = true;
                if (c18405e5.premium) {
                    if (!c18405e5.remoteconfig) {
                        AbstractC9464e.yandex(c18405e5.ad, "mMediaCodec.stop()");
                        c18405e5.appmetrica.stop();
                    }
                    c18405e5.purchase();
                    return;
                }
                return;
            default:
                C18405e c18405e6 = this.f9092e;
                c18405e6.yandex.execute(new RunnableC4127e(c18405e6, 0));
                return;
        }
    }
}
