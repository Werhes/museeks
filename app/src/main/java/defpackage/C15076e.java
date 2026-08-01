package defpackage;

import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔۤۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15076e {
    public final Integer ad;
    public final C10985e appmetrica;
    public final int billing;
    public final C6571e license;
    public final String metrica;
    public final Function0 purchase;
    public final String vip;

    public C15076e(Integer num, String str, String str2, C6571e c6571e, C10985e c10985e, Function0 function0, int i) {
        this.ad = num;
        this.vip = str;
        this.metrica = str2;
        this.license = c6571e;
        this.appmetrica = c10985e;
        this.purchase = function0;
        this.billing = i;
    }

    public /* synthetic */ C15076e(Integer num, String str, String str2, C6571e c6571e, Function0 function0, int i) {
        this((i & 1) != 0 ? null : num, str, (i & 4) != 0 ? null : str2, (i & 8) != 0 ? null : c6571e, null, (i & 32) != 0 ? null : function0, (i & 64) != 0 ? R.drawable.ic_close : R.drawable.ic_edit_outline_28);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C15076e)) {
            return false;
        }
        C15076e c15076e = (C15076e) obj;
        return AbstractC7890e.billing(this.ad, c15076e.ad) && AbstractC7890e.billing(this.vip, c15076e.vip) && AbstractC7890e.billing(this.metrica, c15076e.metrica) && AbstractC7890e.billing(this.license, c15076e.license) && AbstractC7890e.billing(this.appmetrica, c15076e.appmetrica) && AbstractC7890e.billing(this.purchase, c15076e.purchase) && this.billing == c15076e.billing;
    }

    public final int hashCode() {
        Integer num = this.ad;
        int advert = AbstractC1786e.advert((num == null ? 0 : num.hashCode()) * 31, 31, this.vip);
        String str = this.metrica;
        int hashCode = (advert + (str == null ? 0 : str.hashCode())) * 31;
        C6571e c6571e = this.license;
        int hashCode2 = (hashCode + (c6571e == null ? 0 : c6571e.hashCode())) * 31;
        C10985e c10985e = this.appmetrica;
        int hashCode3 = (hashCode2 + (c10985e == null ? 0 : c10985e.hashCode())) * 31;
        Function0 function0 = this.purchase;
        return ((hashCode3 + (function0 != null ? function0.hashCode() : 0)) * 31) + this.billing;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("ASContent(icon=");
        sb.append(this.ad);
        sb.append(", title=");
        sb.append(this.vip);
        sb.append(", subtitle=");
        sb.append(this.metrica);
        sb.append(", action=");
        sb.append(this.license);
        sb.append(", secondaryAction=");
        sb.append(this.appmetrica);
        sb.append(", actionOnClose=");
        sb.append(this.purchase);
        sb.append(", actionIcon=");
        return AbstractC1786e.pro(sb, this.billing, ')');
    }
}
