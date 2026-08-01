package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۗٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2795e extends AbstractC2799e {
    public final C15458e ad;

    public C2795e(C15458e c15458e) {
        this.ad = c15458e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C2795e) && AbstractC7890e.billing(this.ad, ((C2795e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "RequestClose(activeCamera=" + this.ad + ')';
    }
}
