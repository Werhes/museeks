package defpackage;

import java.util.Collections;
import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘُّ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C12408e implements InterfaceC16897e {
    public final /* synthetic */ int ad;
    public static final C12408e vip = new C12408e(0);
    public static final C12408e metrica = new C12408e(1);

    public /* synthetic */ C12408e(int i) {
        this.ad = i;
    }

    @Override // defpackage.InterfaceC16897e
    public final /* bridge */ String license(C0782e c0782e) {
        switch (this.ad) {
            case 0:
                return AbstractC10681e.vip(this, c0782e);
            default:
                return AbstractC10681e.vip(this, c0782e);
        }
    }

    @Override // defpackage.InterfaceC16897e
    public final boolean metrica(C0782e c0782e) {
        AbstractC10226e license;
        switch (this.ad) {
            case 0:
                C13043e c13043e = (C13043e) c0782e.mo330e().get(1);
                C8455e c8455e = C10891e.license;
                int i = AbstractC2876e.ad;
                InterfaceC5334e metrica2 = AbstractC14300e.metrica(c13043e);
                c8455e.getClass();
                InterfaceC5052e license2 = AbstractC1284e.license(metrica2, AbstractC0206e.f1434default);
                if (license2 == null) {
                    license = null;
                } else {
                    C6557e.f13492e.getClass();
                    license = AbstractC1596e.license(C6557e.f13491e, license2.mo1459goto(), Collections.singletonList(new C15786e((InterfaceC16046e) AbstractC13480e.m3590instanceof(license2.mo1459goto().getParameters()))), false);
                }
                if (license == null) {
                    return false;
                }
                return InterfaceC9853e.ad.vip(license, AbstractC11957e.billing(c13043e.ad(), false));
            default:
                List<C13043e> mo330e = c0782e.mo330e();
                if (!mo330e.isEmpty()) {
                    for (C13043e c13043e2 : mo330e) {
                        if (AbstractC2876e.ad(c13043e2) || c13043e2.f25971e != null) {
                            return false;
                        }
                    }
                }
                return true;
        }
    }

    @Override // defpackage.InterfaceC16897e
    public final String vip() {
        switch (this.ad) {
            case 0:
                return "second parameter must be of type KProperty<*> or its supertype";
            default:
                return "should not have varargs or parameters with default values";
        }
    }
}
