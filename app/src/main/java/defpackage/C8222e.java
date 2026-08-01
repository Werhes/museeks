package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًۛۨ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8222e {
    public final int ad;
    public final boolean appmetrica;
    public final C1292e billing;
    public long license;
    public int metrica;
    public final C1292e purchase;
    public int startapp;
    public int vip;
    public int yandex;

    public C8222e(C1292e c1292e, C1292e c1292e2, boolean z) {
        this.billing = c1292e;
        this.purchase = c1292e2;
        this.appmetrica = z;
        c1292e2.m571try(12);
        this.ad = c1292e2.firebase();
        c1292e.m571try(12);
        this.startapp = c1292e.firebase();
        AbstractC9357e.license("first_chunk must be 1", c1292e.smaato() == 1);
        this.vip = -1;
    }

    public final boolean ad() {
        int i = this.vip + 1;
        this.vip = i;
        if (i == this.ad) {
            return false;
        }
        boolean z = this.appmetrica;
        C1292e c1292e = this.purchase;
        this.license = z ? c1292e.m566interface() : c1292e.subs();
        if (this.vip == this.yandex) {
            C1292e c1292e2 = this.billing;
            this.metrica = c1292e2.firebase();
            c1292e2.m568protected(4);
            int i2 = this.startapp - 1;
            this.startapp = i2;
            this.yandex = i2 > 0 ? c1292e2.firebase() - 1 : -1;
        }
        return true;
    }
}
