package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؕٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3175e implements Comparable {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final Object f7291e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final int f7292e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final String f7293e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final long f7294e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f7295e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public final RuntimeException f7296e;

    public C3175e(long j, String str, int i, long j2, Object obj) {
        AbstractC2301e.billing(((j > 0L ? 1 : (j == 0L ? 0 : -1)) == 0) == (str != null));
        this.f7295e = j;
        this.f7293e = str;
        this.f7292e = i;
        this.f7294e = j2;
        this.f7291e = obj;
        if (i != 5) {
            this.f7296e = null;
            return;
        }
        if (obj == null) {
            this.f7296e = new NullPointerException("Null stringOrBytes");
        } else if ((obj instanceof byte[]) || (obj instanceof AbstractC7244e)) {
            this.f7296e = null;
        } else {
            this.f7296e = new RuntimeException("Wrong stringOrBytes type: ".concat(String.valueOf(obj.getClass())));
        }
    }

    public final Object ad() {
        int i = this.f7292e;
        if (i == 0) {
            return Boolean.FALSE;
        }
        if (i == 1) {
            return Boolean.TRUE;
        }
        long j = this.f7294e;
        if (i == 2) {
            return Long.valueOf(j);
        }
        if (i == 3) {
            return Double.valueOf(Double.longBitsToDouble(j));
        }
        Object obj = this.f7291e;
        if (i == 4) {
            obj.getClass();
            return obj;
        }
        if (i != 5) {
            throw new AssertionError("Impossible, this was validated when parsed or created");
        }
        obj.getClass();
        try {
            return obj instanceof byte[] ? (byte[]) obj : ((AbstractC7244e) obj).admob();
        } catch (Throwable th) {
            RuntimeException runtimeException = this.f7296e;
            if (runtimeException != null) {
                th.addSuppressed(runtimeException);
            }
            throw th;
        }
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C3175e c3175e = (C3175e) obj;
        long j = c3175e.f7295e;
        long j2 = this.f7295e;
        int compare = Long.compare(j2, j);
        if (compare != 0) {
            return compare;
        }
        if (j2 != 0) {
            return 0;
        }
        String str = this.f7293e;
        str.getClass();
        String str2 = c3175e.f7293e;
        str2.getClass();
        return str.compareTo(str2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C3175e)) {
            return false;
        }
        C3175e c3175e = (C3175e) obj;
        return this.f7295e == c3175e.f7295e && Objects.equals(this.f7293e, c3175e.f7293e);
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.f7295e), this.f7293e);
    }

    public final String toString() {
        String str = this.f7293e;
        if (str == null) {
            str = Long.toString(this.f7295e);
        }
        String valueOf = String.valueOf(ad());
        return AbstractC8647e.ads(new StringBuilder(String.valueOf(str).length() + 1 + valueOf.length()), str, ":", valueOf);
    }
}
