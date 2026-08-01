package defpackage;

import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import j$.util.DesugarCollections;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.cache.realm.CachedTrack;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُُؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C10739e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ Object f21138e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f21139e;

    public /* synthetic */ C10739e(int i, Object obj) {
        this.f21139e = i;
        this.f21138e = obj;
    }

    public /* synthetic */ C10739e(InterfaceC5366e interfaceC5366e, C16911e c16911e) {
        this.f21139e = 19;
        this.f21138e = interfaceC5366e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public /* synthetic */ C10739e(Function0 function0) {
        this.f21139e = 7;
        this.f21138e = (C7460e) function0;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v9, types: [eؚۛۖ, kotlin.jvm.functions.Function0] */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        String concat;
        StringBuilder sb;
        int i;
        int i2 = this.f21139e;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object[] objArr3 = 0;
        Object[] objArr4 = 0;
        Object obj2 = this.f21138e;
        switch (i2) {
            case 0:
                return (C8633e) ((C11881e) obj2).invoke(((C2157e) obj).ad);
            case 1:
                List list = (List) ((C11881e) obj2).invoke((C8633e) obj);
                if (list != null) {
                    return new C2157e(list);
                }
                return null;
            case 2:
                ((C12344e) obj2).license(new C16768e(obj));
                return Unit.INSTANCE;
            case 3:
                ((C10122e) obj).metrica(((C2038e) obj2).amazon.purchase());
                return Unit.INSTANCE;
            case 4:
                ArrayList arrayList = (ArrayList) ((C11467e) obj2).f23069e;
                ((C17213e) obj).mopub(arrayList.size(), null, new Cfor(arrayList, 20, objArr == true ? 1 : 0), new C2892e(802480018, true, new C12945e(2, arrayList)));
                return Unit.INSTANCE;
            case 5:
                AppActivity appActivity = (AppActivity) obj2;
                if (((Boolean) obj).booleanValue()) {
                    appActivity.isVip(new AbstractC10347e(0));
                }
                return Unit.INSTANCE;
            case 6:
                C7169e c7169e = (C7169e) obj2;
                Throwable th = (Throwable) obj;
                if (th == null) {
                    c7169e.ad(null);
                } else if (th instanceof CancellationException) {
                    c7169e.vip();
                } else {
                    c7169e.metrica(th);
                }
                return Unit.INSTANCE;
            case 7:
                return ((C7460e) obj2).invoke();
            case 8:
                C7576e c7576e = (C7576e) obj2;
                C5363e c5363e = c7576e.mopub;
                Throwable th2 = (Throwable) obj;
                if (th2 != null) {
                    c7576e.startapp.m4115protected(new C15551e(th2));
                }
                if (c5363e.ad()) {
                    ((InterfaceC2885e) c5363e.getValue()).close();
                }
                return Unit.INSTANCE;
            case 9:
                CachedTrack cachedTrack = (CachedTrack) obj2;
                cachedTrack.m4713break(true);
                return (CachedTrack) ((C5114e) obj).m1757e(cachedTrack);
            case 10:
                ((Boolean) obj).booleanValue();
                ((C4850e) obj2).purchase();
                return Unit.INSTANCE;
            case 11:
                ((Boolean) obj).booleanValue();
                ((C6156e) obj2).purchase();
                return Unit.INSTANCE;
            case 12:
                float floatValue = ((Float) obj).floatValue();
                C5070e state = ((C5640e) obj2).advert.getState();
                state.metrica(state.license.purchase() + floatValue);
                return Unit.INSTANCE;
            case 13:
                ((C6799e) obj2).m2245e();
                return Unit.INSTANCE;
            case 14:
                float floatValue2 = ((Float) obj).floatValue();
                C5070e state2 = ((C2702e) obj2).subscription.getState();
                state2.metrica(state2.license.purchase() + floatValue2);
                return Unit.INSTANCE;
            case 15:
                ((Boolean) obj).getClass();
                ((C14875e) obj2).f29469e.setValue(Boolean.valueOf(!((Boolean) r15.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 16:
                ((C8839e) obj2).f17745e = true;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C12894e) obj2).f25750e = null;
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C10032e c10032e = (C10032e) obj2;
                ArrayList arrayList2 = c10032e.f19832e;
                ((C17213e) obj).mopub(arrayList2.size(), null, new Cfor(arrayList2, 24, objArr2 == true ? 1 : 0), new C2892e(2039820996, true, new C4290e(arrayList2, c10032e, 8)));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                InterfaceC5366e interfaceC5366e = (InterfaceC5366e) obj;
                StringBuilder inmobi = AbstractC8703e.inmobi(((InterfaceC5366e) obj2) == interfaceC5366e ? " > " : "   ");
                if (interfaceC5366e instanceof C6155e) {
                    sb = new StringBuilder("CommitTextCommand(text.length=");
                    C6155e c6155e = (C6155e) interfaceC5366e;
                    sb.append(c6155e.ad.f20850e.length());
                    sb.append(", newCursorPosition=");
                    i = c6155e.vip;
                } else {
                    if (!(interfaceC5366e instanceof C7570e)) {
                        if (interfaceC5366e instanceof C2910e) {
                            concat = ((C2910e) interfaceC5366e).toString();
                        } else if (interfaceC5366e instanceof C13266e) {
                            concat = ((C13266e) interfaceC5366e).toString();
                        } else if (interfaceC5366e instanceof C5880e) {
                            concat = ((C5880e) interfaceC5366e).toString();
                        } else if (interfaceC5366e instanceof C8930e) {
                            concat = ((C8930e) interfaceC5366e).toString();
                        } else if (interfaceC5366e instanceof C16699e) {
                            concat = "FinishComposingTextCommand()";
                        } else if (interfaceC5366e instanceof C15481e) {
                            concat = "DeleteAllCommand()";
                        } else {
                            String mopub = AbstractC3820e.ad.vip(interfaceC5366e.getClass()).mopub();
                            if (mopub == null) {
                                mopub = "{anonymous EditCommand}";
                            }
                            concat = "Unknown EditCommand: ".concat(mopub);
                        }
                        inmobi.append(concat);
                        return inmobi.toString();
                    }
                    sb = new StringBuilder("SetComposingTextCommand(text.length=");
                    C7570e c7570e = (C7570e) interfaceC5366e;
                    sb.append(c7570e.ad.f20850e.length());
                    sb.append(", newCursorPosition=");
                    i = c7570e.vip;
                }
                concat = AbstractC1786e.pro(sb, i, ')');
                inmobi.append(concat);
                return inmobi.toString();
            case 20:
                AbstractC13480e.isPro(((C8422e) obj).metrica, (InterfaceC16859e[]) obj2);
                return Unit.INSTANCE;
            case 21:
                AbstractC5087e.premium((C17213e) obj, null, null, new C2892e(147926824, true, new C2642e((C15252e) obj2, objArr3 == true ? 1 : 0)), 3);
                return Unit.INSTANCE;
            case 22:
                C16161e c16161e = (C16161e) obj2;
                C17213e c17213e = (C17213e) obj;
                AbstractC5087e.premium(c17213e, null, null, AbstractC10077e.vip, 3);
                AbstractC5087e.premium(c17213e, null, null, new C2892e(-2129976339, true, new C6599e(23, c16161e)), 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC10077e.license, 3);
                AbstractC5087e.premium(c17213e, null, null, AbstractC10077e.appmetrica, 3);
                ArrayList arrayList3 = c16161e.f31742e;
                c17213e.mopub(arrayList3.size(), null, new Cfor(arrayList3, 27, objArr4 == true ? 1 : 0), new C2892e(802480018, true, new C4290e(arrayList3, c16161e, 9)));
                return Unit.INSTANCE;
            case 23:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                ((C17399e) obj2).f34108e.setValue(bool);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C12632e c12632e = (C12632e) obj2;
                Log.w("FirebaseSessions", "CorruptionException in session data DataStore", (C11506e) obj);
                c12632e.getClass();
                return new C12893e(c12632e.f25346e.ad(null), null, null);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C12431e c12431e = (C12431e) obj2;
                Object[] objArr5 = c12431e.f24870e;
                int i3 = c12431e.f24868e;
                for (int i4 = 0; i4 < i3; i4++) {
                    ((InterfaceC17242e) objArr5[i4]).metrica();
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C6522e c6522e = (C6522e) obj;
                return ((C1773e) obj2).ad(new C6522e(null, c6522e.vip, c6522e.metrica, c6522e.license, c6522e.appmetrica)).getValue();
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                C10675e c10675e = (C10675e) obj;
                ((C6312e) obj2).getClass();
                return c10675e;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return C12761e.vip((C12761e) obj, ((EnumC11342e) obj2) == EnumC11342e.f22807e, null, null, null, 61);
            default:
                C7551e c7551e = (C7551e) obj2;
                C0044e c0044e = (C0044e) obj;
                Map ad = c0044e.ad();
                LinkedHashMap linkedHashMap = c0044e.ad;
                long j = 0;
                for (Map.Entry entry : ad.entrySet()) {
                    if (entry.getValue() instanceof Set) {
                        C11951e c11951e = (C11951e) entry.getKey();
                        Set set = (Set) entry.getValue();
                        String license = c7551e.license(System.currentTimeMillis());
                        if (set.contains(license)) {
                            Object[] objArr6 = {license};
                            HashSet hashSet = new HashSet(1);
                            Object obj3 = objArr6[0];
                            Objects.requireNonNull(obj3);
                            if (!hashSet.add(obj3)) {
                                throw new IllegalArgumentException(AbstractC1634e.advert(obj3, "duplicate element: "));
                            }
                            c0044e.license(c11951e, DesugarCollections.unmodifiableSet(hashSet));
                            j++;
                        } else {
                            c0044e.vip();
                            linkedHashMap.remove(c11951e);
                        }
                    }
                }
                C11951e c11951e2 = C7551e.metrica;
                if (j == 0) {
                    c0044e.vip();
                    linkedHashMap.remove(c11951e2);
                } else {
                    c0044e.license(c11951e2, Long.valueOf(j));
                }
                return null;
        }
    }
}
