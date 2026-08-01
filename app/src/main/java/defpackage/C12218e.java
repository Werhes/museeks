package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّؓٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12218e implements InterfaceC9816e {
    public final C6943e ad;

    public C12218e(C6943e c6943e) {
        this.ad = c6943e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C12218e) && AbstractC7890e.billing(this.ad, ((C12218e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "Ready(book=" + this.ad + ')';
    }
}
