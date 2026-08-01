package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۣؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C5345e {
    public final InterfaceC18147e ad;
    public boolean adcel;
    public long advert;
    public long appmetrica;
    public boolean billing;
    public int license;
    public boolean metrica;
    public long mopub;
    public boolean purchase;
    public boolean smaato;
    public boolean startapp;
    public long vip;
    public boolean yandex;

    public C5345e(InterfaceC18147e interfaceC18147e) {
        this.ad = interfaceC18147e;
    }

    public final void ad(int i) {
        long j = this.advert;
        if (j != -9223372036854775807L) {
            long j2 = this.vip;
            long j3 = this.mopub;
            if (j2 == j3) {
                return;
            }
            int i2 = (int) (j2 - j3);
            this.ad.ad(j, this.smaato ? 1 : 0, i2, i, null);
        }
    }
}
