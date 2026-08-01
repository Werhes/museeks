package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7055e {
    private volatile /* synthetic */ Object _next$volatile = this;
    private volatile /* synthetic */ Object _prev$volatile = this;
    private volatile /* synthetic */ Object _removedRef$volatile;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14486e = AtomicReferenceFieldUpdater.newUpdater(C7055e.class, Object.class, "_next$volatile");

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14485e = AtomicReferenceFieldUpdater.newUpdater(C7055e.class, Object.class, "_prev$volatile");

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f14484e = AtomicReferenceFieldUpdater.newUpdater(C7055e.class, Object.class, "_removedRef$volatile");

    public final void appmetrica(C7055e c7055e) {
        while (true) {
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14485e;
            C7055e c7055e2 = (C7055e) atomicReferenceFieldUpdater.get(c7055e);
            if (f14486e.get(this) != c7055e) {
                return;
            }
            while (!atomicReferenceFieldUpdater.compareAndSet(c7055e, c7055e2, this)) {
                if (atomicReferenceFieldUpdater.get(c7055e) != c7055e2) {
                    break;
                }
            }
            if (yandex()) {
                c7055e.license();
                return;
            }
            return;
        }
    }

    public final C7055e billing() {
        C7055e c7055e;
        Object obj = f14486e.get(this);
        C5670e c5670e = obj instanceof C5670e ? (C5670e) obj : null;
        return (c5670e == null || (c7055e = c5670e.ad) == null) ? (C7055e) obj : c7055e;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0031, code lost:
    
        r6 = ((defpackage.C5670e) r6).ad;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0039, code lost:
    
        if (r5.compareAndSet(r4, r3, r6) == false) goto L24;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x0041, code lost:
    
        if (r5.get(r4) == r3) goto L43;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final defpackage.C7055e license() {
        /*
            r9 = this;
        L0:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r0 = defpackage.C7055e.f14485e
            java.lang.Object r1 = r0.get(r9)
            eَؚٕ r1 = (defpackage.C7055e) r1
            r2 = 0
            r3 = r1
        La:
            r4 = r2
        Lb:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.C7055e.f14486e
            java.lang.Object r6 = r5.get(r3)
            if (r6 != r9) goto L24
            if (r1 != r3) goto L16
            return r3
        L16:
            boolean r2 = r0.compareAndSet(r9, r1, r3)
            if (r2 == 0) goto L1d
            return r3
        L1d:
            java.lang.Object r2 = r0.get(r9)
            if (r2 == r1) goto L16
            goto L0
        L24:
            boolean r7 = r9.yandex()
            if (r7 == 0) goto L2b
            return r2
        L2b:
            boolean r7 = r6 instanceof defpackage.C5670e
            if (r7 == 0) goto L4b
            if (r4 == 0) goto L44
            eؘٖٝ r6 = (defpackage.C5670e) r6
            eَؚٕ r6 = r6.ad
        L35:
            boolean r7 = r5.compareAndSet(r4, r3, r6)
            if (r7 == 0) goto L3d
            r3 = r4
            goto La
        L3d:
            java.lang.Object r7 = r5.get(r4)
            if (r7 == r3) goto L35
            goto L0
        L44:
            java.lang.Object r3 = r0.get(r3)
            eَؚٕ r3 = (defpackage.C7055e) r3
            goto Lb
        L4b:
            r4 = r6
            eَؚٕ r4 = (defpackage.C7055e) r4
            r8 = r4
            r4 = r3
            r3 = r8
            goto Lb
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7055e.license():eَؚٕ");
    }

    public final boolean metrica(C7055e c7055e, int i) {
        while (true) {
            C7055e license = license();
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f14485e;
            if (license == null) {
                Object obj = atomicReferenceFieldUpdater.get(this);
                while (true) {
                    license = (C7055e) obj;
                    if (!license.yandex()) {
                        break;
                    }
                    obj = atomicReferenceFieldUpdater.get(license);
                }
            }
            if (license instanceof C8590e) {
                return (((C8590e) license).f17410e & i) == 0 && license.metrica(c7055e, i);
            }
            atomicReferenceFieldUpdater.set(c7055e, license);
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater2 = f14486e;
            atomicReferenceFieldUpdater2.set(c7055e, this);
            while (!atomicReferenceFieldUpdater2.compareAndSet(license, this, c7055e)) {
                if (atomicReferenceFieldUpdater2.get(license) != this) {
                    break;
                }
            }
            c7055e.appmetrica(this);
            return true;
        }
    }

    public String toString() {
        return new C12781e(1, 8, AbstractC7111e.class, this, "classSimpleName", "getClassSimpleName(Ljava/lang/Object;)Ljava/lang/String;") + '@' + AbstractC7111e.purchase(this);
    }

    public boolean yandex() {
        return f14486e.get(this) instanceof C5670e;
    }
}
