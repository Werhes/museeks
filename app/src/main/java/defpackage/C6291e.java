package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؙٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6291e implements InterfaceC14468e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f13118e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13119e;

    public /* synthetic */ C6291e(int i, Object obj) {
        this.f13119e = i;
        this.f13118e = obj;
    }

    @Override // defpackage.InterfaceC14468e
    public final float invoke() {
        C5070e state;
        C5070e state2;
        switch (this.f13119e) {
            case 0:
                InterfaceC2566e interfaceC2566e = ((C5640e) this.f13118e).advert;
                if (interfaceC2566e == null || (state = interfaceC2566e.getState()) == null) {
                    return 0.0f;
                }
                return state.license.purchase();
            case 1:
                InterfaceC2566e interfaceC2566e2 = ((C2702e) this.f13118e).subscription;
                if (interfaceC2566e2 == null || (state2 = interfaceC2566e2.getState()) == null) {
                    return 0.0f;
                }
                return state2.license.purchase();
            default:
                return ((Number) ((C11200e) this.f13118e).ad.license()).floatValue();
        }
    }
}
