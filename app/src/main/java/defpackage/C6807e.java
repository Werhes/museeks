package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙْۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6807e implements InterfaceC13140e {
    public final /* synthetic */ int ad;

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.InterfaceC13140e
    public final boolean ad(AbstractC14697e abstractC14697e) {
        switch (this.ad) {
            case 0:
                return !(abstractC14697e instanceof InterfaceC18321e) || ((InterfaceC18321e) abstractC14697e).getChildren().size() == 0;
            case 1:
                return abstractC14697e.vip == null;
            default:
                return false;
        }
    }

    public final String toString() {
        switch (this.ad) {
            case 0:
                return "empty";
            case 1:
                return "root";
            default:
                return "target";
        }
    }
}
