package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eّٕۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15785e {
    public Double ad;
    public long appmetrica;
    public byte billing;
    public int license;
    public boolean metrica;
    public long purchase;
    public int vip;

    public final C3876e ad() {
        if (this.billing == 31) {
            return new C3876e(this.ad, this.vip, this.metrica, this.license, this.appmetrica, this.purchase);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.billing & 1) == 0) {
            sb.append(" batteryVelocity");
        }
        if ((this.billing & 2) == 0) {
            sb.append(" proximityOn");
        }
        if ((this.billing & 4) == 0) {
            sb.append(" orientation");
        }
        if ((this.billing & 8) == 0) {
            sb.append(" ramUsed");
        }
        if ((this.billing & 16) == 0) {
            sb.append(" diskUsed");
        }
        throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb));
    }
}
