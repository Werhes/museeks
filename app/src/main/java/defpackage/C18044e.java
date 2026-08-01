package defpackage;

import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣ٘۟, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18044e implements InterfaceC13619e, InterfaceC9208e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final Object f35391e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final Object f35392e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f35393e;

    public /* synthetic */ C18044e(Object obj, Object obj2, int i) {
        this.f35393e = i;
        this.f35392e = obj;
        this.f35391e = obj2;
    }

    private final /* synthetic */ void appmetrica(InterfaceC16400e interfaceC16400e) {
    }

    private final /* synthetic */ void billing(InterfaceC16400e interfaceC16400e) {
    }

    private final /* synthetic */ void license() {
    }

    private final /* synthetic */ void startapp(InterfaceC16400e interfaceC16400e) {
    }

    private final /* synthetic */ void yandex(InterfaceC16400e interfaceC16400e) {
    }

    @Override // defpackage.InterfaceC9208e
    public Object ad(C13895e c13895e) {
        Object ad = AbstractC0421e.ad((AbstractC0003e) this.f35392e, c13895e);
        return ad == EnumC2821e.f6782e ? ad : Unit.INSTANCE;
    }

    @Override // defpackage.InterfaceC9208e
    public void metrica() {
        ((AbstractC0003e) this.f35392e).vip(this);
    }

    @Override // defpackage.InterfaceC13619e
    public final void onDestroy(InterfaceC16400e interfaceC16400e) {
        switch (this.f35393e) {
            case 0:
                ((InterfaceC0665e) this.f35392e).onDestroy();
                ((C5625e) this.f35391e).invoke();
                return;
            default:
                ((InterfaceC10500e) this.f35391e).Signature(null);
                return;
        }
    }

    @Override // defpackage.InterfaceC13619e
    public final void onPause(InterfaceC16400e interfaceC16400e) {
        switch (this.f35393e) {
            case 0:
                ((InterfaceC0665e) this.f35392e).metrica();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.InterfaceC13619e
    public final void onResume(InterfaceC16400e interfaceC16400e) {
        switch (this.f35393e) {
            case 0:
                ((InterfaceC0665e) this.f35392e).vip();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.InterfaceC13619e
    public final void onStart(InterfaceC16400e interfaceC16400e) {
        switch (this.f35393e) {
            case 0:
                ((InterfaceC0665e) this.f35392e).license();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.InterfaceC13619e
    public final void onStop(InterfaceC16400e interfaceC16400e) {
        switch (this.f35393e) {
            case 0:
                ((InterfaceC0665e) this.f35392e).ad();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.InterfaceC13619e
    public final void purchase() {
        switch (this.f35393e) {
            case 0:
                ((InterfaceC0665e) this.f35392e).onCreate();
                return;
            default:
                return;
        }
    }

    @Override // defpackage.InterfaceC9208e
    public void start() {
        ((AbstractC0003e) this.f35392e).ad(this);
    }

    @Override // defpackage.InterfaceC9208e
    public /* synthetic */ void vip() {
    }
}
