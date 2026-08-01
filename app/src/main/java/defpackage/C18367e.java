package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C18367e implements InterfaceC12066e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final InterfaceC16400e f36043e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C11275e f36044e;

    public C18367e(InterfaceC16400e interfaceC16400e, C11275e c11275e) {
        this.f36043e = interfaceC16400e;
        this.f36044e = c11275e;
    }

    @InterfaceC10450e(EnumC14621e.ON_DESTROY)
    public void onDestroy(InterfaceC16400e interfaceC16400e) {
        this.f36044e.amazon(interfaceC16400e);
    }

    @InterfaceC10450e(EnumC14621e.ON_START)
    public void onStart(InterfaceC16400e interfaceC16400e) {
        this.f36044e.yandex(interfaceC16400e);
    }

    @InterfaceC10450e(EnumC14621e.ON_STOP)
    public void onStop(InterfaceC16400e interfaceC16400e) {
        this.f36044e.startapp(interfaceC16400e);
    }
}
