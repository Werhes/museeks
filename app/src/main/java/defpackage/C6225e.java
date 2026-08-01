package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘؙؖ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6225e implements InterfaceC12504e, InterfaceC9479e, InterfaceC14173e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4275e f13030e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13031e;

    public /* synthetic */ C6225e(C4275e c4275e, int i) {
        this.f13031e = i;
        this.f13030e = c4275e;
    }

    @Override // defpackage.InterfaceC14173e
    public void adcel(Object obj, C11715e c11715e) {
        ((InterfaceC8524e) obj).subs(this.f13030e.ad, new C3164e(c11715e));
    }

    @Override // defpackage.InterfaceC12504e
    public void invoke(Object obj) {
        InterfaceC8524e interfaceC8524e = (InterfaceC8524e) obj;
        switch (this.f13031e) {
            case 0:
                interfaceC8524e.mo1480abstract(this.f13030e.applovin);
                return;
            default:
                interfaceC8524e.mo1480abstract(this.f13030e.applovin);
                return;
        }
    }

    @Override // defpackage.InterfaceC9479e
    public void metrica(InterfaceC3001e interfaceC3001e, int i) {
        switch (this.f13031e) {
            case 2:
                interfaceC3001e.mo968e(this.f13030e.metrica, i);
                return;
            case 3:
                interfaceC3001e.mo967e(this.f13030e.metrica, i);
                return;
            case 4:
                interfaceC3001e.mo956e(this.f13030e.metrica, i);
                return;
            case 5:
                interfaceC3001e.mo975e(this.f13030e.metrica, i);
                return;
            case 6:
                interfaceC3001e.mo957e(this.f13030e.metrica, i);
                return;
            case 7:
                interfaceC3001e.mo944e(this.f13030e.metrica, i);
                return;
            case 8:
                interfaceC3001e.mo993interface(this.f13030e.metrica, i);
                return;
            case 9:
                interfaceC3001e.mo953e(this.f13030e.metrica, i);
                return;
            case 10:
            default:
                interfaceC3001e.mo985e(this.f13030e.metrica, i);
                return;
            case 11:
                interfaceC3001e.mo982e(this.f13030e.metrica, i);
                return;
            case 12:
                interfaceC3001e.mo943else(this.f13030e.metrica, i);
                return;
            case 13:
                interfaceC3001e.mo981e(this.f13030e.metrica, i);
                return;
            case 14:
                interfaceC3001e.mo964e(this.f13030e.metrica, i);
                return;
            case 15:
                C4275e c4275e = this.f13030e;
                BinderC4329e binderC4329e = c4275e.metrica;
                if (c4275e.tapsense() >= 6) {
                    interfaceC3001e.mo994protected(binderC4329e, i);
                    return;
                } else {
                    interfaceC3001e.mo963e(binderC4329e, i, 0.0f);
                    return;
                }
            case 16:
                interfaceC3001e.mo971e(this.f13030e.metrica, i);
                return;
        }
    }
}
