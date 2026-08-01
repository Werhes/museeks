package defpackage;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕۛؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C15716e {
    public final <T> InterfaceC5372e serializer(final InterfaceC5372e interfaceC5372e) {
        return new InterfaceC12067e() { // from class: eٗؑ
            private final InterfaceC9998e descriptor;

            {
                C4707e c4707e = new C4707e("bruhcollective.itaysonlab.spark.client.SparkWithHash", this, 2);
                c4707e.advert("data", false);
                c4707e.advert("hash", false);
                this.descriptor = c4707e;
            }

            @Override // defpackage.InterfaceC5372e
            public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
                C1530e c1530e = (C1530e) obj;
                InterfaceC9998e interfaceC9998e = this.descriptor;
                InterfaceC11845e metrica = interfaceC5757e.metrica(interfaceC9998e);
                C15716e c15716e = C1530e.Companion;
                AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
                abstractC15920e.applovin(interfaceC9998e, 0, interfaceC5372e, c1530e.ad);
                abstractC15920e.ads(interfaceC9998e, 1, c1530e.vip);
                metrica.vip(interfaceC9998e);
            }

            @Override // defpackage.InterfaceC5372e
            public final InterfaceC9998e appmetrica() {
                return this.descriptor;
            }

            @Override // defpackage.InterfaceC12067e
            public final InterfaceC5372e[] license() {
                return new InterfaceC5372e[]{interfaceC5372e, C9582e.ad};
            }

            @Override // defpackage.InterfaceC5372e
            public final Object metrica(InterfaceC11754e interfaceC11754e) {
                InterfaceC9998e interfaceC9998e = this.descriptor;
                InterfaceC2043e metrica = interfaceC11754e.metrica(interfaceC9998e);
                Object obj = null;
                boolean z = true;
                int i = 0;
                String str = null;
                while (z) {
                    int yandex = metrica.yandex(interfaceC9998e);
                    if (yandex == -1) {
                        z = false;
                    } else if (yandex == 0) {
                        obj = metrica.subscription(interfaceC9998e, 0, interfaceC5372e, obj);
                        i |= 1;
                    } else {
                        if (yandex != 1) {
                            throw new C0413e(yandex);
                        }
                        str = metrica.smaato(interfaceC9998e, 1);
                        i |= 2;
                    }
                }
                metrica.vip(interfaceC9998e);
                return new C1530e(i, obj, str);
            }

            @Override // defpackage.InterfaceC12067e
            public final InterfaceC5372e[] vip() {
                return new InterfaceC5372e[]{interfaceC5372e};
            }
        };
    }
}
