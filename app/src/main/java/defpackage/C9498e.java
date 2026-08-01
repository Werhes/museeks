package defpackage;

import j$.util.Objects;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٖٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9498e implements InterfaceC16707e {
    public final int ad;
    public final boolean appmetrica;
    public final String license;
    public final String metrica;
    public final int purchase;
    public final String vip;

    public C9498e(int i, int i2, String str, String str2, String str3, boolean z) {
        AbstractC2301e.billing(i2 == -1 || i2 > 0);
        this.ad = i;
        this.vip = str;
        this.metrica = str2;
        this.license = str3;
        this.appmetrica = z;
        this.purchase = i2;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x005f  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x00a1  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00c9  */
    /* JADX WARN: Removed duplicated region for block: B:43:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:44:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x0054  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C9498e license(java.util.Map r14) {
        /*
            Method dump skipped, instructions count: 207
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9498e.license(java.util.Map):eٍٖٚ");
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ C16975e ad() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9498e.class == obj.getClass()) {
            C9498e c9498e = (C9498e) obj;
            if (this.ad == c9498e.ad && Objects.equals(this.vip, c9498e.vip) && Objects.equals(this.metrica, c9498e.metrica) && Objects.equals(this.license, c9498e.license) && this.appmetrica == c9498e.appmetrica && this.purchase == c9498e.purchase) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int i = (527 + this.ad) * 31;
        String str = this.vip;
        int hashCode = (i + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.metrica;
        int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.license;
        return ((((hashCode2 + (str3 != null ? str3.hashCode() : 0)) * 31) + (this.appmetrica ? 1 : 0)) * 31) + this.purchase;
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ byte[] metrica() {
        return null;
    }

    public final String toString() {
        return "IcyHeaders: name=\"" + this.metrica + "\", genre=\"" + this.vip + "\", bitrate=" + this.ad + ", metadataInterval=" + this.purchase;
    }

    @Override // defpackage.InterfaceC16707e
    public final void vip(C4761e c4761e) {
        String str = this.metrica;
        if (str != null) {
            c4761e.f10192interface = str;
        }
        String str2 = this.vip;
        if (str2 != null) {
            c4761e.firebase = str2;
        }
    }
}
