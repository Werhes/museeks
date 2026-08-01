package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1646e extends AbstractC4488e {
    public final C5302e ad;

    public C1646e(C5302e c5302e) {
        this.ad = c5302e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C1646e) && AbstractC7890e.billing(this.ad, ((C1646e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "NormalClass(value=" + this.ad + ')';
    }
}
