package defpackage;

import java.util.List;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؙۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7783e {
    public final <T> InterfaceC5372e serializer(final InterfaceC5372e interfaceC5372e) {
        return new InterfaceC12067e() { // from class: eٍُ۠
            private final InterfaceC9998e descriptor;

            {
                C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.RootItemsResponseDto", this, 2);
                c4707e.advert("count", true);
                c4707e.advert("items", true);
                this.descriptor = c4707e;
            }

            @Override // defpackage.InterfaceC5372e
            public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
                C8641e c8641e = (C8641e) obj;
                List list = c8641e.vip;
                Integer num = c8641e.ad;
                InterfaceC9998e interfaceC9998e = this.descriptor;
                InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
                C7783e c7783e = C8641e.Companion;
                if (metrica.subscription() || num != null) {
                    metrica.Signature(interfaceC9998e, 0, C13257e.ad, num);
                }
                if (metrica.subscription() || !AbstractC7890e.billing(list, C13664e.f27089e)) {
                    ((AbstractC15920e) metrica).applovin(interfaceC9998e, 1, new C13758e(interfaceC5372e, 0), list);
                }
                metrica.vip(interfaceC9998e);
            }

            @Override // defpackage.InterfaceC5372e
            public final InterfaceC9998e appmetrica() {
                return this.descriptor;
            }

            @Override // defpackage.InterfaceC12067e
            public final InterfaceC5372e[] license() {
                return new InterfaceC5372e[]{AbstractC6069e.purchase(C13257e.ad), new C13758e(interfaceC5372e, 0)};
            }

            @Override // defpackage.InterfaceC5372e
            public final Object metrica(InterfaceC11754e interfaceC11754e) {
                InterfaceC9998e interfaceC9998e = this.descriptor;
                InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
                Integer num = null;
                boolean z = true;
                int i = 0;
                List list = null;
                while (z) {
                    int yandex = metrica.yandex(interfaceC9998e);
                    if (yandex == -1) {
                        z = false;
                    } else if (yandex == 0) {
                        num = (Integer) metrica.inmobi(interfaceC9998e, 0, C13257e.ad, num);
                        i |= 1;
                    } else {
                        if (yandex != 1) {
                            throw new C0413e(yandex);
                        }
                        list = (List) metrica.subscription(interfaceC9998e, 1, new C13758e(interfaceC5372e, 0), list);
                        i |= 2;
                    }
                }
                metrica.vip(interfaceC9998e);
                return new C8641e(i, num, list);
            }

            @Override // defpackage.InterfaceC12067e
            public final InterfaceC5372e[] vip() {
                return new InterfaceC5372e[]{interfaceC5372e};
            }
        };
    }
}
