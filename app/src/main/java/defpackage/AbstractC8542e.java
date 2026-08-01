package defpackage;

import android.text.TextUtils;
import androidx.car.app.hardware.common.CarZone;
import androidx.car.app.hardware.info.EnergyProfile;
import androidx.car.app.navigation.model.Maneuver;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌؚؚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC8542e {
    public static final ArrayList ad = new ArrayList();
    public static final Pattern vip = Pattern.compile("^mp4a\\.([a-zA-Z0-9]{2})(?:\\.([0-9]{1,2}))?$");

    public static boolean ad(String str, String str2) {
        C12434e purchase;
        int ad2;
        if (str == null) {
            return false;
        }
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1354451219:
                if (str.equals("application/vnd.dvb.ait")) {
                    c = 1;
                    break;
                }
                break;
            case -1348231605:
                if (str.equals("application/x-icy")) {
                    c = 2;
                    break;
                }
                break;
            case -1265048566:
                if (str.equals("application/x-camera-motion")) {
                    c = 3;
                    break;
                }
                break;
            case -1248341703:
                if (str.equals("application/id3")) {
                    c = 4;
                    break;
                }
                break;
            case -432837260:
                if (str.equals("audio/mpeg-L1")) {
                    c = 5;
                    break;
                }
                break;
            case -432837259:
                if (str.equals("audio/mpeg-L2")) {
                    c = 6;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 7;
                    break;
                }
                break;
            case -43764892:
                if (str.equals("application/meta")) {
                    c = '\b';
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = '\t';
                    break;
                }
                break;
            case 187094639:
                if (str.equals("audio/raw")) {
                    c = '\n';
                    break;
                }
                break;
            case 469933706:
                if (str.equals("application/x-media3-cues")) {
                    c = 11;
                    break;
                }
                break;
            case 1054472807:
                if (str.equals("application/x-itut-t35")) {
                    c = '\f';
                    break;
                }
                break;
            case 1154383568:
                if (str.equals("application/x-emsg")) {
                    c = '\r';
                    break;
                }
                break;
            case 1331836563:
                if (str.equals("video/apv")) {
                    c = 14;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = 15;
                    break;
                }
                break;
            case 1504619009:
                if (str.equals("audio/flac")) {
                    c = 16;
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = 17;
                    break;
                }
                break;
            case 1652648887:
                if (str.equals("application/x-scte35")) {
                    c = 18;
                    break;
                }
                break;
            case 1903231877:
                if (str.equals("audio/g711-alaw")) {
                    c = 19;
                    break;
                }
                break;
            case 1903589369:
                if (str.equals("audio/g711-mlaw")) {
                    c = 20;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case '\b':
            case '\t':
            case '\n':
            case 11:
            case '\f':
            case '\r':
            case 14:
            case 15:
            case 16:
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            case 20:
                return true;
            case 7:
                return (str2 == null || (purchase = purchase(str2)) == null || (ad2 = purchase.ad()) == 0 || ad2 == 16) ? false : true;
            default:
                return false;
        }
    }

    public static boolean adcel(String str, String str2) {
        if (str == null) {
            return false;
        }
        if (str.startsWith("dvhe") || str.startsWith("dvh1") || str.startsWith("dav1")) {
            return true;
        }
        if (str2 == null) {
            return false;
        }
        return (str2.startsWith("dvhe") && str.startsWith("hev1")) || (str2.startsWith("dvh1") && str.startsWith("hvc1")) || ((str2.startsWith("dvav") && str.startsWith("avc3")) || ((str2.startsWith("dva1") && str.startsWith("avc1")) || (str2.startsWith("dav1") && str.startsWith("av01"))));
    }

    public static boolean advert(String str) {
        return "text".equals(billing(str)) || "application/x-media3-cues".equals(str) || "application/cea-608".equals(str) || "application/cea-708".equals(str) || "application/x-mp4-cea-608".equals(str) || "application/x-subrip".equals(str) || "application/ttml+xml".equals(str) || "application/x-quicktime-tx3g".equals(str) || "application/x-mp4-vtt".equals(str) || "application/x-rawcc".equals(str) || "application/vobsub".equals(str) || "application/pgs".equals(str) || "application/dvbsubs".equals(str);
    }

    public static String amazon(String str) {
        if (str == null) {
            return null;
        }
        String tapsense = AbstractC3628e.tapsense(str);
        tapsense.getClass();
        char c = 65535;
        switch (tapsense.hashCode()) {
            case -1833600100:
                if (tapsense.equals("video/x-mvhevc")) {
                    c = 0;
                    break;
                }
                break;
            case -1007807498:
                if (tapsense.equals("audio/x-flac")) {
                    c = 1;
                    break;
                }
                break;
            case -979095690:
                if (tapsense.equals("application/x-mpegurl")) {
                    c = 2;
                    break;
                }
                break;
            case -586683234:
                if (tapsense.equals("audio/x-wav")) {
                    c = 3;
                    break;
                }
                break;
            case -432836268:
                if (tapsense.equals("audio/mpeg-l1")) {
                    c = 4;
                    break;
                }
                break;
            case -432836267:
                if (tapsense.equals("audio/mpeg-l2")) {
                    c = 5;
                    break;
                }
                break;
            case 187090231:
                if (tapsense.equals("audio/mp3")) {
                    c = 6;
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return "video/mv-hevc";
            case 1:
                return "audio/flac";
            case 2:
                return "application/x-mpegURL";
            case 3:
                return "audio/wav";
            case 4:
                return "audio/mpeg-L1";
            case 5:
                return "audio/mpeg-L2";
            case 6:
                return "audio/mpeg";
            default:
                return tapsense;
        }
    }

    public static String appmetrica(int i) {
        if (i == 32) {
            return "video/mp4v-es";
        }
        if (i == 33) {
            return "video/avc";
        }
        if (i == 35) {
            return "video/hevc";
        }
        if (i == 64) {
            return "audio/mp4a-latm";
        }
        if (i == 163) {
            return "video/wvc1";
        }
        if (i == 177) {
            return "video/x-vnd.on2.vp9";
        }
        if (i == 221) {
            return "audio/vorbis";
        }
        if (i == 165) {
            return "audio/ac3";
        }
        if (i == 166) {
            return "audio/eac3";
        }
        switch (i) {
            case CarZone.CAR_ZONE_COLUMN_PASSENGER /* 96 */:
            case 97:
            case 98:
            case 99:
            case 100:
            case EnergyProfile.EVCONNECTOR_TYPE_OTHER /* 101 */:
                return "video/mpeg2";
            case 102:
            case 103:
            case 104:
                return "audio/mp4a-latm";
            case 105:
            case 107:
                return "audio/mpeg";
            case 106:
                return "video/mpeg";
            case 108:
                return "image/jpeg";
            default:
                switch (i) {
                    case 169:
                    case 172:
                        return "audio/vnd.dts";
                    case 170:
                    case 171:
                        return "audio/vnd.dts.hd";
                    case 173:
                        return "audio/opus";
                    case 174:
                        return "audio/ac4";
                    default:
                        return null;
                }
        }
    }

    public static String billing(String str) {
        int indexOf;
        if (str == null || (indexOf = str.indexOf(47)) == -1) {
            return null;
        }
        return str.substring(0, indexOf);
    }

    public static String license(String str) {
        C12434e purchase;
        String str2 = null;
        if (str != null) {
            String tapsense = AbstractC3628e.tapsense(str.trim());
            if (tapsense.startsWith("avc1") || tapsense.startsWith("avc3")) {
                return "video/avc";
            }
            if (tapsense.startsWith("hev1") || tapsense.startsWith("hvc1")) {
                return "video/hevc";
            }
            if (tapsense.startsWith("vvc1") || tapsense.startsWith("vvi1")) {
                return "video/vvc";
            }
            if (tapsense.startsWith("dvav") || tapsense.startsWith("dva1") || tapsense.startsWith("dvhe") || tapsense.startsWith("dvh1") || tapsense.startsWith("dav1")) {
                return "video/dolby-vision";
            }
            if (tapsense.startsWith("av01")) {
                return "video/av01";
            }
            if (tapsense.startsWith("vp9") || tapsense.startsWith("vp09")) {
                return "video/x-vnd.on2.vp9";
            }
            if (tapsense.startsWith("vp8") || tapsense.startsWith("vp08")) {
                return "video/x-vnd.on2.vp8";
            }
            if (tapsense.startsWith("mp4a")) {
                if (tapsense.startsWith("mp4a.") && (purchase = purchase(tapsense)) != null) {
                    str2 = appmetrica(purchase.f24874e);
                }
                return str2 == null ? "audio/mp4a-latm" : str2;
            }
            if (tapsense.startsWith("mha1")) {
                return "audio/mha1";
            }
            if (tapsense.startsWith("mhm1")) {
                return "audio/mhm1";
            }
            if (tapsense.startsWith("ac-3") || tapsense.startsWith("dac3")) {
                return "audio/ac3";
            }
            if (tapsense.startsWith("ec-3") || tapsense.startsWith("dec3")) {
                return "audio/eac3";
            }
            if (tapsense.startsWith("ec+3")) {
                return "audio/eac3-joc";
            }
            if (tapsense.startsWith("ac-4") || tapsense.startsWith("dac4")) {
                return "audio/ac4";
            }
            if (tapsense.startsWith("dtsc")) {
                return "audio/vnd.dts";
            }
            if (tapsense.startsWith("dtse")) {
                return "audio/vnd.dts.hd;profile=lbr";
            }
            if (tapsense.startsWith("dtsh") || tapsense.startsWith("dtsl")) {
                return "audio/vnd.dts.hd";
            }
            if (tapsense.startsWith("dtsx")) {
                return "audio/vnd.dts.uhd;profile=p2";
            }
            if (tapsense.startsWith("opus")) {
                return "audio/opus";
            }
            if (tapsense.startsWith("vorbis")) {
                return "audio/vorbis";
            }
            if (tapsense.startsWith("flac")) {
                return "audio/flac";
            }
            if (tapsense.startsWith("stpp")) {
                return "application/ttml+xml";
            }
            if (tapsense.startsWith("wvtt")) {
                return "text/vtt";
            }
            if (tapsense.contains("cea708")) {
                return "application/cea-708";
            }
            if (tapsense.contains("eia608") || tapsense.contains("cea608")) {
                return "application/cea-608";
            }
            ArrayList arrayList = ad;
            if (arrayList.size() > 0) {
                arrayList.get(0).getClass();
                throw new ClassCastException();
            }
        }
        return null;
    }

    public static int metrica(String str, String str2) {
        C12434e purchase;
        str.getClass();
        char c = 65535;
        switch (str.hashCode()) {
            case -2123537834:
                if (str.equals("audio/eac3-joc")) {
                    c = 0;
                    break;
                }
                break;
            case -1365340241:
                if (str.equals("audio/vnd.dts.hd;profile=lbr")) {
                    c = 1;
                    break;
                }
                break;
            case -1095064472:
                if (str.equals("audio/vnd.dts")) {
                    c = 2;
                    break;
                }
                break;
            case -53558318:
                if (str.equals("audio/mp4a-latm")) {
                    c = 3;
                    break;
                }
                break;
            case 187078296:
                if (str.equals("audio/ac3")) {
                    c = 4;
                    break;
                }
                break;
            case 187078297:
                if (str.equals("audio/ac4")) {
                    c = 5;
                    break;
                }
                break;
            case 187081724:
                if (str.equals("audio/dsd")) {
                    c = 6;
                    break;
                }
                break;
            case 550520934:
                if (str.equals("audio/vnd.dts.uhd;profile=p2")) {
                    c = 7;
                    break;
                }
                break;
            case 1504578661:
                if (str.equals("audio/eac3")) {
                    c = '\b';
                    break;
                }
                break;
            case 1504831518:
                if (str.equals("audio/mpeg")) {
                    c = '\t';
                    break;
                }
                break;
            case 1504891608:
                if (str.equals("audio/opus")) {
                    c = '\n';
                    break;
                }
                break;
            case 1505942594:
                if (str.equals("audio/vnd.dts.hd")) {
                    c = 11;
                    break;
                }
                break;
            case 1556697186:
                if (str.equals("audio/true-hd")) {
                    c = '\f';
                    break;
                }
                break;
        }
        switch (c) {
            case 0:
                return 18;
            case 1:
                return 8;
            case 2:
                return 7;
            case 3:
                if (str2 == null || (purchase = purchase(str2)) == null) {
                    return 0;
                }
                return purchase.ad();
            case 4:
                return 5;
            case 5:
                return 17;
            case 6:
                return 31;
            case 7:
                return 30;
            case '\b':
                return 6;
            case '\t':
                return 9;
            case '\n':
                return 20;
            case 11:
                return 8;
            case '\f':
                return 14;
            default:
                return 0;
        }
    }

    public static boolean mopub(String str) {
        return "image".equals(billing(str)) || "application/x-image-uri".equals(str);
    }

    public static C12434e purchase(String str) {
        Matcher matcher = vip.matcher(str);
        if (!matcher.matches()) {
            return null;
        }
        String group = matcher.group(1);
        group.getClass();
        String group2 = matcher.group(2);
        try {
            return new C12434e(Integer.parseInt(group, 16), group2 != null ? Integer.parseInt(group2) : 0, 5);
        } catch (NumberFormatException unused) {
            return null;
        }
    }

    public static boolean smaato(String str) {
        return "video".equals(billing(str));
    }

    public static boolean startapp(String str) {
        return "audio".equals(billing(str));
    }

    public static String vip(String str, String str2) {
        if (str != null && str2 != null) {
            String[] m2568synchronized = AbstractC9413e.m2568synchronized(str);
            StringBuilder sb = new StringBuilder();
            for (String str3 : m2568synchronized) {
                if (str2.equals(license(str3))) {
                    if (sb.length() > 0) {
                        sb.append(",");
                    }
                    sb.append(str3);
                }
            }
            if (sb.length() > 0) {
                return sb.toString();
            }
        }
        return null;
    }

    public static int yandex(String str) {
        if (TextUtils.isEmpty(str)) {
            return -1;
        }
        if (startapp(str)) {
            return 1;
        }
        if (smaato(str)) {
            return 2;
        }
        if (advert(str)) {
            return 3;
        }
        if (mopub(str)) {
            return 4;
        }
        if ("application/id3".equals(str) || "application/x-emsg".equals(str) || "application/x-scte35".equals(str) || "application/x-icy".equals(str) || "application/vnd.dvb.ait".equals(str) || "application/meta".equals(str) || "application/x-itut-t35".equals(str)) {
            return 5;
        }
        if ("application/x-camera-motion".equals(str)) {
            return 6;
        }
        ArrayList arrayList = ad;
        if (arrayList.size() <= 0) {
            return -1;
        }
        arrayList.get(0).getClass();
        throw new ClassCastException();
    }
}
