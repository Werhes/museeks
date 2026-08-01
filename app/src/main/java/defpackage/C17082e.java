package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗٙؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17082e {
    public String ad;
    public AbstractC10782e adcel;
    public int advert;
    public Long appmetrica;
    public AbstractC17162e billing;
    public long license;
    public String metrica;
    public List mopub;
    public boolean purchase;
    public byte smaato;
    public AbstractC15286e startapp;
    public String vip;
    public AbstractC17920e yandex;

    public final C17924e ad() {
        String str;
        String str2;
        AbstractC17162e abstractC17162e;
        if (this.smaato == 7 && (str = this.ad) != null && (str2 = this.vip) != null && (abstractC17162e = this.billing) != null) {
            return new C17924e(str, str2, this.metrica, this.license, this.appmetrica, this.purchase, abstractC17162e, this.yandex, this.startapp, this.adcel, this.mopub, this.advert);
        }
        StringBuilder sb = new StringBuilder();
        if (this.ad == null) {
            sb.append(" generator");
        }
        if (this.vip == null) {
            sb.append(" identifier");
        }
        if ((this.smaato & 1) == 0) {
            sb.append(" startedAt");
        }
        if ((this.smaato & 2) == 0) {
            sb.append(" crashed");
        }
        if (this.billing == null) {
            sb.append(" app");
        }
        if ((this.smaato & 4) == 0) {
            sb.append(" generatorType");
        }
        throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb));
    }
}
