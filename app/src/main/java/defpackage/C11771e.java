package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٖۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11771e extends AbstractC2003e {
    public final String metrica;
    public final String vip;

    public C11771e(String str, String str2) {
        super(3);
        this.vip = str;
        this.metrica = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C11771e)) {
            return false;
        }
        C11771e c11771e = (C11771e) obj;
        return AbstractC7890e.billing(this.vip, c11771e.vip) && AbstractC7890e.billing(this.metrica, c11771e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + (this.vip.hashCode() * 31);
    }

    @Override // defpackage.AbstractC2003e
    public final String metrica() {
        return this.vip + this.metrica;
    }
}
