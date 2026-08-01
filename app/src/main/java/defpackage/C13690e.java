package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓؑؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13690e extends AbstractC0013e {
    public final C15644e ad;
    public final AbstractC0235e appmetrica;
    public final int billing;
    public final Boolean license;
    public final List metrica;
    public final List purchase;
    public final List vip;

    public C13690e(C15644e c15644e, List list, List list2, Boolean bool, AbstractC0235e abstractC0235e, List list3, int i) {
        this.ad = c15644e;
        this.vip = list;
        this.metrica = list2;
        this.license = bool;
        this.appmetrica = abstractC0235e;
        this.purchase = list3;
        this.billing = i;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC0013e)) {
            return false;
        }
        C13690e c13690e = (C13690e) ((AbstractC0013e) obj);
        List list = c13690e.purchase;
        AbstractC0235e abstractC0235e = c13690e.appmetrica;
        Boolean bool = c13690e.license;
        List list2 = c13690e.metrica;
        List list3 = c13690e.vip;
        if (!this.ad.equals(c13690e.ad)) {
            return false;
        }
        List list4 = this.vip;
        if (list4 == null) {
            if (list3 != null) {
                return false;
            }
        } else if (!list4.equals(list3)) {
            return false;
        }
        List list5 = this.metrica;
        if (list5 == null) {
            if (list2 != null) {
                return false;
            }
        } else if (!list5.equals(list2)) {
            return false;
        }
        Boolean bool2 = this.license;
        if (bool2 == null) {
            if (bool != null) {
                return false;
            }
        } else if (!bool2.equals(bool)) {
            return false;
        }
        AbstractC0235e abstractC0235e2 = this.appmetrica;
        if (abstractC0235e2 == null) {
            if (abstractC0235e != null) {
                return false;
            }
        } else if (!abstractC0235e2.equals(abstractC0235e)) {
            return false;
        }
        List list6 = this.purchase;
        if (list6 == null) {
            if (list != null) {
                return false;
            }
        } else if (!list6.equals(list)) {
            return false;
        }
        return this.billing == c13690e.billing;
    }

    public final int hashCode() {
        int hashCode = (this.ad.hashCode() ^ 1000003) * 1000003;
        List list = this.vip;
        int hashCode2 = (hashCode ^ (list == null ? 0 : list.hashCode())) * 1000003;
        List list2 = this.metrica;
        int hashCode3 = (hashCode2 ^ (list2 == null ? 0 : list2.hashCode())) * 1000003;
        Boolean bool = this.license;
        int hashCode4 = (hashCode3 ^ (bool == null ? 0 : bool.hashCode())) * 1000003;
        AbstractC0235e abstractC0235e = this.appmetrica;
        int hashCode5 = (hashCode4 ^ (abstractC0235e == null ? 0 : abstractC0235e.hashCode())) * 1000003;
        List list3 = this.purchase;
        return ((hashCode5 ^ (list3 != null ? list3.hashCode() : 0)) * 1000003) ^ this.billing;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("Application{execution=");
        sb.append(this.ad);
        sb.append(", customAttributes=");
        sb.append(this.vip);
        sb.append(", internalKeys=");
        sb.append(this.metrica);
        sb.append(", background=");
        sb.append(this.license);
        sb.append(", currentProcessDetails=");
        sb.append(this.appmetrica);
        sb.append(", appProcessDetails=");
        sb.append(this.purchase);
        sb.append(", uiOrientation=");
        return AbstractC17861e.smaato(this.billing, "}", sb);
    }
}
