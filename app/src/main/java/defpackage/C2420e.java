package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؔۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2420e extends AbstractC8589e {
    public final short ad;

    public C2420e(short s) {
        this.ad = s;
    }

    @Override // defpackage.AbstractC8589e
    public final Object ad() {
        return Short.valueOf(this.ad);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2420e) && this.ad == ((C2420e) obj).ad;
    }

    public final int hashCode() {
        return this.ad;
    }
}
