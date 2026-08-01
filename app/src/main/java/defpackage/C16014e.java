package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import kotlin.jvm.functions.Function1;

/* renamed from: eٖؖۧ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C16014e implements Function1 {

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public final InterfaceC7227e f31541e;

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C12816e f31542e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31543e = 0;

    public C16014e(InterfaceC7227e interfaceC7227e, C12816e c12816e) {
        this.f31541e = interfaceC7227e;
        this.f31542e = c12816e;
    }

    public C16014e(C12816e c12816e, InterfaceC7227e interfaceC7227e) {
        this.f31542e = c12816e;
        this.f31541e = interfaceC7227e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        InterfaceC7227e interfaceC7227e;
        switch (this.f31543e) {
            case 0:
                InterfaceC7227e interfaceC7227e2 = this.f31541e;
                C12816e c12816e = this.f31542e;
                C11005e c11005e = (C11005e) obj;
                List typeParameters = interfaceC7227e2.getTypeParameters();
                ArrayList arrayList = new ArrayList(AbstractC0746e.subscription(typeParameters, 10));
                Iterator it = typeParameters.iterator();
                while (it.hasNext()) {
                    C17936e c17936e = new C17936e(c11005e, ((InterfaceC12635e) it.next()).getName(), (AbstractC7890e.billing(c12816e, AbstractC0206e.f1442native) || AbstractC7890e.billing(c12816e, AbstractC0206e.f1452this)) ? 3 : 1);
                    c17936e.f35179e = Collections.singletonList(AbstractC11201e.vip);
                    arrayList.add(c17936e);
                }
                return arrayList;
            default:
                C12816e c12816e2 = this.f31542e;
                InterfaceC7227e interfaceC7227e3 = this.f31541e;
                C11005e c11005e2 = (C11005e) obj;
                if (AbstractC7890e.billing(c12816e2, AbstractC0206e.f1435extends)) {
                    InterfaceC13984e vip = AbstractC3820e.vip(Iterable.class, C5538e.metrica);
                    C12232e c12232e = AbstractC3820e.ad;
                    interfaceC7227e = ((AbstractC8761e) c12232e.license(vip)).advert();
                    if (interfaceC7227e == null) {
                        throw new Error(AbstractC1786e.subscription(c12232e, Iterable.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (AbstractC7890e.billing(c12816e2, AbstractC0206e.f1453throw)) {
                    InterfaceC13984e vip2 = AbstractC3820e.vip(Collection.class, C5538e.metrica);
                    C12232e c12232e2 = AbstractC3820e.ad;
                    interfaceC7227e = ((AbstractC8761e) c12232e2.license(vip2)).advert();
                    if (interfaceC7227e == null) {
                        throw new Error(AbstractC1786e.subscription(c12232e2, Collection.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (AbstractC7890e.billing(c12816e2, AbstractC0206e.f1455try)) {
                    InterfaceC13984e vip3 = AbstractC3820e.vip(Collection.class, C5538e.metrica);
                    C12232e c12232e3 = AbstractC3820e.ad;
                    interfaceC7227e = ((AbstractC8761e) c12232e3.license(vip3)).advert();
                    if (interfaceC7227e == null) {
                        throw new Error(AbstractC1786e.subscription(c12232e3, Collection.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else if (AbstractC7890e.billing(c12816e2, AbstractC0206e.f1456while)) {
                    InterfaceC13984e vip4 = AbstractC3820e.vip(Iterator.class, C5538e.metrica);
                    C12232e c12232e4 = AbstractC3820e.ad;
                    interfaceC7227e = ((AbstractC8761e) c12232e4.license(vip4)).advert();
                    if (interfaceC7227e == null) {
                        throw new Error(AbstractC1786e.subscription(c12232e4, Iterator.class, new StringBuilder("No mutable collection class found: ")));
                    }
                } else {
                    interfaceC7227e = null;
                }
                List<InterfaceC12635e> list = c11005e2.f21795e;
                ArrayList arrayList2 = new ArrayList(AbstractC0746e.subscription(list, 10));
                for (InterfaceC12635e interfaceC12635e : list) {
                    C5538e c5538e = C5538e.metrica;
                    arrayList2.add(AbstractC16704e.license(AbstractC14436e.metrica(interfaceC12635e, null, 7)));
                }
                ArrayList isPro = AbstractC1660e.isPro(new InterfaceC7227e[]{interfaceC7227e3, interfaceC7227e});
                ArrayList arrayList3 = new ArrayList(AbstractC0746e.subscription(isPro, 10));
                Iterator it2 = isPro.iterator();
                while (it2.hasNext()) {
                    arrayList3.add(AbstractC14436e.metrica((InterfaceC7227e) it2.next(), arrayList2, 6));
                }
                return arrayList3;
        }
    }
}
