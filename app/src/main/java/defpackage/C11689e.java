package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import io.realm.kotlin.internal.interop.realmcJNI;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.podcasts.PodcastCover;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkxreborn.playback.service.PlaybackService;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِِۣ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C11689e implements Function0 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f23520e;

    public /* synthetic */ C11689e(int i) {
        this.f23520e = i;
    }

    public /* synthetic */ C11689e(PlaybackService playbackService, int i) {
        this.f23520e = i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r4v0, types: [eًؗۖ, java.lang.Object] */
    /* JADX WARN: Type inference failed for: r4v1, types: [eۡۦ] */
    /* JADX WARN: Type inference failed for: r4v2 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 12;
        int i2 = 5;
        int i3 = 0;
        switch (this.f23520e) {
            case 0:
                C12920e c12920e = new C12920e(EnumC11342e.f22810e, false);
                VKXApplication vKXApplication = VKXApplication.f36528e;
                AbstractC6232e.billing(c12920e, vKXApplication != null ? vKXApplication : 0);
                return Unit.INSTANCE;
            case 1:
                int i4 = PlaybackService.f36732e;
                return Boolean.FALSE;
            case 2:
                return PlaybackService.advert().f15868e.license.billing();
            case 3:
                return Boolean.valueOf(PlaybackService.advert().f15868e.license.purchase());
            case 4:
                C7838e c7838e = VKXApplication.f36530e;
                if (c7838e == null) {
                    c7838e = null;
                }
                if (c7838e.billing()) {
                    C7838e c7838e2 = VKXApplication.f36530e;
                    C7838e c7838e3 = c7838e2 != null ? c7838e2 : null;
                    c7838e3.getClass();
                    c7838e3.startapp(C11293e.f22689e);
                } else {
                    C7838e c7838e4 = VKXApplication.f36530e;
                    if (c7838e4 == null) {
                        c7838e4 = null;
                    }
                    c7838e4.getClass();
                    c7838e4.startapp(new C18474e(c7838e4, r4, i2));
                }
                return Unit.INSTANCE;
            case 5:
                C7838e c7838e5 = VKXApplication.f36530e;
                if (c7838e5 == null) {
                    c7838e5 = null;
                }
                if (c7838e5.billing()) {
                    C7838e c7838e6 = VKXApplication.f36530e;
                    if (c7838e6 == null) {
                        c7838e6 = null;
                    }
                    if (c7838e6.appmetrica() == EnumC11342e.f22808e) {
                        C7838e c7838e7 = VKXApplication.f36530e;
                        (c7838e7 != null ? c7838e7 : null).adcel();
                    } else {
                        C7838e c7838e8 = VKXApplication.f36530e;
                        (c7838e8 != null ? c7838e8 : null).smaato();
                    }
                } else {
                    C7838e c7838e9 = VKXApplication.f36530e;
                    if (c7838e9 == null) {
                        c7838e9 = null;
                    }
                    c7838e9.getClass();
                    c7838e9.startapp(new C18474e(c7838e9, r4, i2));
                    Unit unit = Unit.INSTANCE;
                }
                return Unit.INSTANCE;
            case 6:
                C7838e c7838e10 = VKXApplication.f36530e;
                if (c7838e10 == null) {
                    c7838e10 = null;
                }
                if (c7838e10.billing()) {
                    C7838e c7838e11 = VKXApplication.f36530e;
                    if (c7838e11 == null) {
                        c7838e11 = null;
                    }
                    c7838e11.getClass();
                    c7838e11.startapp(new C10954e(c7838e11, r4, 7));
                } else {
                    C7838e c7838e12 = VKXApplication.f36530e;
                    if (c7838e12 == null) {
                        c7838e12 = null;
                    }
                    c7838e12.getClass();
                    c7838e12.startapp(new C18474e(c7838e12, r4, i2));
                }
                return Unit.INSTANCE;
            case 7:
                C12653e c12653e = PodcastCover.Companion;
                return new C13758e(C6188e.ad, 0);
            case 8:
                return new C13758e(C11144e.ad, 0);
            case 9:
                return new C13758e(C13257e.ad, 0);
            case 10:
                int i5 = AbstractC6909e.ad;
                return Boolean.FALSE;
            case 11:
                return new C9261e(false);
            case 12:
                return new C9261e(true);
            case 13:
                return new C9425e();
            case 14:
                return new C3861e();
            case 15:
                return new C14539e();
            case 16:
                return new C11200e(new C7558e(Float.valueOf(0.0f), AbstractC9546e.ad, r4, i));
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return InterfaceC1940e.Companion.serializer();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                List m3577else = AbstractC13480e.m3577else((List) AbstractC8325e.ad.getValue(), new C11797e(11));
                ArrayList arrayList = new ArrayList();
                int size = m3577else.size();
                while (i3 < size) {
                    ((C8134e) m3577else.get(i3)).getClass();
                    C14015e c14015e = new C14015e(new C14136e(17));
                    InterfaceC7227e vip = AbstractC3820e.ad.vip(C0388e.class);
                    C6571e c6571e = vip == null ? null : new C6571e(c14015e, vip);
                    if (c6571e != null) {
                        arrayList.add(c6571e);
                    }
                    i3++;
                }
                return arrayList;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                List m3577else2 = AbstractC13480e.m3577else((List) AbstractC8325e.vip.getValue(), new C11797e(i));
                ArrayList arrayList2 = new ArrayList();
                int size2 = m3577else2.size();
                while (i3 < size2) {
                    arrayList2.add(((InterfaceC12397e) m3577else2.get(i3)).ad());
                    i3++;
                }
                return arrayList2;
            case 20:
                int i6 = AbstractC6026e.ad;
                return new C10484e(realmcJNI.RLM_INVALID_CLASS_KEY_get());
            case 21:
                int i7 = AbstractC6026e.ad;
                return new C1235e(realmcJNI.RLM_INVALID_PROPERTY_KEY_get());
            case 22:
                return null;
            case 23:
                return new C2505e();
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C0963e((String) null, new C9837e("artist_recoms", 2));
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C15820e(-21, 12, ((C18479e) AbstractC1831e.vip().billing).ad, (String) null);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C16341e(null, null);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return EnumC16168e.Companion.serializer();
            default:
                return new Object();
        }
    }
}
