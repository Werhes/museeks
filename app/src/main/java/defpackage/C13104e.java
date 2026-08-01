package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙْْ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C13104e extends AbstractC16249e {
    public final /* synthetic */ C3318e metrica;
    public final /* synthetic */ InterfaceC6347e vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C13104e(C3318e c3318e, InterfaceC6347e interfaceC6347e, InterfaceC6347e interfaceC6347e2) {
        super(interfaceC6347e);
        this.metrica = c3318e;
        this.vip = interfaceC6347e2;
    }

    @Override // defpackage.AbstractC16249e, defpackage.InterfaceC6347e
    public final C13178e appmetrica(long j) {
        C13178e appmetrica = this.vip.appmetrica(j);
        C7278e c7278e = appmetrica.ad;
        long j2 = c7278e.ad;
        long j3 = c7278e.vip;
        long j4 = this.metrica.f7486e;
        C7278e c7278e2 = new C7278e(j2, j3 + j4);
        C7278e c7278e3 = appmetrica.vip;
        return new C13178e(c7278e2, new C7278e(c7278e3.ad, c7278e3.vip + j4));
    }
}
