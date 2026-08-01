package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓٞٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C1980e implements InterfaceC7970e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ C13192e vip;

    public /* synthetic */ C1980e(C13192e c13192e, int i) {
        this.ad = i;
        this.vip = c13192e;
    }

    @Override // defpackage.InterfaceC7970e
    public final Object get() {
        switch (this.ad) {
            case 0:
                return this.vip.ad("FIREBASE_ML_SDK", new C12007e("json"), C6114e.f12863e);
            case 1:
                return this.vip.ad("FIREBASE_ML_SDK", new C12007e("proto"), C5107e.f10968e);
            case 2:
                return this.vip.ad("FIREBASE_ML_SDK", new C12007e("json"), new C16728e(24));
            default:
                return this.vip.ad("FIREBASE_ML_SDK", new C12007e("proto"), new C0136e(23));
        }
    }
}
