package defpackage;

import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۗۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1259e implements InterfaceC16707e {
    public final byte[] ad;
    public final String metrica;
    public final String vip;

    public C1259e(String str, String str2, byte[] bArr) {
        this.ad = bArr;
        this.vip = str;
        this.metrica = str2;
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ C16975e ad() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || C1259e.class != obj.getClass()) {
            return false;
        }
        return Arrays.equals(this.ad, ((C1259e) obj).ad);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.ad);
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ byte[] metrica() {
        return null;
    }

    public final String toString() {
        return AbstractC17861e.smaato(this.ad.length, "\"", AbstractC17861e.tapsense("ICY: title=\"", this.vip, "\", url=\"", this.metrica, "\", rawMetadata.length=\""));
    }

    @Override // defpackage.InterfaceC16707e
    public final void vip(C4761e c4761e) {
        String str = this.vip;
        if (str != null) {
            c4761e.ad = str;
        }
    }
}
