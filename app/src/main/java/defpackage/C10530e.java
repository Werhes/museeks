package defpackage;

import android.os.SystemClock;
import android.text.TextUtils;
import androidx.car.app.navigation.model.Maneuver;
import java.io.IOException;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.Locale;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eَٖۛ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10530e implements InterfaceC3190e {
    public static final NumberFormat appmetrica;
    public static final C7364e license = new C7364e(", ");
    public final C11501e ad = new C11501e();
    public final C6158e vip = new C6158e();
    public final long metrica = SystemClock.elapsedRealtime();

    static {
        NumberFormat numberFormat = NumberFormat.getInstance(Locale.US);
        appmetrica = numberFormat;
        numberFormat.setMinimumFractionDigits(2);
        numberFormat.setMaximumFractionDigits(2);
        numberFormat.setGroupingUsed(false);
    }

    /* renamed from: private, reason: not valid java name */
    public static String m2829private(long j) {
        if (j == -9223372036854775807L) {
            return "?";
        }
        return appmetrica.format(((float) j) / 1000.0f);
    }

    /* renamed from: super, reason: not valid java name */
    public static String m2830super(C12268e c12268e) {
        String str;
        String str2;
        ArrayList arrayList = new ArrayList();
        int i = c12268e.f24610e;
        if (i != -1) {
            StringBuilder sb = new StringBuilder("enc=");
            if (i == 30) {
                str2 = "dts-uhd-p2";
            } else if (i == 268435456) {
                str2 = "pcm-16be";
            } else if (i == 1073741824) {
                str2 = "aac-er-bsac";
            } else if (i == 1342177280) {
                str2 = "pcm-24be";
            } else if (i != 1610612736) {
                switch (i) {
                    case 2:
                        str2 = "pcm-16";
                        break;
                    case 3:
                        str2 = "pcm-8";
                        break;
                    case 4:
                        str2 = "pcm-float";
                        break;
                    case 5:
                        str2 = "ac3";
                        break;
                    case 6:
                        str2 = "eac3";
                        break;
                    case 7:
                        str2 = "dts";
                        break;
                    case 8:
                        str2 = "dts-hd";
                        break;
                    case 9:
                        str2 = "mp3";
                        break;
                    case 10:
                        str2 = "aac-lc";
                        break;
                    case 11:
                        str2 = "aac-he-v1";
                        break;
                    case 12:
                        str2 = "aac-he-v2";
                        break;
                    default:
                        switch (i) {
                            case 14:
                                str2 = "truehd";
                                break;
                            case 15:
                                str2 = "aac-eld";
                                break;
                            case 16:
                                str2 = "aac-xhe";
                                break;
                            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                                str2 = "ac4";
                                break;
                            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                                str2 = "eac3-joc";
                                break;
                            default:
                                switch (i) {
                                    case 20:
                                        str2 = "opus";
                                        break;
                                    case 21:
                                        str2 = "pcm-24";
                                        break;
                                    case 22:
                                        str2 = "pcm-32";
                                        break;
                                    default:
                                        str2 = String.valueOf(i);
                                        break;
                                }
                        }
                }
            } else {
                str2 = "pcm-32be";
            }
            sb.append(str2);
            arrayList.add(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder("channelConf=");
        int i2 = c12268e.f24607e;
        switch (i2) {
            case 4:
                str = "mono";
                break;
            case 12:
                str = "stereo";
                break;
            case 204:
                str = "quad";
                break;
            case 252:
                str = "5.1";
                break;
            case 6396:
                str = "7.1";
                break;
            case 737532:
                str = "5.1.4";
                break;
            case 743676:
                str = "7.1.4";
                break;
            case 3145980:
                str = "5.1.2";
                break;
            case 3152124:
                str = "7.1.2";
                break;
            case 202070268:
                str = "9.1.4";
                break;
            case 205215996:
                str = "9.1.6";
                break;
            default:
                str = "0x" + Integer.toHexString(i2);
                break;
        }
        sb2.append(str);
        arrayList.add(sb2.toString());
        arrayList.add("sampleRate=" + c12268e.f24608e);
        arrayList.add("bufferSize=" + c12268e.f24609e);
        if (c12268e.f24606e) {
            arrayList.add("tunneling");
        }
        if (c12268e.f24611e) {
            arrayList.add("offload");
        }
        return license.appmetrica(arrayList);
    }

    @Override // defpackage.InterfaceC3190e
    public final void Signature(C18177e c18177e, C0807e c0807e) {
        m2836transient(c18177e, "upstreamDiscarded", C16975e.metrica(c0807e.metrica));
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: abstract */
    public final void mo1295abstract(C18177e c18177e, C18255e c18255e) {
        C17750e c17750e;
        m2831import("tracks [" + m2835strictfp(c18177e));
        AbstractC17475e abstractC17475e = c18255e.ad;
        for (int i = 0; i < abstractC17475e.size(); i++) {
            C6653e c6653e = (C6653e) abstractC17475e.get(i);
            m2831import("  group [ id=" + c6653e.vip.vip);
            for (int i2 = 0; i2 < c6653e.ad; i2++) {
                String str = c6653e.appmetrica[i2] ? "[X]" : "[ ]";
                String subs = AbstractC9413e.subs(c6653e.license[i2]);
                StringBuilder smaato = AbstractC10257e.smaato("    ", str, " Track:", i2, ", ");
                smaato.append(C16975e.metrica(c6653e.vip.license[i2]));
                smaato.append(", supported=");
                smaato.append(subs);
                m2831import(smaato.toString());
            }
            m2831import("  ]");
        }
        boolean z = false;
        for (int i3 = 0; !z && i3 < abstractC17475e.size(); i3++) {
            C6653e c6653e2 = (C6653e) abstractC17475e.get(i3);
            for (int i4 = 0; !z && i4 < c6653e2.ad; i4++) {
                if (c6653e2.appmetrica[i4] && (c17750e = c6653e2.vip.license[i4].advert) != null && c17750e.ad.length > 0) {
                    m2831import("  Metadata [");
                    m2832instanceof(c17750e, "    ");
                    m2831import("  ]");
                    z = true;
                }
            }
        }
        m2831import("]");
    }

    @Override // defpackage.InterfaceC3190e
    public final void ad(C18177e c18177e, boolean z) {
        m2836transient(c18177e, "shuffleModeEnabled", Boolean.toString(z));
    }

    @Override // defpackage.InterfaceC3190e
    public final void adcel(C18177e c18177e, Object obj) {
        m2836transient(c18177e, "renderedFirstFrame", String.valueOf(obj));
    }

    @Override // defpackage.InterfaceC3190e
    public final void admob(C18177e c18177e, int i, int i2) {
        m2836transient(c18177e, "surfaceSize", AbstractC1786e.Signature(i, i2, "w=", ", h="));
    }

    @Override // defpackage.InterfaceC3190e
    public final void ads(C18177e c18177e, String str) {
        m2836transient(c18177e, "videoDecoderReleased", str);
    }

    @Override // defpackage.InterfaceC3190e
    public final void advert(C18177e c18177e, int i) {
        m2836transient(c18177e, "droppedFrames", Integer.toString(i));
    }

    @Override // defpackage.InterfaceC3190e
    public final void amazon(C18177e c18177e, C17750e c17750e) {
        m2831import("metadata [" + m2835strictfp(c18177e));
        m2832instanceof(c17750e, "  ");
        m2831import("]");
    }

    @Override // defpackage.InterfaceC3190e
    public final void applovin(C18177e c18177e, int i) {
        StringBuilder sb = new StringBuilder("mediaItem [");
        sb.append(m2835strictfp(c18177e));
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? i != 2 ? i != 3 ? "?" : "PLAYLIST_CHANGED" : "SEEK" : "AUTO" : "REPEAT");
        sb.append("]");
        m2831import(sb.toString());
    }

    @Override // defpackage.InterfaceC3190e
    public final void appmetrica(C18177e c18177e, boolean z) {
        m2836transient(c18177e, "skipSilenceEnabled", Boolean.toString(z));
    }

    @Override // defpackage.InterfaceC3190e
    public final void billing(C18177e c18177e, String str) {
        m2836transient(c18177e, "audioDecoderInitialized", str);
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: break */
    public final void mo1296break(C18177e c18177e, boolean z) {
        m2836transient(c18177e, "loading", Boolean.toString(z));
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: case */
    public final void mo1297case(C18177e c18177e, int i) {
        m2836transient(c18177e, "playbackSuppressionReason", i != 0 ? i != 1 ? i != 3 ? i != 4 ? "?" : "SCRUBBING" : "UNSUITABLE_AUDIO_OUTPUT" : "TRANSIENT_AUDIO_FOCUS_LOSS" : "NONE");
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: catch */
    public final void mo1298catch(C18177e c18177e) {
        m2834package(c18177e, "drmKeysRestored");
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: class */
    public final void mo1299class(C18177e c18177e, int i) {
        m2836transient(c18177e, "audioSessionId", Integer.toString(i));
    }

    @Override // defpackage.InterfaceC3190e
    public final void crashlytics(C18177e c18177e) {
        m2834package(c18177e, "audioEnabled");
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: default */
    public final void mo1300default(C18177e c18177e, Exception exc) {
        AbstractC2803e.purchase("VkxM3EL", m2833new(c18177e, "internalError", "drmSessionManagerError", exc));
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: extends */
    public final void mo1301extends(C18177e c18177e, C11387e c11387e) {
        m2834package(c18177e, "videoDisabled");
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: final */
    public final void mo1302final(C18177e c18177e, C8256e c8256e) {
        AbstractC2803e.purchase("VkxM3EL", m2833new(c18177e, "playerFailed", null, c8256e));
    }

    @Override // defpackage.InterfaceC3190e
    public final void firebase(C18177e c18177e, int i) {
        m2836transient(c18177e, "drmSessionAcquired", "state=" + i);
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: goto */
    public final /* synthetic */ void mo1303goto(int i, long j, C18177e c18177e) {
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: implements */
    public final void mo1304implements(C18177e c18177e, int i, boolean z) {
        StringBuilder sb = new StringBuilder();
        sb.append(z);
        sb.append(", ");
        sb.append(i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? "?" : "END_OF_MEDIA_ITEM" : "REMOTE" : "AUDIO_BECOMING_NOISY" : "AUDIO_FOCUS_LOSS" : "USER_REQUEST");
        m2836transient(c18177e, "playWhenReady", sb.toString());
    }

    /* renamed from: import, reason: not valid java name */
    public final void m2831import(String str) {
        AbstractC2803e.license("VkxM3EL", str);
    }

    @Override // defpackage.InterfaceC3190e
    public final void inmobi(C18177e c18177e, C16975e c16975e) {
        m2836transient(c18177e, "videoInputFormat", C16975e.metrica(c16975e));
    }

    /* renamed from: instanceof, reason: not valid java name */
    public final void m2832instanceof(C17750e c17750e, String str) {
        for (int i = 0; i < c17750e.ad.length; i++) {
            StringBuilder inmobi = AbstractC8703e.inmobi(str);
            inmobi.append(c17750e.ad[i]);
            m2831import(inmobi.toString());
        }
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: interface */
    public final void mo1305interface(C18177e c18177e) {
        m2834package(c18177e, "audioDisabled");
    }

    @Override // defpackage.InterfaceC3190e
    public final void isPro(C18177e c18177e, int i) {
        m2836transient(c18177e, "droppedSeeksWhileScrubbing", Integer.toString(i));
    }

    @Override // defpackage.InterfaceC3190e
    public final void isVip(C18177e c18177e, int i) {
        AbstractC6690e abstractC6690e = c18177e.vip;
        int yandex = abstractC6690e.yandex();
        int loadAd = abstractC6690e.loadAd();
        StringBuilder sb = new StringBuilder("timeline [");
        sb.append(m2835strictfp(c18177e));
        sb.append(", periodCount=");
        sb.append(yandex);
        sb.append(", windowCount=");
        sb.append(loadAd);
        sb.append(", reason=");
        sb.append(i != 0 ? i != 1 ? "?" : "SOURCE_UPDATE" : "PLAYLIST_CHANGED");
        m2831import(sb.toString());
        for (int i2 = 0; i2 < Math.min(yandex, 3); i2++) {
            C6158e c6158e = this.vip;
            abstractC6690e.purchase(i2, c6158e, false);
            m2831import("  period [" + m2829private(AbstractC9413e.m2567switch(c6158e.license)) + "]");
        }
        if (yandex > 3) {
            m2831import("  ...");
        }
        for (int i3 = 0; i3 < Math.min(loadAd, 3); i3++) {
            C11501e c11501e = this.ad;
            abstractC6690e.amazon(i3, c11501e);
            m2831import("  window [" + m2829private(AbstractC9413e.m2567switch(c11501e.smaato)) + ", seekable=" + c11501e.yandex + ", dynamic=" + c11501e.startapp + "]");
        }
        if (loadAd > 3) {
            m2831import("  ...");
        }
        m2831import("]");
    }

    @Override // defpackage.InterfaceC3190e
    public final void license(C18177e c18177e, String str) {
        m2836transient(c18177e, "audioDecoderReleased", str);
    }

    @Override // defpackage.InterfaceC3190e
    public final void loadAd(C18177e c18177e, C16975e c16975e) {
        m2836transient(c18177e, "audioInputFormat", C16975e.metrica(c16975e));
    }

    @Override // defpackage.InterfaceC3190e
    public final void metrica(C18177e c18177e, boolean z) {
        m2836transient(c18177e, "isPlaying", Boolean.toString(z));
    }

    @Override // defpackage.InterfaceC3190e
    public final void mopub(C18177e c18177e, long j) {
        m2836transient(c18177e, "audioPositionAdvancing", "since " + m2829private((SystemClock.elapsedRealtime() + (j - System.currentTimeMillis())) - this.metrica));
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: native */
    public final void mo1306native(C18177e c18177e, int i, long j, long j2) {
        AbstractC2803e.purchase("VkxM3EL", m2833new(c18177e, "audioTrackUnderrun", i + ", " + j + ", " + j2, null));
    }

    /* renamed from: new, reason: not valid java name */
    public final String m2833new(C18177e c18177e, String str, String str2, Throwable th) {
        StringBuilder isPro = AbstractC8703e.isPro(str, " [");
        isPro.append(m2835strictfp(c18177e));
        String sb = isPro.toString();
        if (th instanceof C8256e) {
            StringBuilder isPro2 = AbstractC8703e.isPro(sb, ", errorCode=");
            isPro2.append(((C8256e) th).vip());
            sb = isPro2.toString();
        }
        if (str2 != null) {
            sb = AbstractC4653e.isPro(sb, ", ", str2);
        }
        String adcel = AbstractC2803e.adcel(th);
        if (!TextUtils.isEmpty(adcel)) {
            StringBuilder isPro3 = AbstractC8703e.isPro(sb, "\n  ");
            isPro3.append(adcel.replace("\n", "\n  "));
            isPro3.append('\n');
            sb = isPro3.toString();
        }
        return AbstractC10257e.adcel(sb, "]");
    }

    /* renamed from: package, reason: not valid java name */
    public final void m2834package(C18177e c18177e, String str) {
        m2831import(m2833new(c18177e, str, null, null));
    }

    @Override // defpackage.InterfaceC3190e
    public final void premium(C18177e c18177e, C12268e c12268e) {
        m2836transient(c18177e, "audioTrackReleased", m2830super(c12268e));
    }

    @Override // defpackage.InterfaceC3190e
    public final void pro(C18177e c18177e, C12268e c12268e) {
        m2836transient(c18177e, "audioTrackInit", m2830super(c12268e));
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: protected */
    public final void mo1307protected(C18177e c18177e, String str) {
        m2836transient(c18177e, "videoDecoderInitialized", str);
    }

    @Override // defpackage.InterfaceC3190e
    public final void purchase(C18177e c18177e, C4194e c4194e) {
        m2836transient(c18177e, "playbackParameters", c4194e.toString());
    }

    @Override // defpackage.InterfaceC3190e
    public final void remoteconfig(C18177e c18177e, C3335e c3335e) {
        m2836transient(c18177e, "audioAttributes", c3335e.ad + "," + c3335e.vip + "," + c3335e.metrica + "," + c3335e.license);
    }

    @Override // defpackage.InterfaceC3190e
    public final void signatures(C18177e c18177e) {
        m2834package(c18177e, "videoEnabled");
    }

    @Override // defpackage.InterfaceC3190e
    public final /* synthetic */ void smaato(InterfaceC16843e interfaceC16843e, C18540e c18540e) {
    }

    @Override // defpackage.InterfaceC3190e
    public final void startapp(C18177e c18177e, int i) {
        m2836transient(c18177e, "state", i != 1 ? i != 2 ? i != 3 ? i != 4 ? "?" : "ENDED" : "READY" : "BUFFERING" : "IDLE");
    }

    /* renamed from: strictfp, reason: not valid java name */
    public final String m2835strictfp(C18177e c18177e) {
        String str = "window=" + c18177e.metrica;
        C18208e c18208e = c18177e.license;
        if (c18208e != null) {
            StringBuilder isPro = AbstractC8703e.isPro(str, ", period=");
            isPro.append(c18177e.vip.vip(c18208e.ad));
            str = isPro.toString();
            if (c18208e.vip()) {
                StringBuilder isPro2 = AbstractC8703e.isPro(str, ", adGroup=");
                isPro2.append(c18208e.vip);
                StringBuilder isPro3 = AbstractC8703e.isPro(isPro2.toString(), ", ad=");
                isPro3.append(c18208e.metrica);
                str = isPro3.toString();
            }
        }
        return "eventTime=" + m2829private(c18177e.ad - this.metrica) + ", mediaPos=" + m2829private(c18177e.appmetrica) + ", " + str;
    }

    @Override // defpackage.InterfaceC3190e
    public final void subs(C18177e c18177e, int i, int i2, boolean z) {
        StringBuilder premium = AbstractC4653e.premium("rendererIndex=", i, ", ");
        premium.append(AbstractC9413e.m2558native(i2));
        premium.append(", ");
        premium.append(z);
        m2836transient(c18177e, "rendererReady", premium.toString());
    }

    @Override // defpackage.InterfaceC3190e
    public final void subscription(C18177e c18177e, int i) {
        m2836transient(c18177e, "repeatMode", i != 0 ? i != 1 ? i != 2 ? "?" : "ALL" : "ONE" : "OFF");
    }

    @Override // defpackage.InterfaceC3190e
    public final void tapsense(C18177e c18177e, C2351e c2351e) {
        StringBuilder sb = new StringBuilder("w=" + c2351e.ad + ", h=" + c2351e.vip);
        float f = c2351e.metrica;
        if (f != 1.0f) {
            sb.append(", par=");
            sb.append(f);
        }
        m2836transient(c18177e, "videoSize", sb.toString());
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: this */
    public final void mo1308this(C18177e c18177e, float f) {
        m2836transient(c18177e, "volume", Float.toString(f));
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: throw */
    public final void mo1309throw(int i, C18177e c18177e, C0101e c0101e, C0101e c0101e2) {
        String str;
        StringBuilder sb = new StringBuilder("reason=");
        switch (i) {
            case 0:
                str = "AUTO_TRANSITION";
                break;
            case 1:
                str = "SEEK";
                break;
            case 2:
                str = "SEEK_ADJUSTMENT";
                break;
            case 3:
                str = "SKIP";
                break;
            case 4:
                str = "REMOVE";
                break;
            case 5:
                str = "INTERNAL";
                break;
            case 6:
                str = "SILENCE_SKIP";
                break;
            default:
                str = "?";
                break;
        }
        sb.append(str);
        sb.append(", PositionInfo:old [");
        sb.append(c0101e);
        sb.append("], PositionInfo:new [");
        sb.append(c0101e2);
        sb.append("]");
        m2836transient(c18177e, "positionDiscontinuity", sb.toString());
    }

    /* renamed from: transient, reason: not valid java name */
    public final void m2836transient(C18177e c18177e, String str, String str2) {
        m2831import(m2833new(c18177e, str, str2, null));
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: try */
    public final void mo1310try(C18177e c18177e) {
        m2834package(c18177e, "drmSessionReleased");
    }

    @Override // defpackage.InterfaceC3190e
    public final void vip(C18177e c18177e) {
        m2834package(c18177e, "drmKeysLoaded");
    }

    @Override // defpackage.InterfaceC3190e
    /* renamed from: while */
    public final void mo1311while(C18177e c18177e, C0807e c0807e) {
        m2836transient(c18177e, "downstreamFormat", C16975e.metrica(c0807e.metrica));
    }

    @Override // defpackage.InterfaceC3190e
    public final void yandex(C18177e c18177e, C0807e c0807e, IOException iOException) {
        AbstractC2803e.purchase("VkxM3EL", m2833new(c18177e, "internalError", "loadError", iOException));
    }
}
