package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚٛۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7288e {
    public int ad;
    public int appmetrica;
    public boolean billing;
    public int license;
    public int metrica;
    public int purchase;
    public int vip;
    public boolean yandex;

    public final void ad(int i, int i2) {
        this.metrica = i;
        this.license = i2;
        this.yandex = true;
        if (this.billing) {
            if (i2 != Integer.MIN_VALUE) {
                this.ad = i2;
            }
            if (i != Integer.MIN_VALUE) {
                this.vip = i;
                return;
            }
            return;
        }
        if (i != Integer.MIN_VALUE) {
            this.ad = i;
        }
        if (i2 != Integer.MIN_VALUE) {
            this.vip = i2;
        }
    }
}
