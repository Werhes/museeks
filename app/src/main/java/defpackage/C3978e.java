package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًْؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3978e {
    public int ad;
    public byte adcel;
    public long appmetrica;
    public long billing;
    public int license;
    public int metrica;
    public long purchase;
    public List startapp;
    public String vip;
    public String yandex;

    public final C6074e ad() {
        String str;
        if (this.adcel == 63 && (str = this.vip) != null) {
            return new C6074e(this.ad, str, this.metrica, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.adcel & 1) == 0) {
            sb.append(" pid");
        }
        if (this.vip == null) {
            sb.append(" processName");
        }
        if ((this.adcel & 2) == 0) {
            sb.append(" reasonCode");
        }
        if ((this.adcel & 4) == 0) {
            sb.append(" importance");
        }
        if ((this.adcel & 8) == 0) {
            sb.append(" pss");
        }
        if ((this.adcel & 16) == 0) {
            sb.append(" rss");
        }
        if ((this.adcel & 32) == 0) {
            sb.append(" timestamp");
        }
        throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb));
    }
}
