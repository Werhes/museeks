package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٓؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1795e implements InterfaceC10957e {
    public final C17983e ad;

    public C1795e(C17983e c17983e) {
        this.ad = c17983e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1795e) && AbstractC7890e.billing(this.ad, ((C1795e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "Result(response=" + this.ad + ')';
    }
}
