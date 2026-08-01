package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import bruhcollective.itaysonlab.libvkmusic.objects.RadioInfo;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٓۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C13887e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27547e;

    public /* synthetic */ C13887e(int i) {
        this.f27547e = i;
    }

    public /* synthetic */ C13887e(C5627e c5627e) {
        this.f27547e = 9;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v2, types: [java.lang.Object, eّٙۖ] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String adcel;
        int i = 7;
        int i2 = 20;
        Object[] objArr = 0;
        int i3 = 1;
        switch (this.f27547e) {
            case 0:
                ((C17213e) obj).mopub(EnumC7437e.f15210e.subs(), null, new C3801e(9), new C2892e(802480018, true, new Object()));
                return Unit.INSTANCE;
            case 1:
                List list = (List) obj;
                return new C5070e(((Number) list.get(0)).floatValue(), ((Number) list.get(1)).floatValue(), ((Number) list.get(2)).floatValue());
            case 2:
                return Unit.INSTANCE;
            case 3:
                C11384e c11384e = (C11384e) obj;
                AbstractC1634e.isVip(c11384e, new C13887e(4));
                C11883e c11883e = c11384e.ad;
                C12120e c12120e = InterfaceC10857e.ad;
                long j = C3618e.vip;
                c11883e.f23814e = C15407e.ad((C15407e) c11883e.f23814e, AbstractC3995e.isVip(j), null, 14);
                c11883e.f23814e = C15407e.ad((C15407e) c11883e.f23814e, null, AbstractC3995e.isVip(j), 7);
                Unit unit = Unit.INSTANCE;
                return Unit.INSTANCE;
            case 4:
                C14143e c14143e = (C14143e) obj;
                C13231e c13231e = InterfaceC12646e.f25366e;
                c14143e.ad(new C17974e(20));
                C18390e c18390e = InterfaceC11104e.f22002e;
                c14143e.vip(new C9770e(19));
                c14143e.metrica(new C10328e(1.0f, true, true, true, true));
                return Unit.INSTANCE;
            case 5:
                ((C17213e) obj).mopub(15, null, C8865e.f17809e, AbstractC17957e.vip);
                return Unit.INSTANCE;
            case 6:
                C11384e c11384e2 = (C11384e) obj;
                AbstractC1634e.isVip(c11384e2, new C13887e(i));
                C11883e c11883e2 = c11384e2.ad;
                C12120e c12120e2 = InterfaceC10857e.ad;
                long j2 = C3618e.vip;
                c11883e2.f23814e = C15407e.ad((C15407e) c11883e2.f23814e, AbstractC3995e.isVip(j2), null, 14);
                c11883e2.f23814e = C15407e.ad((C15407e) c11883e2.f23814e, null, AbstractC3995e.isVip(j2), 7);
                Unit unit2 = Unit.INSTANCE;
                return Unit.INSTANCE;
            case 7:
                C14143e c14143e2 = (C14143e) obj;
                C13231e c13231e2 = InterfaceC12646e.f25366e;
                c14143e2.ad(new C17974e(20));
                C18390e c18390e2 = InterfaceC11104e.f22002e;
                c14143e2.vip(new C9770e(19));
                c14143e2.metrica(new C10328e(1.0f, true, true, true, true));
                return Unit.INSTANCE;
            case 8:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 9:
                C5538e c5538e = (C5538e) obj;
                int i4 = c5538e.ad;
                InterfaceC13984e interfaceC13984e = c5538e.vip;
                if (i4 == 0) {
                    return "*";
                }
                C5627e c5627e = interfaceC13984e instanceof C5627e ? (C5627e) interfaceC13984e : null;
                String valueOf = (c5627e == null || (adcel = c5627e.adcel(true)) == null) ? String.valueOf(interfaceC13984e) : adcel;
                int m2467class = AbstractC8703e.m2467class(i4);
                if (m2467class == 0) {
                    return valueOf;
                }
                if (m2467class == 1) {
                    return "in ".concat(valueOf);
                }
                if (m2467class == 2) {
                    return "out ".concat(valueOf);
                }
                throw new C14803e(10);
            case 10:
                C6571e c6571e = (C6571e) obj;
                String str = (String) c6571e.f13544e;
                Object obj2 = c6571e.f13543e;
                return obj2 == null ? str : AbstractC0869e.tapsense('=', str, String.valueOf(obj2));
            case 11:
                Map.Entry entry = (Map.Entry) obj;
                return ((String) entry.getKey()) + " = " + ((String) entry.getValue());
            case 12:
                Map.Entry entry2 = (Map.Entry) obj;
                return ((String) entry2.getKey()) + " = " + ((String) entry2.getValue());
            case 13:
                ((C15104e) obj).vip = true;
                return Unit.INSTANCE;
            case 14:
                return ((RadioInfo) obj).yandex.ad;
            case 15:
                return ((RadioInfo) obj).purchase.vip;
            case 16:
                return ((RadioInfo) obj).billing.ad;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return ((RadioInfo) obj).startapp.vip;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((AbstractC16510e) obj).yandex;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C7145e c7145e = (C7145e) obj;
                c7145e.ad(C11047e.f21905e, new C4198e(((C0880e) c7145e.vip).ad, objArr == true ? 1 : 0, i3));
                return Unit.INSTANCE;
            case 20:
                C6730e c6730e = (C6730e) obj;
                AbstractC17190e.metrica(c6730e, ':');
                AbstractC13501e.inmobi(c6730e);
                return Unit.INSTANCE;
            case 21:
                AbstractC13501e.inmobi((C6730e) obj);
                return Unit.INSTANCE;
            case 22:
                AbstractC8703e.license((C6730e) obj, "z");
                return Unit.INSTANCE;
            case 23:
                AbstractC17190e.purchase((C6730e) obj, "Z", new C13887e(26));
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                AbstractC8703e.license((C6730e) obj, "z");
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                AbstractC17190e.purchase((C6730e) obj, "Z", new C13887e(27));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C6730e c6730e2 = (C6730e) obj;
                AbstractC13501e.tapsense(c6730e2);
                AbstractC17190e.metrica(c6730e2, ':');
                AbstractC13501e.isVip(c6730e2);
                AbstractC17190e.billing(c6730e2, new C13887e(i2));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C6730e c6730e3 = (C6730e) obj;
                AbstractC13501e.tapsense(c6730e3);
                AbstractC17190e.billing(c6730e3, new C13887e(28));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C6730e c6730e4 = (C6730e) obj;
                AbstractC13501e.isVip(c6730e4);
                AbstractC17190e.billing(c6730e4, new C13887e(21));
                return Unit.INSTANCE;
            default:
                ((C15104e) obj).purchase = true;
                return Unit.INSTANCE;
        }
    }
}
