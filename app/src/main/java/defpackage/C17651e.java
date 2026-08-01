package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17651e extends C17663e implements InterfaceC4619e {
    public static final /* synthetic */ AtomicReferenceFieldUpdater yandex = AtomicReferenceFieldUpdater.newUpdater(C17651e.class, Object.class, "owner$volatile");
    private volatile /* synthetic */ Object owner$volatile;

    public C17651e(boolean z) {
        super(1, z ? 1 : 0);
        this.owner$volatile = z ? null : AbstractC12751e.ad;
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x0022, code lost:
    
        r0.smaato(kotlin.Unit.INSTANCE, r3.vip);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object appmetrica(defpackage.InterfaceC5083e r4) {
        /*
            r3 = this;
            boolean r0 = r3.purchase()
            if (r0 == 0) goto L9
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L9:
            eًؗۖ r4 = defpackage.AbstractC10558e.startapp(r4)
            eْۢ٘ r4 = defpackage.AbstractC15297e.metrica(r4)
            eٌَؑ r0 = new eٌَؑ     // Catch: java.lang.Throwable -> L41
            r0.<init>(r3, r4)     // Catch: java.lang.Throwable -> L41
        L16:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r1 = defpackage.C17663e.billing     // Catch: java.lang.Throwable -> L41
            int r1 = r1.getAndDecrement(r3)     // Catch: java.lang.Throwable -> L41
            int r2 = r3.ad     // Catch: java.lang.Throwable -> L41
            if (r1 > r2) goto L16
            if (r1 <= 0) goto L2a
            kotlin.Unit r1 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L41
            eٜ٘ؓ r2 = r3.vip     // Catch: java.lang.Throwable -> L41
            r0.smaato(r1, r2)     // Catch: java.lang.Throwable -> L41
            goto L30
        L2a:
            boolean r1 = r3.vip(r0)     // Catch: java.lang.Throwable -> L41
            if (r1 == 0) goto L16
        L30:
            java.lang.Object r4 = r4.signatures()
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r4 != r0) goto L39
            goto L3b
        L39:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L3b:
            if (r4 != r0) goto L3e
            return r4
        L3e:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L41:
            r0 = move-exception
            r4.m3617class()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17651e.appmetrica(eًؗۖ):java.lang.Object");
    }

    public final void billing(Object obj) {
        while (license()) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = yandex;
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            C2443e c2443e = AbstractC12751e.ad;
            if (obj2 != c2443e) {
                if (obj2 == obj || obj == null) {
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, obj2, c2443e)) {
                        if (atomicReferenceFieldUpdater.get(this) != obj2) {
                            break;
                        }
                    }
                    metrica();
                    return;
                }
                throw new IllegalStateException(("This mutex is locked by " + obj2 + ", but " + obj + " is expected").toString());
            }
        }
        throw new IllegalStateException("This mutex is not locked");
    }

    public final boolean license() {
        return Math.max(C17663e.billing.get(this), 0) == 0;
    }

    public final boolean purchase() {
        int i;
        while (true) {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = C17663e.billing;
            int i2 = atomicIntegerFieldUpdater.get(this);
            int i3 = this.ad;
            if (i2 > i3) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i > i3) {
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i3));
            } else {
                if (i2 <= 0) {
                    return false;
                }
                if (atomicIntegerFieldUpdater.compareAndSet(this, i2, i2 - 1)) {
                    yandex.set(this, null);
                    return true;
                }
            }
        }
    }

    public final String toString() {
        return "Mutex@" + AbstractC7111e.purchase(this) + "[isLocked=" + license() + ",owner=" + yandex.get(this) + ']';
    }
}
