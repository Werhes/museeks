package defpackage;

import android.graphics.SurfaceTexture;
import android.view.Surface;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؔۖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C2780e implements InterfaceC0867e {
    public final /* synthetic */ int ad;
    public final /* synthetic */ Object metrica;
    public final /* synthetic */ Object vip;

    public /* synthetic */ C2780e(Object obj, Object obj2, int i) {
        this.ad = i;
        this.vip = obj;
        this.metrica = obj2;
    }

    @Override // defpackage.InterfaceC0867e
    public final void accept(Object obj) {
        switch (this.ad) {
            case 0:
                Surface surface = (Surface) this.vip;
                SurfaceTexture surfaceTexture = (SurfaceTexture) this.metrica;
                surface.release();
                surfaceTexture.release();
                return;
            case 1:
                ((AbstractC9927e) obj).getClass();
                throw null;
            case 2:
                C6681e c6681e = (C6681e) this.vip;
                C13705e c13705e = (C13705e) this.metrica;
                c13705e.close();
                Surface surface2 = (Surface) c6681e.f13791e.remove(c13705e);
                if (surface2 != null) {
                    C7188e c7188e = c6681e.f13795e;
                    AbstractC7328e.license((AtomicBoolean) c7188e.f14683e, true);
                    AbstractC7328e.metrica((Thread) c7188e.f14680e);
                    c7188e.loadAd(surface2, true);
                    return;
                }
                return;
            default:
                C12799e c12799e = (C12799e) this.vip;
                C13705e c13705e2 = (C13705e) this.metrica;
                c13705e2.close();
                Surface surface3 = (Surface) c12799e.f25605e.remove(c13705e2);
                if (surface3 != null) {
                    C2625e c2625e = c12799e.f25608e;
                    AbstractC7328e.license((AtomicBoolean) c2625e.f14683e, true);
                    AbstractC7328e.metrica((Thread) c2625e.f14680e);
                    c2625e.loadAd(surface3, true);
                    return;
                }
                return;
        }
    }
}
