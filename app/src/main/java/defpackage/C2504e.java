package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُؔۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2504e implements InterfaceC7252e, InterfaceC0099e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f6352e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ BinderC17428e f6353e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f6354e;

    public /* synthetic */ C2504e(BinderC17428e binderC17428e, int i, int i2) {
        this.f6354e = i2;
        this.f6353e = binderC17428e;
        this.f6352e = i;
    }

    @Override // defpackage.InterfaceC0099e
    public void ad(C6268e c6268e, C18424e c18424e, List list) {
        switch (this.f6354e) {
            case 1:
                c6268e.mo2070e(this.f6353e.m4323e(c18424e, c6268e, this.f6352e), list);
                return;
            case 2:
                BinderC17428e binderC17428e = this.f6353e;
                binderC17428e.getClass();
                int size = list.size();
                int i = this.f6352e;
                if (size == 1) {
                    c6268e.mo2110e(binderC17428e.m4323e(c18424e, c6268e, i), (C1962e) list.get(0));
                    return;
                } else {
                    c6268e.mo2135static(binderC17428e.m4323e(c18424e, c6268e, i), binderC17428e.m4323e(c18424e, c6268e, i + 1), list);
                    return;
                }
            default:
                c6268e.mo2070e(this.f6353e.m4323e(c18424e, c6268e, this.f6352e), list);
                return;
        }
    }

    @Override // defpackage.InterfaceC7252e
    public void billing(C6268e c6268e, C18424e c18424e) {
        switch (this.f6354e) {
            case 0:
                c6268e.mo2092e(this.f6353e.m4323e(c18424e, c6268e, this.f6352e));
                return;
            default:
                c6268e.mo2068else(this.f6353e.m4323e(c18424e, c6268e, this.f6352e));
                return;
        }
    }
}
