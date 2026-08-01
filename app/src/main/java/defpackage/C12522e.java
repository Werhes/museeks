package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍّٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C12522e extends AbstractC15049e implements Function2 {

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public int f25066e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public int f25067e;

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ C4726e f25068e;

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public int f25069e;

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public /* synthetic */ Object f25070e;

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public int f25071e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C12522e(C4726e c4726e, InterfaceC5083e interfaceC5083e) {
        super(2, interfaceC5083e);
        this.f25068e = c4726e;
    }

    @Override // defpackage.AbstractC9049e
    public final InterfaceC5083e advert(InterfaceC5083e interfaceC5083e, Object obj) {
        C12522e c12522e = new C12522e(this.f25068e, interfaceC5083e);
        c12522e.f25070e = obj;
        return c12522e;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((C12522e) advert((InterfaceC5083e) obj2, (C4300e) obj)).loadAd(Unit.INSTANCE);
    }

    @Override // defpackage.AbstractC9049e
    public final Object loadAd(Object obj) {
        C4300e c4300e;
        int i;
        int i2;
        int i3;
        String str;
        int i4;
        int i5;
        String str2;
        C4726e c4726e = this.f25068e;
        C12328e c12328e = c4726e.f10116e;
        C12452e c12452e = c4726e.f10113e;
        int i6 = this.f25071e;
        if (i6 == 0) {
            AbstractC2003e.purchase(obj);
            c4300e = (C4300e) this.f25070e;
            i = 0;
            i2 = 0;
            i3 = 0;
        } else {
            if (i6 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            i = this.f25066e;
            i2 = this.f25069e;
            i3 = this.f25067e;
            c4300e = (C4300e) this.f25070e;
            AbstractC2003e.purchase(obj);
        }
        if (i3 >= Math.min(c4726e.f10115e + 10, c12452e.vip)) {
            return Unit.INSTANCE;
        }
        int i7 = i3 + 1;
        int metrica = c12452e.metrica(i3);
        switch (metrica) {
            case 0:
                str = "up";
                break;
            case 1:
                String advert = AbstractC1634e.advert(c12328e.yandex(i2), "down ");
                i2++;
                str = advert;
                break;
            case 2:
                str = "remove " + c12452e.metrica(i7) + ' ' + c12452e.metrica(i3 + 2);
                i7 = i3 + 3;
                break;
            case 3:
                str = "move " + c12452e.metrica(i7) + ' ' + c12452e.metrica(i3 + 2) + ' ' + c12452e.metrica(i3 + 3);
                i7 = i3 + 4;
                break;
            case 4:
                str = "clear";
                break;
            case 5:
                i4 = i3 + 2;
                int metrica2 = c12452e.metrica(i7);
                i5 = i2 + 1;
                str2 = "insertBottomUp " + metrica2 + ' ' + c12328e.yandex(i2);
                int i8 = i4;
                str = str2;
                i7 = i8;
                i2 = i5;
                break;
            case 6:
                i4 = i3 + 2;
                int metrica3 = c12452e.metrica(i7);
                i5 = i2 + 1;
                str2 = "insertTopDown " + metrica3 + ' ' + c12328e.yandex(i2);
                int i82 = i4;
                str = str2;
                i7 = i82;
                i2 = i5;
                break;
            case 7:
                Object yandex = c12328e.yandex(i2);
                AbstractC9476e.purchase(2, yandex);
                i2 += 2;
                str = "apply " + ((Function2) yandex);
                break;
            case 8:
                str = "reuse " + c4726e.f10114e.yandex(i);
                i++;
                break;
            case 9:
                str = "recompose pending";
                break;
            default:
                str = AbstractC1786e.admob(metrica, "unknown op: ");
                break;
        }
        this.f25070e = c4300e;
        this.f25067e = i7;
        this.f25069e = i2;
        this.f25066e = i;
        this.f25071e = 1;
        c4300e.metrica(this, i3 + ": " + str);
        return EnumC2821e.f6782e;
    }
}
