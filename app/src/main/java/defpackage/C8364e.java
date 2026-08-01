package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًّۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8364e implements InterfaceC0665e {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public final /* synthetic */ Object f17112e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ Object f17113e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f17114e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public final /* synthetic */ Object f17115e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f17116e = 1;

    public C8364e(C6112e c6112e, EnumC10668e enumC10668e, C18135e c18135e, C4804e c4804e) {
        this.f17114e = c6112e;
        this.f17113e = enumC10668e;
        this.f17115e = c18135e;
        this.f17112e = c4804e;
    }

    public C8364e(InterfaceC10540e interfaceC10540e, C5934e c5934e, C11898e c11898e, C5934e c5934e2) {
        this.f17114e = interfaceC10540e;
        this.f17113e = c5934e;
        this.f17112e = c11898e;
        this.f17115e = c5934e2;
    }

    private final void appmetrica() {
    }

    private final void billing() {
    }

    private final void purchase() {
    }

    private final void startapp() {
    }

    private final void yandex() {
    }

    @Override // defpackage.InterfaceC0665e
    public final void ad() {
        switch (this.f17116e) {
            case 0:
                return;
            default:
                if (((EnumC10668e) this.f17113e) == EnumC10668e.f21011e) {
                    ((C4804e) this.f17112e).invoke();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC0665e
    public final void license() {
        switch (this.f17116e) {
            case 0:
                return;
            default:
                if (((EnumC10668e) this.f17113e) == EnumC10668e.f21011e) {
                    ((C18135e) this.f17115e).invoke();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC0665e
    public final void metrica() {
        switch (this.f17116e) {
            case 0:
                return;
            default:
                if (((EnumC10668e) this.f17113e) == EnumC10668e.f21008e) {
                    ((C4804e) this.f17112e).invoke();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC0665e
    public final void onCreate() {
        switch (this.f17116e) {
            case 0:
                return;
            default:
                if (((EnumC10668e) this.f17113e) == EnumC10668e.f21009e) {
                    ((C18135e) this.f17115e).invoke();
                    return;
                }
                return;
        }
    }

    @Override // defpackage.InterfaceC0665e
    public final void onDestroy() {
        switch (this.f17116e) {
            case 0:
                ((InterfaceC10540e) this.f17114e).startapp((C5934e) this.f17113e);
                ((C11898e) this.f17112e).startapp((C5934e) this.f17115e);
                return;
            default:
                if (((EnumC10668e) this.f17113e) == EnumC10668e.f21009e) {
                    ((C4804e) this.f17112e).invoke();
                }
                ((C6112e) this.f17114e).invoke();
                return;
        }
    }

    @Override // defpackage.InterfaceC0665e
    public final void vip() {
        switch (this.f17116e) {
            case 0:
                return;
            default:
                if (((EnumC10668e) this.f17113e) == EnumC10668e.f21008e) {
                    ((C18135e) this.f17115e).invoke();
                    return;
                }
                return;
        }
    }
}
