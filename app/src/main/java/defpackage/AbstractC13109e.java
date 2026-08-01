package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙْٞ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC13109e {
    public final C18257e ad = new C18257e();
    public C10312e adcel = new C10312e(21, false);
    public boolean advert;
    public long appmetrica;
    public long billing;
    public InterfaceC3604e license;
    public InterfaceC5483e metrica;
    public long mopub;
    public long purchase;
    public boolean smaato;
    public int startapp;
    public InterfaceC18147e vip;
    public int yandex;

    public void ad(long j) {
        this.billing = j;
    }

    public void license(boolean z) {
        if (z) {
            this.adcel = new C10312e(21, false);
            this.purchase = 0L;
            this.yandex = 0;
        } else {
            this.yandex = 1;
        }
        this.appmetrica = -1L;
        this.billing = 0L;
    }

    public abstract boolean metrica(C1292e c1292e, long j, C10312e c10312e);

    public abstract long vip(C1292e c1292e);
}
