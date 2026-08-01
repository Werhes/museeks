package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔؓٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C2336e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C2336e(int i, Object obj) {
        this.ad = i;
        this.vip = obj;
    }

    public final void ad() {
        switch (this.ad) {
            case 0:
                C13770e c13770e = (C13770e) this.vip;
                c13770e.ads--;
                return;
            default:
                C14040e c14040e = (C14040e) this.vip;
                c14040e.mopub--;
                return;
        }
    }

    public final void vip() {
        switch (this.ad) {
            case 0:
                ((C13770e) this.vip).ads++;
                return;
            default:
                ((C14040e) this.vip).mopub++;
                return;
        }
    }
}
