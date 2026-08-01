package defpackage;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘٖؗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C16027e implements Function2 {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final /* synthetic */ boolean f31562e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f31563e;

    public /* synthetic */ C16027e(int i, int i2, boolean z) {
        this.f31563e = i2;
        this.f31562e = z;
    }

    public /* synthetic */ C16027e(boolean z, int i) {
        this.f31563e = i;
        this.f31562e = z;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        switch (this.f31563e) {
            case 0:
                C13770e c13770e = (C13770e) obj;
                int intValue = ((Integer) obj2).intValue();
                if (c13770e.m3673protected(intValue & 1, (intValue & 3) != 2)) {
                    boolean z = this.f31562e;
                    AbstractC5647e.vip(AbstractC12475e.metrica(z ? R.drawable.ic_thumbs_down_28 : R.drawable.ic_thumbs_down_outline_28, 0, c13770e), AbstractC5297e.appmetrica(c13770e, z ? R.string.now_playing_toolbox_dislike_remove_track : R.string.now_playing_toolbox_dislike_track), AbstractC18007e.startapp(C0115e.f1276e, 28), 0L, c13770e, 392, 8);
                } else {
                    c13770e.m3659default();
                }
                return Unit.INSTANCE;
            case 1:
                C13770e c13770e2 = (C13770e) obj;
                int intValue2 = ((Integer) obj2).intValue();
                if (c13770e2.m3673protected(intValue2 & 1, (intValue2 & 3) != 2)) {
                    AbstractC5647e.vip(AbstractC12475e.metrica(this.f31562e ? R.drawable.ic_check : R.drawable.ic_add, 0, c13770e2), null, null, 0L, c13770e2, 56, 12);
                } else {
                    c13770e2.m3659default();
                }
                return Unit.INSTANCE;
            case 2:
                C13770e c13770e3 = (C13770e) obj;
                int intValue3 = ((Integer) obj2).intValue();
                if (c13770e3.m3673protected(intValue3 & 1, (intValue3 & 3) != 2)) {
                    C8738e.ad(this.f31562e, ((C7019e) c13770e3.adcel(AbstractC11785e.ad)).ad.admob, AbstractC18007e.startapp(C0115e.f1276e, 61), c13770e3, 384);
                } else {
                    c13770e3.m3659default();
                }
                return Unit.INSTANCE;
            case 3:
                ((Integer) obj2).getClass();
                AbstractC15077e.ad(AbstractC5190e.advert(7), (C13770e) obj, this.f31562e);
                return Unit.INSTANCE;
            case 4:
                C13770e c13770e4 = (C13770e) obj;
                int intValue4 = ((Integer) obj2).intValue();
                if (c13770e4.m3673protected(intValue4 & 1, (intValue4 & 3) != 2)) {
                    AbstractC14489e.vip(AbstractC5297e.appmetrica(c13770e4, this.f31562e ? R.string.auth2_password_hint : R.string.auth2_code), null, 0L, 0L, null, null, null, 0L, null, 0L, 0, false, 0, 0, null, c13770e4, 0, 0, 262142);
                } else {
                    c13770e4.m3659default();
                }
                return Unit.INSTANCE;
            case 5:
                C13770e c13770e5 = (C13770e) obj;
                int intValue5 = ((Integer) obj2).intValue();
                if (c13770e5.m3673protected(intValue5 & 1, (intValue5 & 3) != 2)) {
                    AbstractC5647e.vip(AbstractC12475e.metrica(R.drawable.player_shuffle, 0, c13770e5), AbstractC5297e.appmetrica(c13770e5, this.f31562e ? R.string.now_playing_shuffle_disable : R.string.now_playing_shuffle_enable), AbstractC18007e.startapp(C0115e.f1276e, 28), 0L, c13770e5, 392, 8);
                } else {
                    c13770e5.m3659default();
                }
                return Unit.INSTANCE;
            case 6:
                C13770e c13770e6 = (C13770e) obj;
                int intValue6 = ((Integer) obj2).intValue();
                if (c13770e6.m3673protected(intValue6 & 1, (intValue6 & 3) != 2)) {
                    C10102e.ad.vip(this.f31562e, null, c13770e6, 3072);
                } else {
                    c13770e6.m3659default();
                }
                return Unit.INSTANCE;
            case 7:
                ((Integer) obj2).getClass();
                AbstractC9164e.vip(AbstractC5190e.advert(1), (C13770e) obj, this.f31562e);
                return Unit.INSTANCE;
            default:
                ((Integer) obj2).getClass();
                AbstractC9764e.license(AbstractC5190e.advert(1), (C13770e) obj, this.f31562e);
                return Unit.INSTANCE;
        }
    }
}
