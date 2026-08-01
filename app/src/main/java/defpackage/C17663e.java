package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَ٘ؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C17663e {
    private volatile /* synthetic */ int _availablePermits$volatile;
    public final int ad;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;
    public final C17871e vip;
    public static final /* synthetic */ AtomicReferenceFieldUpdater metrica = AtomicReferenceFieldUpdater.newUpdater(C17663e.class, Object.class, "head$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater license = AtomicLongFieldUpdater.newUpdater(C17663e.class, "deqIdx$volatile");
    public static final /* synthetic */ AtomicReferenceFieldUpdater appmetrica = AtomicReferenceFieldUpdater.newUpdater(C17663e.class, Object.class, "tail$volatile");
    public static final /* synthetic */ AtomicLongFieldUpdater purchase = AtomicLongFieldUpdater.newUpdater(C17663e.class, "enqIdx$volatile");
    public static final /* synthetic */ AtomicIntegerFieldUpdater billing = AtomicIntegerFieldUpdater.newUpdater(C17663e.class, "_availablePermits$volatile");

    public C17663e(int i, int i2) {
        this.ad = i;
        if (i <= 0) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "Semaphore should have at least 1 permit, but had ").toString());
        }
        if (i2 < 0 || i2 > i) {
            throw new IllegalArgumentException(AbstractC1786e.admob(i, "The number of acquired permits should be in 0..").toString());
        }
        C15596e c15596e = new C15596e(0L, null, 2);
        this.head$volatile = c15596e;
        this.tail$volatile = c15596e;
        this._availablePermits$volatile = i - i2;
        this.vip = new C17871e(17, this);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0025, code lost:
    
        r4.smaato(kotlin.Unit.INSTANCE, r3.vip);
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object ad(defpackage.AbstractC10731e r4) {
        /*
            r3 = this;
        L0:
            java.util.concurrent.atomic.AtomicIntegerFieldUpdater r0 = defpackage.C17663e.billing
            int r1 = r0.getAndDecrement(r3)
            int r2 = r3.ad
            if (r1 > r2) goto L0
            if (r1 <= 0) goto Lf
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        Lf:
            eًؗۖ r4 = defpackage.AbstractC10558e.startapp(r4)
            eْۢ٘ r4 = defpackage.AbstractC15297e.metrica(r4)
            boolean r1 = r3.vip(r4)     // Catch: java.lang.Throwable -> L44
            if (r1 != 0) goto L33
        L1d:
            int r1 = r0.getAndDecrement(r3)     // Catch: java.lang.Throwable -> L44
            if (r1 > r2) goto L1d
            if (r1 <= 0) goto L2d
            kotlin.Unit r0 = kotlin.Unit.INSTANCE     // Catch: java.lang.Throwable -> L44
            eٜ٘ؓ r1 = r3.vip     // Catch: java.lang.Throwable -> L44
            r4.smaato(r0, r1)     // Catch: java.lang.Throwable -> L44
            goto L33
        L2d:
            boolean r1 = r3.vip(r4)     // Catch: java.lang.Throwable -> L44
            if (r1 == 0) goto L1d
        L33:
            java.lang.Object r4 = r4.signatures()
            eٟؔۙ r0 = defpackage.EnumC2821e.f6782e
            if (r4 != r0) goto L3c
            goto L3e
        L3c:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
        L3e:
            if (r4 != r0) goto L41
            return r4
        L41:
            kotlin.Unit r4 = kotlin.Unit.INSTANCE
            return r4
        L44:
            r0 = move-exception
            r4.m3617class()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C17663e.ad(eُؑ۠):java.lang.Object");
    }

    public final void metrica() {
        int i;
        Object purchase2;
        boolean z;
        do {
            AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = billing;
            int andIncrement = atomicIntegerFieldUpdater.getAndIncrement(this);
            int i2 = this.ad;
            if (andIncrement >= i2) {
                do {
                    i = atomicIntegerFieldUpdater.get(this);
                    if (i <= i2) {
                        break;
                    }
                } while (!atomicIntegerFieldUpdater.compareAndSet(this, i, i2));
                throw new IllegalStateException(("The number of released permits cannot be greater than " + i2).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = metrica;
            C15596e c15596e = (C15596e) atomicReferenceFieldUpdater.get(this);
            long andIncrement2 = license.getAndIncrement(this);
            long j = andIncrement2 / AbstractC10363e.purchase;
            C10013e c10013e = C10013e.f19767e;
            while (true) {
                purchase2 = AbstractC2251e.purchase(c15596e, j, c10013e);
                if (AbstractC1101e.purchase(purchase2)) {
                    break;
                }
                AbstractC12466e appmetrica2 = AbstractC1101e.appmetrica(purchase2);
                while (true) {
                    AbstractC12466e abstractC12466e = (AbstractC12466e) atomicReferenceFieldUpdater.get(this);
                    if (abstractC12466e.f24956e >= appmetrica2.f24956e) {
                        break;
                    }
                    if (!appmetrica2.adcel()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC12466e, appmetrica2)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC12466e) {
                            if (appmetrica2.purchase()) {
                                appmetrica2.appmetrica();
                            }
                        }
                    }
                    if (abstractC12466e.purchase()) {
                        abstractC12466e.appmetrica();
                    }
                }
            }
            C15596e c15596e2 = (C15596e) AbstractC1101e.appmetrica(purchase2);
            c15596e2.vip();
            AtomicReferenceArray atomicReferenceArray = c15596e2.f30770e;
            z = false;
            if (c15596e2.f24956e <= j) {
                int i3 = (int) (andIncrement2 % AbstractC10363e.purchase);
                Object andSet = atomicReferenceArray.getAndSet(i3, AbstractC10363e.vip);
                if (andSet == null) {
                    int i4 = AbstractC10363e.ad;
                    for (int i5 = 0; i5 < i4; i5++) {
                        if (atomicReferenceArray.get(i3) == AbstractC10363e.metrica) {
                            z = true;
                            break;
                        }
                    }
                    C2443e c2443e = AbstractC10363e.vip;
                    C2443e c2443e2 = AbstractC10363e.license;
                    while (true) {
                        if (!atomicReferenceArray.compareAndSet(i3, c2443e, c2443e2)) {
                            if (atomicReferenceArray.get(i3) != c2443e) {
                                break;
                            }
                        } else {
                            z = true;
                            break;
                        }
                    }
                    z = !z;
                } else if (andSet != AbstractC10363e.appmetrica) {
                    if (andSet instanceof InterfaceC1148e) {
                        InterfaceC1148e interfaceC1148e = (InterfaceC1148e) andSet;
                        C2443e adcel = interfaceC1148e.adcel(Unit.INSTANCE, this.vip);
                        if (adcel != null) {
                            interfaceC1148e.pro(adcel);
                            z = true;
                            break;
                            break;
                        }
                    } else {
                        if (!(andSet instanceof InterfaceC11221e)) {
                            throw new IllegalStateException(("unexpected: " + andSet).toString());
                        }
                        z = ((C16259e) ((InterfaceC11221e) andSet)).yandex(this, Unit.INSTANCE);
                    }
                }
            }
        } while (!z);
    }

    public final boolean vip(InterfaceC5634e interfaceC5634e) {
        Object purchase2;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = appmetrica;
        C15596e c15596e = (C15596e) atomicReferenceFieldUpdater.get(this);
        long andIncrement = purchase.getAndIncrement(this);
        C14527e c14527e = C14527e.f28722e;
        long j = andIncrement / AbstractC10363e.purchase;
        loop0: while (true) {
            purchase2 = AbstractC2251e.purchase(c15596e, j, c14527e);
            if (!AbstractC1101e.purchase(purchase2)) {
                AbstractC12466e appmetrica2 = AbstractC1101e.appmetrica(purchase2);
                while (true) {
                    AbstractC12466e abstractC12466e = (AbstractC12466e) atomicReferenceFieldUpdater.get(this);
                    if (abstractC12466e.f24956e >= appmetrica2.f24956e) {
                        break loop0;
                    }
                    if (!appmetrica2.adcel()) {
                        break;
                    }
                    while (!atomicReferenceFieldUpdater.compareAndSet(this, abstractC12466e, appmetrica2)) {
                        if (atomicReferenceFieldUpdater.get(this) != abstractC12466e) {
                            if (appmetrica2.purchase()) {
                                appmetrica2.appmetrica();
                            }
                        }
                    }
                    if (abstractC12466e.purchase()) {
                        abstractC12466e.appmetrica();
                    }
                }
            } else {
                break;
            }
        }
        C15596e c15596e2 = (C15596e) AbstractC1101e.appmetrica(purchase2);
        AtomicReferenceArray atomicReferenceArray = c15596e2.f30770e;
        int i = (int) (andIncrement % AbstractC10363e.purchase);
        while (!atomicReferenceArray.compareAndSet(i, null, interfaceC5634e)) {
            if (atomicReferenceArray.get(i) != null) {
                C2443e c2443e = AbstractC10363e.vip;
                C2443e c2443e2 = AbstractC10363e.metrica;
                while (!atomicReferenceArray.compareAndSet(i, c2443e, c2443e2)) {
                    if (atomicReferenceArray.get(i) != c2443e) {
                        return false;
                    }
                }
                ((InterfaceC1148e) interfaceC5634e).smaato(Unit.INSTANCE, this.vip);
                return true;
            }
        }
        interfaceC5634e.metrica(c15596e2, i);
        return true;
    }
}
