package defpackage;

import j$.util.Objects;
import java.util.Arrays;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُّٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15382e implements InterfaceC16707e {
    public static final C16975e billing;
    public static final C16975e yandex;
    public final String ad;
    public final byte[] appmetrica;
    public final long license;
    public final long metrica;
    public int purchase;
    public final String vip;

    static {
        C11445e c11445e = new C11445e();
        c11445e.amazon = AbstractC8542e.amazon("application/id3");
        billing = new C16975e(c11445e);
        C11445e c11445e2 = new C11445e();
        c11445e2.amazon = AbstractC8542e.amazon("application/x-scte35");
        yandex = new C16975e(c11445e2);
    }

    public C15382e(String str, String str2, long j, long j2, byte[] bArr) {
        this.ad = str;
        this.vip = str2;
        this.metrica = j;
        this.license = j2;
        this.appmetrica = bArr;
    }

    @Override // defpackage.InterfaceC16707e
    public final C16975e ad() {
        String str = this.ad;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -1468477611:
                if (str.equals("urn:scte:scte35:2014:bin")) {
                    c = 0;
                    break;
                }
                break;
            case -795945609:
                if (str.equals("https://aomedia.org/emsg/ID3")) {
                    c = 1;
                    break;
                }
                break;
            case 1303648457:
                if (str.equals("https://developer.apple.com/streaming/emsg-id3")) {
                    c = 2;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return yandex;
            case 1:
            case 2:
                return billing;
            default:
                return null;
        }
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj != null && C15382e.class == obj.getClass()) {
            C15382e c15382e = (C15382e) obj;
            if (this.metrica == c15382e.metrica && this.license == c15382e.license && Objects.equals(this.ad, c15382e.ad) && Objects.equals(this.vip, c15382e.vip) && Arrays.equals(this.appmetrica, c15382e.appmetrica)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        if (this.purchase == 0) {
            String str = this.ad;
            int hashCode = (527 + (str != null ? str.hashCode() : 0)) * 31;
            String str2 = this.vip;
            int hashCode2 = (hashCode + (str2 != null ? str2.hashCode() : 0)) * 31;
            long j = this.metrica;
            int i = (hashCode2 + ((int) (j ^ (j >>> 32)))) * 31;
            long j2 = this.license;
            this.purchase = Arrays.hashCode(this.appmetrica) + ((i + ((int) (j2 ^ (j2 >>> 32)))) * 31);
        }
        return this.purchase;
    }

    @Override // defpackage.InterfaceC16707e
    public final byte[] metrica() {
        if (ad() != null) {
            return this.appmetrica;
        }
        return null;
    }

    public final String toString() {
        return "EMSG: scheme=" + this.ad + ", id=" + this.license + ", durationMs=" + this.metrica + ", value=" + this.vip;
    }

    @Override // defpackage.InterfaceC16707e
    public final /* synthetic */ void vip(C4761e c4761e) {
    }
}
