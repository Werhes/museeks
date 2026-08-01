package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙؑٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6115e {
    public final <T> InterfaceC5372e serializer(final InterfaceC5372e interfaceC5372e) {
        return new InterfaceC12067e() { // from class: eٖؗۤ
            private final InterfaceC9998e descriptor;

            {
                C4707e c4707e = new C4707e("bruhcollective.itaysonlab.vkapi.objects.internal.RawVkResponse", this, 2);
                c4707e.advert("response", true);
                c4707e.advert("error", true);
                this.descriptor = c4707e;
            }

            @Override // defpackage.InterfaceC5372e
            public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
                C11464e c11464e = (C11464e) obj;
                C2813e c2813e = c11464e.vip;
                Object obj2 = c11464e.ad;
                InterfaceC9998e interfaceC9998e = this.descriptor;
                InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
                C6115e c6115e = C11464e.Companion;
                if (metrica.subscription() || obj2 != null) {
                    metrica.Signature(interfaceC9998e, 0, interfaceC5372e, obj2);
                }
                if (metrica.subscription() || c2813e != null) {
                    metrica.Signature(interfaceC9998e, 1, C8733e.ad, c2813e);
                }
                metrica.vip(interfaceC9998e);
            }

            @Override // defpackage.InterfaceC5372e
            public final InterfaceC9998e appmetrica() {
                return this.descriptor;
            }

            @Override // defpackage.InterfaceC12067e
            public final InterfaceC5372e[] license() {
                return new InterfaceC5372e[]{AbstractC6069e.purchase(interfaceC5372e), AbstractC6069e.purchase(C8733e.ad)};
            }

            @Override // defpackage.InterfaceC5372e
            public final Object metrica(InterfaceC11754e interfaceC11754e) {
                InterfaceC9998e interfaceC9998e = this.descriptor;
                InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
                Object obj = null;
                boolean z = true;
                int i = 0;
                C2813e c2813e = null;
                while (z) {
                    int yandex = metrica.yandex(interfaceC9998e);
                    if (yandex == -1) {
                        z = false;
                    } else if (yandex == 0) {
                        obj = metrica.inmobi(interfaceC9998e, 0, interfaceC5372e, obj);
                        i |= 1;
                    } else {
                        if (yandex != 1) {
                            throw new C0413e(yandex);
                        }
                        c2813e = (C2813e) metrica.inmobi(interfaceC9998e, 1, C8733e.ad, c2813e);
                        i |= 2;
                    }
                }
                metrica.vip(interfaceC9998e);
                return new C11464e(i, obj, c2813e);
            }

            @Override // defpackage.InterfaceC12067e
            public final InterfaceC5372e[] vip() {
                return new InterfaceC5372e[]{interfaceC5372e};
            }
        };
    }
}
