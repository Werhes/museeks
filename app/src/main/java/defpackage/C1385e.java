package defpackage;

import android.util.Size;
import android.view.Surface;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؒۡٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C1385e extends AbstractC5113e {
    public final /* synthetic */ int amazon = 0;
    public final Object loadAd;

    public C1385e(Surface surface, Size size, int i) {
        super(i, size);
        this.loadAd = surface;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C1385e(C6122e c6122e, Size size) {
        super(34, size);
        this.loadAd = c6122e;
    }

    @Override // defpackage.AbstractC5113e
    public final ListenableFuture purchase() {
        switch (this.amazon) {
            case 0:
                return AbstractC15792e.mopub((Surface) this.loadAd);
            default:
                return ((C6122e) this.loadAd).yandex;
        }
    }
}
