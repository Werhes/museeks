package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕؔۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3012e extends AbstractC8589e {
    public final byte ad;

    public C3012e(byte b) {
        this.ad = b;
    }

    @Override // defpackage.AbstractC8589e
    public final Object ad() {
        return new C9287e(this.ad);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C3012e) && this.ad == ((C3012e) obj).ad;
    }

    public final int hashCode() {
        return this.ad;
    }
}
