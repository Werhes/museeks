package defpackage;

import java.util.Collection;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُِٕ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C11758e extends AbstractC8530e {
    public static final /* synthetic */ InterfaceC8614e[] purchase;
    public final C0394e appmetrica;
    public final C0394e license;
    public final boolean metrica;
    public final C7025e vip;

    static {
        C12156e c12156e = new C12156e(C11758e.class, "functions", "getFunctions()Ljava/util/List;", 0);
        C12232e c12232e = AbstractC3820e.ad;
        purchase = new InterfaceC8614e[]{c12232e.yandex(c12156e), AbstractC4653e.tapsense(C11758e.class, "properties", "getProperties()Ljava/util/List;", 0, c12232e)};
    }

    /* JADX WARN: Type inference failed for: r3v2, types: [eٖؑٚ, eٖۥٌ] */
    /* JADX WARN: Type inference failed for: r3v4, types: [eٖؑٚ, eٖۥٌ] */
    public C11758e(C6272e c6272e, C7025e c7025e, boolean z) {
        this.vip = c7025e;
        this.metrica = z;
        C13250e c13250e = new C13250e(this, 0);
        c6272e.getClass();
        this.license = new C16622e(c6272e, c13250e);
        this.appmetrica = new C16622e(c6272e, new C13250e(this, 1));
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Collection ad(C0520e c0520e, EnumC2192e enumC2192e) {
        InterfaceC8614e interfaceC8614e = purchase[0];
        List list = (List) this.license.invoke();
        C15587e c15587e = new C15587e();
        for (Object obj : list) {
            if (AbstractC7890e.billing(((C1117e) obj).getName(), c0520e)) {
                c15587e.add(obj);
            }
        }
        return c15587e;
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC7192e
    public final /* bridge */ /* synthetic */ InterfaceC4077e appmetrica(C0520e c0520e, EnumC2192e enumC2192e) {
        return null;
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC7192e
    public final Collection metrica(C4942e c4942e, Function1 function1) {
        InterfaceC8614e[] interfaceC8614eArr = purchase;
        InterfaceC8614e interfaceC8614e = interfaceC8614eArr[0];
        List list = (List) this.license.invoke();
        InterfaceC8614e interfaceC8614e2 = interfaceC8614eArr[1];
        return AbstractC13480e.m3584final(list, (List) this.appmetrica.invoke());
    }

    @Override // defpackage.AbstractC8530e, defpackage.InterfaceC8528e
    public final Collection purchase(C0520e c0520e, EnumC2192e enumC2192e) {
        InterfaceC8614e interfaceC8614e = purchase[1];
        List list = (List) this.appmetrica.invoke();
        C15587e c15587e = new C15587e();
        for (Object obj : list) {
            if (AbstractC7890e.billing(((InterfaceC2188e) obj).getName(), c0520e)) {
                c15587e.add(obj);
            }
        }
        return c15587e;
    }
}
