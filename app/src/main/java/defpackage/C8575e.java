package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٌِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C8575e implements InterfaceC13858e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C8575e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    @Override // defpackage.InterfaceC13858e
    public final int ad(int i, int i2) {
        switch (this.ad) {
            case 0:
                return ((Character) ((InterfaceC3314e) this.vip).getValue()).charValue();
            default:
                C16818e c16818e = (C16818e) this.vip;
                return i == ((C16330e) c16818e.vip.f20360e).purchase() ? i2 : ((Character) c16818e.ad.getValue()).charValue();
        }
    }
}
