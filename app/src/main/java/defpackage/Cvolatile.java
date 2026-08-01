package defpackage;

import android.os.Build;
import android.view.View;
import android.view.contentcapture.ContentCaptureSession;
import androidx.car.app.navigation.model.Maneuver;
import bruhcollective.itaysonlab.libvkmusic.objects.UmaTrack;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import ua.itaysonlab.vkapi2.objects.music.AudioTrack;
import ua.itaysonlab.vkapi2.objects.music.playlist.album.AudioAlbum;
import ua.itaysonlab.vkx.R;
import ua.itaysonlab.vkx.VKXApplication;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: volatile, reason: invalid class name */
/* loaded from: classes.dex */
public final /* synthetic */ class Cvolatile extends C7460e implements Function0 {

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public final /* synthetic */ int f36766e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ Cvolatile(int i, Object obj, Class cls, String str, String str2, int i2, int i3, int i4) {
        super(i, obj, cls, str, str2, i2, i3);
        this.f36766e = i4;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v136, types: [java.lang.Object, kotlin.jvm.functions.Function0] */
    /* JADX WARN: Type inference failed for: r8v0, types: [eًؗۖ] */
    /* JADX WARN: Type inference failed for: r8v2 */
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        AudioAlbum audioAlbum;
        ContentCaptureSession remoteconfig;
        int i = this.f36766e;
        int i2 = 11;
        int i3 = 7;
        int i4 = 10;
        boolean z = true;
        char c = 1;
        int i5 = 0;
        int i6 = 2;
        Object obj = this.f7266e;
        switch (i) {
            case 0:
                ((Cpublic) obj).mo734case();
                return Unit.INSTANCE;
            case 1:
                ((C2038e) obj).getClass();
                C7838e c7838e = VKXApplication.f36530e;
                if (c7838e == null) {
                    c7838e = null;
                }
                c7838e.getClass();
                int ordinal = ((EnumC10286e) c7838e.yandex(new C1586e(c7838e, i3))).ordinal();
                int i7 = 6;
                if (ordinal == 0) {
                    C7838e c7838e2 = VKXApplication.f36530e;
                    if (c7838e2 == null) {
                        c7838e2 = null;
                    }
                    c7838e2.getClass();
                    c7838e2.startapp(new C10954e(EnumC10286e.f20305e, r8, i7));
                } else if (ordinal == 1) {
                    C7838e c7838e3 = VKXApplication.f36530e;
                    if (c7838e3 == null) {
                        c7838e3 = null;
                    }
                    c7838e3.getClass();
                    c7838e3.startapp(new C10954e(EnumC10286e.f20304e, r8, i7));
                } else {
                    if (ordinal != 2) {
                        throw new C14803e(10);
                    }
                    C7838e c7838e4 = VKXApplication.f36530e;
                    if (c7838e4 == null) {
                        c7838e4 = null;
                    }
                    c7838e4.getClass();
                    c7838e4.startapp(new C10954e(EnumC10286e.f20307e, r8, i7));
                }
                return Unit.INSTANCE;
            case 2:
                ((C2038e) obj).getClass();
                C7838e c7838e5 = VKXApplication.f36530e;
                r8 = c7838e5 != null ? c7838e5 : 0;
                r8.getClass();
                return Unit.INSTANCE;
            case 3:
                ((C2038e) obj).getClass();
                C7838e c7838e6 = VKXApplication.f36530e;
                C7838e c7838e7 = c7838e6 != null ? c7838e6 : null;
                c7838e7.getClass();
                return Unit.INSTANCE;
            case 4:
                ((C2038e) obj).billing();
                return Unit.INSTANCE;
            case 5:
                ((C2038e) obj).getClass();
                C7838e c7838e8 = VKXApplication.f36530e;
                C7838e c7838e9 = c7838e8 != null ? c7838e8 : null;
                c7838e9.getClass();
                return Unit.INSTANCE;
            case 6:
                ((C2038e) obj).getClass();
                C7838e c7838e10 = VKXApplication.f36530e;
                if (c7838e10 == null) {
                    c7838e10 = null;
                }
                c7838e10.getClass();
                c7838e10.startapp(new C10954e(c7838e10, r8, i3));
                return Unit.INSTANCE;
            case 7:
                C2038e c2038e = (C2038e) obj;
                c2038e.getClass();
                C7838e c7838e11 = VKXApplication.f36530e;
                if (c7838e11 == null) {
                    c7838e11 = null;
                }
                InterfaceC1686e interfaceC1686e = c7838e11.f15868e.license;
                if (!(interfaceC1686e instanceof C8040e) && !(interfaceC1686e instanceof InterfaceC11116e)) {
                    c2038e.loadAd(C16875e.ad(c2038e.mopub(), null, 0, null, null, null, false, false, false, false, false, null, false, true, 0, 0, 28671));
                    C7838e c7838e12 = VKXApplication.f36530e;
                    if (c7838e12 == null) {
                        c7838e12 = null;
                    }
                    if (((Boolean) ((C1615e) c7838e12.f15870e.f36229e).getValue()).booleanValue()) {
                        C12894e c12894e = C7838e.f15858e;
                        if (c12894e == null) {
                            c12894e = null;
                        }
                        ((C7838e) ((C14136e) c12894e.f25751e).invoke()).amazon(!((C7838e) ((C14136e) (C7838e.f15858e != null ? r2 : null).f25751e).invoke()).metrica());
                    } else {
                        C7838e c7838e13 = VKXApplication.f36530e;
                        if (c7838e13 == null) {
                            c7838e13 = null;
                        }
                        if (!c7838e13.metrica()) {
                            C7838e c7838e14 = VKXApplication.f36530e;
                            if (c7838e14 == null) {
                                c7838e14 = null;
                            }
                            if (!(c7838e14.f15868e.license instanceof InterfaceC17992e)) {
                                new C10137e(new C13630e(13), new C5636e(c2038e, 3)).signatures(c2038e.ad);
                            }
                        }
                        C12894e c12894e2 = C7838e.f15858e;
                        if (c12894e2 == null) {
                            c12894e2 = null;
                        }
                        ((C7838e) ((C14136e) c12894e2.f25751e).invoke()).amazon(!((C7838e) ((C14136e) (C7838e.f15858e != null ? r2 : null).f25751e).invoke()).metrica());
                    }
                }
                return Unit.INSTANCE;
            case 8:
                C2038e c2038e2 = (C2038e) obj;
                AppActivity appActivity = c2038e2.ad;
                if (!(c2038e2.adcel().vip instanceof UmaTrack) || ((UmaTrack) c2038e2.adcel().vip).pro == null) {
                    AbstractC16049e abstractC16049e = c2038e2.adcel().vip;
                    AudioTrack audioTrack = abstractC16049e instanceof AudioTrack ? (AudioTrack) abstractC16049e : null;
                    if (audioTrack != null && (audioAlbum = audioTrack.amazon) != null) {
                        appActivity.firebase();
                        appActivity.isVip(new C15820e(audioAlbum.ad.intValue(), 8, audioAlbum.vip.longValue(), audioAlbum.metrica));
                    }
                } else {
                    AbstractC16519e.ad(AbstractC17947e.billing(appActivity), appActivity, false, new C14296e(c2038e2, r8, i6));
                }
                return Unit.INSTANCE;
            case 9:
                C2038e c2038e3 = (C2038e) obj;
                AppActivity appActivity2 = c2038e3.ad;
                if (!(c2038e3.adcel().vip instanceof UmaTrack) || ((UmaTrack) c2038e3.adcel().vip).pro == null) {
                    AbstractC16049e abstractC16049e2 = c2038e3.adcel().vip;
                    AudioTrack audioTrack2 = abstractC16049e2 instanceof AudioTrack ? (AudioTrack) abstractC16049e2 : null;
                    List vip = audioTrack2 != null ? AbstractC6914e.vip(audioTrack2) : null;
                    if (vip == null) {
                        vip = C13664e.f27089e;
                    }
                    List list = vip.isEmpty() ? null : vip;
                    if (list != null) {
                        AbstractC6100e.vip(appActivity2, list);
                    }
                } else {
                    AbstractC16519e.ad(AbstractC17947e.billing(appActivity2), appActivity2, false, new C14296e(c2038e3, r8, c == true ? 1 : 0));
                }
                return Unit.INSTANCE;
            case 10:
                C2038e c2038e4 = (C2038e) obj;
                AbstractC16049e abstractC16049e3 = c2038e4.adcel().vip;
                AudioTrack audioTrack3 = abstractC16049e3 instanceof AudioTrack ? (AudioTrack) abstractC16049e3 : null;
                if (audioTrack3 != null) {
                    new C13424e(new C5175e(audioTrack3)).signatures(c2038e4.ad);
                }
                return Unit.INSTANCE;
            case 11:
                C2038e c2038e5 = (C2038e) obj;
                AppActivity appActivity3 = c2038e5.ad;
                AbstractC16519e.ad(AbstractC17947e.billing(appActivity3), appActivity3, false, new C14869e(c2038e5, (InterfaceC5083e) r8, 22));
                return Unit.INSTANCE;
            case 12:
                ((C2038e) obj).getClass();
                C7838e c7838e15 = VKXApplication.f36530e;
                if (c7838e15 == null) {
                    c7838e15 = null;
                }
                c7838e15.getClass();
                c7838e15.startapp(new C9754e(i6, i4, r8));
                return Unit.INSTANCE;
            case 13:
                ((C2038e) obj).getClass();
                C7838e c7838e16 = VKXApplication.f36530e;
                if (c7838e16 == null) {
                    c7838e16 = null;
                }
                c7838e16.getClass();
                c7838e16.startapp(new C9754e(i6, i2, r8));
                return Unit.INSTANCE;
            case 14:
                ((C2038e) obj).getClass();
                C7838e c7838e17 = VKXApplication.f36530e;
                if (c7838e17 == null) {
                    c7838e17 = null;
                }
                c7838e17.getClass();
                c7838e17.startapp(new C9754e(i6, i4, r8));
                return Unit.INSTANCE;
            case 15:
                ((C2038e) obj).getClass();
                C7838e c7838e18 = VKXApplication.f36530e;
                if (c7838e18 == null) {
                    c7838e18 = null;
                }
                c7838e18.getClass();
                c7838e18.startapp(new C9754e(i6, i2, r8));
                return Unit.INSTANCE;
            case 16:
                C2038e c2038e6 = (C2038e) obj;
                AbstractC16049e abstractC16049e4 = c2038e6.adcel().vip;
                InterfaceC10136e interfaceC10136e = abstractC16049e4 instanceof InterfaceC10136e ? (InterfaceC10136e) abstractC16049e4 : null;
                if (interfaceC10136e != null) {
                    if (interfaceC10136e.getPurchase()) {
                        new C14875e(c2038e6.adcel().vip, new C9041e(interfaceC10136e, c2038e6, i6), new C13630e(12)).signatures(c2038e6.ad);
                    } else {
                        C7838e c7838e19 = VKXApplication.f36530e;
                        if (c7838e19 == null) {
                            c7838e19 = null;
                        }
                        c7838e19.getClass();
                        c7838e19.startapp(new C13053e(c7838e19, z, (InterfaceC5083e) r8, i5));
                        c2038e6.loadAd(C16875e.ad(c2038e6.mopub(), C0939e.ad(c2038e6.mopub().ad, Boolean.TRUE, null, 95), 0, null, null, null, false, false, false, false, false, null, false, false, 0, 0, 32766));
                    }
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                C2038e c2038e7 = (C2038e) obj;
                AbstractC16049e abstractC16049e5 = c2038e7.adcel().vip;
                InterfaceC16260e interfaceC16260e = abstractC16049e5 instanceof InterfaceC16260e ? (InterfaceC16260e) abstractC16049e5 : null;
                if (interfaceC16260e != null) {
                    if (interfaceC16260e.getInmobi()) {
                        interfaceC16260e.startapp(false);
                        c2038e7.loadAd(C16875e.ad(c2038e7.mopub(), C0939e.ad(c2038e7.mopub().ad, null, Boolean.FALSE, 63), 0, null, null, null, false, false, false, false, false, null, false, false, 0, 0, 32766));
                    } else {
                        interfaceC16260e.startapp(true);
                        C12894e c12894e3 = c2038e7.admob;
                        VKXApplication.Companion companion = VKXApplication.f36531e;
                        c12894e3.loadAd(VKXApplication.Companion.vip(R.string.now_playing_notification_disliked_title), VKXApplication.Companion.vip(R.string.now_playing_notification_disliked_text));
                        C7838e c7838e20 = VKXApplication.f36530e;
                        if (c7838e20 == null) {
                            c7838e20 = null;
                        }
                        c7838e20.getClass();
                        c7838e20.startapp(new C10954e(c7838e20, r8, i3));
                        c2038e7.loadAd(C16875e.ad(c2038e7.mopub(), C0939e.ad(c2038e7.mopub().ad, null, Boolean.TRUE, 63), 0, null, null, null, false, false, false, false, false, null, false, false, 0, 0, 32766));
                    }
                }
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((C1925e) obj).license.invoke();
                return Unit.INSTANCE;
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((C18128e) obj).purchase();
                return Unit.INSTANCE;
            case 20:
                ((C2045e) obj).mo734case();
                return Unit.INSTANCE;
            case 21:
                View view = (View) obj;
                int i8 = Build.VERSION.SDK_INT;
                if (i8 >= 30) {
                    AbstractC5096e.remoteconfig(view);
                }
                if (i8 < 29 || (remoteconfig = AbstractC14204e.remoteconfig(view)) == null) {
                    return null;
                }
                return new C2311e(remoteconfig, view);
            case 22:
                ((C10685e) obj).mo734case();
                return Unit.INSTANCE;
            case 23:
                ((C0038e) obj).purchase();
                return Unit.INSTANCE;
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                ((C5522e) obj).mo1388instanceof();
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                ((C14398e) obj).mo734case();
                return Unit.INSTANCE;
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return ((AbstractC9194e) obj).mo2531throws();
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                ((C1208e) obj).purchase();
                return Unit.INSTANCE;
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                ((C1718e) obj).mo734case();
                return Unit.INSTANCE;
            default:
                ((C11210e) obj).mo734case();
                return Unit.INSTANCE;
        }
    }
}
