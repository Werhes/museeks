package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۦ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15106e implements InterfaceC1365e {
    public final AbstractC10727e ad;

    public C15106e(AbstractC10727e abstractC10727e) {
        this.ad = abstractC10727e;
    }

    @Override // defpackage.InterfaceC1365e
    public final AbstractC10727e ad() {
        return this.ad;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C15106e) && AbstractC7890e.billing(this.ad, ((C15106e) obj).ad);
    }

    public final int hashCode() {
        AbstractC10727e abstractC10727e = this.ad;
        if (abstractC10727e == null) {
            return 0;
        }
        return abstractC10727e.hashCode();
    }

    public final String toString() {
        return "Loading(painter=" + this.ad + ")";
    }
}
