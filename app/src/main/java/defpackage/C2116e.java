package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۜۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2116e extends AbstractC8589e {
    public final boolean ad;

    public C2116e(boolean z) {
        this.ad = z;
    }

    @Override // defpackage.AbstractC8589e
    public final Object ad() {
        return Boolean.valueOf(this.ad);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2116e) && this.ad == ((C2116e) obj).ad;
    }

    public final int hashCode() {
        return this.ad ? 1231 : 1237;
    }
}
