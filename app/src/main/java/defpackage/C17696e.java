package defpackage;

import java.lang.reflect.GenericArrayType;
import java.lang.reflect.WildcardType;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِ٘ٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C17696e implements InterfaceC14707e {
    public static final /* synthetic */ InterfaceC8614e[] yandex;
    public final C11980e ad;
    public final C10253e appmetrica;
    public final boolean billing;
    public final C0394e license;
    public final C16622e metrica;
    public final C0394e purchase;
    public final C2430e vip;

    static {
        C12156e c12156e = new C12156e(C17696e.class, "fqName", "getFqName()Lorg/jetbrains/kotlin/name/FqName;", 0);
        C12232e c12232e = AbstractC3820e.ad;
        yandex = new InterfaceC8614e[]{c12232e.yandex(c12156e), AbstractC4653e.tapsense(C17696e.class, "type", "getType()Lorg/jetbrains/kotlin/types/SimpleType;", 0, c12232e), AbstractC4653e.tapsense(C17696e.class, "allValueArguments", "getAllValueArguments()Ljava/util/Map;", 0, c12232e)};
    }

    /* JADX WARN: Type inference failed for: r3v1, types: [eٖؑٚ, eٖۥٌ] */
    /* JADX WARN: Type inference failed for: r6v5, types: [eٖؑٚ, eٖۥٌ] */
    public C17696e(C2430e c2430e, C11980e c11980e, boolean z) {
        this.ad = c11980e;
        this.vip = c2430e;
        C17241e c17241e = (C17241e) c11980e.f23950e;
        InterfaceC11542e interfaceC11542e = c17241e.ad;
        C10816e c10816e = new C10816e(this, 0);
        C6272e c6272e = (C6272e) interfaceC11542e;
        c6272e.getClass();
        this.metrica = new C16622e(c6272e, c10816e);
        C10816e c10816e2 = new C10816e(this, 1);
        C6272e c6272e2 = (C6272e) interfaceC11542e;
        c6272e2.getClass();
        this.license = new C16622e(c6272e2, c10816e2);
        this.appmetrica = c17241e.adcel.pro(c2430e);
        C10816e c10816e3 = new C10816e(this, 2);
        C6272e c6272e3 = (C6272e) interfaceC11542e;
        c6272e3.getClass();
        this.purchase = new C16622e(c6272e3, c10816e3);
        this.billing = z;
    }

    @Override // defpackage.InterfaceC16566e
    public final AbstractC1186e ad() {
        InterfaceC8614e interfaceC8614e = yandex[1];
        return (AbstractC10226e) this.license.invoke();
    }

    @Override // defpackage.InterfaceC16566e
    public final InterfaceC3054e adcel() {
        return this.appmetrica;
    }

    @Override // defpackage.InterfaceC16566e
    public final Map advert() {
        InterfaceC8614e interfaceC8614e = yandex[2];
        return (Map) this.purchase.invoke();
    }

    @Override // defpackage.InterfaceC16566e
    public final C12816e mopub() {
        InterfaceC8614e interfaceC8614e = yandex[0];
        return (C12816e) this.metrica.invoke();
    }

    public final String toString() {
        return C8746e.metrica.isVip(this, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final AbstractC13656e vip(InterfaceC16083e interfaceC16083e) {
        AbstractC1186e startapp;
        if (interfaceC16083e instanceof C4451e) {
            return C9616e.adcel(null, ((C4451e) interfaceC16083e).vip);
        }
        if (interfaceC16083e instanceof C16910e) {
            Enum r7 = ((C16910e) interfaceC16083e).vip;
            Class<?> cls = r7.getClass();
            if (!cls.isEnum()) {
                cls = cls.getEnclosingClass();
            }
            return new C8259e(AbstractC2677e.ad(cls), C0520e.appmetrica(r7.name()));
        }
        boolean z = interfaceC16083e instanceof C17745e;
        C11980e c11980e = this.ad;
        if (z) {
            C17745e c17745e = (C17745e) interfaceC16083e;
            C0520e c0520e = c17745e.ad;
            if (c0520e == null) {
                c0520e = AbstractC15262e.vip;
            }
            ArrayList ad = c17745e.ad();
            InterfaceC8614e interfaceC8614e = yandex[1];
            if (!AbstractC4520e.purchase((AbstractC10226e) this.license.invoke())) {
                C13043e appmetrica = AbstractC8913e.appmetrica(c0520e, AbstractC2876e.license(this));
                if (appmetrica == null || (startapp = appmetrica.ad()) == null) {
                    startapp = ((C17241e) c11980e.f23950e).loadAd.amazon().startapp(C18139e.vip(EnumC16799e.f32913e, new String[0]));
                }
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(ad, 10));
                Iterator it = ad.iterator();
                while (it.hasNext()) {
                    AbstractC13656e vip = vip((InterfaceC16083e) it.next());
                    if (vip == null) {
                        vip = new AbstractC13656e(null);
                    }
                    arrayList.add(vip);
                }
                return new C7270e(arrayList, startapp);
            }
        } else {
            if (interfaceC16083e instanceof C15026e) {
                return new AbstractC13656e(new C17696e(new C2430e(((C15026e) interfaceC16083e).vip), c11980e, false));
            }
            if (interfaceC16083e instanceof C17255e) {
                Class cls2 = ((C17255e) interfaceC16083e).vip;
                AbstractC1186e m4538e = ((C18478e) c11980e.f23948e).m4538e(cls2.isPrimitive() ? new C17896e(cls2) : ((cls2 instanceof GenericArrayType) || cls2.isArray()) ? new C12860e(cls2) : cls2 instanceof WildcardType ? new C13634e((WildcardType) cls2) : new C13652e(cls2), AbstractC10510e.purchase(2, false, null, 7));
                if (!AbstractC4520e.purchase(m4538e)) {
                    AbstractC1186e abstractC1186e = m4538e;
                    int i = 0;
                    while (AbstractC13270e.isPro(abstractC1186e)) {
                        abstractC1186e = ((AbstractC16232e) AbstractC13480e.m3590instanceof(abstractC1186e.mopub())).vip();
                        i++;
                    }
                    InterfaceC4077e advert = abstractC1186e.loadAd().advert();
                    if (advert instanceof InterfaceC5052e) {
                        C11709e purchase = AbstractC2876e.purchase(advert);
                        return purchase == null ? new AbstractC13656e(new C16637e(m4538e)) : new C5644e(purchase, i);
                    }
                    if (advert instanceof InterfaceC16046e) {
                        C12816e startapp2 = AbstractC0206e.ad.startapp();
                        return new C5644e(new C11709e(startapp2.vip(), startapp2.ad.billing()), 0);
                    }
                }
            }
        }
        return null;
    }
}
