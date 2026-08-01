package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؓٚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC15951e implements InterfaceC15834e {
    public final long ad = C6913e.billing.getAndIncrement();
    public final int appmetrica;
    public final long billing;
    public final C16975e license;
    public final int metrica;
    public final Object purchase;
    public final C9344e startapp;
    public final C2435e vip;
    public final long yandex;

    public AbstractC15951e(InterfaceC9660e interfaceC9660e, C2435e c2435e, int i, C16975e c16975e, int i2, Object obj, long j, long j2) {
        this.startapp = new C9344e(interfaceC9660e);
        this.vip = c2435e;
        this.metrica = i;
        this.license = c16975e;
        this.appmetrica = i2;
        this.purchase = obj;
        this.billing = j;
        this.yandex = j2;
    }
}
