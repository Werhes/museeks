package defpackage;

import j$.util.DesugarCollections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C4898e {
    public final String ad;
    public final List appmetrica;
    public final List license;
    public final String metrica;
    public final String vip;

    public C4898e(String str, String str2, String str3, List list, List list2) {
        this.ad = str;
        this.vip = str2;
        this.metrica = str3;
        this.license = DesugarCollections.unmodifiableList(list);
        this.appmetrica = DesugarCollections.unmodifiableList(list2);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C4898e.class != obj.getClass()) {
            return false;
        }
        C4898e c4898e = (C4898e) obj;
        if (this.ad.equals(c4898e.ad) && this.vip.equals(c4898e.vip) && this.metrica.equals(c4898e.metrica) && this.license.equals(c4898e.license)) {
            return this.appmetrica.equals(c4898e.appmetrica);
        }
        return false;
    }

    public final int hashCode() {
        return this.appmetrica.hashCode() + ((this.license.hashCode() + AbstractC1786e.advert(AbstractC1786e.advert(this.ad.hashCode() * 31, 31, this.vip), 31, this.metrica)) * 31);
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ForeignKey{referenceTable='");
        sb.append(this.ad);
        sb.append("', onDelete='");
        sb.append(this.vip);
        sb.append("', onUpdate='");
        sb.append(this.metrica);
        sb.append("', columnNames=");
        sb.append(this.license);
        sb.append(", referenceColumnNames=");
        return AbstractC1786e.tapsense(sb, this.appmetrica, '}');
    }
}
