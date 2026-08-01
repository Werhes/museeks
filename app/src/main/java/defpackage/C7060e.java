package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؚۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C7060e {
    public int ad;
    public byte appmetrica;
    public boolean license;
    public String metrica;
    public String vip;

    public final C18532e ad() {
        String str;
        String str2;
        if (this.appmetrica == 3 && (str = this.vip) != null && (str2 = this.metrica) != null) {
            return new C18532e(this.ad, str, str2, this.license);
        }
        StringBuilder sb = new StringBuilder();
        if ((this.appmetrica & 1) == 0) {
            sb.append(" platform");
        }
        if (this.vip == null) {
            sb.append(" version");
        }
        if (this.metrica == null) {
            sb.append(" buildVersion");
        }
        if ((this.appmetrica & 2) == 0) {
            sb.append(" jailbroken");
        }
        throw new IllegalStateException(AbstractC8703e.pro("Missing required properties:", sb));
    }
}
