package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٟۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15644e extends AbstractC8657e {
    public final List ad;
    public final List appmetrica;
    public final C10330e license;
    public final AbstractC13920e metrica;
    public final AbstractC8900e vip;

    public C15644e(List list, C10216e c10216e, AbstractC13920e abstractC13920e, C10330e c10330e, List list2) {
        this.ad = list;
        this.vip = c10216e;
        this.metrica = abstractC13920e;
        this.license = c10330e;
        this.appmetrica = list2;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof AbstractC8657e)) {
            return false;
        }
        AbstractC8657e abstractC8657e = (AbstractC8657e) obj;
        List list = this.ad;
        if (list == null) {
            if (((C15644e) abstractC8657e).ad != null) {
                return false;
            }
        } else if (!list.equals(((C15644e) abstractC8657e).ad)) {
            return false;
        }
        AbstractC8900e abstractC8900e = this.vip;
        if (abstractC8900e == null) {
            if (((C15644e) abstractC8657e).vip != null) {
                return false;
            }
        } else if (!abstractC8900e.equals(((C15644e) abstractC8657e).vip)) {
            return false;
        }
        AbstractC13920e abstractC13920e = this.metrica;
        if (abstractC13920e == null) {
            if (((C15644e) abstractC8657e).metrica != null) {
                return false;
            }
        } else if (!abstractC13920e.equals(((C15644e) abstractC8657e).metrica)) {
            return false;
        }
        C15644e c15644e = (C15644e) abstractC8657e;
        return this.license.equals(c15644e.license) && this.appmetrica.equals(c15644e.appmetrica);
    }

    public final int hashCode() {
        List list = this.ad;
        int hashCode = ((list == null ? 0 : list.hashCode()) ^ 1000003) * 1000003;
        AbstractC8900e abstractC8900e = this.vip;
        int hashCode2 = (hashCode ^ (abstractC8900e == null ? 0 : abstractC8900e.hashCode())) * 1000003;
        AbstractC13920e abstractC13920e = this.metrica;
        return (((((abstractC13920e != null ? abstractC13920e.hashCode() : 0) ^ hashCode2) * 1000003) ^ this.license.hashCode()) * 1000003) ^ this.appmetrica.hashCode();
    }

    public final String toString() {
        return "Execution{threads=" + this.ad + ", exception=" + this.vip + ", appExitInfo=" + this.metrica + ", signal=" + this.license + ", binaries=" + this.appmetrica + "}";
    }
}
