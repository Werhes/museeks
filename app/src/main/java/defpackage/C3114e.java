package defpackage;

import android.database.Cursor;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؕؔٛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C3114e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f7187e;

    public /* synthetic */ C3114e(int i) {
        this.f7187e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 9;
        r10 = null;
        C4282e c4282e = null;
        switch (this.f7187e) {
            case 0:
                return new C14163e((Cursor) obj);
            case 1:
                Cursor cursor = (Cursor) obj;
                if (C2691e.f6569e == null) {
                    VKXApplication vKXApplication = VKXApplication.f36528e;
                    if (vKXApplication == null) {
                        vKXApplication = null;
                    }
                    C2691e.f6569e = new C2691e(13, vKXApplication.getApplicationContext().getContentResolver());
                }
                C2691e c2691e = C2691e.f6569e;
                return new C16607e(cursor, (C12817e) AbstractC17976e.appmetrica(c2691e != null ? c2691e : null, new C18478e(25, new C9125e(2), new C1336e(false, 9), new AbstractC3219e[]{new C0144e(cursor.getLong(0))})).get(0));
            case 2:
                return new C12817e((Cursor) obj);
            case 3:
                return Unit.INSTANCE;
            case 4:
                return Unit.INSTANCE;
            case 5:
                C4017e c4017e = (C4017e) obj;
                C18478e c18478e = c4017e.f8940e.f28537e;
                long m4560try = c18478e.m4560try();
                c18478e.m4557this().billing();
                try {
                    ((C5389e) c18478e.f36228e).appmetrica(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    c4017e.ad();
                    AbstractC0054e.m224this(c18478e, m4560try);
                    return Unit.INSTANCE;
                } finally {
                }
            case 6:
                C4017e c4017e2 = (C4017e) obj;
                C18478e c18478e2 = c4017e2.f8940e.f28537e;
                long m4560try2 = c18478e2.m4560try();
                c18478e2.m4557this().billing();
                try {
                    ((C5389e) c18478e2.f36228e).appmetrica(-3.4028235E38f, 0.0f, Float.MAX_VALUE, Float.MAX_VALUE, 1);
                    c4017e2.ad();
                    AbstractC0054e.m224this(c18478e2, m4560try2);
                    return Unit.INSTANCE;
                } finally {
                }
            case 7:
                Float f = (Float) obj;
                f.getClass();
                return new C11200e(new C7558e(f, AbstractC9546e.ad, null, 12));
            case 8:
                C11384e c11384e = (C11384e) obj;
                AbstractC1634e.isVip(c11384e, new C3114e(i));
                C11883e c11883e = c11384e.ad;
                C12120e c12120e = InterfaceC10857e.ad;
                long j = C3618e.vip;
                c11883e.f23814e = C15407e.ad((C15407e) c11883e.f23814e, AbstractC3995e.isVip(j), null, 14);
                c11883e.f23814e = C15407e.ad((C15407e) c11883e.f23814e, null, AbstractC3995e.isVip(j), 7);
                Unit unit = Unit.INSTANCE;
                return Unit.INSTANCE;
            case 9:
                C14143e c14143e = (C14143e) obj;
                C13231e c13231e = InterfaceC12646e.f25366e;
                c14143e.ad(new C17974e(20));
                C18390e c18390e = InterfaceC11104e.f22002e;
                c14143e.vip(new C9770e(19));
                c14143e.metrica(new C10328e(1.0f, true, true, true, true));
                return Unit.INSTANCE;
            case 10:
                String str = (String) obj;
                C7838e c7838e = VKXApplication.f36530e;
                return (c7838e != null ? c7838e : null).f15868e.startapp(str);
            case 11:
                return Boolean.FALSE;
            case 12:
                throw new IllegalArgumentException("Sets cannot contain other collections ");
            case 13:
                throw new IllegalArgumentException("Sets cannot contain other collections ");
            case 14:
                C17400e c17400e = (C17400e) obj;
                c17400e.ad = 1332;
                c17400e.ad(Float.valueOf(0.0f), 0).vip = AbstractC6685e.ad;
                c17400e.ad(Float.valueOf(290.0f), 666);
                return Unit.INSTANCE;
            case 15:
                C17400e c17400e2 = (C17400e) obj;
                c17400e2.ad = 1332;
                c17400e2.ad(Float.valueOf(0.0f), 0).vip = AbstractC0702e.ad;
                c17400e2.ad(Float.valueOf(290.0f), 666);
                return Unit.INSTANCE;
            case 16:
                C17400e c17400e3 = (C17400e) obj;
                c17400e3.ad = 1332;
                c17400e3.ad(Float.valueOf(0.0f), 666).vip = AbstractC6685e.ad;
                c17400e3.ad(Float.valueOf(290.0f), c17400e3.ad);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C17400e c17400e4 = (C17400e) obj;
                c17400e4.ad = 1332;
                c17400e4.ad(Float.valueOf(0.0f), 666).vip = AbstractC0702e.ad;
                c17400e4.ad(Float.valueOf(290.0f), c17400e4.ad);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C10675e c10675e = C17345e.f34029e;
                return Boolean.valueOf(C10068e.vip(((C12243e) obj).ad));
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return Boolean.TRUE;
            case 20:
                return ((C1252e) obj).ad;
            case 21:
                return Boolean.valueOf(((String) obj).length() > 0);
            case 22:
                String str2 = (String) obj;
                return (AbstractC5304e.isPro(str2, '{') && AbstractC5304e.isPro(str2, '}')) ? new C1252e(str2, 2) : new C1252e(AbstractC6528e.metrica(0, 0, 7, str2), 1);
            case 23:
                return AbstractC13480e.m3608try((List) obj, " -> ", "  ", null, new C3114e(24), 28);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return "\"" + ((C5158e) obj).ad.f23980e + '\"';
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C3083e c3083e = (C3083e) obj;
                InterfaceC4911e interfaceC4911e = AbstractC12044e.vip;
                if (interfaceC4911e.yandex()) {
                    ArrayList arrayList = c3083e.appmetrica;
                    StringBuilder sb = new StringBuilder();
                    sb.append(c3083e.toString());
                    sb.append('\n');
                    C16396e c16396e = c3083e.metrica;
                    if (c16396e != null) {
                        c16396e.ad(0, sb);
                    }
                    if (c3083e.license != null) {
                        sb.append("Matched routes:");
                        sb.append('\n');
                        if (arrayList.isEmpty()) {
                            sb.append("  No results");
                            sb.append('\n');
                        } else {
                            sb.append(AbstractC13480e.m3608try(arrayList, "\n", null, null, new C3114e(23), 30));
                            sb.append('\n');
                        }
                        sb.append("Routing resolve result:");
                        sb.append('\n');
                        StringBuilder sb2 = new StringBuilder("  ");
                        AbstractC1006e abstractC1006e = c3083e.license;
                        sb2.append(abstractC1006e != null ? abstractC1006e : null);
                        sb.append(sb2.toString());
                    }
                    interfaceC4911e.amazon(sb.toString());
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C10304e((Map) obj);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return obj;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                List list = (List) obj;
                Object obj2 = list.get(0);
                Function1 function1 = (Function1) AbstractC4768e.yandex.f23814e;
                Boolean bool = Boolean.FALSE;
                C4282e c4282e2 = (AbstractC7890e.billing(obj2, bool) || obj2 == null) ? null : (C4282e) function1.invoke(obj2);
                Object obj3 = list.get(1);
                C4282e c4282e3 = (AbstractC7890e.billing(obj3, bool) || obj3 == null) ? null : (C4282e) function1.invoke(obj3);
                Object obj4 = list.get(2);
                C4282e c4282e4 = (AbstractC7890e.billing(obj4, bool) || obj4 == null) ? null : (C4282e) function1.invoke(obj4);
                Object obj5 = list.get(3);
                if (!AbstractC7890e.billing(obj5, bool) && obj5 != null) {
                    c4282e = (C4282e) function1.invoke(obj5);
                }
                return new C2233e(c4282e2, c4282e3, c4282e4, c4282e);
            default:
                List list2 = (List) obj;
                Object obj6 = list2.get(1);
                List list3 = (AbstractC7890e.billing(obj6, Boolean.FALSE) || obj6 == null) ? null : (List) ((Function1) AbstractC4768e.ad.f23814e).invoke(obj6);
                Object obj7 = list2.get(0);
                return new C10566e(list3, obj7 != null ? (String) obj7 : null);
        }
    }
}
