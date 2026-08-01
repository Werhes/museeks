package defpackage;

import java.io.Closeable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٗۖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16828e implements Closeable, InterfaceC12066e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final C13391e f32957e = new C13391e("MobileVisionBase", BuildConfig.FLAVOR);

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final C15816e f32958e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C1729e f32959e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final Executor f32960e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final AtomicBoolean f32961e = new AtomicBoolean(false);

    public AbstractC16828e(C1729e c1729e, Executor executor) {
        this.f32959e = c1729e;
        C15816e c15816e = new C15816e(5);
        this.f32958e = c15816e;
        this.f32960e = executor;
        c1729e.vip.incrementAndGet();
        c1729e.ad(executor, CallableC14883e.vip, (C0731e) c15816e.f31190e).metrica(C14914e.f29589e);
    }

    public final synchronized C0560e advert(C15444e c15444e) {
        if (this.f32961e.get()) {
            return AbstractC1749e.license(new C15745e("This detector is already closed!", 14));
        }
        if (c15444e.metrica < 32 || c15444e.license < 32) {
            return AbstractC1749e.license(new C15745e("InputImage width and height should be at least 32!", 3));
        }
        return this.f32959e.ad(this.f32960e, new CallableC4347e(this, c15444e, 0), (C0731e) this.f32958e.f31190e);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    @InterfaceC10450e(EnumC14621e.ON_DESTROY)
    public synchronized void close() {
        boolean z = true;
        if (this.f32961e.getAndSet(true)) {
            return;
        }
        this.f32958e.pro();
        C1729e c1729e = this.f32959e;
        Executor executor = this.f32960e;
        if (c1729e.vip.get() <= 0) {
            z = false;
        }
        AbstractC9528e.advert(z);
        c1729e.ad.remoteconfig(new RunnableC12554e(c1729e, new C8988e(), 15), executor);
    }

    /* JADX WARN: Code restructure failed: missing block: B:68:0x0136, code lost:
    
        if ((r9 - ((java.lang.Long) r13.get(r5)).longValue()) <= java.util.concurrent.TimeUnit.SECONDS.toMillis(30)) goto L47;
     */
    /* JADX WARN: Type inference failed for: r3v8, types: [eٔؒۤ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r6v4, types: [java.lang.Object, eٍؖۨ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C0560e license(android.media.Image r20, int r21, android.graphics.Matrix r22) {
        /*
            Method dump skipped, instructions count: 523
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC16828e.license(android.media.Image, int, android.graphics.Matrix):eؑۛٞ");
    }
}
