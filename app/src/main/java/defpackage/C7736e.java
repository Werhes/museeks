package defpackage;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import androidx.car.app.navigation.model.Maneuver;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؗؐ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C7736e extends C7460e implements Function0 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f15706e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C7736e(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f15706e = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AudioPlaylist audioPlaylist;
        AudioPlaylist audioPlaylist2;
        int i = this.f15706e;
        C4130e c4130e = C4130e.ad;
        int i2 = 5;
        Object[] objArr = 0;
        Object[] objArr2 = 0;
        Object obj = this.f7266e;
        switch (i) {
            case 0:
                ((C11986e) obj).mo734case();
                return Unit.INSTANCE;
            case 1:
                ((C11439e) obj).mo734case();
                return Unit.INSTANCE;
            case 2:
                ((C3625e) obj).mo734case();
                return Unit.INSTANCE;
            case 3:
                C2921e c2921e = (C2921e) obj;
                c2921e.f6911e.setValue(Boolean.FALSE);
                C16251e c16251e = C16251e.ad;
                C16251e.license(EnumC14893e.f29517e);
                new C8054e(c4130e, null).signatures(c2921e.pro());
                return Unit.INSTANCE;
            case 4:
                ((C2921e) obj).f6911e.setValue(Boolean.FALSE);
                C16251e c16251e2 = C16251e.ad;
                C16251e.license(EnumC14893e.f29517e);
                return Unit.INSTANCE;
            case 5:
                ((C2921e) obj).mo734case();
                return Unit.INSTANCE;
            case 6:
                ((C2921e) obj).m1216else(true);
                return Unit.INSTANCE;
            case 7:
                ((C2921e) obj).m1216else(false);
                return Unit.INSTANCE;
            case 8:
                C2921e c2921e2 = (C2921e) obj;
                c2921e2.m1216else(false);
                new C8054e(c4130e, null).signatures(c2921e2.pro());
                return Unit.INSTANCE;
            case 9:
                C2921e c2921e3 = (C2921e) obj;
                c2921e3.m1216else(false);
                c2921e3.f6912e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case 10:
                C2921e c2921e4 = (C2921e) obj;
                c2921e4.getClass();
                C2921e.m1215return(c2921e4, null, true, 1);
                return Unit.INSTANCE;
            case 11:
                ((C17890e) obj).purchase();
                return Unit.INSTANCE;
            case 12:
                C17890e c17890e = (C17890e) obj;
                Activity activity = c17890e.f10582e;
                Intent intent = new Intent("android.settings.APPLICATION_DETAILS_SETTINGS");
                intent.setData(Uri.fromParts("package", c17890e.f10582e.getPackageName(), null));
                activity.startActivity(intent);
                return Unit.INSTANCE;
            case 13:
                ((C1856e) obj).mo734case();
                return Unit.INSTANCE;
            case 14:
                ((C9669e) obj).mo734case();
                return Unit.INSTANCE;
            case 15:
                ((C4271e) obj).purchase();
                return Unit.INSTANCE;
            case 16:
                return Boolean.valueOf(((C15601e) obj).license);
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((C12785e) obj).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C8510e c8510e = (C8510e) obj;
                c8510e.getClass();
                c8510e.m2514goto(new C15435e());
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                C8510e c8510e2 = (C8510e) obj;
                c8510e2.getClass();
                c8510e2.m2514goto(new C2921e());
                return Unit.INSTANCE;
            case 20:
                C8510e c8510e3 = (C8510e) obj;
                c8510e3.getClass();
                c8510e3.m2514goto(new C5250e(C17647e.f34587e));
                return Unit.INSTANCE;
            case 21:
                C8510e c8510e4 = (C8510e) obj;
                c8510e4.getClass();
                c8510e4.m2514goto(new C5250e(C1400e.f4199e));
                return Unit.INSTANCE;
            case 22:
                C8510e c8510e5 = (C8510e) obj;
                c8510e5.getClass();
                int i3 = AbstractC8752e.ad;
                AbstractC8752e.ad(c8510e5.pro(), AbstractC4608e.metrica(c8510e5.vip()), true, new C12358e((Object) c8510e5, (InterfaceC5083e) (objArr == true ? 1 : 0), i2));
                return Unit.INSTANCE;
            case 23:
                ((C14873e) obj).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                C14873e c14873e = (C14873e) obj;
                c14873e.m3874e(false);
                InterfaceC11578e m3875e = c14873e.m3875e();
                C6123e c6123e = m3875e instanceof C6123e ? (C6123e) m3875e : null;
                if (c6123e != null && (audioPlaylist = c6123e.ad) != null) {
                    AbstractC16519e.vip((AppActivity) c14873e.pro(), new C3472e((Object) audioPlaylist, (Object) c14873e, (InterfaceC5083e) (objArr2 == true ? 1 : 0), i2));
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C14873e c14873e2 = (C14873e) obj;
                c14873e2.m3874e(false);
                InterfaceC11578e m3875e2 = c14873e2.m3875e();
                C6123e c6123e2 = m3875e2 instanceof C6123e ? (C6123e) m3875e2 : null;
                if (c6123e2 != null && (audioPlaylist2 = c6123e2.ad) != null) {
                    c14873e2.m2514goto(new C15820e(audioPlaylist2));
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C14873e c14873e3 = (C14873e) obj;
                c14873e3.m3874e(false);
                c14873e3.f29459e.setValue(Boolean.TRUE);
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((C9013e) obj).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((C9289e) obj).license.invoke();
                return Unit.INSTANCE;
            default:
                ((C9289e) obj).purchase.subscription(Boolean.FALSE);
                C16251e c16251e3 = C16251e.ad;
                C16251e.license(EnumC14893e.f29514e);
                return Unit.INSTANCE;
        }
    }
}
