package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؑؐؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C0000e implements InterfaceC0627e {
    public final AbstractC4191e ad;
    public final C10068e vip;

    public C0000e(C10068e c10068e, AbstractC4191e abstractC4191e) {
        C10215e c10215e = AbstractC18306e.ad;
        this.vip = c10068e;
        this.ad = abstractC4191e;
    }

    @Override // defpackage.InterfaceC0627e
    public final AbstractC11202e ad() {
        AbstractC4191e abstractC4191e = this.ad;
        return abstractC4191e instanceof AbstractC11202e ? (AbstractC11202e) ((AbstractC11202e) abstractC4191e).startapp(4, null) : ((AbstractC10140e) ((AbstractC11202e) abstractC4191e).startapp(5, null)).vip();
    }

    @Override // defpackage.InterfaceC0627e
    public final int appmetrica(AbstractC11202e abstractC11202e) {
        abstractC11202e.zzc.getClass();
        return 506991;
    }

    @Override // defpackage.InterfaceC0627e
    public final void billing(Object obj, C16554e c16554e) {
        throw AbstractC8647e.isVip(obj);
    }

    @Override // defpackage.InterfaceC0627e
    public final boolean license(AbstractC11202e abstractC11202e, AbstractC11202e abstractC11202e2) {
        return abstractC11202e.zzc.equals(abstractC11202e2.zzc);
    }

    @Override // defpackage.InterfaceC0627e
    public final int metrica(AbstractC4191e abstractC4191e) {
        C7012e c7012e = ((AbstractC11202e) abstractC4191e).zzc;
        int i = c7012e.metrica;
        if (i != -1) {
            return i;
        }
        c7012e.metrica = 0;
        return 0;
    }

    @Override // defpackage.InterfaceC0627e
    public final boolean purchase(Object obj) {
        throw AbstractC8647e.isVip(obj);
    }

    @Override // defpackage.InterfaceC0627e
    public final void vip(Object obj, Object obj2) {
        AbstractC17377e.vip(obj, obj2);
    }

    @Override // defpackage.InterfaceC0627e
    public final void yandex(Object obj) {
        this.vip.getClass();
        C7012e c7012e = ((AbstractC11202e) obj).zzc;
        if (c7012e.license) {
            c7012e.license = false;
        }
        C10215e c10215e = AbstractC18306e.ad;
        throw AbstractC8647e.isVip(obj);
    }
}
