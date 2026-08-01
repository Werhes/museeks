package defpackage;

import android.app.Activity;
import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍؓۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C9214e implements Function1 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f18403e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f18404e;

    public /* synthetic */ C9214e(InterfaceC3314e interfaceC3314e, int i) {
        this.f18404e = i;
        this.f18403e = interfaceC3314e;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.f18404e) {
            case 0:
                C14314e c14314e = (C14314e) this.f18403e.getValue();
                if (c14314e != null) {
                    Activity activity = c14314e.f28306e;
                    if (activity instanceof AbstractActivityC15824e) {
                        c14314e.onDestroy((AbstractActivityC15824e) activity);
                    }
                }
                return Unit.INSTANCE;
            case 1:
                this.f18403e.setValue((InterfaceC0043e) obj);
                return Unit.INSTANCE;
            case 2:
                this.f18403e.setValue((C0398e) obj);
                return Unit.INSTANCE;
            case 3:
                boolean booleanValue = ((Boolean) obj).booleanValue();
                InterfaceC3314e interfaceC3314e = this.f18403e;
                interfaceC3314e.setValue(C16074e.vip((C16074e) interfaceC3314e.getValue(), booleanValue, false, false, 0.0f, 0.0f, 62));
                return Unit.INSTANCE;
            case 4:
                Float f = (Float) obj;
                f.getClass();
                InterfaceC3314e interfaceC3314e2 = this.f18403e;
                interfaceC3314e2.setValue(C16074e.vip((C16074e) interfaceC3314e2.getValue(), false, false, false, ((Number) AbstractC3062e.purchase(f, new C3721e(-12.0f, 12.0f))).floatValue(), 0.0f, 55));
                return Unit.INSTANCE;
            case 5:
                boolean booleanValue2 = ((Boolean) obj).booleanValue();
                InterfaceC3314e interfaceC3314e3 = this.f18403e;
                interfaceC3314e3.setValue(C16074e.vip((C16074e) interfaceC3314e3.getValue(), false, booleanValue2, false, 0.0f, 0.0f, 61));
                return Unit.INSTANCE;
            case 6:
                Float f2 = (Float) obj;
                f2.getClass();
                InterfaceC3314e interfaceC3314e4 = this.f18403e;
                interfaceC3314e4.setValue(C16074e.vip((C16074e) interfaceC3314e4.getValue(), false, false, false, 0.0f, ((Number) AbstractC3062e.purchase(f2, new C3721e(-12.0f, 12.0f))).floatValue(), 47));
                return Unit.INSTANCE;
            case 7:
                boolean booleanValue3 = ((Boolean) obj).booleanValue();
                InterfaceC3314e interfaceC3314e5 = this.f18403e;
                interfaceC3314e5.setValue(C16074e.vip((C16074e) interfaceC3314e5.getValue(), false, false, booleanValue3, 0.0f, 0.0f, 59));
                return Unit.INSTANCE;
            case 8:
                C17213e c17213e = (C17213e) obj;
                InterfaceC3314e interfaceC3314e6 = this.f18403e;
                AbstractC5087e.premium(c17213e, null, null, new C2892e(1014189233, true, new C3584e(interfaceC3314e6, 2)), 3);
                if (((C16074e) interfaceC3314e6.getValue()).f31668e) {
                    AbstractC5087e.premium(c17213e, null, null, new C2892e(2133744972, true, new C3584e(interfaceC3314e6, 3)), 3);
                    if (((C16074e) interfaceC3314e6.getValue()).f31666e) {
                        AbstractC5087e.premium(c17213e, null, null, new C2892e(1171105831, true, new C3584e(interfaceC3314e6, 4)), 3);
                    } else {
                        AbstractC5087e.premium(c17213e, null, null, new C2892e(-1689889296, true, new C3584e(interfaceC3314e6, 0)), 3);
                        AbstractC5087e.premium(c17213e, null, null, new C2892e(843292071, true, new C3584e(interfaceC3314e6, 1)), 3);
                    }
                }
                return Unit.INSTANCE;
            case 9:
                this.f18403e.setValue((InterfaceC0043e) obj);
                return Unit.INSTANCE;
            case 10:
                C13706e c13706e = (C13706e) obj;
                this.f18403e.setValue(c13706e.metrica ? c13706e.vip : c13706e.ad);
                return Unit.INSTANCE;
            case 11:
                List list = (List) obj;
                InterfaceC3314e interfaceC3314e7 = this.f18403e;
                if (interfaceC3314e7 != null) {
                    interfaceC3314e7.setValue(list);
                }
                return Unit.INSTANCE;
            case 12:
                Float f3 = (Float) obj;
                f3.getClass();
                ((Function1) this.f18403e.getValue()).invoke(f3);
                return Unit.INSTANCE;
            case 13:
                this.f18403e.setValue((C0398e) obj);
                return Unit.INSTANCE;
            case 14:
                this.f18403e.setValue((C0398e) obj);
                return Unit.INSTANCE;
            case 15:
                this.f18403e.setValue((C0398e) obj);
                return Unit.INSTANCE;
            case 16:
                boolean booleanValue4 = ((Boolean) obj).booleanValue();
                InterfaceC3314e interfaceC3314e8 = this.f18403e;
                interfaceC3314e8.setValue(C7190e.vip((C7190e) interfaceC3314e8.getValue(), booleanValue4, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 126));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                float floatValue = ((Float) obj).floatValue();
                InterfaceC3314e interfaceC3314e9 = this.f18403e;
                interfaceC3314e9.setValue(C7190e.vip((C7190e) interfaceC3314e9.getValue(), false, 0.0f, floatValue, 0.0f, 0.0f, 0.0f, 123));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                float floatValue2 = ((Float) obj).floatValue();
                InterfaceC3314e interfaceC3314e10 = this.f18403e;
                interfaceC3314e10.setValue(C7190e.vip((C7190e) interfaceC3314e10.getValue(), false, floatValue2, 0.0f, 0.0f, 0.0f, 0.0f, 125));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                float floatValue3 = ((Float) obj).floatValue();
                InterfaceC3314e interfaceC3314e11 = this.f18403e;
                interfaceC3314e11.setValue(C7190e.vip((C7190e) interfaceC3314e11.getValue(), false, 0.0f, 0.0f, 0.0f, 0.0f, floatValue3, 95));
                return Unit.INSTANCE;
            case 20:
                float floatValue4 = ((Float) obj).floatValue();
                InterfaceC3314e interfaceC3314e12 = this.f18403e;
                interfaceC3314e12.setValue(C7190e.vip((C7190e) interfaceC3314e12.getValue(), false, 0.0f, 0.0f, floatValue4, 0.0f, 0.0f, 119));
                return Unit.INSTANCE;
            case 21:
                float floatValue5 = ((Float) obj).floatValue();
                InterfaceC3314e interfaceC3314e13 = this.f18403e;
                interfaceC3314e13.setValue(C7190e.vip((C7190e) interfaceC3314e13.getValue(), false, 0.0f, 0.0f, 0.0f, floatValue5, 0.0f, 111));
                return Unit.INSTANCE;
            case 22:
                C17213e c17213e2 = (C17213e) obj;
                InterfaceC3314e interfaceC3314e14 = this.f18403e;
                AbstractC5087e.premium(c17213e2, null, null, new C2892e(-389820903, true, new C3584e(interfaceC3314e14, 8)), 3);
                if (((C7190e) interfaceC3314e14.getValue()).f14696e) {
                    AbstractC5087e.premium(c17213e2, null, null, new C2892e(729734836, true, new C3584e(interfaceC3314e14, 9)), 3);
                    AbstractC5087e.premium(c17213e2, null, null, new C2892e(1969147243, true, new C3584e(interfaceC3314e14, 10)), 3);
                    AbstractC5087e.premium(c17213e2, null, null, new C2892e(2047268332, true, new C3584e(interfaceC3314e14, 11)), 3);
                    AbstractC5087e.premium(c17213e2, null, null, new C2892e(2125389421, true, new C3584e(interfaceC3314e14, 6)), 3);
                    AbstractC5087e.premium(c17213e2, null, null, new C2892e(-2091456786, true, new C3584e(interfaceC3314e14, 7)), 3);
                }
                return Unit.INSTANCE;
            case 23:
                this.f18403e.setValue((String) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                this.f18403e.setValue((String) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                this.f18403e.setValue((String) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                this.f18403e.setValue((InterfaceC0043e) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                Float f4 = (Float) obj;
                f4.getClass();
                return Float.valueOf(((Number) ((Function1) this.f18403e.getValue()).invoke(f4)).floatValue());
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                this.f18403e.setValue((C9106e) obj);
                return Unit.INSTANCE;
            default:
                Boolean bool = (Boolean) obj;
                bool.booleanValue();
                this.f18403e.setValue(bool);
                return Unit.INSTANCE;
        }
    }
}
