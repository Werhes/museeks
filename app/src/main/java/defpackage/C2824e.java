package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۙۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2824e {
    public final InterfaceC7227e ad;

    public C2824e(InterfaceC7227e interfaceC7227e) {
        this.ad = interfaceC7227e;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof C2824e) {
            return AbstractC7890e.billing(this.ad, ((C2824e) obj).ad);
        }
        return false;
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return ((InterfaceC18155e) this.ad).subs().getName();
    }
}
