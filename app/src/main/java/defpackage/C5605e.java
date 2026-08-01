package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘّۤ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5605e {
    public final String ad;
    public final boolean metrica;
    public final String vip;

    public C5605e(String str, boolean z) {
        AbstractC9528e.purchase(str);
        this.ad = str;
        AbstractC9528e.purchase("com.google.android.gms");
        this.vip = "com.google.android.gms";
        this.metrica = z;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C5605e)) {
            return false;
        }
        C5605e c5605e = (C5605e) obj;
        return AbstractC5729e.vip(this.ad, c5605e.ad) && AbstractC5729e.vip(this.vip, c5605e.vip) && AbstractC5729e.vip(null, null) && this.metrica == c5605e.metrica && AbstractC5729e.vip(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.ad, this.vip, null, 4225, Boolean.valueOf(this.metrica), null});
    }

    public final String toString() {
        String str = this.ad;
        if (str != null) {
            return str;
        }
        AbstractC9528e.startapp(null);
        throw null;
    }
}
