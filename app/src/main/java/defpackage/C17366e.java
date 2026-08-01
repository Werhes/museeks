package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّۣٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17366e {
    public String ad;
    public AbstractC9135e adcel;
    public AbstractC13920e advert;
    public String appmetrica;
    public String billing;
    public String license;
    public int metrica;
    public AbstractC4592e mopub;
    public String purchase;
    public byte smaato;
    public String startapp;
    public String vip;
    public String yandex;

    public final C0823e ad() {
        if (this.smaato == 1 && this.ad != null && this.vip != null && this.license != null && this.yandex != null && this.startapp != null) {
            return new C0823e(this.ad, this.vip, this.metrica, this.license, this.appmetrica, this.purchase, this.billing, this.yandex, this.startapp, this.adcel, this.mopub, this.advert);
        }
        StringBuilder sb = new StringBuilder();
        if (this.ad == null) {
            sb.append(" sdkVersion");
        }
        if (this.vip == null) {
            sb.append(" gmpAppId");
        }
        if ((1 & this.smaato) == 0) {
            sb.append(" platform");
        }
        if (this.license == null) {
            sb.append(" installationUuid");
        }
        if (this.yandex == null) {
            sb.append(" buildVersion");
        }
        if (this.startapp == null) {
            sb.append(" displayVersion");
        }
        throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb));
    }
}
