package defpackage;

import java.util.ArrayList;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٞٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C9635e implements InterfaceC16707e {
    public final String ad;
    public final int license;
    public final int metrica;
    public final byte[] vip;

    public C9635e(String str, byte[] bArr, int i, int i2) {
        byte b;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1949883051:
                if (str.equals("com.android.capture.fps")) {
                    c = 0;
                    break;
                }
                break;
            case -269399509:
                if (str.equals("auxiliary.tracks.interleaved")) {
                    c = 1;
                    break;
                }
                break;
            case 1011693540:
                if (str.equals("auxiliary.tracks.length")) {
                    c = 2;
                    break;
                }
                break;
            case 1098277265:
                if (str.equals("auxiliary.tracks.offset")) {
                    c = 3;
                    break;
                }
                break;
            case 2002123038:
                if (str.equals("auxiliary.tracks.map")) {
                    c = 4;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                if (i2 == 23 && bArr.length == 4) {
                    r2 = true;
                }
                AbstractC2301e.billing(r2);
                break;
            case 1:
                if (i2 == 75 && bArr.length == 1 && ((b = bArr[0]) == 0 || b == 1)) {
                    r2 = true;
                }
                AbstractC2301e.billing(r2);
                break;
            case 2:
            case 3:
                if (i2 == 78 && bArr.length == 8) {
                    r2 = true;
                }
                AbstractC2301e.billing(r2);
                break;
            case 4:
                AbstractC2301e.billing(i2 == 0);
                break;
        }
        this.ad = str;
        this.vip = bArr;
        this.metrica = i;
        this.license = i2;
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ C16975e ad() {
        return null;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C9635e.class == obj.getClass()) {
            C9635e c9635e = (C9635e) obj;
            if (this.ad.equals(c9635e.ad) && Arrays.equals(this.vip, c9635e.vip) && this.metrica == c9635e.metrica && this.license == c9635e.license) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((((Arrays.hashCode(this.vip) + AbstractC1786e.advert(527, 31, this.ad)) * 31) + this.metrica) * 31) + this.license;
    }

    public final ArrayList license() {
        AbstractC2301e.admob("Metadata is not an auxiliary tracks map", this.ad.equals("auxiliary.tracks.map"));
        byte[] bArr = this.vip;
        byte b = bArr[1];
        ArrayList arrayList = new ArrayList();
        for (int i = 0; i < b; i++) {
            arrayList.add(Integer.valueOf(bArr[i + 2]));
        }
        return arrayList;
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ byte[] metrica() {
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x00c0  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.String toString() {
        /*
            Method dump skipped, instructions count: 410
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C9635e.toString():java.lang.String");
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ void vip(C4761e c4761e) {
    }
}
