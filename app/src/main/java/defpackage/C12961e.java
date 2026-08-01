package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؑٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12961e extends AbstractC14681e {
    public final String metrica;
    public final String vip;

    public C12961e(String str, String str2, String str3) {
        super(str);
        this.vip = str2;
        this.metrica = str3;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C12961e.class == obj.getClass()) {
            C12961e c12961e = (C12961e) obj;
            if (this.ad.equals(c12961e.ad) && Objects.equals(this.vip, c12961e.vip) && Objects.equals(this.metrica, c12961e.metrica)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int advert = AbstractC1786e.advert(527, 31, this.ad);
        String str = this.vip;
        int hashCode = (advert + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.metrica;
        return hashCode + (str2 != null ? str2.hashCode() : 0);
    }

    @Override // defpackage.AbstractC14681e
    public final String toString() {
        return this.ad + ": url=" + this.metrica;
    }
}
