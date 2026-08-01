package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C18377e extends AbstractC8589e {
    public final long ad;

    public C18377e(long j) {
        this.ad = j;
    }

    @Override // defpackage.AbstractC8589e
    public final Object ad() {
        return new C10994e(this.ad);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C18377e) && this.ad == ((C18377e) obj).ad;
    }

    public final int hashCode() {
        return C10994e.ad(this.ad);
    }
}
