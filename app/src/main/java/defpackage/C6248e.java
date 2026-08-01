package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؚؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6248e implements InterfaceC15046e, InterfaceC7449e {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final /* synthetic */ C11753e f13065e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ String f13066e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f13067e;

    public /* synthetic */ C6248e(int i, C11753e c11753e, String str) {
        this.f13067e = i;
        this.f13066e = str;
        this.f13065e = c11753e;
    }

    @Override // defpackage.InterfaceC15046e
    public void appmetrica(InterfaceC10645e interfaceC10645e, int i) {
        interfaceC10645e.appmetrica(i, this.f13065e, this.f13066e);
    }

    @Override // defpackage.InterfaceC7449e
    public Object startapp(C6584e c6584e, C18424e c18424e, int i) {
        switch (this.f13067e) {
            case 1:
                return c6584e.m2204class(c18424e, this.f13066e, this.f13065e);
            default:
                return c6584e.subs(c18424e, this.f13066e, this.f13065e);
        }
    }
}
