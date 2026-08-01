package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؙؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4697e extends AbstractC17001e {
    public final /* synthetic */ int metrica;

    public /* synthetic */ C4697e(int i) {
        this.metrica = i;
    }

    @Override // defpackage.AbstractC17001e, defpackage.InterfaceC16282e
    public void ad(C15816e c15816e, C11154e c11154e) {
        switch (this.metrica) {
            case 1:
                c15816e.m4022super("EXT-X-VERSION", Integer.toString(c11154e.license));
                return;
            default:
                super.ad(c15816e, c11154e);
                return;
        }
    }

    @Override // defpackage.AbstractC17001e
    public final boolean metrica() {
        switch (this.metrica) {
            case 0:
                return false;
            default:
                return true;
        }
    }

    @Override // defpackage.AbstractC17001e
    public final String vip() {
        switch (this.metrica) {
            case 0:
                return "EXTM3U";
            default:
                return "EXT-X-VERSION";
        }
    }
}
