package defpackage;

import androidx.camera.core.ImageProcessingUtil;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍُؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9159e implements InterfaceC4843e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC12385e f18327e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18328e;

    public /* synthetic */ C9159e(InterfaceC12385e interfaceC12385e, InterfaceC12385e interfaceC12385e2, int i) {
        this.f18328e = i;
        this.f18327e = interfaceC12385e2;
    }

    @Override // defpackage.InterfaceC4843e
    public final void ad(AbstractC1816e abstractC1816e) {
        int i = this.f18328e;
        InterfaceC12385e interfaceC12385e = this.f18327e;
        switch (i) {
            case 0:
                int i2 = ImageProcessingUtil.ad;
                if (interfaceC12385e != null) {
                    interfaceC12385e.close();
                    return;
                }
                return;
            default:
                int i3 = ImageProcessingUtil.ad;
                interfaceC12385e.close();
                return;
        }
    }
}
