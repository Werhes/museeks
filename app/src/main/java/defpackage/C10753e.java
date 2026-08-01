package defpackage;

import android.media.VolumeProvider;
import android.os.Handler;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10753e extends VolumeProvider {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object vip;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C10753e(Object obj, int i, int i2, int i3, String str, int i4) {
        super(i, i2, i3, str);
        this.ad = i4;
        this.vip = obj;
    }

    @Override // android.media.VolumeProvider
    public final void onAdjustVolume(int i) {
        switch (this.ad) {
            case 0:
                C18501e c18501e = (C18501e) this.vip;
                AbstractC9413e.m2565strictfp((Handler) c18501e.f36262e, new RunnableC9695e((C6268e) c18501e.f36261e, i, 1));
                return;
            default:
                C0423e c0423e = (C0423e) this.vip;
                ((C14090e) ((C0909e) c0423e.f2468e).f3321e).ad.post(new RunnableC11386e(c0423e, i, 1));
                return;
        }
    }

    @Override // android.media.VolumeProvider
    public final void onSetVolumeTo(int i) {
        switch (this.ad) {
            case 0:
                C18501e c18501e = (C18501e) this.vip;
                AbstractC9413e.m2565strictfp((Handler) c18501e.f36262e, new RunnableC9695e((C6268e) c18501e.f36261e, i, 0));
                return;
            default:
                C0423e c0423e = (C0423e) this.vip;
                ((C14090e) ((C0909e) c0423e.f2468e).f3321e).ad.post(new RunnableC11386e(c0423e, i, 0));
                return;
        }
    }
}
