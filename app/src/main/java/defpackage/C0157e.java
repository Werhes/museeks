package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؑۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C0157e implements InterfaceC11640e {
    public final C2362e ad;

    public C0157e(C2362e c2362e) {
        this.ad = c2362e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C0157e) && AbstractC7890e.billing(this.ad, ((C0157e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "Supported(resolvedFeatureGroup=" + this.ad + ')';
    }
}
