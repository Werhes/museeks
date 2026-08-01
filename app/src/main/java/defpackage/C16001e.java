package defpackage;

import android.content.Context;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16001e extends AbstractC16222e {
    public final Context ad;
    public final String license;
    public final InterfaceC3832e metrica;
    public final InterfaceC3832e vip;

    public C16001e(Context context, InterfaceC3832e interfaceC3832e, InterfaceC3832e interfaceC3832e2, String str) {
        if (context == null) {
            throw new NullPointerException("Null applicationContext");
        }
        this.ad = context;
        if (interfaceC3832e == null) {
            throw new NullPointerException("Null wallClock");
        }
        this.vip = interfaceC3832e;
        if (interfaceC3832e2 == null) {
            throw new NullPointerException("Null monotonicClock");
        }
        this.metrica = interfaceC3832e2;
        if (str == null) {
            throw new NullPointerException("Null backendName");
        }
        this.license = str;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof AbstractC16222e) {
            C16001e c16001e = (C16001e) ((AbstractC16222e) obj);
            if (this.ad.equals(c16001e.ad) && this.vip.equals(c16001e.vip) && this.metrica.equals(c16001e.metrica) && this.license.equals(c16001e.license)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((((this.ad.hashCode() ^ 1000003) * 1000003) ^ this.vip.hashCode()) * 1000003) ^ this.metrica.hashCode()) * 1000003) ^ this.license.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("CreationContext{applicationContext=");
        sb.append(this.ad);
        sb.append(", wallClock=");
        sb.append(this.vip);
        sb.append(", monotonicClock=");
        sb.append(this.metrica);
        sb.append(", backendName=");
        return AbstractC1786e.signatures(sb, this.license, "}");
    }
}
