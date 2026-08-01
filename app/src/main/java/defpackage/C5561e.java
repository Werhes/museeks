package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘَٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5561e implements InterfaceC3851e {
    public final Exception ad;

    public C5561e(Exception exc) {
        this.ad = exc;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C5561e) && AbstractC7890e.billing(this.ad, ((C5561e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "InitializingDiscoveryFailed(code=" + this.ad + ')';
    }
}
