package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؑ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0329e extends AbstractC8589e {
    public final long ad;

    public C0329e(long j) {
        this.ad = j;
    }

    @Override // defpackage.AbstractC8589e
    public final Object ad() {
        return Long.valueOf(this.ad);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0329e) && this.ad == ((C0329e) obj).ad;
    }

    public final int hashCode() {
        long j = this.ad;
        return (int) (j ^ (j >>> 32));
    }
}
