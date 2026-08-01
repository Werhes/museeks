package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًِٖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7873e {
    public String ad;
    public byte appmetrica;
    public boolean license;
    public int metrica;
    public int vip;

    public final C3116e ad() {
        String str;
        if (this.appmetrica == 7 && (str = this.ad) != null) {
            return new C3116e(this.vip, this.metrica, str, this.license);
        }
        StringBuilder sb = new StringBuilder();
        if (this.ad == null) {
            sb.append(" processName");
        }
        if ((this.appmetrica & 1) == 0) {
            sb.append(" pid");
        }
        if ((this.appmetrica & 2) == 0) {
            sb.append(" importance");
        }
        if ((this.appmetrica & 4) == 0) {
            sb.append(" defaultProcess");
        }
        throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb));
    }
}
