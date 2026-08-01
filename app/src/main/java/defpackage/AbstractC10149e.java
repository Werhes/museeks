package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًَۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC10149e extends AbstractC12898e implements Ctransient, InterfaceC18435e {

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20093e = AtomicIntegerFieldUpdater.newUpdater(AbstractC10149e.class, "closeFlag");

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicIntegerFieldUpdater f20092e = AtomicIntegerFieldUpdater.newUpdater(AbstractC10149e.class, "actualCloseFlag");

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20090e = AtomicReferenceFieldUpdater.newUpdater(AbstractC10149e.class, Object.class, "readerJob");

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f20091e = AtomicReferenceFieldUpdater.newUpdater(AbstractC10149e.class, Object.class, "writerJob");
    private volatile /* synthetic */ int closeFlag = 0;
    private volatile /* synthetic */ int actualCloseFlag = 0;
    volatile /* synthetic */ Object readerJob = null;
    volatile /* synthetic */ Object writerJob = null;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final C17955e f20095e = new C17955e(1, this);

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C6799e f20094e = new C6799e(null);

    public final C17269e ads(C4070e c4070e) {
        if (this.closeFlag != 0) {
            IOException iOException = new IOException("Socket closed");
            c4070e.ad(iOException);
            throw iOException;
        }
        C17269e subs = subs(c4070e);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20091e;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, subs)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                IllegalStateException illegalStateException = new IllegalStateException("reading channel has already been set");
                ((C6467e) subs.ad()).Signature(null);
                throw illegalStateException;
            }
        }
        if (this.closeFlag != 0) {
            IOException iOException2 = new IOException("Socket closed");
            ((C6467e) subs.ad()).Signature(null);
            c4070e.ad(iOException2);
            throw iOException2;
        }
        ((C6467e) subs.ad()).mo692else(new C9693e(c4070e, 0));
        ((C6467e) subs.ad()).mo692else(this.f20095e);
        return subs;
    }

    @Override // defpackage.InterfaceC18435e
    public final InterfaceC8850e advert() {
        return this.f20094e;
    }

    @Override // defpackage.AbstractC12898e, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        if (f20093e.compareAndSet(this, 0, 1)) {
            AbstractC5336e.purchase(this, new C5621e("socket-close"), 0, new C15238e(this, null, 0), 2);
        }
    }

    public final C11614e crashlytics(C4070e c4070e) {
        if (this.closeFlag != 0) {
            IOException iOException = new IOException("Socket closed");
            c4070e.ad(iOException);
            throw iOException;
        }
        C11614e mo2003goto = mo2003goto(c4070e);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f20090e;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, mo2003goto)) {
            if (atomicReferenceFieldUpdater.get(this) != null) {
                IllegalStateException illegalStateException = new IllegalStateException("writing channel has already been set");
                ((C6467e) mo2003goto.ad()).Signature(null);
                throw illegalStateException;
            }
        }
        if (this.closeFlag != 0) {
            IOException iOException2 = new IOException("Socket closed");
            ((C6467e) mo2003goto.ad()).Signature(null);
            c4070e.ad(iOException2);
            throw iOException2;
        }
        ((C6467e) mo2003goto.ad()).mo692else(new C9693e(c4070e, 0));
        ((C6467e) mo2003goto.ad()).mo692else(this.f20095e);
        return mo2003goto;
    }

    @Override // defpackage.Ctransient
    /* renamed from: eُؚٕ, reason: contains not printable characters */
    public final C6799e mo2773e() {
        return this.f20094e;
    }

    /* renamed from: goto */
    public abstract C11614e mo2003goto(C4070e c4070e);

    public abstract Throwable isVip();

    /* JADX WARN: Removed duplicated region for block: B:27:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0098  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x007f  */
    /* renamed from: protected, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void m2774protected() {
        /*
            r4 = this;
            int r0 = r4.closeFlag
            if (r0 == 0) goto La3
            java.lang.Object r0 = r4.readerJob
            eؖۛؗ r0 = (defpackage.InterfaceC4376e) r0
            if (r0 == 0) goto L14
            eَٟۙ r0 = r0.ad()
            boolean r0 = r0.mo693e()
            if (r0 == 0) goto La3
        L14:
            java.lang.Object r0 = r4.writerJob
            eؖۛؗ r0 = (defpackage.InterfaceC4376e) r0
            if (r0 == 0) goto L24
            eَٟۙ r0 = r0.ad()
            boolean r0 = r0.mo693e()
            if (r0 == 0) goto La3
        L24:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.AbstractC10149e.f20092e
            r1 = 0
            r2 = 1
            boolean r0 = r0.compareAndSet(r4, r1, r2)
            if (r0 != 0) goto L30
            goto La3
        L30:
            java.lang.Object r0 = r4.readerJob
            eؖۛؗ r0 = (defpackage.InterfaceC4376e) r0
            r1 = 0
            if (r0 == 0) goto L54
            eَٟۙ r2 = r0.ad()
            boolean r2 = r2.isCancelled()
            if (r2 == 0) goto L42
            goto L43
        L42:
            r0 = r1
        L43:
            if (r0 == 0) goto L54
            eَٟۙ r0 = r0.ad()
            java.util.concurrent.CancellationException r0 = r0.mo695implements()
            if (r0 == 0) goto L54
            java.lang.Throwable r0 = r0.getCause()
            goto L55
        L54:
            r0 = r1
        L55:
            java.lang.Object r2 = r4.writerJob
            eؖۛؗ r2 = (defpackage.InterfaceC4376e) r2
            if (r2 == 0) goto L77
            eَٟۙ r3 = r2.ad()
            boolean r3 = r3.isCancelled()
            if (r3 == 0) goto L66
            goto L67
        L66:
            r2 = r1
        L67:
            if (r2 == 0) goto L77
            eَٟۙ r2 = r2.ad()
            java.util.concurrent.CancellationException r2 = r2.mo695implements()
            if (r2 == 0) goto L77
            java.lang.Throwable r1 = r2.getCause()
        L77:
            java.lang.Throwable r2 = r4.isVip()
            if (r0 != 0) goto L7f
            r0 = r1
            goto L88
        L7f:
            if (r1 != 0) goto L82
            goto L88
        L82:
            if (r0 != r1) goto L85
            goto L88
        L85:
            defpackage.AbstractC13362e.license(r0, r1)
        L88:
            if (r0 != 0) goto L8b
            goto L96
        L8b:
            if (r2 != 0) goto L8e
            goto L90
        L8e:
            if (r0 != r2) goto L92
        L90:
            r2 = r0
            goto L96
        L92:
            defpackage.AbstractC13362e.license(r0, r2)
            goto L90
        L96:
            if (r2 != 0) goto L9e
            eؙۧؐ r0 = r4.f20094e
            r0.m2245e()
            return
        L9e:
            eؙۧؐ r0 = r4.f20094e
            r0.m2244e(r2)
        La3:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC10149e.m2774protected():void");
    }

    public abstract C17269e subs(C4070e c4070e);
}
