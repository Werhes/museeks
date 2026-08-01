package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۜؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11279e {
    public static final C16592e ad = new C16592e(new byte[0], 0, 0, false, false);
    public static final AtomicReference[] metrica;
    public static final int vip;

    static {
        int highestOneBit = Integer.highestOneBit((Runtime.getRuntime().availableProcessors() * 2) - 1);
        vip = highestOneBit;
        AtomicReference[] atomicReferenceArr = new AtomicReference[highestOneBit];
        for (int i = 0; i < highestOneBit; i++) {
            atomicReferenceArr[i] = new AtomicReference();
        }
        metrica = atomicReferenceArr;
    }

    public static final void ad(C16592e c16592e) {
        if (c16592e.purchase != null || c16592e.billing != null) {
            throw new IllegalArgumentException("Failed requirement.");
        }
        if (c16592e.license) {
            return;
        }
        AtomicReference atomicReference = metrica[(int) (Thread.currentThread().getId() & (vip - 1))];
        C16592e c16592e2 = ad;
        C16592e c16592e3 = (C16592e) atomicReference.getAndSet(c16592e2);
        if (c16592e3 == c16592e2) {
            return;
        }
        int i = c16592e3 != null ? c16592e3.metrica : 0;
        if (i >= 65536) {
            atomicReference.set(c16592e3);
            return;
        }
        c16592e.purchase = c16592e3;
        c16592e.vip = 0;
        c16592e.metrica = i + 8192;
        atomicReference.set(c16592e);
    }

    public static final C16592e vip() {
        AtomicReference atomicReference = metrica[(int) (Thread.currentThread().getId() & (vip - 1))];
        C16592e c16592e = ad;
        C16592e c16592e2 = (C16592e) atomicReference.getAndSet(c16592e);
        if (c16592e2 == c16592e) {
            return new C16592e();
        }
        if (c16592e2 == null) {
            atomicReference.set(null);
            return new C16592e();
        }
        atomicReference.set(c16592e2.purchase);
        c16592e2.purchase = null;
        c16592e2.metrica = 0;
        return c16592e2;
    }
}
