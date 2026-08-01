package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚّّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7105e extends AbstractC8589e {
    public final short ad;

    public C7105e(short s) {
        this.ad = s;
    }

    @Override // defpackage.AbstractC8589e
    public final Object ad() {
        return new C11330e(this.ad);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C7105e) && this.ad == ((C7105e) obj).ad;
    }

    public final int hashCode() {
        return this.ad;
    }
}
