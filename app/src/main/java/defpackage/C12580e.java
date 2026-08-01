package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٚۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12580e implements Iterator, InterfaceC16555e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f25270e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f25271e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public int f25272e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public C15926e f25273e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f25274e = -1;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final /* synthetic */ C15453e f25275e;

    public C12580e(C15453e c15453e) {
        this.f25275e = c15453e;
        int metrica = AbstractC3062e.metrica(0, 0, ((CharSequence) c15453e.license).length());
        this.f25272e = metrica;
        this.f25271e = metrica;
    }

    /* JADX WARN: Code restructure failed: missing block: B:9:0x0018, code lost:
    
        if (r6 < r3) goto L10;
     */
    /* JADX WARN: Type inference failed for: r0v7, types: [eٖؑۡ, eُۙۨ] */
    /* JADX WARN: Type inference failed for: r0v8, types: [eٖؑۡ, eُۙۨ] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final void ad() {
        /*
            r7 = this;
            int r0 = r7.f25271e
            r1 = 0
            if (r0 >= 0) goto Lb
            r7.f25274e = r1
            r0 = 0
            r7.f25273e = r0
            return
        Lb:
            eٕٜٓ r2 = r7.f25275e
            int r3 = r2.vip
            r4 = -1
            r5 = 1
            if (r3 <= 0) goto L1a
            int r6 = r7.f25270e
            int r6 = r6 + r5
            r7.f25270e = r6
            if (r6 >= r3) goto L24
        L1a:
            java.lang.Object r3 = r2.license
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r3 = r3.length()
            if (r0 <= r3) goto L38
        L24:
            eٖؑۡ r0 = new eٖؑۡ
            int r1 = r7.f25272e
            java.lang.Object r2 = r2.license
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = defpackage.AbstractC5304e.crashlytics(r2)
            r0.<init>(r1, r2, r5)
            r7.f25273e = r0
            r7.f25271e = r4
            goto L81
        L38:
            kotlin.jvm.functions.Function2 r0 = r2.metrica
            java.lang.Object r3 = r2.license
            java.lang.CharSequence r3 = (java.lang.CharSequence) r3
            int r6 = r7.f25271e
            java.lang.Integer r6 = java.lang.Integer.valueOf(r6)
            java.lang.Object r0 = r0.invoke(r3, r6)
            eؙۖؕ r0 = (defpackage.C6571e) r0
            if (r0 != 0) goto L60
            eٖؑۡ r0 = new eٖؑۡ
            int r1 = r7.f25272e
            java.lang.Object r2 = r2.license
            java.lang.CharSequence r2 = (java.lang.CharSequence) r2
            int r2 = defpackage.AbstractC5304e.crashlytics(r2)
            r0.<init>(r1, r2, r5)
            r7.f25273e = r0
            r7.f25271e = r4
            goto L81
        L60:
            java.lang.Object r2 = r0.f13544e
            java.lang.Number r2 = (java.lang.Number) r2
            int r2 = r2.intValue()
            java.lang.Object r0 = r0.f13543e
            java.lang.Number r0 = (java.lang.Number) r0
            int r0 = r0.intValue()
            int r3 = r7.f25272e
            eٖؑۡ r3 = defpackage.AbstractC3062e.admob(r3, r2)
            r7.f25273e = r3
            int r2 = r2 + r0
            r7.f25272e = r2
            if (r0 != 0) goto L7e
            r1 = r5
        L7e:
            int r2 = r2 + r1
            r7.f25271e = r2
        L81:
            r7.f25274e = r5
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12580e.ad():void");
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (this.f25274e == -1) {
            ad();
        }
        return this.f25274e == 1;
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (this.f25274e == -1) {
            ad();
        }
        if (this.f25274e == 0) {
            throw new NoSuchElementException();
        }
        C15926e c15926e = this.f25273e;
        this.f25273e = null;
        this.f25274e = -1;
        return c15926e;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Operation is not supported for read-only collection");
    }
}
