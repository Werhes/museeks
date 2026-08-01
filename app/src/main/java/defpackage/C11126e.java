package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٜۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11126e implements InterfaceC9479e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ List f22043e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C4275e f22044e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f22045e;

    public /* synthetic */ C11126e(C4275e c4275e, List list, int i) {
        this.f22045e = i;
        this.f22044e = c4275e;
        this.f22043e = list;
    }

    @Override // defpackage.InterfaceC9479e
    public final void metrica(InterfaceC3001e interfaceC3001e, int i) {
        switch (this.f22045e) {
            case 0:
                C4275e c4275e = this.f22044e;
                BinderC4329e binderC4329e = c4275e.metrica;
                C13304e Signature = AbstractC17475e.Signature();
                int i2 = 0;
                while (true) {
                    List list = this.f22043e;
                    if (i2 >= list.size()) {
                        interfaceC3001e.mo978e(binderC4329e, i, new BinderC7421e(Signature.billing()), true);
                        return;
                    } else {
                        Signature.metrica(((C1962e) list.get(i2)).metrica(c4275e.tapsense(), true));
                        i2++;
                    }
                }
            default:
                C4275e c4275e2 = this.f22044e;
                BinderC4329e binderC4329e2 = c4275e2.metrica;
                C13304e Signature2 = AbstractC17475e.Signature();
                int i3 = 0;
                while (true) {
                    List list2 = this.f22043e;
                    if (i3 >= list2.size()) {
                        interfaceC3001e.mo946e(binderC4329e2, i, new BinderC7421e(Signature2.billing()));
                        return;
                    } else {
                        Signature2.metrica(((C1962e) list2.get(i3)).metrica(c4275e2.tapsense(), true));
                        i3++;
                    }
                }
        }
    }
}
