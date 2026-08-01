package defpackage;

import android.content.SharedPreferences;
import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؚؓۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C1672e implements Function0 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ InterfaceC3314e f4606e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f4607e;

    public /* synthetic */ C1672e(InterfaceC3314e interfaceC3314e, int i) {
        this.f4607e = i;
        this.f4606e = interfaceC3314e;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        switch (this.f4607e) {
            case 0:
                InterfaceC0043e interfaceC0043e = (InterfaceC0043e) this.f4606e.getValue();
                if (interfaceC0043e != null) {
                    return interfaceC0043e;
                }
                AbstractC8889e.license("Required value was null.");
                throw new C14803e(9);
            case 1:
                InterfaceC0043e interfaceC0043e2 = (InterfaceC0043e) this.f4606e.getValue();
                if (interfaceC0043e2 != null) {
                    return interfaceC0043e2;
                }
                AbstractC8889e.license("Required value was null.");
                throw new C14803e(9);
            case 2:
                InterfaceC3314e interfaceC3314e = this.f4606e;
                if (interfaceC3314e != null) {
                    return (List) interfaceC3314e.getValue();
                }
                return null;
            case 3:
                this.f4606e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 4:
                this.f4606e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 5:
                Boolean bool = (Boolean) this.f4606e.getValue();
                bool.booleanValue();
                return bool;
            case 6:
                this.f4606e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 7:
                this.f4606e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 8:
                this.f4606e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 9:
                this.f4606e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 10:
                this.f4606e.setValue(Boolean.FALSE);
                C11999e.ad.getClass();
                SharedPreferences sharedPreferences = AbstractC16082e.license;
                if (sharedPreferences == null) {
                    sharedPreferences = null;
                }
                SharedPreferences.Editor edit = sharedPreferences.edit();
                edit.putBoolean("misc_donatepopup", true);
                edit.apply();
                return Unit.INSTANCE;
            case 11:
                this.f4606e.setValue(null);
                return Unit.INSTANCE;
            case 12:
                this.f4606e.setValue(AbstractC1831e.vip().billing());
                return Unit.INSTANCE;
            case 13:
                this.f4606e.setValue(null);
                return Unit.INSTANCE;
            case 14:
                this.f4606e.setValue(Boolean.valueOf(!((Boolean) r0.getValue()).booleanValue()));
                return Unit.INSTANCE;
            case 15:
                return new C11324e((Function1) this.f4606e.getValue());
            case 16:
                return (InterfaceC9153e) ((Function0) this.f4606e.getValue()).invoke();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C17213e((Function1) this.f4606e.getValue());
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new C7882e((Function1) this.f4606e.getValue());
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                AbstractC12185e.billing(this.f4606e, false);
                return Unit.INSTANCE;
            case 20:
                this.f4606e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case 21:
                this.f4606e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 22:
                this.f4606e.setValue(EnumC6972e.SOCKS5);
                return Unit.INSTANCE;
            case 23:
                this.f4606e.setValue(EnumC6972e.HTTP);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                InterfaceC0043e interfaceC0043e3 = (InterfaceC0043e) this.f4606e.getValue();
                if (interfaceC0043e3 != null) {
                    return interfaceC0043e3;
                }
                AbstractC8889e.license("Required value was null.");
                throw new C14803e(9);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                this.f4606e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                this.f4606e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                this.f4606e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                this.f4606e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            default:
                this.f4606e.setValue(Boolean.FALSE);
                return Unit.INSTANCE;
        }
    }
}
