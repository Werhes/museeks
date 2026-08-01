package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٜؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C1190e {
    public final /* synthetic */ int ad;
    public final String metrica;
    public final boolean vip;

    public C1190e(String str, boolean z) {
        this.ad = 1;
        this.vip = z;
        this.metrica = str;
    }

    public /* synthetic */ C1190e(String str, boolean z, int i) {
        this.ad = i;
        this.metrica = str;
        this.vip = z;
    }

    public String toString() {
        switch (this.ad) {
            case 0:
                String str = this.metrica;
                StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
                sb.append("{");
                sb.append(str);
                sb.append("}");
                sb.append(this.vip);
                return sb.toString();
            default:
                return super.toString();
        }
    }
}
