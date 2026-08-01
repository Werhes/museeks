package defpackage;

import java.lang.annotation.Annotation;
import java.util.Arrays;
import kotlin.Unit;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۘۜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C13458e implements InterfaceC5372e {
    public final /* synthetic */ int ad;
    public final Object license;
    public Object metrica;
    public final Object vip;

    public C13458e(Object obj, String str) {
        this.ad = 1;
        this.vip = obj;
        this.metrica = C13664e.f27089e;
        this.license = AbstractC18039e.appmetrica(2, new C1708e(str, this, 22));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public C13458e(String str, Object obj, Annotation[] annotationArr) {
        this(obj, str);
        this.ad = 1;
        this.metrica = Arrays.asList(annotationArr);
    }

    public C13458e(String str, Enum[] enumArr) {
        this.ad = 0;
        this.vip = enumArr;
        this.license = new C5363e(new C5625e(this, str, 13));
    }

    @Override // defpackage.InterfaceC5372e
    public final void ad(InterfaceC5757e interfaceC5757e, Object obj) {
        switch (this.ad) {
            case 0:
                Enum r5 = (Enum) obj;
                Enum[] enumArr = (Enum[]) this.vip;
                int firebase = AbstractC1660e.firebase(r5, enumArr);
                if (firebase != -1) {
                    interfaceC5757e.amazon(appmetrica(), firebase);
                    return;
                }
                throw new IllegalArgumentException(r5 + " is not a valid enum " + appmetrica().ad() + ", must be one of " + Arrays.toString(enumArr));
            default:
                interfaceC5757e.metrica(appmetrica()).vip(appmetrica());
                return;
        }
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, eؕٛؓ] */
    @Override // defpackage.InterfaceC5372e
    public final InterfaceC9998e appmetrica() {
        switch (this.ad) {
            case 0:
                return (InterfaceC9998e) ((C5363e) this.license).getValue();
            default:
                return (InterfaceC9998e) this.license.getValue();
        }
    }

    @Override // defpackage.InterfaceC5372e
    public final Object metrica(InterfaceC11754e interfaceC11754e) {
        int i = this.ad;
        Object obj = this.vip;
        switch (i) {
            case 0:
                Enum[] enumArr = (Enum[]) obj;
                int signatures = interfaceC11754e.signatures(appmetrica());
                if (signatures >= 0 && signatures < enumArr.length) {
                    return enumArr[signatures];
                }
                throw new IllegalArgumentException(signatures + " is not among valid " + appmetrica().ad() + " enum values, values size is " + enumArr.length);
            default:
                InterfaceC9998e appmetrica = appmetrica();
                InterfaceC2043e metrica = interfaceC11754e.metrica(appmetrica);
                int yandex = metrica.yandex(appmetrica());
                if (yandex != -1) {
                    throw new IllegalArgumentException(AbstractC1786e.admob(yandex, "Unexpected index "));
                }
                Unit unit = Unit.INSTANCE;
                metrica.vip(appmetrica);
                return obj;
        }
    }

    public String toString() {
        switch (this.ad) {
            case 0:
                return "kotlinx.serialization.internal.EnumSerializer<" + appmetrica().ad() + '>';
            default:
                return super.toString();
        }
    }
}
