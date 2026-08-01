package defpackage;

import java.util.Map;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؖۘۡ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C4336e implements InterfaceC5372e {
    public final InterfaceC5372e ad;
    public final C17709e license;
    public final /* synthetic */ int metrica;
    public final InterfaceC5372e vip;

    public C4336e(InterfaceC5372e interfaceC5372e, InterfaceC5372e interfaceC5372e2, byte b) {
        this.ad = interfaceC5372e;
        this.vip = interfaceC5372e2;
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C4336e(InterfaceC5372e interfaceC5372e, InterfaceC5372e interfaceC5372e2, int i) {
        this(interfaceC5372e, interfaceC5372e2, (byte) 0);
        this.metrica = i;
        switch (i) {
            case 1:
                this(interfaceC5372e, interfaceC5372e2, (byte) 0);
                InterfaceC9998e[] interfaceC9998eArr = new InterfaceC9998e[0];
                if (AbstractC5304e.m1866native("kotlin.Pair")) {
                    throw new IllegalArgumentException("Blank serial names are prohibited");
                }
                C7469e c7469e = new C7469e("kotlin.Pair");
                c7469e.ad(interfaceC5372e.appmetrica(), "first");
                c7469e.ad(interfaceC5372e2.appmetrica(), "second");
                Unit unit = Unit.INSTANCE;
                this.license = new C17709e("kotlin.Pair", C6805e.appmetrica, c7469e.metrica.size(), AbstractC1660e.m670implements(interfaceC9998eArr), c7469e);
                return;
            default:
                C10869e c10869e = new C10869e(interfaceC5372e, interfaceC5372e2, 5);
                this.license = AbstractC10003e.license("kotlin.collections.Map.Entry", C18215e.appmetrica, new InterfaceC9998e[0], c10869e);
                return;
        }
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        Object key;
        Object value;
        InterfaceC11845e metrica = interfaceC5757e.metrica(appmetrica());
        InterfaceC9998e appmetrica = appmetrica();
        InterfaceC5372e interfaceC5372e = this.ad;
        switch (this.metrica) {
            case 0:
                key = ((Map.Entry) obj).getKey();
                break;
            default:
                key = ((C6571e) obj).f13544e;
                break;
        }
        AbstractC15920e abstractC15920e = (AbstractC15920e) metrica;
        abstractC15920e.applovin(appmetrica, 0, interfaceC5372e, key);
        InterfaceC9998e appmetrica2 = appmetrica();
        InterfaceC5372e interfaceC5372e2 = this.vip;
        switch (this.metrica) {
            case 0:
                value = ((Map.Entry) obj).getValue();
                break;
            default:
                value = ((C6571e) obj).f13543e;
                break;
        }
        abstractC15920e.applovin(appmetrica2, 1, interfaceC5372e2, value);
        abstractC15920e.vip(appmetrica());
    }

    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        switch (this.metrica) {
            case 0:
                return this.license;
            default:
                return this.license;
        }
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        Object c13233e;
        InterfaceC9998e appmetrica = appmetrica();
        InterfaceC2043e metrica = interfaceC11754e.metrica(appmetrica);
        Object obj = AbstractC2641e.ad;
        Object obj2 = obj;
        Object obj3 = obj2;
        while (true) {
            int yandex = metrica.yandex(appmetrica());
            if (yandex == -1) {
                if (obj2 == obj) {
                    throw new IllegalArgumentException("Element 'key' is missing");
                }
                if (obj3 == obj) {
                    throw new IllegalArgumentException("Element 'value' is missing");
                }
                switch (this.metrica) {
                    case 0:
                        c13233e = new C13233e(obj2, obj3);
                        break;
                    default:
                        c13233e = new C6571e(obj2, obj3);
                        break;
                }
                metrica.vip(appmetrica);
                return c13233e;
            }
            if (yandex == 0) {
                obj2 = metrica.subscription(appmetrica(), 0, this.ad, null);
            } else {
                if (yandex != 1) {
                    throw new IllegalArgumentException(AbstractC1786e.admob(yandex, "Invalid index: "));
                }
                obj3 = metrica.subscription(appmetrica(), 1, this.vip, null);
            }
        }
    }
}
