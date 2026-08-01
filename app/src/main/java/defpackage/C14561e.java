package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙٔ٘, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14561e implements Function0 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f28774e;

    public /* synthetic */ C14561e(int i) {
        this.f28774e = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = 5;
        byte b = 0;
        switch (this.f28774e) {
            case 0:
                return new C13758e(C9582e.ad, 0);
            case 1:
                return new C13758e(C9582e.ad, 0);
            case 2:
                return new C13758e(C16093e.ad, 0);
            case 3:
                return new C13758e(C9245e.ad, 0);
            case 4:
                return new C13758e(C1471e.ad, 0);
            case 5:
                return new C13758e(C11181e.ad, 0);
            case 6:
                return new C13758e(C11181e.ad, 0);
            case 7:
                return new C13758e(C5992e.ad, 0);
            case 8:
                return new C13758e(C14729e.ad, 0);
            case 9:
                return new C13758e(C11181e.ad, 0);
            case 10:
                return new C13758e(C11181e.ad, 0);
            case 11:
                ArrayList arrayList = new ArrayList();
                C8167e c8167e = new C8167e(0);
                c8167e.metrica("playlist_id", new C14911e("playlist_id", i));
                c8167e.metrica("owner_id", new C14911e("owner_id", i));
                c8167e.metrica("access_key", new C14911e("access_key", i));
                c8167e.metrica("count", new C14911e("count", i));
                c8167e.metrica("offset", new C14911e("offset", i));
                c8167e.metrica("shuffle_seed", new C14911e("shuffle_seed", i));
                Unit unit = Unit.INSTANCE;
                int i2 = 24;
                arrayList.add(new C11883e("tracks", new C12309e("audio.get", c8167e, 12), i2));
                C2443e ad = new C2443e("tracks", 3).ad("items");
                int i3 = 27;
                arrayList.add(new C10312e("response", C17354e.f34047e, i3));
                C2443e c2443e = new C2443e("response", 3);
                arrayList.add(new C5891e(c2443e.ad("items"), C4524e.f9804e, i2));
                int i4 = 18;
                arrayList.add(new C10312e("index", new C5401e(b, i4, b), i3));
                C2443e c2443e2 = new C2443e("index", 3);
                arrayList.add(new C10312e("counter", ad.ad("length"), i3));
                C2443e c2443e3 = new C2443e("counter", 3);
                C3168e c3168e = new C3168e(c2443e3, new C5401e(b, i4, b), i2);
                C9584e c9584e = new C9584e(ad, c2443e2, c2443e3, c2443e);
                C12052e c12052e = new C12052e();
                c9584e.invoke(c12052e);
                arrayList.add(new C10312e(c3168e, c12052e.ad, 29));
                arrayList.add(new C12916e(28, c2443e));
                return AbstractC13480e.m3608try(arrayList, "\n\n", null, null, null, 62);
            case 12:
                return new C13758e(C9433e.ad, 0);
            case 13:
                return EnumC2854e.Companion.serializer();
            case 14:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPhotoSizesDto.TypeDto", EnumC2854e.values(), new String[]{"s", "m", "x", "y", "z", "w", "o", "p", "q", "r", "base"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null});
            case 15:
                return new C13758e(C7058e.ad, 0);
            case 16:
                return EnumC6983e.Companion.serializer();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return EnumC0422e.Companion.serializer();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPlaylistActionDto.LocationDto", EnumC0422e.values(), new String[]{"more_menu", "button", "banner"}, new Annotation[][]{null, null, null});
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPlaylistActionDto.TypeDto", EnumC6983e.values(), new String[]{"add", "shareBanner"}, new Annotation[][]{null, null});
            case 20:
                return EnumC4165e.Companion.serializer();
            case 21:
                return new C13758e(C16652e.ad, 0);
            case 22:
                return new C13758e(C14729e.ad, 0);
            case 23:
                return new C13758e(C13144e.ad, 0);
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new C13758e(C5992e.ad, 0);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return new C13758e(C5992e.ad, 0);
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return new C13758e(C5992e.ad, 0);
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return EnumC3616e.Companion.serializer();
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return new C13758e(C1575e.ad, 0);
            default:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.audio.AudioPlaylistDto.AlbumTypeDto", EnumC3616e.values(), new String[]{"playlist", "main_only", "main_feat", "collection"}, new Annotation[][]{null, null, null, null});
        }
    }
}
