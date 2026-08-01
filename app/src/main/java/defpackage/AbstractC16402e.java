package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٟ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC16402e {
    public static final C0378e ad = new C0378e(new byte[0], 0, 0, null);
    public static final int appmetrica;
    public static final AtomicReferenceArray billing;
    public static final int license;
    public static final int metrica;
    public static final AtomicReferenceArray purchase;
    public static final int vip;

    static {
        int intValue;
        int i = 0;
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        vip = highestOneBit;
        int i2 = highestOneBit / 2;
        int i3 = i2 >= 1 ? i2 : 1;
        metrica = i3;
        Integer signatures = AbstractC6507e.signatures(System.getProperty("kotlinx.io.pool.size.bytes", AbstractC7890e.billing(System.getProperty("java.vm.name"), "Dalvik") ? "0" : "4194304"));
        if (signatures != null && (intValue = signatures.intValue()) >= 0) {
            i = intValue;
        }
        license = i;
        int i4 = i / i3;
        if (i4 < 8192) {
            i4 = 8192;
        }
        appmetrica = i4;
        purchase = new AtomicReferenceArray(highestOneBit);
        billing = new AtomicReferenceArray(i3);
    }

    public static final void ad(C0378e c0378e) {
        C0378e c0378e2 = ad;
        if (c0378e.purchase != null || c0378e.billing != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        AbstractC5679e abstractC5679e = c0378e.license;
        if (abstractC5679e != null) {
            C10447e c10447e = (C10447e) abstractC5679e;
            if (c10447e.metrica != 0) {
                int decrementAndGet = C10447e.license.decrementAndGet(c10447e);
                if (decrementAndGet >= 0) {
                    return;
                }
                if (decrementAndGet != -1) {
                    throw new IllegalStateException(("Shared copies count is negative: " + (decrementAndGet + 1)).toString());
                }
                c10447e.metrica = 0;
            }
        }
        AtomicReferenceArray atomicReferenceArray = purchase;
        int id = (int) ((vip - 1) & Thread.currentThread().getId());
        c0378e.vip = 0;
        c0378e.appmetrica = true;
        while (true) {
            C0378e c0378e3 = (C0378e) atomicReferenceArray.get(id);
            if (c0378e3 != c0378e2) {
                int i = c0378e3 != null ? c0378e3.metrica : 0;
                if (i < 65536) {
                    c0378e.purchase = c0378e3;
                    c0378e.metrica = i + 8192;
                    while (!atomicReferenceArray.compareAndSet(id, c0378e3, c0378e)) {
                        if (atomicReferenceArray.get(id) != c0378e3) {
                            break;
                        }
                    }
                    return;
                }
                if (license <= 0) {
                    return;
                }
                c0378e.vip = 0;
                c0378e.appmetrica = true;
                int id2 = (int) ((metrica - 1) & Thread.currentThread().getId());
                AtomicReferenceArray atomicReferenceArray2 = billing;
                int i2 = 0;
                while (true) {
                    C0378e c0378e4 = (C0378e) atomicReferenceArray2.get(id2);
                    if (c0378e4 != c0378e2) {
                        int i3 = (c0378e4 != null ? c0378e4.metrica : 0) + 8192;
                        if (i3 <= appmetrica) {
                            c0378e.purchase = c0378e4;
                            c0378e.metrica = i3;
                            while (!atomicReferenceArray2.compareAndSet(id2, c0378e4, c0378e)) {
                                if (atomicReferenceArray2.get(id2) != c0378e4) {
                                    break;
                                }
                            }
                            return;
                        }
                        int i4 = metrica;
                        if (i2 >= i4) {
                            return;
                        }
                        i2++;
                        id2 = (id2 + 1) & (i4 - 1);
                    }
                }
            }
        }
    }

    public static final C0378e vip() {
        AtomicReferenceArray atomicReferenceArray;
        C0378e c0378e;
        C0378e c0378e2;
        int id = (int) ((vip - 1) & Thread.currentThread().getId());
        do {
            atomicReferenceArray = purchase;
            c0378e = ad;
            c0378e2 = (C0378e) atomicReferenceArray.getAndSet(id, c0378e);
        } while (AbstractC7890e.billing(c0378e2, c0378e));
        if (c0378e2 != null) {
            atomicReferenceArray.set(id, c0378e2.purchase);
            c0378e2.purchase = null;
            c0378e2.metrica = 0;
            return c0378e2;
        }
        atomicReferenceArray.set(id, null);
        if (license <= 0) {
            return new C0378e();
        }
        int i = metrica;
        int id2 = (int) (Thread.currentThread().getId() & (i - 1));
        int i2 = 0;
        while (true) {
            AtomicReferenceArray atomicReferenceArray2 = billing;
            C0378e c0378e3 = (C0378e) atomicReferenceArray2.getAndSet(id2, c0378e);
            if (!AbstractC7890e.billing(c0378e3, c0378e)) {
                if (c0378e3 != null) {
                    atomicReferenceArray2.set(id2, c0378e3.purchase);
                    c0378e3.purchase = null;
                    c0378e3.metrica = 0;
                    return c0378e3;
                }
                atomicReferenceArray2.set(id2, null);
                if (i2 >= i) {
                    return new C0378e();
                }
                id2 = (id2 + 1) & (i - 1);
                i2++;
            }
        }
    }
}
