package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌۜۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8997e {
    public final int ad;
    public final long vip;

    public C8997e(int i, long j) {
        if (i == 0) {
            throw new NullPointerException("Null status");
        }
        this.ad = i;
        this.vip = j;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C8997e)) {
            return false;
        }
        C8997e c8997e = (C8997e) obj;
        return AbstractC8703e.adcel(this.ad, c8997e.ad) && this.vip == c8997e.vip;
    }

    public final int hashCode() {
        int m2467class = (AbstractC8703e.m2467class(this.ad) ^ 1000003) * 1000003;
        long j = this.vip;
        return m2467class ^ ((int) (j ^ (j >>> 32)));
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("BackendResponse{status=");
        int i = this.ad;
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? "null" : "INVALID_PAYLOAD" : "FATAL_ERROR" : "TRANSIENT_ERROR" : "OK");
        sb.append(", nextRequestWaitMillis=");
        return AbstractC5087e.m1750native(this.vip, "}", sb);
    }
}
