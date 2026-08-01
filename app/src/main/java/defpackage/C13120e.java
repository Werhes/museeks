package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13120e {
    public final EnumC3305e ad;
    public final C7895e appmetrica;
    public final C7895e license;
    public final C12720e metrica;
    public final Boolean vip;

    public /* synthetic */ C13120e(C11328e c11328e) {
        this.ad = (EnumC3305e) c11328e.f22774e;
        this.vip = (Boolean) c11328e.f22772e;
        this.metrica = (C12720e) c11328e.f22771e;
        this.license = (C7895e) c11328e.f22773e;
        this.appmetrica = (C7895e) c11328e.f22770e;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C13120e)) {
            return false;
        }
        C13120e c13120e = (C13120e) obj;
        return AbstractC5729e.vip(this.ad, c13120e.ad) && AbstractC5729e.vip(null, null) && AbstractC5729e.vip(this.vip, c13120e.vip) && AbstractC5729e.vip(null, null) && AbstractC5729e.vip(this.metrica, c13120e.metrica) && AbstractC5729e.vip(this.license, c13120e.license) && AbstractC5729e.vip(this.appmetrica, c13120e.appmetrica);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.ad, null, this.vip, null, this.metrica, this.license, this.appmetrica});
    }
}
