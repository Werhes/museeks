package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.Executor;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٔؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14510e {
    public final int ad;
    public final InterfaceC8943e appmetrica;
    public final Map billing;
    public final Executor license;
    public final ArrayList metrica;
    public final int purchase;
    public final List vip;

    public C14510e(int i, ArrayList arrayList, ArrayList arrayList2, Executor executor, C13135e c13135e, int i2, LinkedHashMap linkedHashMap) {
        this.ad = i;
        this.vip = arrayList;
        this.metrica = arrayList2;
        this.license = executor;
        this.appmetrica = c13135e;
        this.purchase = i2;
        this.billing = linkedHashMap;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C14510e)) {
            return false;
        }
        C14510e c14510e = (C14510e) obj;
        return this.ad == c14510e.ad && AbstractC7890e.billing(this.vip, c14510e.vip) && this.metrica.equals(c14510e.metrica) && AbstractC7890e.billing(this.license, c14510e.license) && AbstractC7890e.billing(this.appmetrica, c14510e.appmetrica) && this.purchase == c14510e.purchase && AbstractC7890e.billing(this.billing, c14510e.billing);
    }

    public final int hashCode() {
        int i = this.ad * 31;
        List list = this.vip;
        return (this.billing.hashCode() + ((((this.appmetrica.hashCode() + ((this.license.hashCode() + ((this.metrica.hashCode() + ((i + (list == null ? 0 : list.hashCode())) * 31)) * 31)) * 31)) * 31) + this.purchase) * 31)) * 31;
    }

    public final String toString() {
        return "SessionConfigData(sessionType=" + this.ad + ", inputConfiguration=" + this.vip + ", outputConfigurations=" + this.metrica + ", executor=" + this.license + ", stateCallback=" + this.appmetrica + ", sessionTemplateId=" + this.purchase + ", sessionParameters=" + this.billing + ", sessionColorSpace=" + ((Object) "null") + ')';
    }
}
