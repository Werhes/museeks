package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18240e {
    public final ArrayList ad;
    public final Map appmetrica;
    public final C13274e billing;
    public final int license;
    public final InterfaceC8943e metrica;
    public final Integer purchase;
    public final ExecutorC13626e vip;
    public final InterfaceC2901e yandex;

    public C18240e(ArrayList arrayList, ExecutorC13626e executorC13626e, C13135e c13135e, int i, LinkedHashMap linkedHashMap, Integer num, C13274e c13274e, InterfaceC2901e interfaceC2901e) {
        this.ad = arrayList;
        this.vip = executorC13626e;
        this.metrica = c13135e;
        this.license = i;
        this.appmetrica = linkedHashMap;
        this.purchase = num;
        this.billing = c13274e;
        this.yandex = interfaceC2901e;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C18240e)) {
            return false;
        }
        C18240e c18240e = (C18240e) obj;
        return this.ad.equals(c18240e.ad) && this.vip.equals(c18240e.vip) && AbstractC7890e.billing(this.metrica, c18240e.metrica) && this.license == c18240e.license && AbstractC7890e.billing(this.appmetrica, c18240e.appmetrica) && this.purchase.equals(c18240e.purchase) && this.billing.equals(c18240e.billing) && AbstractC7890e.billing(this.yandex, c18240e.yandex);
    }

    public final int hashCode() {
        int hashCode = (this.billing.hashCode() + ((this.purchase.hashCode() + ((this.appmetrica.hashCode() + ((((this.metrica.hashCode() + ((this.vip.hashCode() + ((this.ad.hashCode() + 62) * 31)) * 31)) * 31) + this.license) * 31)) * 31)) * 31)) * 31;
        InterfaceC2901e interfaceC2901e = this.yandex;
        return hashCode + (interfaceC2901e == null ? 0 : interfaceC2901e.hashCode());
    }

    public final String toString() {
        return "ExtensionSessionConfigData(sessionType=2, outputConfigurations=" + this.ad + ", executor=" + this.vip + ", stateCallback=" + this.metrica + ", sessionTemplateId=" + this.license + ", sessionParameters=" + this.appmetrica + ", extensionMode=" + this.purchase + ", extensionStateCallback=" + this.billing + ", postviewOutputConfiguration=" + this.yandex + ')';
    }
}
