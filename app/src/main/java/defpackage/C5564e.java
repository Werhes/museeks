package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘَۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5564e {
    public final long ad;
    public final Long vip;

    public C5564e(long j, Long l) {
        this.ad = j;
        this.vip = l;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C5564e.class == obj.getClass()) {
            C5564e c5564e = (C5564e) obj;
            if (this.ad == c5564e.ad && Objects.equals(this.vip, c5564e.vip)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Objects.hash(Long.valueOf(this.ad), this.vip);
    }

    public final String toString() {
        return "ByteRange{mSubRangeLength=" + this.ad + ", mOffset=" + this.vip + '}';
    }
}
