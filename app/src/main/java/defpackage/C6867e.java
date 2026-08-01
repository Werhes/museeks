package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؒٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6867e extends AbstractC8589e {
    public final int ad;

    public C6867e(int i) {
        this.ad = i;
    }

    @Override // defpackage.AbstractC8589e
    public final Object ad() {
        return new C2875e(this.ad);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6867e) && this.ad == ((C6867e) obj).ad;
    }

    public final int hashCode() {
        return this.ad;
    }
}
