package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٕٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C15355e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f30279e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f30280e;

    public /* synthetic */ C15355e(int i, int i2) {
        this.f30280e = i2;
        this.f30279e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C15921e c15921e = (C15921e) obj;
        switch (this.f30280e) {
            case 0:
                C2714e purchase = AbstractC4533e.purchase(this.f30279e, ((EnumC10044e) c15921e.metrica()).ordinal() > ((EnumC10044e) c15921e.ad()).ordinal());
                purchase.license = AbstractC7572e.metrica(2);
                return purchase;
            case 1:
                C2714e purchase2 = AbstractC4533e.purchase(this.f30279e, true);
                purchase2.license = AbstractC7572e.metrica(2);
                return purchase2;
            case 2:
                return AbstractC4533e.appmetrica(this.f30279e, ((EnumC14098e) ((AbstractC6986e) c15921e.ad()).ad()).ordinal() < ((EnumC14098e) ((AbstractC6986e) c15921e.metrica()).ad()).ordinal());
            case 3:
                boolean booleanValue = ((Boolean) c15921e.metrica()).booleanValue();
                int i = this.f30279e;
                C2714e purchase3 = booleanValue ? AbstractC4533e.purchase(i, true) : AbstractC4533e.purchase(i, false);
                purchase3.license = AbstractC7572e.metrica(2);
                return purchase3;
            case 4:
                boolean booleanValue2 = ((Boolean) c15921e.metrica()).booleanValue();
                int i2 = this.f30279e;
                C2714e purchase4 = booleanValue2 ? AbstractC4533e.purchase(i2, true) : AbstractC4533e.purchase(i2, false);
                purchase4.license = AbstractC7572e.metrica(2);
                return purchase4;
            case 5:
                C2714e purchase5 = AbstractC4533e.purchase(this.f30279e, true);
                purchase5.license = AbstractC7572e.metrica(2);
                return purchase5;
            default:
                C2714e purchase6 = AbstractC4533e.purchase(this.f30279e, true);
                purchase6.license = AbstractC7572e.metrica(2);
                return purchase6;
        }
    }
}
