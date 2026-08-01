package defpackage;

import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۦٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C9903e extends AbstractC0586e {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public C2532e f19529e;

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public final int f19530e;

    public C9903e(C2532e c2532e, int i) {
        this.f19529e = c2532e;
        this.f19530e = i;
    }

    @Override // defpackage.AbstractC0586e
    public final void license() {
        AtomicLong atomicLong;
        long j;
        int i;
        int i2;
        boolean z;
        C2532e c2532e = this.f19529e;
        this.f19529e = null;
        if (c2532e == null) {
            return;
        }
        AtomicReference atomicReference = (AtomicReference) c2532e.f6385e;
        do {
            atomicLong = (AtomicLong) c2532e.f6386e;
            j = atomicLong.get();
            i = (int) j;
            long j2 = j >>> 32;
            if (i == Integer.MIN_VALUE) {
                StringBuilder sb = new StringBuilder(String.valueOf(j).length() + 13);
                sb.append("Refcount is: ");
                sb.append(j);
                throw new AssertionError(sb.toString());
            }
            i2 = (int) j2;
            z = i == -2147483647;
            if (z) {
                i2++;
            }
        } while (!atomicLong.compareAndSet(j, (i2 << 32) | (4294967295L & (i - 1))));
        if (!z) {
            return;
        }
        while (true) {
            C3357e c3357e = (C3357e) atomicReference.get();
            if (c3357e != null) {
                if (c3357e.f7564e <= this.f19530e) {
                    c3357e.cancel(true);
                    while (!atomicReference.compareAndSet(c3357e, null)) {
                        if (atomicReference.get() != c3357e) {
                            break;
                        }
                    }
                    return;
                }
                return;
            }
            return;
        }
    }

    @Override // defpackage.AbstractC0586e
    public final String mopub() {
        InterfaceC0987e interfaceC0987e;
        C2532e c2532e = this.f19529e;
        if (c2532e == null || (interfaceC0987e = (InterfaceC0987e) ((RunnableC12554e) c2532e.f6388e).f25148e) == null) {
            return null;
        }
        String obj = interfaceC0987e.toString();
        String ads = AbstractC8647e.ads(new StringBuilder(obj.length() + 11), "callable=[", obj, "]");
        C3357e c3357e = (C3357e) ((AtomicReference) this.f19529e.f6385e).get();
        if (c3357e == null) {
            return ads;
        }
        int length = ads.length();
        String abstractC0586e = c3357e.toString();
        return AbstractC4653e.ads(new StringBuilder(abstractC0586e.length() + length + 9 + 1), ads, ", trial=[", abstractC0586e, "]");
    }
}
