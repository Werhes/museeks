package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؚۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7625e {
    public long ad;
    public int appmetrica;
    public long license;
    public String metrica;
    public byte purchase;
    public String vip;

    public final C9254e ad() {
        String str;
        if (this.purchase == 7 && (str = this.vip) != null) {
            return new C9254e(this.ad, str, this.metrica, this.license, this.appmetrica);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.purchase & 1) == 0) {
            sb.append(" pc");
        }
        if (this.vip == null) {
            sb.append(" symbol");
        }
        if ((this.purchase & 2) == 0) {
            sb.append(" offset");
        }
        if ((this.purchase & 4) == 0) {
            sb.append(" importance");
        }
        throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb));
    }
}
