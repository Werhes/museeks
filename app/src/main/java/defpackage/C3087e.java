package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؒۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3087e implements Comparable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C3087e f7170e = new C3087e(0, 0);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f7171e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f7172e;

    public C3087e(long j, long j2) {
        this.f7172e = j;
        this.f7171e = j2;
    }

    @Override // java.lang.Comparable
    /* renamed from: ad, reason: merged with bridge method [inline-methods] */
    public final int compareTo(C3087e c3087e) {
        int compare = Long.compare(this.f7172e ^ Long.MIN_VALUE, c3087e.f7172e ^ Long.MIN_VALUE);
        if (compare != 0) {
            return compare;
        }
        return Long.compare(this.f7171e ^ Long.MIN_VALUE, c3087e.f7171e ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        C12232e c12232e = AbstractC3820e.ad;
        if (!AbstractC7890e.billing(c12232e.vip(C3087e.class), c12232e.vip(obj.getClass()))) {
            return false;
        }
        C3087e c3087e = (C3087e) obj;
        return this.f7172e == c3087e.f7172e && this.f7171e == c3087e.f7171e;
    }

    public final int hashCode() {
        return C10994e.ad(this.f7171e) + (C10994e.ad(this.f7172e) * 31);
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x01af, code lost:
    
        if ((r14 ^ Long.MIN_VALUE) < (r6 ^ Long.MIN_VALUE)) goto L119;
     */
    /* JADX WARN: Removed duplicated region for block: B:58:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x01b4  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 534
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C3087e.toString():java.lang.String");
    }
}
