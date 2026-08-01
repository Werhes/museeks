package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؓ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1746e {
    public int ad;
    public byte adcel;
    public long appmetrica;
    public int billing;
    public long license;
    public int metrica;
    public boolean purchase;
    public String startapp;
    public String vip;
    public String yandex;

    public final C10602e ad() {
        String str;
        String str2;
        String str3;
        if (this.adcel == 63 && (str = this.vip) != null && (str2 = this.yandex) != null && (str3 = this.startapp) != null) {
            return new C10602e(this.ad, str, this.metrica, this.license, this.appmetrica, this.purchase, this.billing, str2, str3);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.adcel & 1) == 0) {
            sb.append(" arch");
        }
        if (this.vip == null) {
            sb.append(" model");
        }
        if ((this.adcel & 2) == 0) {
            sb.append(" cores");
        }
        if ((this.adcel & 4) == 0) {
            sb.append(" ram");
        }
        if ((this.adcel & 8) == 0) {
            sb.append(" diskSpace");
        }
        if ((this.adcel & 16) == 0) {
            sb.append(" simulator");
        }
        if ((this.adcel & 32) == 0) {
            sb.append(" state");
        }
        if (this.yandex == null) {
            sb.append(" manufacturer");
        }
        if (this.startapp == null) {
            sb.append(" modelClass");
        }
        throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb));
    }
}
