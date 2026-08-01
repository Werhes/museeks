package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۧ۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1485e {
    public final C4361e ad;
    public int appmetrica;
    public final C13811e license;
    public final InterfaceC18147e metrica;
    public C16975e purchase;
    public final C5085e vip;

    public C1485e(C4361e c4361e, C5085e c5085e, InterfaceC18147e interfaceC18147e) {
        this.ad = c4361e;
        this.vip = c5085e;
        this.metrica = interfaceC18147e;
        this.license = "audio/true-hd".equals(c4361e.billing.loadAd) ? new C13811e() : null;
    }
}
