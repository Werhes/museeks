package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.car.app.navigation.model.Maneuver;
import java.util.List;
import java.util.Map;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.conscrypt.BuildConfig;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.catalog.CustomCatalogBlockItem;
import ua.itaysonlab.vkapi2.objects.music.playlist.AudioPlaylist;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟٗۙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final /* synthetic */ class C17187e implements Function1 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f33705e;

    public /* synthetic */ C17187e(int i) {
        this.f33705e = i;
    }

    public /* synthetic */ C17187e(int i, C13648e c13648e) {
        this.f33705e = 16;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        Context context = null;
        int i = 0;
        switch (this.f33705e) {
            case 0:
                char charValue = ((Character) obj).charValue();
                return Boolean.valueOf('0' <= charValue && charValue < ':');
            case 1:
                C6571e c6571e = (C6571e) obj;
                C8416e.appmetrica.vip(new C0389e((AudioPlaylist) c6571e.f13544e, (List) c6571e.f13543e, BuildConfig.FLAVOR));
                return Unit.INSTANCE;
            case 2:
                C6571e c6571e2 = (C6571e) obj;
                C2464e c2464e = C2464e.appmetrica;
                C0389e c0389e = new C0389e((AudioPlaylist) c6571e2.f13544e, (List) c6571e2.f13543e, BuildConfig.FLAVOR);
                c2464e.getClass();
                C2464e.metrica(null, c0389e);
                return Unit.INSTANCE;
            case 3:
                C2464e.appmetrica.getClass();
                C2464e.vip(null, (AudioTrack) obj);
                return Unit.INSTANCE;
            case 4:
                C7469e c7469e = (C7469e) obj;
                c7469e.ad(new C12880e(new C13564e(26)), "JsonPrimitive");
                c7469e.ad(new C12880e(new C13564e(27)), "JsonNull");
                c7469e.ad(new C12880e(new C13564e(28)), "JsonLiteral");
                c7469e.ad(new C12880e(new C13564e(29)), "JsonObject");
                c7469e.ad(new C12880e(new C0568e(i)), "JsonArray");
                return Unit.INSTANCE;
            case 5:
                Map.Entry entry = (Map.Entry) obj;
                String str = (String) entry.getKey();
                AbstractC1948e abstractC1948e = (AbstractC1948e) entry.getValue();
                StringBuilder sb = new StringBuilder();
                AbstractC13517e.ad(str, sb);
                sb.append(':');
                sb.append(abstractC1948e);
                return sb.toString();
            case 6:
                C15104e c15104e = (C15104e) obj;
                c15104e.ad = true;
                c15104e.metrica = true;
                c15104e.appmetrica = true;
                c15104e.purchase = true;
                return Unit.INSTANCE;
            case 7:
                InterfaceC15671e interfaceC15671e = (InterfaceC15671e) obj;
                InterfaceC5371e.ad.getClass();
                AbstractC14594e.yandex(interfaceC15671e, C8155e.vip);
                AbstractC14594e.purchase(interfaceC15671e, C14914e.f29583e);
                return Unit.INSTANCE;
            case 8:
                InterfaceC15671e interfaceC15671e2 = (InterfaceC15671e) obj;
                InterfaceC5371e.ad.getClass();
                AbstractC14594e.yandex(interfaceC15671e2, C8155e.metrica);
                AbstractC14594e.purchase(interfaceC15671e2, C14914e.f29583e);
                return Unit.INSTANCE;
            case 9:
                return Boolean.valueOf(!(((InterfaceC15276e) obj) instanceof C0522e));
            case 10:
                return Unit.INSTANCE;
            case 11:
                List list = (List) obj;
                return new C8202e(((Number) list.get(0)).intValue(), ((Number) list.get(1)).intValue());
            case 12:
                ((Integer) obj).getClass();
                C17908e c17908e = AbstractC8644e.ad;
                return C13664e.f27089e;
            case 13:
                ((Integer) obj).getClass();
                C17908e c17908e2 = AbstractC8644e.ad;
                return -1;
            case 14:
                return Unit.INSTANCE;
            case 15:
                List list2 = (List) obj;
                return new C4993e(((Number) list2.get(0)).intValue(), ((Number) list2.get(1)).intValue());
            case 16:
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((Integer) obj).getClass();
                return null;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List list3 = (List) obj;
                return new C13713e((int[]) list3.get(0), (int[]) list3.get(1));
            case 20:
                return Unit.INSTANCE;
            case 21:
                return Unit.INSTANCE;
            case 22:
                return Unit.INSTANCE;
            case 23:
                C5658e.ad.vip(((CustomCatalogBlockItem) obj).license);
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                List list4 = (List) obj;
                if (!list4.isEmpty()) {
                    int i2 = C3566e.f8039e;
                    AbstractC0890e.appmetrica((AudioTrack) list4.get(0), new C0568e(7)).signatures(C5658e.vip);
                    return Unit.INSTANCE;
                }
                AppActivity appActivity = C5658e.vip;
                if (appActivity == null) {
                    return Unit.INSTANCE;
                }
                AbstractC15615e.ad(new C1478e(i, appActivity, "Трек недоступен из-за его отсуствия или настроек приватности владельца."));
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                AudioTrack audioTrack = (AudioTrack) obj;
                AppActivity appActivity2 = C5658e.vip;
                if (appActivity2 != null) {
                    AbstractC13201e.license(appActivity2, new C0227e(audioTrack));
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((MainArtist) obj).metrica;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                Context context2 = (Context) ((InterfaceC14927e) obj).mo2377else(AbstractC2676e.vip);
                while (true) {
                    if (context2 instanceof ContextWrapper) {
                        if (context2 instanceof Activity) {
                            context = context2;
                        } else {
                            context2 = ((ContextWrapper) context2).getBaseContext();
                        }
                    }
                }
                return (Activity) context;
            default:
                return Unit.INSTANCE;
        }
    }
}
