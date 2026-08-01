package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؐؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10705e implements InterfaceC5738e {
    public final String ad;

    public C10705e(String str) {
        this.ad = str;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C10705e) && AbstractC7890e.billing(this.ad, ((C10705e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return AbstractC4653e.applovin(new StringBuilder("GenericQRCode(url="), this.ad, ')');
    }
}
