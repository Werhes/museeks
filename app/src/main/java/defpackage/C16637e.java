package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖۥۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16637e extends AbstractC4488e {
    public final AbstractC1186e ad;

    public C16637e(AbstractC1186e abstractC1186e) {
        this.ad = abstractC1186e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C16637e) && AbstractC7890e.billing(this.ad, ((C16637e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "LocalClass(type=" + this.ad + ')';
    }
}
