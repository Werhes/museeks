package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَؕ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10048e {
    public final <C> InterfaceC5372e serializer(final InterfaceC5372e interfaceC5372e) {
        return new InterfaceC12067e() { // from class: eّؔؖ
            private final InterfaceC9998e descriptor;

            {
                C4707e c4707e = new C4707e("com.arkivanov.decompose.router.pages.SerializablePages", this, 2);
                c4707e.advert("items", false);
                c4707e.advert("selectedIndex", false);
                this.descriptor = c4707e;
            }

            @Override // defpackage.InterfaceC5372e
            public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
                C15565e c15565e = (C15565e) obj;
                InterfaceC9998e interfaceC9998e = this.descriptor;
                InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
                C10048e c10048e = C15565e.Companion;
                AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
                abstractC15920e.applovin(interfaceC9998e, 0, new C13758e(interfaceC5372e, 0), c15565e.ad);
                abstractC15920e.inmobi(1, c15565e.vip, interfaceC9998e);
                metrica.vip(interfaceC9998e);
            }

            @Override // defpackage.InterfaceC5372e
            public final InterfaceC9998e appmetrica() {
                return this.descriptor;
            }

            @Override // defpackage.InterfaceC12067e
            public final InterfaceC5372e[] license() {
                return new InterfaceC5372e[]{new C13758e(interfaceC5372e, 0), C13257e.ad};
            }

            @Override // defpackage.InterfaceC5372e
            public final Object metrica(InterfaceC11754e interfaceC11754e) {
                InterfaceC9998e interfaceC9998e = this.descriptor;
                InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
                List list = null;
                boolean z = true;
                int i = 0;
                int i2 = 0;
                while (z) {
                    int yandex = metrica.yandex(interfaceC9998e);
                    if (yandex == -1) {
                        z = false;
                    } else if (yandex == 0) {
                        list = (List) metrica.subscription(interfaceC9998e, 0, new C13758e(interfaceC5372e, 0), list);
                        i |= 1;
                    } else {
                        if (yandex != 1) {
                            throw new C0413e(yandex);
                        }
                        i2 = metrica.remoteconfig(interfaceC9998e, 1);
                        i |= 2;
                    }
                }
                metrica.vip(interfaceC9998e);
                return new C15565e(i, i2, list);
            }

            @Override // defpackage.InterfaceC12067e
            public final InterfaceC5372e[] vip() {
                return new InterfaceC5372e[]{interfaceC5372e};
            }
        };
    }
}
