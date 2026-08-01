package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Set;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗۥِ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5266e implements InterfaceC8528e {
    public final Object metrica;
    public final /* synthetic */ int vip = 1;

    public C5266e(InterfaceC8528e interfaceC8528e) {
        this.metrica = interfaceC8528e;
    }

    public C5266e(InterfaceC11542e interfaceC11542e, Function0 function0) {
        C0327e c0327e = new C0327e(1, function0);
        C6272e c6272e = (C6272e) interfaceC11542e;
        c6272e.getClass();
        this.metrica = new C16622e(c6272e, c0327e);
    }

    @Override // defpackage.InterfaceC8528e
    public Collection ad(C0520e c0520e, EnumC2192e enumC2192e) {
        switch (this.vip) {
            case 1:
                return AbstractC12442e.m3349interface(adcel(c0520e, enumC2192e), C15146e.f29950e);
            default:
                return adcel(c0520e, enumC2192e);
        }
    }

    public final Collection adcel(C0520e c0520e, EnumC2192e enumC2192e) {
        return advert().ad(c0520e, enumC2192e);
    }

    public final InterfaceC8528e advert() {
        switch (this.vip) {
            case 0:
                return (InterfaceC8528e) ((C0394e) this.metrica).invoke();
            default:
                return (InterfaceC8528e) this.metrica;
        }
    }

    @Override // defpackage.InterfaceC7192e
    public final InterfaceC4077e appmetrica(C0520e c0520e, EnumC2192e enumC2192e) {
        return advert().appmetrica(c0520e, enumC2192e);
    }

    @Override // defpackage.InterfaceC8528e
    public final Set billing() {
        return advert().billing();
    }

    @Override // defpackage.InterfaceC8528e
    public final Set license() {
        return advert().license();
    }

    @Override // defpackage.InterfaceC7192e
    public Collection metrica(C4942e c4942e, Function1 function1) {
        switch (this.vip) {
            case 1:
                Collection startapp = startapp(c4942e, function1);
                ArrayList arrayList = new ArrayList();
                ArrayList arrayList2 = new ArrayList();
                for (Object obj : startapp) {
                    if (((InterfaceC15498e) obj) instanceof InterfaceC6647e) {
                        arrayList.add(obj);
                    } else {
                        arrayList2.add(obj);
                    }
                }
                return AbstractC13480e.m3584final(AbstractC12442e.m3349interface(arrayList, C15146e.f29959e), arrayList2);
            default:
                return startapp(c4942e, function1);
        }
    }

    public final Collection mopub(C0520e c0520e, EnumC2192e enumC2192e) {
        return advert().purchase(c0520e, enumC2192e);
    }

    @Override // defpackage.InterfaceC8528e
    public Collection purchase(C0520e c0520e, EnumC2192e enumC2192e) {
        switch (this.vip) {
            case 1:
                return AbstractC12442e.m3349interface(mopub(c0520e, enumC2192e), C15146e.f29955e);
            default:
                return mopub(c0520e, enumC2192e);
        }
    }

    public final Collection startapp(C4942e c4942e, Function1 function1) {
        return advert().metrica(c4942e, function1);
    }

    @Override // defpackage.InterfaceC8528e
    public final Set vip() {
        return advert().vip();
    }

    public final InterfaceC8528e yandex() {
        return advert() instanceof C5266e ? ((C5266e) advert()).yandex() : advert();
    }
}
