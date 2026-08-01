package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6211e extends AbstractC10385e {
    public final C11056e ad;

    public C6211e(C11056e c11056e) {
        this.ad = c11056e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof C6211e) && AbstractC7890e.billing(this.ad, ((C6211e) obj).ad);
    }

    public final int hashCode() {
        return this.ad.hashCode();
    }

    public final String toString() {
        return "AnnotationValue(" + this.ad + ')';
    }
}
