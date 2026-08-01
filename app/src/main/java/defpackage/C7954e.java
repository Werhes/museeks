package defpackage;

import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public class C7954e {
    volatile /* synthetic */ Object _next = this;
    volatile /* synthetic */ Object _prev = this;
    private volatile /* synthetic */ Object removedRef = null;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16102e = AtomicReferenceFieldUpdater.newUpdater(C7954e.class, Object.class, "_next");

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16101e = AtomicReferenceFieldUpdater.newUpdater(C7954e.class, Object.class, "_prev");

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final /* synthetic */ AtomicReferenceFieldUpdater f16100e = AtomicReferenceFieldUpdater.newUpdater(C7954e.class, Object.class, "removedRef");

    /* JADX WARN: Code restructure failed: missing block: B:47:0x004b, code lost:
    
        r5.metrica();
        r2 = defpackage.C7954e.f16102e;
        r0 = ((defpackage.C12405e) r0).ad;
     */
    /* JADX WARN: Code restructure failed: missing block: B:49:0x0058, code lost:
    
        if (r2.compareAndSet(r7, r5, r0) == false) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x005f, code lost:
    
        if (r2.get(r7) == r5) goto L66;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public void ad() {
        /*
            r9 = this;
        L0:
            java.lang.Object r0 = r9._next
            boolean r1 = r0 instanceof defpackage.C12405e
            if (r1 == 0) goto L8
            goto L85
        L8:
            if (r0 != r9) goto Lc
            goto L85
        Lc:
            r1 = r0
            eًٕۘ r1 = (defpackage.C7954e) r1
            java.lang.Object r2 = r1.removedRef
            eَّۨ r2 = (defpackage.C12405e) r2
            if (r2 != 0) goto L1f
            eَّۨ r2 = new eَّۨ
            r2.<init>(r1)
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.C7954e.f16100e
            r3.lazySet(r1, r2)
        L1f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.C7954e.f16102e
        L21:
            boolean r4 = r3.compareAndSet(r9, r0, r2)
            if (r4 == 0) goto L8d
            eًٕۘ r0 = r9.metrica()
            java.lang.Object r2 = r9._next
            eَّۨ r2 = (defpackage.C12405e) r2
            eًٕۘ r2 = r2.ad
            r4 = 0
            r5 = r0
            r6 = r2
        L34:
            r7 = r4
        L35:
            java.lang.Object r0 = r6._next
            boolean r2 = r0 instanceof defpackage.C12405e
            if (r2 == 0) goto L43
            r6.metrica()
            eَّۨ r0 = (defpackage.C12405e) r0
            eًٕۘ r6 = r0.ad
            goto L35
        L43:
            java.lang.Object r0 = r5._next
            boolean r2 = r0 instanceof defpackage.C12405e
            if (r2 == 0) goto L6a
            if (r7 == 0) goto L63
            r5.metrica()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.C7954e.f16102e
            eَّۨ r0 = (defpackage.C12405e) r0
            eًٕۘ r0 = r0.ad
        L54:
            boolean r3 = r2.compareAndSet(r7, r5, r0)
            if (r3 == 0) goto L5b
            goto L61
        L5b:
            java.lang.Object r3 = r2.get(r7)
            if (r3 == r5) goto L54
        L61:
            r5 = r7
            goto L34
        L63:
            java.lang.Object r0 = r5._prev
            eًٕۘ r0 = defpackage.AbstractC15603e.metrica(r0)
            goto L72
        L6a:
            if (r0 == r9) goto L74
            eًٕۘ r0 = (defpackage.C7954e) r0
            if (r0 != r6) goto L71
            goto L7c
        L71:
            r7 = r5
        L72:
            r5 = r0
            goto L35
        L74:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r8 = defpackage.C7954e.f16102e
        L76:
            boolean r0 = r8.compareAndSet(r5, r9, r6)
            if (r0 == 0) goto L86
        L7c:
            java.lang.Object r0 = r9._prev
            eًٕۘ r0 = defpackage.AbstractC15603e.metrica(r0)
            r1.vip(r0)
        L85:
            return
        L86:
            java.lang.Object r0 = r8.get(r5)
            if (r0 == r9) goto L76
            goto L35
        L8d:
            java.lang.Object r4 = r3.get(r9)
            if (r4 == r0) goto L21
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7954e.ad():void");
    }

    public final C7954e metrica() {
        C7954e c7954e;
        while (true) {
            Object obj = this._prev;
            if (obj instanceof C12405e) {
                return ((C12405e) obj).ad;
            }
            if (obj == this) {
                c7954e = this;
                while (!(c7954e instanceof C11721e)) {
                    c7954e = AbstractC15603e.metrica(c7954e._next);
                    if (c7954e == this) {
                        throw new IllegalStateException("Cannot loop to this while looking for list head");
                    }
                }
            } else {
                c7954e = (C7954e) obj;
            }
            C12405e c12405e = (C12405e) c7954e.removedRef;
            if (c12405e == null) {
                c12405e = new C12405e(c7954e);
                f16100e.lazySet(c7954e, c12405e);
            }
            AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f16101e;
            while (!atomicReferenceFieldUpdater.compareAndSet(this, obj, c12405e)) {
                if (atomicReferenceFieldUpdater.get(this) != obj) {
                    break;
                }
            }
            return (C7954e) obj;
        }
    }

    public final String toString() {
        return AbstractC3820e.ad.vip(getClass()).mopub() + '@' + hashCode();
    }

    /* JADX WARN: Code restructure failed: missing block: B:40:0x000d, code lost:
    
        r7.metrica();
        r3 = defpackage.C7954e.f16102e;
        r2 = ((defpackage.C12405e) r2).ad;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x001a, code lost:
    
        if (r3.compareAndSet(r1, r7, r2) == false) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0021, code lost:
    
        if (r3.get(r1) == r7) goto L52;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void vip(defpackage.C7954e r7) {
        /*
            r6 = this;
            r0 = 0
        L1:
            r1 = r0
        L2:
            java.lang.Object r2 = r7._next
            if (r2 != 0) goto L7
            goto L4d
        L7:
            boolean r3 = r2 instanceof defpackage.C12405e
            if (r3 == 0) goto L2c
            if (r1 == 0) goto L25
            r7.metrica()
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r3 = defpackage.C7954e.f16102e
            eَّۨ r2 = (defpackage.C12405e) r2
            eًٕۘ r2 = r2.ad
        L16:
            boolean r4 = r3.compareAndSet(r1, r7, r2)
            if (r4 == 0) goto L1d
            goto L23
        L1d:
            java.lang.Object r4 = r3.get(r1)
            if (r4 == r7) goto L16
        L23:
            r7 = r1
            goto L1
        L25:
            java.lang.Object r7 = r7._prev
            eًٕۘ r7 = defpackage.AbstractC15603e.metrica(r7)
            goto L2
        L2c:
            java.lang.Object r3 = r6._prev
            boolean r4 = r3 instanceof defpackage.C12405e
            if (r4 == 0) goto L33
            goto L4d
        L33:
            if (r2 == r6) goto L3c
            r1 = r2
            eًٕۘ r1 = (defpackage.C7954e) r1
            r5 = r1
            r1 = r7
            r7 = r5
            goto L2
        L3c:
            if (r3 != r7) goto L3f
            goto L4d
        L3f:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r2 = defpackage.C7954e.f16101e
        L41:
            boolean r4 = r2.compareAndSet(r6, r3, r7)
            if (r4 == 0) goto L4e
            java.lang.Object r2 = r7._prev
            boolean r2 = r2 instanceof defpackage.C12405e
            if (r2 != 0) goto L2
        L4d:
            return
        L4e:
            java.lang.Object r4 = r2.get(r6)
            if (r4 == r3) goto L41
            goto L2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C7954e.vip(eًٕۘ):void");
    }
}
