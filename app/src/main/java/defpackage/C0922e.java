package defpackage;

import java.util.concurrent.atomic.AtomicReferenceArray;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؒۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0922e extends AbstractC12466e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final C14137e f3343e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ AtomicReferenceArray f3344e;

    public C0922e(long j, C0922e c0922e, C14137e c14137e, int i) {
        super(j, c0922e, i);
        this.f3343e = c14137e;
        this.f3344e = new AtomicReferenceArray(AbstractC11295e.vip * 2);
    }

    public final Object advert(int i) {
        return this.f3344e.get((i * 2) + 1);
    }

    public final void amazon(int i, Object obj) {
        this.f3344e.set(i * 2, obj);
    }

    @Override // defpackage.AbstractC12466e
    public final int billing() {
        return AbstractC11295e.vip;
    }

    public final void loadAd(int i, Object obj) {
        this.f3344e.set((i * 2) + 1, obj);
    }

    public final boolean mopub(int i, Object obj, Object obj2) {
        AtomicReferenceArray atomicReferenceArray;
        int i2 = (i * 2) + 1;
        do {
            atomicReferenceArray = this.f3344e;
            if (atomicReferenceArray.compareAndSet(i2, obj, obj2)) {
                return true;
            }
        } while (atomicReferenceArray.get(i2) == obj);
        return false;
    }

    public final void smaato(int i, boolean z) {
        if (z) {
            this.f3343e.m3759protected((this.f24956e * AbstractC11295e.vip) + i);
        }
        startapp();
    }

    /* JADX WARN: Code restructure failed: missing block: B:54:0x005a, code lost:
    
        amazon(r7, null);
     */
    /* JADX WARN: Code restructure failed: missing block: B:55:0x005d, code lost:
    
        if (r1 == false) goto L64;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x005f, code lost:
    
        r7 = r4.f27963e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x0061, code lost:
    
        if (r7 == null) goto L65;
     */
    /* JADX WARN: Code restructure failed: missing block: B:58:0x0063, code lost:
    
        defpackage.AbstractC6401e.license(r7, r0, r8);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0066, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:?, code lost:
    
        return;
     */
    @Override // defpackage.AbstractC12466e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void yandex(int r7, defpackage.InterfaceC8850e r8) {
        /*
            r6 = this;
            int r0 = defpackage.AbstractC11295e.vip
            if (r7 < r0) goto L6
            r1 = 1
            goto L7
        L6:
            r1 = 0
        L7:
            if (r1 == 0) goto La
            int r7 = r7 - r0
        La:
            int r0 = r7 * 2
            java.util.concurrent.atomic.AtomicReferenceArray r2 = r6.f3344e
            java.lang.Object r0 = r2.get(r0)
        L12:
            java.lang.Object r2 = r6.advert(r7)
            boolean r3 = r2 instanceof defpackage.InterfaceC5634e
            eٖٓٞ r4 = r6.f3343e
            r5 = 0
            if (r3 != 0) goto L67
            boolean r3 = r2 instanceof defpackage.C6908e
            if (r3 == 0) goto L22
            goto L67
        L22:
            eًؚؔ r3 = defpackage.AbstractC11295e.adcel
            if (r2 == r3) goto L5a
            eًؚؔ r3 = defpackage.AbstractC11295e.mopub
            if (r2 != r3) goto L2b
            goto L5a
        L2b:
            eًؚؔ r3 = defpackage.AbstractC11295e.billing
            if (r2 == r3) goto L12
            eًؚؔ r3 = defpackage.AbstractC11295e.purchase
            if (r2 != r3) goto L34
            goto L12
        L34:
            eًؚؔ r7 = defpackage.AbstractC11295e.startapp
            if (r2 == r7) goto L85
            eًؚؔ r7 = defpackage.AbstractC11295e.license
            if (r2 != r7) goto L3d
            goto L85
        L3d:
            eًؚؔ r7 = defpackage.AbstractC11295e.advert
            if (r2 != r7) goto L42
            goto L85
        L42:
            java.lang.IllegalStateException r7 = new java.lang.IllegalStateException
            java.lang.StringBuilder r8 = new java.lang.StringBuilder
            java.lang.String r0 = "unexpected state: "
            r8.<init>(r0)
            r8.append(r2)
            java.lang.String r8 = r8.toString()
            java.lang.String r8 = r8.toString()
            r7.<init>(r8)
            throw r7
        L5a:
            r6.amazon(r7, r5)
            if (r1 == 0) goto L85
            kotlin.jvm.functions.Function1 r7 = r4.f27963e
            if (r7 == 0) goto L85
            defpackage.AbstractC6401e.license(r7, r0, r8)
            return
        L67:
            if (r1 == 0) goto L6c
            eًؚؔ r3 = defpackage.AbstractC11295e.adcel
            goto L6e
        L6c:
            eًؚؔ r3 = defpackage.AbstractC11295e.mopub
        L6e:
            boolean r2 = r6.mopub(r7, r2, r3)
            if (r2 == 0) goto L12
            r6.amazon(r7, r5)
            r2 = r1 ^ 1
            r6.smaato(r7, r2)
            if (r1 == 0) goto L85
            kotlin.jvm.functions.Function1 r7 = r4.f27963e
            if (r7 == 0) goto L85
            defpackage.AbstractC6401e.license(r7, r0, r8)
        L85:
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C0922e.yandex(int, eٌِٞ):void");
    }
}
