package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۢؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4443e {
    public C15373e ad;
    public byte appmetrica;
    public long license;
    public String metrica;
    public String vip;

    public final C12907e ad() {
        C15373e c15373e;
        String str;
        String str2;
        if (this.appmetrica == 1 && (c15373e = this.ad) != null && (str = this.vip) != null && (str2 = this.metrica) != null) {
            return new C12907e(c15373e, str, str2, this.license);
        }
        StringBuilder sb = new StringBuilder();
        if (this.ad == null) {
            sb.append(" rolloutVariant");
        }
        if (this.vip == null) {
            sb.append(" parameterKey");
        }
        if (this.metrica == null) {
            sb.append(" parameterValue");
        }
        if ((1 & this.appmetrica) == 0) {
            sb.append(" templateVersion");
        }
        throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb));
    }
}
