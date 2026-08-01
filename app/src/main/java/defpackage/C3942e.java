package defpackage;

import java.util.Collection;
import java.util.Collections;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؖٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3942e implements InterfaceC11605e {
    public static final C11709e billing;
    public static final C0520e purchase;
    public final InterfaceC5334e ad;
    public final C0394e vip;
    public static final /* synthetic */ InterfaceC8614e[] license = {AbstractC3820e.ad.yandex(new C12156e(C3942e.class, "cloneable", "getCloneable()Lorg/jetbrains/kotlin/descriptors/impl/ClassDescriptorImpl;", 0))};
    public static final C10914e metrica = new C10914e(3);
    public static final C12816e appmetrica = AbstractC4972e.mopub;

    static {
        C13579e c13579e = AbstractC0206e.metrica;
        purchase = c13579e.billing();
        C12816e startapp = c13579e.startapp();
        billing = new C11709e(startapp.vip(), startapp.ad.billing());
    }

    /* JADX WARN: Type inference failed for: r0v1, types: [eٖؑٚ, eٖۥٌ] */
    public C3942e(C6272e c6272e, C16113e c16113e) {
        this.ad = c16113e;
        this.vip = new C16622e(c6272e, new C12056e(this, c6272e, 23));
    }

    @Override // defpackage.InterfaceC11605e
    public final InterfaceC5052e ad(C11709e c11709e) {
        if (!c11709e.equals(billing)) {
            return null;
        }
        InterfaceC8614e interfaceC8614e = license[0];
        return (C13726e) this.vip.invoke();
    }

    @Override // defpackage.InterfaceC11605e
    public final boolean metrica(C12816e c12816e, C0520e c0520e) {
        return c0520e.equals(purchase) && c12816e.equals(appmetrica);
    }

    @Override // defpackage.InterfaceC11605e
    public final Collection vip(C12816e c12816e) {
        if (!c12816e.equals(appmetrica)) {
            return C3295e.f7451e;
        }
        InterfaceC8614e interfaceC8614e = license[0];
        return Collections.singleton((C13726e) this.vip.invoke());
    }
}
