package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٕٗٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C17028e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ int f33359e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33360e;

    public /* synthetic */ C17028e(int i, int i2) {
        this.f33360e = i2;
        this.f33359e = i;
    }

    public /* synthetic */ C17028e(Object obj, int i, int i2) {
        this.f33360e = i2;
        this.f33359e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C2714e purchase;
        switch (this.f33360e) {
            case 0:
                return AbstractC4533e.purchase(this.f33359e, ((Boolean) ((C15921e) obj).metrica()).booleanValue());
            case 1:
                C2714e purchase2 = AbstractC4533e.purchase(this.f33359e, true);
                purchase2.license = AbstractC7572e.metrica(2);
                return purchase2;
            case 2:
                C2714e appmetrica = AbstractC4533e.appmetrica(this.f33359e, true);
                appmetrica.license = AbstractC7572e.metrica(2);
                return appmetrica;
            case 3:
                return AbstractC4533e.appmetrica(this.f33359e, true);
            case 4:
                return AbstractC4533e.appmetrica(this.f33359e, true);
            case 5:
                C15921e c15921e = (C15921e) obj;
                C2714e purchase3 = AbstractC4533e.purchase(this.f33359e, ((EnumC10826e) c15921e.metrica()).ordinal() > ((EnumC10826e) c15921e.ad()).ordinal());
                purchase3.license = AbstractC7572e.metrica(2);
                return purchase3;
            case 6:
                C2714e purchase4 = AbstractC4533e.purchase(this.f33359e, true);
                purchase4.license = AbstractC7572e.metrica(2);
                return purchase4;
            case 7:
                C2714e purchase5 = AbstractC4533e.purchase(this.f33359e, true);
                purchase5.license = AbstractC7572e.metrica(2);
                return purchase5;
            case 8:
                C4839e c4839e = (C4839e) obj;
                StringBuilder sb = new StringBuilder();
                sb.append(c4839e.ad);
                sb.append('=');
                String str = c4839e.vip;
                int m2467class = AbstractC8703e.m2467class(this.f33359e);
                if (m2467class != 0) {
                    if (m2467class == 1) {
                        str = AbstractC0383e.vip(str);
                    } else {
                        if (m2467class != 2) {
                            throw new C14803e(10);
                        }
                        str = AbstractC6528e.appmetrica(str, false);
                    }
                } else if (AbstractC0383e.ad(str)) {
                    str = AbstractC0383e.vip(str);
                }
                sb.append(str);
                return sb.toString();
            case 9:
                return AbstractC15143e.vip(AbstractC15367e.metrica(((C14542e) obj).ad, this.f33359e));
            case 10:
                return AbstractC15143e.vip(AbstractC15367e.metrica(((C14542e) obj).ad, this.f33359e));
            case 11:
                C4885e c4885e = (C4885e) obj;
                AbstractC13717e adcel = AbstractC12640e.adcel();
                AbstractC12640e.Signature(adcel, AbstractC12640e.smaato(adcel), adcel != null ? adcel.appmetrica() : null);
                int i = c4885e.ad;
                if (i == -1) {
                    i = 2;
                }
                for (int i2 = 0; i2 < i; i2++) {
                    c4885e.ad(this.f33359e + i2);
                }
                return Unit.INSTANCE;
            case 12:
                C2714e purchase6 = AbstractC4533e.purchase(this.f33359e, true);
                purchase6.license = AbstractC7572e.metrica(2);
                return purchase6;
            case 13:
                C2714e purchase7 = AbstractC4533e.purchase(this.f33359e, true);
                purchase7.license = AbstractC7572e.metrica(2);
                return purchase7;
            case 14:
                boolean booleanValue = ((Boolean) ((C15921e) obj).metrica()).booleanValue();
                int i3 = this.f33359e;
                C2714e purchase8 = booleanValue ? AbstractC4533e.purchase(i3, true) : AbstractC4533e.purchase(i3, false);
                purchase8.license = AbstractC7572e.metrica(2);
                return purchase8;
            case 15:
                C15921e c15921e2 = (C15921e) obj;
                Object ad = c15921e2.ad();
                int i4 = this.f33359e;
                EnumC10483e enumC10483e = EnumC10483e.f20706e;
                EnumC10483e enumC10483e2 = EnumC10483e.f20707e;
                if (ad == enumC10483e2 || c15921e2.metrica() == enumC10483e2 || c15921e2.ad() == enumC10483e || c15921e2.metrica() == enumC10483e) {
                    if (c15921e2.ad() != enumC10483e2 && c15921e2.metrica() != enumC10483e) {
                        r2 = false;
                    }
                    purchase = AbstractC4533e.purchase(i4, r2);
                } else {
                    purchase = AbstractC4533e.appmetrica(i4, ((EnumC10483e) c15921e2.metrica()).ordinal() > ((EnumC10483e) c15921e2.ad()).ordinal());
                }
                purchase.license = AbstractC7572e.metrica(2);
                return purchase;
            case 16:
                return new C8181e(this.f33359e, ((C8181e) obj).ad);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C2714e purchase9 = AbstractC4533e.purchase(this.f33359e, true);
                purchase9.license = AbstractC7572e.metrica(2);
                return purchase9;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C2714e appmetrica2 = AbstractC4533e.appmetrica(this.f33359e, true);
                appmetrica2.license = AbstractC7572e.metrica(2);
                return appmetrica2;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                boolean booleanValue2 = ((Boolean) ((C15921e) obj).metrica()).booleanValue();
                int i5 = this.f33359e;
                C2714e purchase10 = booleanValue2 ? AbstractC4533e.purchase(i5, true) : AbstractC4533e.purchase(i5, false);
                purchase10.license = AbstractC7572e.metrica(2);
                return purchase10;
            case 20:
                C2714e purchase11 = AbstractC4533e.purchase(this.f33359e, true);
                purchase11.license = AbstractC7572e.metrica(2);
                return purchase11;
            case 21:
                C2714e purchase12 = AbstractC4533e.purchase(this.f33359e, ((Boolean) ((C15921e) obj).metrica()).booleanValue());
                purchase12.license = AbstractC7572e.metrica(2);
                return purchase12;
            case 22:
                C2714e purchase13 = AbstractC4533e.purchase(this.f33359e, true);
                purchase13.license = AbstractC7572e.metrica(2);
                return purchase13;
            case 23:
                C2714e purchase14 = AbstractC4533e.purchase(this.f33359e, true);
                purchase14.license = AbstractC7572e.metrica(2);
                return purchase14;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C2714e purchase15 = AbstractC4533e.purchase(this.f33359e, true);
                purchase15.license = AbstractC7572e.metrica(2);
                return purchase15;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C2714e purchase16 = AbstractC4533e.purchase(this.f33359e, true);
                purchase16.license = AbstractC7572e.metrica(2);
                return purchase16;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C2714e purchase17 = AbstractC4533e.purchase(this.f33359e, true);
                purchase17.license = AbstractC7572e.metrica(2);
                return purchase17;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C2714e purchase18 = AbstractC4533e.purchase(this.f33359e, true);
                purchase18.license = AbstractC7572e.metrica(2);
                return purchase18;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C15921e c15921e3 = (C15921e) obj;
                C2714e purchase19 = AbstractC4533e.purchase(this.f33359e, ((EnumC11831e) c15921e3.metrica()).ordinal() > ((EnumC11831e) c15921e3.ad()).ordinal());
                purchase19.license = AbstractC7572e.metrica(2);
                return purchase19;
            default:
                C2714e purchase20 = AbstractC4533e.purchase(this.f33359e, true);
                purchase20.license = AbstractC7572e.metrica(2);
                return purchase20;
        }
    }
}
