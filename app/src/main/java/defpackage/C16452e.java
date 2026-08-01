package defpackage;

import android.os.Parcel;
import com.google.common.util.concurrent.ListenableFuture;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖٜۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C16452e implements InterfaceC17847e, InterfaceC12937e, InterfaceC0987e {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final Object f32285e;

    public /* synthetic */ C16452e(Object obj) {
        this.f32285e = obj;
    }

    @Override // defpackage.InterfaceC17847e
    public void accept(Object obj, Object obj2) {
        C4379e c4379e = (C4379e) obj;
        C1091e c1091e = (C1091e) c4379e.loadAd();
        C10988e appmetrica = AbstractC10432e.appmetrica();
        BinderC12679e binderC12679e = ((C4612e) this.f32285e).mopub;
        Parcel m4156e = c1091e.m4156e();
        AbstractC3336e.metrica(m4156e, binderC12679e);
        AbstractC3336e.vip(m4156e, appmetrica);
        c1091e.m4151e(m4156e, 18);
        C1091e c1091e2 = (C1091e) c4379e.loadAd();
        C10988e appmetrica2 = AbstractC10432e.appmetrica();
        Parcel m4156e2 = c1091e2.m4156e();
        AbstractC3336e.vip(m4156e2, appmetrica2);
        c1091e2.m4151e(m4156e2, 17);
        ((C8988e) obj2).vip(null);
    }

    @Override // defpackage.InterfaceC0987e
    public /* synthetic */ ListenableFuture call() {
        return (AbstractC0586e) this.f32285e;
    }

    @Override // defpackage.InterfaceC12937e
    /* renamed from: metrica */
    public boolean mo2946metrica(Class cls) {
        for (int i = 0; i < 2; i++) {
            if (((InterfaceC12937e[]) this.f32285e)[i].mo2946metrica(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.InterfaceC12937e
    public C5166e vip(Class cls) {
        for (int i = 0; i < 2; i++) {
            InterfaceC12937e interfaceC12937e = ((InterfaceC12937e[]) this.f32285e)[i];
            if (interfaceC12937e.mo2946metrica(cls)) {
                return interfaceC12937e.vip(cls);
            }
        }
        throw new UnsupportedOperationException("No factory is available for message type: ".concat(cls.getName()));
    }
}
