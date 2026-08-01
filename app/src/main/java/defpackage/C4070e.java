package defpackage;

import java.io.IOException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؖۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4070e implements InterfaceC13033e, InterfaceC1618e {
    public static final /* synthetic */ AtomicReferenceFieldUpdater billing = AtomicReferenceFieldUpdater.newUpdater(C4070e.class, Object.class, "suspensionSlot");
    public static final /* synthetic */ AtomicReferenceFieldUpdater yandex = AtomicReferenceFieldUpdater.newUpdater(C4070e.class, Object.class, "_closedCause");
    private volatile int flushBufferSize;
    public final boolean vip;
    public final C12402e metrica = new Object();
    public final Object license = new Object();
    volatile /* synthetic */ Object suspensionSlot = C6478e.vip;
    public final C12402e appmetrica = new Object();
    public final C12402e purchase = new Object();
    volatile /* synthetic */ Object _closedCause = null;

    /* JADX WARN: Type inference failed for: r1v1, types: [eَّۙ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v4, types: [eَّۙ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r1v5, types: [eَّۙ, java.lang.Object] */
    public C4070e(boolean z) {
        this.vip = z;
    }

    @Override // defpackage.InterfaceC13033e, defpackage.InterfaceC1618e
    public final void ad(Throwable th) {
        if (this._closedCause != null) {
            return;
        }
        C7761e c7761e = new C7761e(th);
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yandex;
        while (!atomicReferenceFieldUpdater.compareAndSet(this, null, c7761e) && atomicReferenceFieldUpdater.get(this) == null) {
        }
        mopub(c7761e.ad(C6244e.f13064e));
    }

    public final void adcel() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater;
        advert();
        C7761e c7761e = AbstractC7754e.ad;
        do {
            atomicReferenceFieldUpdater = yandex;
            if (atomicReferenceFieldUpdater.compareAndSet(this, null, c7761e)) {
                mopub(null);
                return;
            }
        } while (atomicReferenceFieldUpdater.get(this) == null);
    }

    public final void advert() {
        if (this.purchase.yandex()) {
            return;
        }
        synchronized (this.license) {
            C12402e c12402e = this.purchase;
            int i = (int) c12402e.f24832e;
            this.metrica.inmobi(c12402e);
            this.flushBufferSize += i;
            Unit unit = Unit.INSTANCE;
        }
        InterfaceC9329e interfaceC9329e = (InterfaceC9329e) this.suspensionSlot;
        if (interfaceC9329e instanceof C15560e) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = billing;
            C6478e c6478e = C6478e.vip;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC9329e, c6478e)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC9329e) {
                    return;
                }
            }
            ((InterfaceC8287e) interfaceC9329e).vip();
        }
    }

    public final void amazon() {
        synchronized (this.license) {
            this.metrica.ads(this.appmetrica);
            this.flushBufferSize = 0;
            Unit unit = Unit.INSTANCE;
        }
        InterfaceC9329e interfaceC9329e = (InterfaceC9329e) this.suspensionSlot;
        if (interfaceC9329e instanceof C13014e) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = billing;
            C6478e c6478e = C6478e.vip;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, interfaceC9329e, c6478e)) {
                if (atomicReferenceFieldUpdater.get(this) != interfaceC9329e) {
                    return;
                }
            }
            ((InterfaceC8287e) interfaceC9329e).vip();
        }
    }

    @Override // defpackage.InterfaceC1618e
    public final C12402e appmetrica() {
        Throwable ad;
        if (!smaato()) {
            return this.purchase;
        }
        C7761e c7761e = (C7761e) this._closedCause;
        if (c7761e == null || (ad = c7761e.ad(C5480e.f11760e)) == null) {
            throw new IOException(null, null);
        }
        throw ad;
    }

    @Override // defpackage.InterfaceC13033e
    public final C12402e billing() {
        Throwable ad;
        C7761e c7761e = (C7761e) this._closedCause;
        if (c7761e != null && (ad = c7761e.ad(C16601e.f32562e)) != null) {
            throw ad;
        }
        if (this.appmetrica.yandex()) {
            amazon();
        }
        return this.appmetrica;
    }

    /* JADX WARN: Removed duplicated region for block: B:63:0x0110  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x011b  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x011d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x003c  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    @Override // defpackage.InterfaceC13033e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object license(int r18, defpackage.AbstractC10731e r19) {
        /*
            Method dump skipped, instructions count: 292
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4070e.license(int, eُؑ۠):java.lang.Object");
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x00e1 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:? A[LOOP:0: B:11:0x004d->B:29:?, LOOP_END, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00c7  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x009c  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0025  */
    @Override // defpackage.InterfaceC1618e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(defpackage.AbstractC10731e r13) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4070e.metrica(eُؑ۠):java.lang.Object");
    }

    public final void mopub(Throwable th) {
        C5440e c5440e;
        if (th != null) {
            c5440e = new C5440e(th);
        } else {
            InterfaceC9329e.ad.getClass();
            c5440e = C13433e.vip;
        }
        InterfaceC9329e interfaceC9329e = (InterfaceC9329e) billing.getAndSet(this, c5440e);
        if (interfaceC9329e instanceof InterfaceC8287e) {
            ((InterfaceC8287e) interfaceC9329e).ad(th);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:1|(2:3|(8:5|6|7|(1:(1:10)(2:26|27))(4:28|29|30|(1:32))|11|12|(2:13|(3:22|23|24)(1:15))|19))|34|6|7|(0)(0)|11|12|(2:13|(0)(0))|19) */
    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0048 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x002d  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x001f  */
    @Override // defpackage.InterfaceC1618e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object purchase(defpackage.InterfaceC5083e r5) {
        /*
            r4 = this;
            boolean r0 = r5 instanceof defpackage.C17902e
            if (r0 == 0) goto L13
            r0 = r5
            eؚ٘ٞ r0 = (defpackage.C17902e) r0
            int r1 = r0.f35150e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f35150e = r1
            goto L18
        L13:
            eؚ٘ٞ r0 = new eؚ٘ٞ
            r0.<init>(r4, r5)
        L18:
            java.lang.Object r5 = r0.f35149e
            int r1 = r0.f35150e
            r2 = 1
            if (r1 == 0) goto L2d
            if (r1 != r2) goto L25
            defpackage.AbstractC2003e.purchase(r5)     // Catch: java.lang.Throwable -> L3d
            goto L3b
        L25:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r0 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r0)
            throw r5
        L2d:
            defpackage.AbstractC2003e.purchase(r5)
            r0.f35150e = r2     // Catch: java.lang.Throwable -> L3d
            java.lang.Object r5 = r4.metrica(r0)     // Catch: java.lang.Throwable -> L3d
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r5 != r0) goto L3b
            return r0
        L3b:
            kotlin.Unit r5 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L3d
        L3d:
            eًؘؘ r5 = defpackage.AbstractC7754e.ad
        L3f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.C4070e.yandex
            r1 = 0
            boolean r2 = r0.compareAndSet(r4, r1, r5)
            if (r2 == 0) goto L4e
            r4.mopub(r1)
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        L4e:
            java.lang.Object r0 = r0.get(r4)
            if (r0 == 0) goto L3f
            kotlin.Unit r5 = kotlin.Unit.INSTANCE
            return r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C4070e.purchase(eًؗۖ):java.lang.Object");
    }

    public final boolean smaato() {
        return this._closedCause != null;
    }

    @Override // defpackage.InterfaceC1618e
    public final boolean startapp() {
        return this.vip;
    }

    public final String toString() {
        return "ByteChannel[" + hashCode() + ']';
    }

    @Override // defpackage.InterfaceC13033e, defpackage.InterfaceC1618e
    public final Throwable vip() {
        C7761e c7761e = (C7761e) this._closedCause;
        if (c7761e != null) {
            return c7761e.ad(C6244e.f13064e);
        }
        return null;
    }

    @Override // defpackage.InterfaceC13033e
    public final boolean yandex() {
        if (vip() == null) {
            return smaato() && this.flushBufferSize == 0 && this.appmetrica.yandex();
        }
        return true;
    }
}
