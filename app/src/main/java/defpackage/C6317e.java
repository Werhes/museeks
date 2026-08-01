package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙُؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C6317e extends C7460e implements Function0 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f13147e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C6317e(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f13147e = i4;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.f13147e;
        C4130e c4130e = C4130e.ad;
        InterfaceC5083e interfaceC5083e = null;
        Object obj = this.f7266e;
        switch (i) {
            case 0:
                ((C16110e) obj).ad(!((Boolean) r5.appmetrica.getValue()).booleanValue());
                return Unit.INSTANCE;
            case 1:
                ((C16110e) obj).ad(!((Boolean) r5.appmetrica.getValue()).booleanValue());
                return Unit.INSTANCE;
            case 2:
                ((AbstractC15638e) obj).mo734case();
                return Unit.INSTANCE;
            case 3:
                ((C12340e) obj).purchase();
                return Unit.INSTANCE;
            case 4:
                ((C12340e) obj).purchase();
                return Unit.INSTANCE;
            case 5:
                ((C13424e) obj).purchase();
                return Unit.INSTANCE;
            case 6:
                ((C0073e) obj).metrica.invoke();
                return Unit.INSTANCE;
            case 7:
                ((C6621e) obj).purchase();
                return Unit.INSTANCE;
            case 8:
                C11188e c11188e = (C11188e) obj;
                c11188e.getClass();
                new C8054e(c4130e, null).signatures(c11188e.pro());
                return Unit.INSTANCE;
            case 9:
                C11188e c11188e2 = (C11188e) obj;
                c11188e2.getClass();
                new C17180e(R.string.cache_migration_header, R.string.cache_migration_text, R.string.cache_migration_start, null, null, new C6317e(0, c11188e2, C11188e.class, "dispatchAssetMigration", "dispatchAssetMigration()V", 0, 0, 10), null, 360).signatures(c11188e2.pro());
                return Unit.INSTANCE;
            case 10:
                C11188e c11188e3 = (C11188e) obj;
                c11188e3.getClass();
                int i2 = AbstractC8752e.ad;
                AbstractC8752e.ad(c11188e3.pro(), AbstractC4608e.metrica(c11188e3.vip()), true, new C12358e(c11188e3, interfaceC5083e, 11));
                return Unit.INSTANCE;
            case 11:
                ((C10797e) obj).mo734case();
                return Unit.INSTANCE;
            case 12:
                ((C10797e) obj).mo734case();
                return Unit.INSTANCE;
            case 13:
                ((C0046e) obj).mo734case();
                return Unit.INSTANCE;
            case 14:
                ((C1374e) obj).mo734case();
                return Unit.INSTANCE;
            case 15:
                ((C6267e) obj).mo734case();
                return Unit.INSTANCE;
            case 16:
                ((C5352e) obj).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C9745e) obj).purchase();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C5422e) obj).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C18480e) obj).purchase();
                return Unit.INSTANCE;
            case 20:
                C16869e c16869e = (C16869e) obj;
                c16869e.f33052e.setValue(Boolean.FALSE);
                AbstractC16519e.ad(c16869e, c16869e.pro(), false, new C1240e(c16869e, interfaceC5083e, 4));
                return Unit.INSTANCE;
            case 21:
                ((C16869e) obj).mo734case();
                return Unit.INSTANCE;
            case 22:
                ((C16869e) obj).m4205transient(true);
                return Unit.INSTANCE;
            case 23:
                ((C16869e) obj).f33047e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C16869e c16869e2 = (C16869e) obj;
                c16869e2.getClass();
                new C8054e(c4130e, null).signatures(c16869e2.pro());
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C16869e c16869e3 = (C16869e) obj;
                c16869e3.getClass();
                new C8054e(C8817e.ad, null).signatures(c16869e3.pro());
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C16869e c16869e4 = (C16869e) obj;
                AbstractC16519e.ad(c16869e4, c16869e4.f27451e, false, new C1240e(c16869e4, interfaceC5083e, 5));
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                AbstractC18467e.vip((AppActivity) ((C16869e) obj).pro());
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                C16869e c16869e5 = (C16869e) obj;
                c16869e5.m4205transient(false);
                AbstractC16519e.ad(c16869e5, c16869e5.pro(), false, new C1240e(c16869e5, interfaceC5083e, 2));
                return Unit.INSTANCE;
            default:
                C16869e c16869e6 = (C16869e) obj;
                c16869e6.m4205transient(false);
                c16869e6.f33052e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
        }
    }
}
