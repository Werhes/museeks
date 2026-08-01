package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَُۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10197e {
    public final /* synthetic */ int ad;
    public Object appmetrica;
    public boolean license;
    public final C16330e metrica;
    public final C0705e purchase;
    public final C16330e vip;

    public C10197e(int i, int i2, int i3) {
        this.ad = i3;
        switch (i3) {
            case 1:
                this.vip = new C16330e(i);
                this.metrica = new C16330e(i2);
                this.purchase = new C0705e(i, 30, 100);
                return;
            default:
                this.vip = new C16330e(i);
                this.metrica = new C16330e(i2);
                this.purchase = new C0705e(i, 90, 200);
                return;
        }
    }

    public final void ad(int i, int i2) {
        switch (this.ad) {
            case 0:
                if (i < 0.0f) {
                    AbstractC8889e.ad("Index should be non-negative");
                }
                this.vip.startapp(i);
                this.purchase.metrica(i);
                this.metrica.startapp(i2);
                return;
            default:
                if (i < 0.0f) {
                    AbstractC8889e.ad("Index should be non-negative (" + i + ')');
                }
                this.vip.startapp(i);
                this.purchase.metrica(i);
                this.metrica.startapp(i2);
                return;
        }
    }
}
