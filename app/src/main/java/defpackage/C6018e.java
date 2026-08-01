package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘۤؕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C6018e implements InterfaceC8371e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ AbstractC17001e vip;

    public /* synthetic */ C6018e(AbstractC17001e abstractC17001e, int i) {
        this.ad = i;
        this.vip = abstractC17001e;
    }

    @Override // defpackage.InterfaceC8371e
    public final String ad(Object obj) {
        switch (this.ad) {
            case 0:
                String str = ((C7297e) obj).billing;
                ((C8873e) this.vip).getClass();
                return AbstractC6261e.purchase(str, "EXT-X-I-FRAME-STREAM-INF", false);
            default:
                String str2 = ((C4438e) obj).ad;
                ((C12691e) this.vip).getClass();
                return AbstractC6261e.purchase(str2, "EXT-X-MAP", false);
        }
    }

    @Override // defpackage.InterfaceC8371e
    public final /* bridge */ /* synthetic */ boolean vip(Object obj) {
        switch (this.ad) {
            case 0:
                return true;
            default:
                return true;
        }
    }
}
