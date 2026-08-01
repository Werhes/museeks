package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: e٘ؕؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17536e implements InterfaceC7252e, InterfaceC0099e, InterfaceC8427e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ int f34379e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f34380e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ BinderC17428e f34381e;

    public /* synthetic */ C17536e(BinderC17428e binderC17428e, int i, int i2) {
        this.f34381e = binderC17428e;
        this.f34380e = i;
        this.f34379e = i2;
    }

    @Override // defpackage.InterfaceC8427e
    public void accept(Object obj) {
        BinderC17428e binderC17428e = this.f34381e;
        ((C6584e) binderC17428e.metrica.get()).getClass();
        SurfaceHolderC2120e surfaceHolderC2120e = binderC17428e.startapp;
        if (surfaceHolderC2120e != null) {
            surfaceHolderC2120e.setFixedSize(this.f34380e, this.f34379e);
        }
    }

    @Override // defpackage.InterfaceC0099e
    public void ad(C6268e c6268e, C18424e c18424e, List list) {
        BinderC17428e binderC17428e = this.f34381e;
        c6268e.mo2135static(binderC17428e.m4323e(c18424e, c6268e, this.f34380e), binderC17428e.m4323e(c18424e, c6268e, this.f34379e), list);
    }

    @Override // defpackage.InterfaceC7252e
    public void billing(C6268e c6268e, C18424e c18424e) {
        BinderC17428e binderC17428e = this.f34381e;
        c6268e.mo2140throws(binderC17428e.m4323e(c18424e, c6268e, this.f34380e), binderC17428e.m4323e(c18424e, c6268e, this.f34379e));
    }
}
