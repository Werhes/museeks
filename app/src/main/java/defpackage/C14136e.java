package defpackage;

import androidx.car.app.navigation.model.Maneuver;
import java.lang.annotation.Annotation;
import java.util.UUID;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.playlist.metadata.MainArtist;
import ua.itaysonlab.vkx.VKXApplication;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٓٞٓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class C14136e implements Function0 {

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final /* synthetic */ int f27952e;

    public /* synthetic */ C14136e(int i) {
        this.f27952e = i;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        boolean z = false;
        switch (this.f27952e) {
            case 0:
                return new C13458e("err_not_found", C2471e.INSTANCE, new Annotation[0]);
            case 1:
                return new C13758e(InterfaceC12391e.Companion.serializer(), 0);
            case 2:
                C5945e c5945e = MainArtist.Companion;
                return new C13758e(C0735e.ad, 0);
            case 3:
                C15492e c15492e = AbstractC11785e.ad;
                return Boolean.FALSE;
            case 4:
                return new C7019e(AbstractC7893e.purchase(0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, 0L, -1, 65535), new C0984e(null, null, null, null, null, null, null, null, null, 32767), new C17500e(null, 31), C0843e.ad);
            case 5:
                return new C13758e(C0417e.ad, 0);
            case 6:
                return new C13758e(C7058e.ad, 0);
            case 7:
                return EnumC5502e.Companion.serializer();
            case 8:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.media.MediaPopupDto.ImageModeDto", EnumC5502e.values(), new String[]{"round", "small", "big", "emoji"}, new Annotation[][]{null, null, null, null});
            case 9:
                return UUID.randomUUID();
            case 10:
                InterfaceC9998e[] interfaceC9998eArr = new InterfaceC9998e[0];
                if (AbstractC5304e.m1866native("kotlinx.datetime.MonthBased")) {
                    throw new IllegalArgumentException("Blank serial names are prohibited");
                }
                C7469e c7469e = new C7469e("kotlinx.datetime.MonthBased");
                c7469e.ad(C13257e.vip, "months");
                Unit unit = Unit.INSTANCE;
                return new C17709e("kotlinx.datetime.MonthBased", C6805e.appmetrica, c7469e.metrica.size(), AbstractC1660e.m670implements(interfaceC9998eArr), c7469e);
            case 11:
                return InterfaceC5816e.ad;
            case 12:
                return C4514e.ad;
            case 13:
                return Unit.INSTANCE;
            case 14:
                return AbstractC14533e.startapp(Boolean.FALSE);
            case 15:
                return Unit.INSTANCE;
            case 16:
                return new C1343e(new C6351e());
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new C15948e(new C1343e(new C6351e()));
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                C14808e c14808e = AbstractC11069e.Signature;
                return new C7208e(c14808e, c14808e);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return Boolean.valueOf(!AbstractC12918e.metrica.license);
            case 20:
                return new C11179e();
            case 21:
                return Unit.INSTANCE;
            case 22:
                return EnumC14901e.Companion.serializer();
            case 23:
                return AbstractC7237e.vip("bruhcollective.itaysonlab.vkapi.objects.photos.PhotosPhotoSizesTypeDto", EnumC14901e.values(), new String[]{"t", "s", "m", "x", "o", "p", "q", "r", "k", "l", "y", "z", "c", "w", "a", "b", "e", "i", "d", "j", "temp", "h", "g", "n", "f", "max", "base", "u", "v"}, new Annotation[][]{null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null});
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                int i = C12979e.f25885e;
                return Boolean.FALSE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return Boolean.TRUE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                C15420e c15420e = AbstractC6731e.ad;
                return ExecutorC3603e.f8134e;
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                AbstractC11110e abstractC11110e = C14564e.f28775e;
                return 31;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                VKXApplication.Companion companion = VKXApplication.f36531e;
                C7838e c7838e = VKXApplication.f36530e;
                if (c7838e != null) {
                    return c7838e;
                }
                return null;
            default:
                C5363e c5363e = C0353e.startapp;
                if (!AbstractC15792e.billing().vip.tapsense()) {
                    C18046e c18046e = VKXApplication.f36532e;
                    if (!((Boolean) ((C14688e) (c18046e != null ? c18046e : null).purchase.yandex).f29092e.getValue()).booleanValue()) {
                        z = true;
                    }
                }
                return Boolean.valueOf(!z);
        }
    }
}
