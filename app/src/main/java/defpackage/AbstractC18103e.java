package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eۣ٘ۥ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC18103e extends AbstractC8530e {
    public static final /* synthetic */ InterfaceC8614e[] license = {AbstractC3820e.ad.yandex(new C12156e(AbstractC18103e.class, "allDescriptors", "getAllDescriptors()Ljava/util/List;", 0))};
    public final C0394e metrica;
    public final AbstractC15349e vip;

    /* JADX WARN: Type inference failed for: r0v1, types: [eٖؑٚ, eٖۥٌ] */
    public AbstractC18103e(C6272e c6272e, AbstractC15349e abstractC15349e) {
        this.vip = abstractC15349e;
        C3411e c3411e = new C3411e(23, this);
        c6272e.getClass();
        this.metrica = new C16622e(c6272e, c3411e);
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Collection ad(C0520e c0520e, EnumC2192e enumC2192e) {
        InterfaceC8614e interfaceC8614e = license[0];
        List list = (List) this.metrica.invoke();
        if (list.isEmpty()) {
            return C13664e.f27089e;
        }
        C15587e c15587e = new C15587e();
        for (Object obj : list) {
            if ((obj instanceof C1117e) && AbstractC7890e.billing(((C1117e) obj).getName(), c0520e)) {
                c15587e.add(obj);
            }
        }
        return c15587e;
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC7192e
    public final Collection metrica(C4942e c4942e, Function1 function1) {
        if (!c4942e.ad(C4942e.amazon.vip)) {
            return C13664e.f27089e;
        }
        InterfaceC8614e interfaceC8614e = license[0];
        return (List) this.metrica.invoke();
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Collection purchase(C0520e c0520e, EnumC2192e enumC2192e) {
        InterfaceC8614e interfaceC8614e = license[0];
        List list = (List) this.metrica.invoke();
        if (list.isEmpty()) {
            return C13664e.f27089e;
        }
        C15587e c15587e = new C15587e();
        for (Object obj : list) {
            if ((obj instanceof InterfaceC2188e) && AbstractC7890e.billing(((InterfaceC2188e) obj).getName(), c0520e)) {
                c15587e.add(obj);
            }
        }
        return c15587e;
    }

    public abstract List yandex();
}
