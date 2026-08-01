package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْؒٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC1038e {
    public final /* synthetic */ int ad = 1;
    public final String metrica;
    public final int vip;

    public AbstractC1038e(int i, String str) {
        this.vip = i;
        this.metrica = str;
    }

    public AbstractC1038e(String str, int i) {
        this.metrica = str;
        this.vip = i;
    }

    public abstract int ad();

    public String toString() {
        switch (this.ad) {
            case 0:
                return String.format("%s(0x%04x)", this.metrica, Integer.valueOf(this.vip));
            default:
                return super.toString();
        }
    }

    public abstract void vip(C2025e c2025e);
}
