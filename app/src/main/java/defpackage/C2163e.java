package defpackage;

import android.content.SharedPreferences;
import android.util.Log;
import androidx.car.app.navigation.model.Maneuver;
import java.io.File;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.downloader.service.DownloaderService;
import ua.itaysonlab.vkxreborn.cache.v2.DedicatedCacheService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؓۢؒ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C2163e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f5537e;

    public /* synthetic */ C2163e(int i) {
        this.f5537e = i;
    }

    public /* synthetic */ C2163e(C9964e c9964e) {
        this.f5537e = 5;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        int i = 2;
        int i2 = 0;
        switch (this.f5537e) {
            case 0:
                InterfaceC4595e interfaceC4595e = (InterfaceC4595e) obj;
                if (interfaceC4595e instanceof AbstractC3743e) {
                    return (AbstractC3743e) interfaceC4595e;
                }
                return null;
            case 1:
                return C13664e.f27089e;
            case 2:
                return obj instanceof Object[] ? AbstractC1660e.m669goto((Object[]) obj, null, "[", "]", new C2163e(i), 25) : String.valueOf(obj);
            case 3:
                AudioTrack audioTrack = (AudioTrack) obj;
                int i3 = DedicatedCacheService.f36730e;
                if (!AbstractC6914e.appmetrica(audioTrack) && audioTrack.adcel.length() != 0) {
                    r6 = false;
                }
                return Boolean.valueOf(r6);
            case 4:
                List list = (List) obj;
                return new C16349e(((Integer) list.get(0)).intValue(), ((Float) list.get(1)).floatValue(), new C5864e(i2, list));
            case 5:
                C7043e c7043e = (C7043e) obj;
                c7043e.metrica = false;
                c7043e.ad.add(new AbstractC7185e(2, null));
                return Unit.INSTANCE;
            case 6:
                AbstractC14594e.Signature((InterfaceC15671e) obj);
                return Unit.INSTANCE;
            case 7:
                AbstractC14594e.Signature((InterfaceC15671e) obj);
                return Unit.INSTANCE;
            case 8:
                int i4 = 3;
                ((C7145e) obj).ad.f18710e.mopub(C13886e.f27522e, new C1053e(i4, i4, (InterfaceC5083e) (null == true ? 1 : 0)));
                return Unit.INSTANCE;
            case 9:
                AudioTrack audioTrack2 = (AudioTrack) obj;
                int i5 = DownloaderService.f36551e;
                if (!AbstractC6914e.appmetrica(audioTrack2) && audioTrack2.adcel.length() != 0) {
                    r6 = false;
                }
                return Boolean.valueOf(r6);
            case 10:
                int i6 = DownloaderService.f36551e;
                String str = ((C2662e) obj).license;
                return str == null ? BuildConfig.FLAVOR : str;
            case 11:
                int i7 = DownloaderService.f36551e;
                return ((MainArtist) obj).metrica;
            case 12:
                return Double.valueOf(50.0d);
            case 13:
                return Unit.INSTANCE;
            case 14:
                InterfaceC15671e interfaceC15671e = (InterfaceC15671e) obj;
                InterfaceC5371e.ad.getClass();
                AbstractC14594e.yandex(interfaceC15671e, C8155e.purchase);
                AbstractC14594e.purchase(interfaceC15671e, C14914e.f29583e);
                return Unit.INSTANCE;
            case 15:
                InterfaceC15671e interfaceC15671e2 = (InterfaceC15671e) obj;
                InterfaceC5371e.ad.getClass();
                AbstractC14594e.yandex(interfaceC15671e2, C8155e.metrica);
                AbstractC14594e.purchase(interfaceC15671e2, C14914e.f29583e);
                return Unit.INSTANCE;
            case 16:
                InterfaceC15671e interfaceC15671e3 = (InterfaceC15671e) obj;
                InterfaceC5371e.ad.getClass();
                AbstractC14594e.yandex(interfaceC15671e3, C8155e.vip);
                AbstractC14594e.purchase(interfaceC15671e3, C14914e.f29583e);
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return 1;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return Float.valueOf(((C1050e) obj).f3537e);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return 2;
            case 20:
                return new C7954e();
            case 21:
                return "[" + ((C4211e) obj) + ']';
            case 22:
                ((File) obj).getCanonicalFile().getAbsolutePath();
                return new C2771e();
            case 23:
                return Boolean.valueOf(((C18422e) obj).f36115while != null);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return ((C5926e) obj).metrica;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                C18479e c18479e = (C18479e) obj;
                SharedPreferences sharedPreferences = AbstractC16082e.appmetrica;
                SharedPreferences sharedPreferences2 = sharedPreferences != null ? sharedPreferences : null;
                if (sharedPreferences == null) {
                    sharedPreferences = null;
                }
                long j = sharedPreferences2.getLong("user_id_v2", sharedPreferences.getInt("user_id", 0));
                SharedPreferences sharedPreferences3 = AbstractC16082e.appmetrica;
                if (sharedPreferences3 == null) {
                    sharedPreferences3 = null;
                }
                String string = sharedPreferences3.getString("user_token", BuildConfig.FLAVOR);
                if (string == null) {
                    string = BuildConfig.FLAVOR;
                }
                C5471e c5471e = C5471e.f11744e;
                C5471e metrica = C13023e.metrica(Long.MAX_VALUE, 0L);
                StringBuilder sb = new StringBuilder();
                SharedPreferences sharedPreferences4 = AbstractC16082e.appmetrica;
                if (sharedPreferences4 == null) {
                    sharedPreferences4 = null;
                }
                sb.append(sharedPreferences4.getString("user_first_name", BuildConfig.FLAVOR));
                sb.append(' ');
                SharedPreferences sharedPreferences5 = AbstractC16082e.appmetrica;
                if (sharedPreferences5 == null) {
                    sharedPreferences5 = null;
                }
                sb.append(sharedPreferences5.getString("user_last_name", BuildConfig.FLAVOR));
                String sb2 = sb.toString();
                SharedPreferences sharedPreferences6 = AbstractC16082e.appmetrica;
                String string2 = (sharedPreferences6 != null ? sharedPreferences6 : null).getString("user_avatar", BuildConfig.FLAVOR);
                return C18479e.ad(c18479e, j, string, metrica, null, null, null, sb2, null, null, string2 == null ? BuildConfig.FLAVOR : string2, false, 440);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                ((C9167e) obj).vip = AbstractC12918e.ad();
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                Log.w("FirebaseSessions", "CorruptionException in session configs DataStore", (C11506e) obj);
                return C10990e.f21764e;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                AbstractC14594e.advert((InterfaceC15671e) obj, 0);
                return Unit.INSTANCE;
            default:
                return Unit.INSTANCE;
        }
    }
}
