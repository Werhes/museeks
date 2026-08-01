package defpackage;

import java.io.Serializable;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؔؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2335e implements Comparable, Serializable {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final C2335e f5851e = new C2335e(0, 0);

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final long f5852e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final long f5853e;

    public C2335e(long j, long j2) {
        this.f5853e = j;
        this.f5852e = j2;
    }

    public final String ad() {
        byte[] bArr = new byte[32];
        AbstractC8294e.license(this.f5853e, bArr, 0, 0, 8);
        AbstractC8294e.license(this.f5852e, bArr, 16, 0, 8);
        return AbstractC6507e.mopub(bArr);
    }

    @Override // java.lang.Comparable
    public final int compareTo(Object obj) {
        C2335e c2335e = (C2335e) obj;
        long j = c2335e.f5853e;
        long j2 = this.f5853e;
        if (j2 != j) {
            return Long.compare(j2 ^ Long.MIN_VALUE, j ^ Long.MIN_VALUE);
        }
        return Long.compare(this.f5852e ^ Long.MIN_VALUE, c2335e.f5852e ^ Long.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C2335e)) {
            return false;
        }
        C2335e c2335e = (C2335e) obj;
        return this.f5853e == c2335e.f5853e && this.f5852e == c2335e.f5852e;
    }

    public final int hashCode() {
        long j = this.f5853e ^ this.f5852e;
        return (int) (j ^ (j >>> 32));
    }

    public final String toString() {
        byte[] bArr = new byte[36];
        AbstractC8294e.license(this.f5853e, bArr, 0, 0, 4);
        bArr[8] = 45;
        AbstractC8294e.license(this.f5853e, bArr, 9, 4, 6);
        bArr[13] = 45;
        AbstractC8294e.license(this.f5853e, bArr, 14, 6, 8);
        bArr[18] = 45;
        AbstractC8294e.license(this.f5852e, bArr, 19, 0, 2);
        bArr[23] = 45;
        AbstractC8294e.license(this.f5852e, bArr, 24, 2, 8);
        return AbstractC6507e.mopub(bArr);
    }
}
