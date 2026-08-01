package defpackage;

import android.net.Uri;
import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;
import ua.itaysonlab.vkxreborn.ui.nextdock.NextDockView;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۛۗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2098e extends C7460e implements Function1 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f5427e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ C2098e(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f5427e = i4;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        C4956e c4956e;
        AppActivity appActivity;
        AppActivity appActivity2;
        switch (this.f5427e) {
            case 0:
                return ((C8336e) this.f7266e).mopub((C16439e) obj);
            case 1:
                return ((C8336e) this.f7266e).mopub((C16439e) obj);
            case 2:
                return ((C8336e) this.f7266e).mopub((C16439e) obj);
            case 3:
                return ((C8336e) this.f7266e).mopub((C16439e) obj);
            case 4:
                return ((C8336e) this.f7266e).mopub((C16439e) obj);
            case 5:
                return ((C8336e) this.f7266e).mopub((C16439e) obj);
            case 6:
                return ((C8336e) this.f7266e).mopub((C16439e) obj);
            case 7:
                return ((C8336e) this.f7266e).mopub((C16439e) obj);
            case 8:
                return ((C8336e) this.f7266e).mopub((C16439e) obj);
            case 9:
                return ((C8336e) this.f7266e).mopub((C16439e) obj);
            case 10:
                return ((C8336e) this.f7266e).mopub((C16439e) obj);
            case 11:
                ((C4850e) this.f7266e).billing((C8226e) obj);
                return Unit.INSTANCE;
            case 12:
                return ((C8746e) this.f7266e).loadAd((String) obj);
            case 13:
                return new C1860e((C7025e) this.f7266e, (C13520e) obj);
            case 14:
                ((C16161e) this.f7266e).m4137strictfp(((Boolean) obj).booleanValue());
                return Unit.INSTANCE;
            case 15:
                C10860e c10860e = (C10860e) this.f7266e;
                c10860e.getClass();
                for (InterfaceC1921e interfaceC1921e : (List) obj) {
                    if (interfaceC1921e instanceof AbstractC15405e) {
                        c10860e.ad(null);
                    } else if (interfaceC1921e instanceof C15969e) {
                        AbstractC5336e.purchase(c10860e.f21524e, null, 4, new C16600e((C15969e) interfaceC1921e, null, 7), 1);
                    }
                }
                return Unit.INSTANCE;
            case 16:
                C8416e c8416e = (C8416e) this.f7266e;
                c8416e.getClass();
                c8416e.vip(new C1390e((AudioTrack) obj));
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((AbstractC9832e) this.f7266e).mopub((Throwable) obj);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return ((C12092e) this.f7266e).m3326throw((C0520e) obj);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return ((C12092e) this.f7266e).m3327while((C0520e) obj);
            case 20:
                String str = (String) obj;
                ((C0139e) this.f7266e).getClass();
                AppActivity appActivity3 = C5658e.vip;
                if (appActivity3 != null) {
                    appActivity3.isVip(new C5522e(str));
                }
                return Unit.INSTANCE;
            case 21:
                String str2 = (String) obj;
                ((C0139e) this.f7266e).getClass();
                C14027e.ad.getClass();
                if (str2.equals(String.valueOf(C14027e.metrica()))) {
                    AppActivity appActivity4 = C5658e.vip;
                    AppActivity appActivity5 = AbstractC0869e.premium(appActivity4) ? appActivity4 : null;
                    if (appActivity5 != null && (c4956e = appActivity5.f36547e) != null) {
                        NextDockView.metrica((NextDockView) c4956e.f10519e, String.valueOf(3), 6);
                    }
                } else {
                    AppActivity appActivity6 = C5658e.vip;
                    if (appActivity6 != null) {
                        appActivity6.isVip(new C0963e((String) null, new C9837e("https://vk.com/audios".concat(str2), 1)));
                    }
                }
                return Unit.INSTANCE;
            case 22:
                String str3 = (String) obj;
                ((C0139e) this.f7266e).getClass();
                AppActivity appActivity7 = C5658e.vip;
                if (appActivity7 != null) {
                    appActivity7.isVip(new C5421e(Long.parseLong(str3)));
                }
                return Unit.INSTANCE;
            case 23:
                String str4 = (String) obj;
                ((C0139e) this.f7266e).getClass();
                AppActivity appActivity8 = C5658e.vip;
                if (appActivity8 != null) {
                    appActivity8.isVip(new C11210e(Integer.parseInt(str4)));
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                String str5 = (String) obj;
                ((C0139e) this.f7266e).getClass();
                AppActivity appActivity9 = C5658e.vip;
                if (appActivity9 != null) {
                    new C4271e(str5).signatures(appActivity9);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((C0139e) this.f7266e).getClass();
                AppActivity appActivity10 = C5658e.vip;
                if (appActivity10 != null) {
                    new C4271e(null).signatures(appActivity10);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                Uri uri = (Uri) obj;
                ((C0139e) this.f7266e).getClass();
                if (uri.getQueryParameter("section") != null) {
                    String uri2 = uri.toString();
                    AppActivity appActivity11 = C5658e.vip;
                    if (appActivity11 != null) {
                        appActivity11.isVip(new C0963e((String) null, new C9837e(uri2, 1)));
                    }
                } else if (uri.getQueryParameter("q") != null) {
                    uri.getQueryParameter("q");
                } else if (AbstractC7890e.billing(uri.getQueryParameter("popup"), "recoms_onboarding")) {
                    AppActivity appActivity12 = C5658e.vip;
                    if (appActivity12 != null) {
                        appActivity12.isVip(new C14197e());
                    }
                } else {
                    VKXApplication vKXApplication = VKXApplication.f36528e;
                    AbstractC6232e.billing(C12592e.ad, vKXApplication != null ? vKXApplication : null);
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((C0139e) this.f7266e).getClass();
                String queryParameter = ((Uri) obj).getQueryParameter("category");
                if (queryParameter != null && (appActivity = C5658e.vip) != null) {
                    appActivity.isVip(new C0963e(queryParameter, 3));
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                Uri uri3 = (Uri) obj;
                ((C0139e) this.f7266e).getClass();
                AppActivity appActivity13 = C5658e.vip;
                if (appActivity13 != null) {
                    String queryParameter2 = uri3.getQueryParameter("genre");
                    appActivity13.isVip(new C0963e((String) null, new C12851e(12, queryParameter2 != null ? Integer.valueOf(Integer.parseInt(queryParameter2)) : null)));
                }
                return Unit.INSTANCE;
            default:
                Uri uri4 = (Uri) obj;
                ((C0139e) this.f7266e).getClass();
                String queryParameter3 = uri4.getQueryParameter("genre_id");
                String queryParameter4 = uri4.getQueryParameter("person_id");
                if (queryParameter4 != null && (appActivity2 = C5658e.vip) != null) {
                    int parseInt = Integer.parseInt(queryParameter4);
                    Integer valueOf = queryParameter3 != null ? Integer.valueOf(Integer.parseInt(queryParameter3)) : null;
                    appActivity2.isVip(valueOf != null ? new C0963e((String) null, new C7307e(parseInt, 0, valueOf)) : new C15767e(new C7307e(parseInt, 1, valueOf)));
                }
                return Unit.INSTANCE;
        }
    }
}
