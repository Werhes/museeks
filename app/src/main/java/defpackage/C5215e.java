package defpackage;

import kotlin.jvm.functions.Function0;
import org.conscrypt.BuildConfig;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۢؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5215e {
    public final int ad;
    public final Function0 appmetrica;
    public final String license;
    public final int metrica;
    public final int vip;

    public C5215e(int i, int i2, int i3, String str, Function0 function0, int i4) {
        i3 = (i4 & 4) != 0 ? -1 : i3;
        str = (i4 & 8) != 0 ? BuildConfig.FLAVOR : str;
        this.ad = i;
        this.vip = i2;
        this.metrica = i3;
        this.license = str;
        this.appmetrica = function0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5215e)) {
            return false;
        }
        C5215e c5215e = (C5215e) obj;
        return this.ad == c5215e.ad && this.vip == c5215e.vip && this.metrica == c5215e.metrica && AbstractC7890e.billing(this.license, c5215e.license) && this.appmetrica.equals(c5215e.appmetrica);
    }

    public final int hashCode() {
        return this.appmetrica.hashCode() + ((((this.license.hashCode() + (((((this.ad * 31) + this.vip) * 31) + this.metrica) * 31)) * 31) + 1237) * 31);
    }

    public final String toString() {
        return "StaticMenuItem(icon=" + this.ad + ", title=" + this.vip + ", text=" + this.metrica + ", textString=" + this.license + ", prominent=false, onClick=" + this.appmetrica + ')';
    }
}
