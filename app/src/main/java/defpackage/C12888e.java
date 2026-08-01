package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۦؙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12888e implements Iterator {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final boolean f25740e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final CharSequence f25741e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public String f25742e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C6594e f25743e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final AbstractC7723e f25744e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public int f25746e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f25745e = 2;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f25747e = 0;

    public C12888e(C6594e c6594e, C0381e c0381e, CharSequence charSequence) {
        this.f25743e = c6594e;
        this.f25744e = (AbstractC7723e) c0381e.license;
        this.f25740e = c0381e.metrica;
        this.f25746e = c0381e.vip;
        this.f25741e = charSequence;
    }

    /* JADX WARN: Code restructure failed: missing block: B:42:0x008d, code lost:
    
        r8 = r10.f25746e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008f, code lost:
    
        if (r8 != 1) goto L49;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0091, code lost:
    
        r3 = r6.length();
        r10.f25747e = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x0097, code lost:
    
        if (r3 <= r0) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00a3, code lost:
    
        if (r7.metrica(r6.charAt(r3 - 1)) == false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00a5, code lost:
    
        r3 = r3 - 1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00ab, code lost:
    
        r0 = r6.subSequence(r0, r3).toString();
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x00a8, code lost:
    
        r10.f25746e = r8 - 1;
     */
    @Override // java.util.Iterator
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final boolean hasNext() {
        /*
            r10 = this;
            int r0 = r10.f25745e
            r1 = 0
            r2 = 1
            r3 = 4
            if (r0 == r3) goto L9
            r0 = r2
            goto La
        L9:
            r0 = r1
        La:
            defpackage.AbstractC2301e.subscription(r0)
            int r0 = r10.f25745e
            int r0 = defpackage.AbstractC8703e.m2467class(r0)
            if (r0 == 0) goto Lc1
            r4 = 2
            if (r0 == r4) goto Lc0
            r10.f25745e = r3
            int r0 = r10.f25747e
        L1c:
            int r3 = r10.f25747e
            r4 = 3
            r5 = -1
            if (r3 == r5) goto Lb4
            eؙۗۗ r6 = r10.f25743e
            java.lang.Object r6 = r6.f13613e
            e٘ۦٕ r6 = (defpackage.C18142e) r6
            java.lang.CharSequence r7 = r10.f25741e
            int r8 = r7.length()
            defpackage.AbstractC2301e.loadAd(r3, r8)
        L31:
            if (r3 >= r8) goto L41
            char r9 = r7.charAt(r3)
            boolean r9 = r6.metrica(r9)
            if (r9 == 0) goto L3e
            goto L42
        L3e:
            int r3 = r3 + 1
            goto L31
        L41:
            r3 = -1
        L42:
            java.lang.CharSequence r6 = r10.f25741e
            if (r3 != r5) goto L4d
            int r3 = r6.length()
            r10.f25747e = r5
            goto L51
        L4d:
            int r7 = r3 + 1
            r10.f25747e = r7
        L51:
            int r7 = r10.f25747e
            if (r7 != r0) goto L62
            int r7 = r7 + 1
            r10.f25747e = r7
            int r3 = r6.length()
            if (r7 <= r3) goto L1c
            r10.f25747e = r5
            goto L1c
        L62:
            eًؕۤ r7 = r10.f25744e
            if (r0 >= r3) goto L73
            char r8 = r6.charAt(r0)
            boolean r8 = r7.metrica(r8)
            if (r8 == 0) goto L73
            int r0 = r0 + 1
            goto L62
        L73:
            if (r3 <= r0) goto L84
            int r8 = r3 + (-1)
            char r8 = r6.charAt(r8)
            boolean r8 = r7.metrica(r8)
            if (r8 == 0) goto L84
            int r3 = r3 + (-1)
            goto L73
        L84:
            boolean r8 = r10.f25740e
            if (r8 == 0) goto L8d
            if (r0 != r3) goto L8d
            int r0 = r10.f25747e
            goto L1c
        L8d:
            int r8 = r10.f25746e
            if (r8 != r2) goto La8
            int r3 = r6.length()
            r10.f25747e = r5
        L97:
            if (r3 <= r0) goto Lab
            int r5 = r3 + (-1)
            char r5 = r6.charAt(r5)
            boolean r5 = r7.metrica(r5)
            if (r5 == 0) goto Lab
            int r3 = r3 + (-1)
            goto L97
        La8:
            int r8 = r8 - r2
            r10.f25746e = r8
        Lab:
            java.lang.CharSequence r0 = r6.subSequence(r0, r3)
            java.lang.String r0 = r0.toString()
            goto Lb7
        Lb4:
            r10.f25745e = r4
            r0 = 0
        Lb7:
            r10.f25742e = r0
            int r0 = r10.f25745e
            if (r0 == r4) goto Lc0
            r10.f25745e = r2
            return r2
        Lc0:
            return r1
        Lc1:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C12888e.hasNext():boolean");
    }

    @Override // java.util.Iterator
    public final Object next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.f25745e = 2;
        String str = this.f25742e;
        this.f25742e = null;
        return str;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
