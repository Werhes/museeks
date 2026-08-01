package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۗؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4304e extends AbstractC8530e {
    public final InterfaceC8528e vip;

    public C4304e(InterfaceC8528e interfaceC8528e) {
        this.vip = interfaceC8528e;
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC7192e
    public final InterfaceC4077e appmetrica(C0520e c0520e, EnumC2192e enumC2192e) {
        InterfaceC4077e appmetrica = this.vip.appmetrica(c0520e, enumC2192e);
        if (appmetrica != null) {
            InterfaceC5052e interfaceC5052e = appmetrica instanceof InterfaceC5052e ? (InterfaceC5052e) appmetrica : null;
            if (interfaceC5052e != null) {
                return interfaceC5052e;
            }
            if (appmetrica instanceof InterfaceC9794e) {
                return (InterfaceC9794e) appmetrica;
            }
        }
        return null;
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Set billing() {
        return this.vip.billing();
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Set license() {
        return this.vip.license();
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC7192e
    public final Collection metrica(C4942e c4942e, Function1 function1) {
        int i = C4942e.advert & c4942e.vip;
        C4942e c4942e2 = i == 0 ? null : new C4942e(i, c4942e.ad);
        if (c4942e2 == null) {
            return C13664e.f27089e;
        }
        Collection metrica = this.vip.metrica(c4942e2, function1);
        ArrayList arrayList = new ArrayList();
        for (Object obj : metrica) {
            if (obj instanceof InterfaceC2978e) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public final String toString() {
        return "Classes from " + this.vip;
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Set vip() {
        return this.vip.vip();
    }
}
