package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَّٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C10216e extends AbstractC8900e {
    public final String ad;
    public final int appmetrica;
    public final AbstractC8900e license;
    public final List metrica;
    public final String vip;

    public C10216e(String str, String str2, List list, AbstractC8900e abstractC8900e, int i) {
        this.ad = str;
        this.vip = str2;
        this.metrica = list;
        this.license = abstractC8900e;
        this.appmetrica = i;
    }

    public final boolean equals(Object obj) {
        String str;
        AbstractC8900e abstractC8900e;
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC8900e) {
            C10216e c10216e = (C10216e) ((AbstractC8900e) obj);
            AbstractC8900e abstractC8900e2 = c10216e.license;
            String str2 = c10216e.vip;
            if (this.ad.equals(c10216e.ad) && ((str = this.vip) != null ? str.equals(str2) : str2 == null) && this.metrica.equals(c10216e.metrica) && ((abstractC8900e = this.license) != null ? abstractC8900e.equals(abstractC8900e2) : abstractC8900e2 == null) && this.appmetrica == c10216e.appmetrica) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.ad.hashCode() ^ 1000003) * 1000003;
        String str = this.vip;
        int hashCode2 = (((hashCode ^ (str == null ? 0 : str.hashCode())) * 1000003) ^ this.metrica.hashCode()) * 1000003;
        AbstractC8900e abstractC8900e = this.license;
        return ((hashCode2 ^ (abstractC8900e != null ? abstractC8900e.hashCode() : 0)) * 1000003) ^ this.appmetrica;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Exception{type=");
        sb.append(this.ad);
        sb.append(", reason=");
        sb.append(this.vip);
        sb.append(", frames=");
        sb.append(this.metrica);
        sb.append(", causedBy=");
        sb.append(this.license);
        sb.append(", overflowCount=");
        return AbstractC17861e.smaato(this.appmetrica, "}", sb);
    }
}
