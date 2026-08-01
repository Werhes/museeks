package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖؗؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C3900e {
    public final /* synthetic */ int ad;
    public int license;
    public int metrica;
    public int vip;

    public C3900e() {
        this.ad = 2;
        this.vip = 0;
        this.metrica = 0;
        this.license = 0;
    }

    public /* synthetic */ C3900e(int i, int i2, int i3, int i4) {
        this.ad = i4;
        this.vip = i;
        this.metrica = i2;
        this.license = i3;
    }

    public String toString() {
        String str;
        switch (this.ad) {
            case 3:
                StringBuilder sb = new StringBuilder();
                int i = this.vip;
                if (i == 1) {
                    str = "DELETE";
                } else if (i == 2) {
                    str = "EQUAL";
                } else if (i == 3) {
                    str = "INSERT";
                } else if (i == 4) {
                    str = "REPLACE";
                } else {
                    if (i != 5) {
                        throw null;
                    }
                    str = "KEEP";
                }
                sb.append(str);
                sb.append("(");
                sb.append(this.metrica);
                sb.append(",");
                return AbstractC17861e.smaato(this.license, ")", sb);
            case 4:
                StringBuilder sb2 = new StringBuilder("(");
                sb2.append(this.vip);
                sb2.append(",");
                sb2.append(this.metrica);
                sb2.append(",");
                return AbstractC17861e.smaato(this.license, ")", sb2);
            default:
                return super.toString();
        }
    }
}
