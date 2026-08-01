package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7735e {
    public final int ad;
    public final String license;
    public final InterfaceC12516e metrica;
    public final C13391e vip;

    public C7735e(C13391e c13391e, InterfaceC12516e interfaceC12516e, String str) {
        this.vip = c13391e;
        this.metrica = interfaceC12516e;
        this.license = str;
        this.ad = Arrays.hashCode(new Object[]{c13391e, interfaceC12516e, str, null});
    }

    public final boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof C7735e)) {
            return false;
        }
        C7735e c7735e = (C7735e) obj;
        return AbstractC5729e.vip(this.vip, c7735e.vip) && AbstractC5729e.vip(this.metrica, c7735e.metrica) && AbstractC5729e.vip(this.license, c7735e.license) && AbstractC5729e.vip(null, null);
    }

    public final int hashCode() {
        return this.ad;
    }
}
