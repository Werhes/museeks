package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.Arrays;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٗۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7983e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f16172e;

    public /* synthetic */ C7983e(int i) {
        this.f16172e = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C13655e f36702e;
        int i = 1;
        switch (this.f16172e) {
            case 0:
                return new C14591e(((Integer) obj).intValue());
            case 1:
                return new C18285e(((Integer) obj).intValue());
            case 2:
                List list = (List) obj;
                Object obj2 = list.get(0);
                int i2 = ((AbstractC7890e.billing(obj2, Boolean.FALSE) || obj2 == null) ? null : (C6132e) ((Function1) AbstractC17287e.appmetrica.f23814e).invoke(obj2)).ad;
                Object obj3 = list.get(1);
                return new C2666e(i2, (obj3 != null ? (Boolean) obj3 : null).booleanValue());
            case 3:
                return new C6132e(((Integer) obj).intValue());
            case 4:
                return new C9137e(((Integer) obj).intValue());
            case 5:
                C15991e c15991e = (C15991e) obj;
                if (c15991e != null && c15991e.ad == 2) {
                    r5 = true;
                }
                return Boolean.valueOf(!r5);
            case 6:
                return Unit.INSTANCE;
            case 7:
                AbstractC14594e.advert((InterfaceC15671e) obj, 3);
                return Unit.INSTANCE;
            case 8:
                InterfaceC8614e[] interfaceC8614eArr = AbstractC14594e.ad;
                C16591e c16591e = AbstractC9058e.appmetrica;
                Unit unit = Unit.INSTANCE;
                ((InterfaceC15671e) obj).appmetrica(c16591e, unit);
                return unit;
            case 9:
                C2152e c2152e = (C2152e) obj;
                long j = c2152e.ad;
                return (9223372034707292159L & j) != 9205357640488583168L ? new C14443e(Float.intBitsToFloat((int) (j >> 32)), Float.intBitsToFloat((int) (4294967295L & c2152e.ad))) : AbstractC1236e.ad;
            case 10:
                C14443e c14443e = (C14443e) obj;
                return new C2152e((4294967295L & Float.floatToRawIntBits(c14443e.vip)) | (Float.floatToRawIntBits(c14443e.ad) << 32));
            case 11:
                return new C0971e(((Long) obj).longValue());
            case 12:
                return ((InterfaceC9093e) obj).iterator();
            case 13:
                return ((Iterable) obj).iterator();
            case 14:
                return Boolean.valueOf(obj == null);
            case 15:
                InterfaceC7227e interfaceC7227e = (InterfaceC7227e) obj;
                InterfaceC5372e mopub = AbstractC17808e.mopub(interfaceC7227e);
                if (mopub != null) {
                    return mopub;
                }
                if (((InterfaceC18155e) interfaceC7227e).subs().isInterface()) {
                    return new C18384e(interfaceC7227e);
                }
                return null;
            case 16:
                InterfaceC7227e interfaceC7227e2 = (InterfaceC7227e) obj;
                InterfaceC5372e mopub2 = AbstractC17808e.mopub(interfaceC7227e2);
                if (mopub2 == null) {
                    mopub2 = ((InterfaceC18155e) interfaceC7227e2).subs().isInterface() ? new C18384e(interfaceC7227e2) : null;
                }
                if (mopub2 != null) {
                    return AbstractC6069e.purchase(mopub2);
                }
                return null;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                Byte b = (Byte) obj;
                b.byteValue();
                return String.format("%02x", Arrays.copyOf(new Object[]{b}, 1));
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return Unit.INSTANCE;
            case 20:
                ((Boolean) obj).getClass();
                return Boolean.TRUE;
            case 21:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 22:
                ((Boolean) obj).booleanValue();
                return Unit.INSTANCE;
            case 23:
                return Long.valueOf(((C16655e) obj).ad);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return 0;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                InterfaceC14287e interfaceC14287e = (InterfaceC14287e) obj;
                if (interfaceC14287e == null || (f36702e = ((InterfaceC10518e) interfaceC14287e).getF36702e()) == null) {
                    return null;
                }
                long ptr$cinterop_release = f36702e.f27071e.getPtr$cinterop_release();
                int i3 = AbstractC6026e.ad;
                return new C18031e(realmcJNI.realm_object_get_key(ptr$cinterop_release));
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                AbstractC14145e.ad((C11093e) obj, AbstractC7763e.ad(new C4671e(i)));
                return Unit.INSTANCE;
            default:
                C3226e.ad((C3226e) obj);
                return Unit.INSTANCE;
        }
    }
}
