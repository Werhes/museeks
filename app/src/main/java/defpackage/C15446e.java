package defpackage;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٓؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15446e implements InterfaceC11929e, InterfaceC7424e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f30524e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f30525e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f30526e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ boolean f30527e;

    public /* synthetic */ C15446e(boolean z, Object obj, Object obj2, Object obj3) {
        this.f30525e = obj;
        this.f30524e = obj2;
        this.f30527e = z;
        this.f30526e = obj3;
    }

    @Override // defpackage.InterfaceC7424e
    public void purchase(Exception exc) {
        C17553e c17553e = (C17553e) this.f30525e;
        C8988e c8988e = (C8988e) this.f30524e;
        C16281e c16281e = (C16281e) this.f30526e;
        if (exc != null) {
            c8988e.metrica(exc);
            return;
        }
        if (this.f30527e) {
            boolean z = true;
            CountDownLatch countDownLatch = new CountDownLatch(1);
            new Thread(new RunnableC11247e(c17553e, countDownLatch, 5)).start();
            TimeUnit timeUnit = TimeUnit.SECONDS;
            ExecutorService executorService = AbstractC16802e.ad;
            boolean z2 = false;
            try {
                long nanos = timeUnit.toNanos(2L);
                long nanoTime = System.nanoTime() + nanos;
                while (true) {
                    try {
                        try {
                            countDownLatch.await(nanos, TimeUnit.NANOSECONDS);
                            break;
                        } catch (Throwable th) {
                            th = th;
                            if (z) {
                                Thread.currentThread().interrupt();
                            }
                            throw th;
                        }
                    } catch (InterruptedException unused) {
                        nanos = nanoTime - System.nanoTime();
                        z2 = true;
                    }
                }
                if (z2) {
                    Thread.currentThread().interrupt();
                }
            } catch (Throwable th2) {
                th = th2;
                z = z2;
            }
        }
        c8988e.license(c16281e);
    }

    @Override // defpackage.InterfaceC11929e
    public C1410e vip(int i, C16437e c16437e, int[] iArr) {
        C11010e c11010e = (C11010e) this.f30525e;
        C16672e c16672e = (C16672e) this.f30524e;
        int[] iArr2 = (int[]) this.f30526e;
        c11010e.getClass();
        C9211e c9211e = new C9211e(c11010e, c16672e);
        int i2 = iArr2[i];
        C13304e Signature = AbstractC17475e.Signature();
        for (int i3 = 0; i3 < c16437e.ad; i3++) {
            Signature.metrica(new C15806e(i, c16437e, i3, c16672e, iArr[i3], this.f30527e, c9211e, i2));
        }
        return Signature.billing();
    }
}
