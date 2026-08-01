package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِۣۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12073e implements InterfaceC5222e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ AbstractC5004e vip;

    public /* synthetic */ C12073e(AbstractC5004e abstractC5004e, int i) {
        this.ad = i;
        this.vip = abstractC5004e;
    }

    @Override // defpackage.InterfaceC5222e
    public final void ad(C9412e c9412e) {
        switch (this.ad) {
            case 0:
                AbstractC5004e abstractC5004e = this.vip;
                C6530e c6530e = abstractC5004e.f10591e;
                C9232e c9232e = c9412e.license;
                c6530e.setCurrentProgress((float) c9232e.ad);
                if (c9232e.ad == 1.0d) {
                    c9412e.ad();
                    abstractC5004e.amazon();
                    abstractC5004e.f10582e.getApplication().unregisterActivityLifecycleCallbacks(abstractC5004e.f10581e);
                    return;
                }
                return;
            default:
                C6530e c6530e2 = this.vip.f10591e;
                C9232e c9232e2 = c9412e.license;
                c6530e2.setCurrentProgress((float) c9232e2.ad);
                if (c9232e2.ad == 0.0d) {
                    c9412e.ad();
                    return;
                }
                return;
        }
    }
}
