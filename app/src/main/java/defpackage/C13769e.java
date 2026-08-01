package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣٓؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13769e extends AbstractC2003e {
    public final String metrica;
    public final String vip;

    public C13769e(String str, String str2) {
        super(3);
        this.vip = str;
        this.metrica = str2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C13769e)) {
            return false;
        }
        C13769e c13769e = (C13769e) obj;
        return AbstractC7890e.billing(this.vip, c13769e.vip) && AbstractC7890e.billing(this.metrica, c13769e.metrica);
    }

    public final int hashCode() {
        return this.metrica.hashCode() + (this.vip.hashCode() * 31);
    }

    @Override // defpackage.AbstractC2003e
    public final String metrica() {
        return this.vip + ':' + this.metrica;
    }
}
