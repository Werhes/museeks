package defpackage;

import java.util.ArrayList;
import java.util.LinkedHashMap;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؗۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5138e {
    public final ArrayList ad;
    public final LinkedHashMap license;
    public final InterfaceC2901e metrica;
    public final LinkedHashMap vip;

    public C5138e(ArrayList arrayList, LinkedHashMap linkedHashMap, C2012e c2012e, LinkedHashMap linkedHashMap2) {
        this.ad = arrayList;
        this.vip = linkedHashMap;
        this.metrica = c2012e;
        this.license = linkedHashMap2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5138e)) {
            return false;
        }
        C5138e c5138e = (C5138e) obj;
        return this.ad.equals(c5138e.ad) && this.vip.equals(c5138e.vip) && AbstractC7890e.billing(this.metrica, c5138e.metrica) && this.license.equals(c5138e.license);
    }

    public final int hashCode() {
        int yandex = AbstractC17861e.yandex(this.vip, this.ad.hashCode() * 31, 31);
        InterfaceC2901e interfaceC2901e = this.metrica;
        return this.license.hashCode() + ((yandex + (interfaceC2901e == null ? 0 : interfaceC2901e.hashCode())) * 31);
    }

    public final String toString() {
        return "OutputConfigurations(all=" + this.ad + ", deferred=" + this.vip + ", postviewOutput=" + this.metrica + ", outputSurfaceMap=" + this.license + ')';
    }
}
