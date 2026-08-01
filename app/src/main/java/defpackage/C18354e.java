package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C18354e implements InterfaceC12504e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ C8256e f36031e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f36032e;

    public /* synthetic */ C18354e(int i, C8256e c8256e) {
        this.f36032e = i;
        this.f36031e = c8256e;
    }

    @Override // defpackage.InterfaceC12504e
    public final void invoke(Object obj) {
        switch (this.f36032e) {
            case 0:
                ((InterfaceC8524e) obj).crashlytics(this.f36031e);
                return;
            case 1:
                ((InterfaceC8524e) obj).ads(this.f36031e);
                return;
            case 2:
                ((InterfaceC8524e) obj).crashlytics(this.f36031e);
                return;
            default:
                ((InterfaceC8524e) obj).ads(this.f36031e);
                return;
        }
    }
}
