package defpackage;

import android.util.Base64;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;
import java.util.UUID;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٔ٘ٔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C14778e implements InterfaceC17431e {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public final C9144e f29306e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public final C5833e f29307e;

    /* renamed from: eًؔؐ, reason: contains not printable characters */
    public static final Pattern f29236e = Pattern.compile("AVERAGE-BANDWIDTH=(\\d+)\\b");

    /* renamed from: eؙِٖ, reason: contains not printable characters */
    public static final Pattern f29279e = Pattern.compile("VIDEO=\"((?:.|\f)+?)\"");

    /* renamed from: eّؑؑ, reason: contains not printable characters */
    public static final Pattern f29228e = Pattern.compile("AUDIO=\"((?:.|\f)+?)\"");

    /* renamed from: eٗۚۖ, reason: contains not printable characters */
    public static final Pattern f29300e = Pattern.compile("SUBTITLES=\"((?:.|\f)+?)\"");

    /* renamed from: eؘَٗ, reason: contains not printable characters */
    public static final Pattern f29299e = Pattern.compile("CLOSED-CAPTIONS=\"((?:.|\f)+?)\"");

    /* renamed from: eٌٍٚ, reason: contains not printable characters */
    public static final Pattern f29263e = Pattern.compile("[^-]BANDWIDTH=(\\d+)\\b");

    /* renamed from: eّٕۜ, reason: contains not printable characters */
    public static final Pattern f29287e = Pattern.compile("CHANNELS=\"((?:.|\f)+?)\"");

    /* renamed from: eؙؔٞ, reason: contains not printable characters */
    public static final Pattern f29237e = Pattern.compile("VIDEO-RANGE=(SDR|PQ|HLG)");

    /* renamed from: eٍۗۛ, reason: contains not printable characters */
    public static final Pattern f29269e = Pattern.compile("CODECS=\"((?:.|\f)+?)\"");

    /* renamed from: eٕؓۥ, reason: contains not printable characters */
    public static final Pattern f29234e = Pattern.compile("SUPPLEMENTAL-CODECS=\"((?:.|\f)+?)\"");

    /* renamed from: eٕؒۙ, reason: contains not printable characters */
    public static final Pattern f29232e = Pattern.compile("RESOLUTION=(\\d+x\\d+)");

    /* renamed from: eَؕ۟, reason: contains not printable characters */
    public static final Pattern f29240e = Pattern.compile("FRAME-RATE=([\\d\\.]+)\\b");

    /* renamed from: eؚٕؒ, reason: contains not printable characters */
    public static final Pattern f29256e = Pattern.compile("PATHWAY-ID=\"((?:.|\f)+?)\"");

    /* renamed from: eًؕۙ, reason: contains not printable characters */
    public static final Pattern f29258e = Pattern.compile("STABLE-VARIANT-ID=\"((?:.|\f)+?)\"");

    /* renamed from: eؙِۛ, reason: contains not printable characters */
    public static final Pattern f29255e = Pattern.compile("STABLE-RENDITION-ID=\"((?:.|\f)+?)\"");

    /* renamed from: eٍؗٚ, reason: contains not printable characters */
    public static final Pattern f29248e = Pattern.compile("#EXT-X-TARGETDURATION:(\\d+)\\b");

    /* renamed from: eٍُٝ, reason: contains not printable characters */
    public static final Pattern f29276e = Pattern.compile("DURATION=([\\d\\.]+)\\b");

    /* renamed from: eٗۥۚ, reason: contains not printable characters */
    public static final Pattern f29302e = Pattern.compile("[:,]DURATION=([\\d\\.]+)\\b");

    /* renamed from: eؙؕ, reason: contains not printable characters */
    public static final Pattern f29239e = Pattern.compile("PART-TARGET=([\\d\\.]+)\\b");

    /* renamed from: eَٕٞ, reason: contains not printable characters */
    public static final Pattern f29271e = Pattern.compile("#EXT-X-VERSION:(\\d+)\\b");

    /* renamed from: eّٜۦ, reason: contains not printable characters */
    public static final Pattern f29286e = Pattern.compile("#EXT-X-PLAYLIST-TYPE:(.+)\\b");

    /* renamed from: eْٖٓ, reason: contains not printable characters */
    public static final Pattern f29290e = Pattern.compile("CAN-SKIP-UNTIL=([\\d\\.]+)\\b");

    /* renamed from: eَؖٗ, reason: contains not printable characters */
    public static final Pattern f29270e = ad("CAN-SKIP-DATERANGES");

    /* renamed from: eٍٍٜ, reason: contains not printable characters */
    public static final Pattern f29265e = Pattern.compile("SKIPPED-SEGMENTS=(\\d+)\\b");

    /* renamed from: eٍٖۥ, reason: contains not printable characters */
    public static final Pattern f29266e = Pattern.compile("[:|,]HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: eُٛۜ, reason: contains not printable characters */
    public static final Pattern f29275e = Pattern.compile("PART-HOLD-BACK=([\\d\\.]+)\\b");

    /* renamed from: eًۛٝ, reason: contains not printable characters */
    public static final Pattern f29262e = ad("CAN-BLOCK-RELOAD");

    /* renamed from: eؘؖؑ, reason: contains not printable characters */
    public static final Pattern f29253e = Pattern.compile("#EXT-X-MEDIA-SEQUENCE:(\\d+)\\b");

    /* renamed from: eَۦۥ, reason: contains not printable characters */
    public static final Pattern f29273e = Pattern.compile("#EXTINF:([\\d\\.]+)\\b");

    /* renamed from: eؘؑۦ, reason: contains not printable characters */
    public static final Pattern f29251e = Pattern.compile("#EXTINF:[\\d\\.]+\\b,(.+)");

    /* renamed from: eؘِْ, reason: contains not printable characters */
    public static final Pattern f29278e = Pattern.compile("LAST-MSN=(\\d+)\\b");

    /* renamed from: eُِٔ, reason: contains not printable characters */
    public static final Pattern f29274e = Pattern.compile("LAST-PART=(\\d+)\\b");

    /* renamed from: eؚۚۦ, reason: contains not printable characters */
    public static final Pattern f29257e = Pattern.compile("TIME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: eَٔٞ, reason: contains not printable characters */
    public static final Pattern f29294e = Pattern.compile("#EXT-X-BYTERANGE:(\\d+(?:@\\d+)?)\\b");

    /* renamed from: eّٖٗ, reason: contains not printable characters */
    public static final Pattern f29298e = Pattern.compile("BYTERANGE=\"(\\d+(?:@\\d+)?)\\b\"");

    /* renamed from: eٖٕٚ, reason: contains not printable characters */
    public static final Pattern f29297e = Pattern.compile("BYTERANGE-START=(\\d+)\\b");

    /* renamed from: eّؑۛ, reason: contains not printable characters */
    public static final Pattern f29230e = Pattern.compile("BYTERANGE-LENGTH=(\\d+)\\b");

    /* renamed from: eٖؗۘ, reason: contains not printable characters */
    public static final Pattern f29249e = Pattern.compile("METHOD=(NONE|AES-128|SAMPLE-AES|SAMPLE-AES-CENC|SAMPLE-AES-CTR)\\s*(?:,|$)");

    /* renamed from: eًؚْ, reason: contains not printable characters */
    public static final Pattern f29260e = Pattern.compile("KEYFORMAT=\"((?:.|\f)+?)\"");

    /* renamed from: eؙٚؑ, reason: contains not printable characters */
    public static final Pattern f29254e = Pattern.compile("KEYFORMATVERSIONS=\"((?:.|\f)+?)\"");

    /* renamed from: eَٖؑ, reason: contains not printable characters */
    public static final Pattern f29296e = Pattern.compile("URI=\"((?:.|\f)+?)\"");

    /* renamed from: eُِۤ, reason: contains not printable characters */
    public static final Pattern f29283e = Pattern.compile("IV=([^,.*]+)");

    /* renamed from: eؚؚْ, reason: contains not printable characters */
    public static final Pattern f29289e = Pattern.compile("TYPE=(AUDIO|VIDEO|SUBTITLES|CLOSED-CAPTIONS)");

    /* renamed from: eًٜ٘, reason: contains not printable characters */
    public static final Pattern f29304e = Pattern.compile("TYPE=(PART|MAP)");

    /* renamed from: eِۢٔ, reason: contains not printable characters */
    public static final Pattern f29282e = Pattern.compile("LANGUAGE=\"((?:.|\f)+?)\"");

    /* renamed from: eًؕ۟, reason: contains not printable characters */
    public static final Pattern f29259e = Pattern.compile("NAME=\"((?:.|\f)+?)\"");

    /* renamed from: eؘؙؕ, reason: contains not printable characters */
    public static final Pattern f29252e = Pattern.compile("QUERYPARAM=\"((?:.|\f)+?)\"");

    /* renamed from: eٔۜۙ, reason: contains not printable characters */
    public static final Pattern f29295e = Pattern.compile("GROUP-ID=\"((?:.|\f)+?)\"");

    /* renamed from: eۡۘ, reason: contains not printable characters */
    public static final Pattern f29305e = Pattern.compile("CHARACTERISTICS=\"((?:.|\f)+?)\"");

    /* renamed from: eؚٔۦ, reason: contains not printable characters */
    public static final Pattern f29293e = Pattern.compile("INSTREAM-ID=\"((?:CC|SERVICE)\\d+)\"");

    /* renamed from: eّْؗ, reason: contains not printable characters */
    public static final Pattern f29285e = ad("AUTOSELECT");

    /* renamed from: eّؑ۠, reason: contains not printable characters */
    public static final Pattern f29284e = ad("DEFAULT");

    /* renamed from: eٍٜؓ, reason: contains not printable characters */
    public static final Pattern f29267e = ad("FORCED");

    /* renamed from: eؗۜؐ, reason: contains not printable characters */
    public static final Pattern f29250e = ad("INDEPENDENT");

    /* renamed from: eؘؕٗ, reason: contains not printable characters */
    public static final Pattern f29242e = ad("GAP");

    /* renamed from: eؕ٘ۘ, reason: contains not printable characters */
    public static final Pattern f29243e = ad("PRECISE");

    /* renamed from: eٟؖٚ, reason: contains not printable characters */
    public static final Pattern f29246e = Pattern.compile("VALUE=\"((?:.|\f)+?)\"");

    /* renamed from: eؘؙْ, reason: contains not printable characters */
    public static final Pattern f29288e = Pattern.compile("IMPORT=\"((?:.|\f)+?)\"");

    /* renamed from: eًٖٕ, reason: contains not printable characters */
    public static final Pattern f29261e = Pattern.compile("[:,]ID=\"((?:.|\f)+?)\"");

    /* renamed from: eِۘٞ, reason: contains not printable characters */
    public static final Pattern f29281e = Pattern.compile("CLASS=\"((?:.|\f)+?)\"");

    /* renamed from: eٗ۟ٓ, reason: contains not printable characters */
    public static final Pattern f29301e = Pattern.compile("START-DATE=\"((?:.|\f)+?)\"");

    /* renamed from: eًؗٛ, reason: contains not printable characters */
    public static final Pattern f29247e = Pattern.compile("CUE=\"((?:.|\f)+?)\"");

    /* renamed from: eّؕ۠, reason: contains not printable characters */
    public static final Pattern f29241e = Pattern.compile("END-DATE=\"((?:.|\f)+?)\"");

    /* renamed from: eٌُۚ, reason: contains not printable characters */
    public static final Pattern f29264e = Pattern.compile("PLANNED-DURATION=([\\d\\.]+)\\b");

    /* renamed from: eؕۡ۠, reason: contains not printable characters */
    public static final Pattern f29244e = ad("END-ON-NEXT");

    /* renamed from: eُۨٞ, reason: contains not printable characters */
    public static final Pattern f29277e = Pattern.compile("X-ASSET-URI=\"((?:.|\f)+?)\"");

    /* renamed from: eؖؗؖ, reason: contains not printable characters */
    public static final Pattern f29245e = Pattern.compile("X-ASSET-LIST=\"((?:.|\f)+?)\"");

    /* renamed from: eُٓٞ, reason: contains not printable characters */
    public static final Pattern f29291e = Pattern.compile("X-RESUME-OFFSET=(-?[\\d\\.]+)\\b");

    /* renamed from: eٟؑۨ, reason: contains not printable characters */
    public static final Pattern f29231e = Pattern.compile("X-PLAYOUT-LIMIT=([\\d\\.]+)\\b");

    /* renamed from: eٕؒ۠, reason: contains not printable characters */
    public static final Pattern f29233e = Pattern.compile("X-SNAP=\"((?:.|\f)+?)\"");

    /* renamed from: eّؑۚ, reason: contains not printable characters */
    public static final Pattern f29229e = Pattern.compile("X-RESTRICT=\"((?:.|\f)+?)\"");

    /* renamed from: eؕؑٝ, reason: contains not printable characters */
    public static final Pattern f29238e = Pattern.compile("X-CONTENT-MAY-VARY=\"((?:.|\f)+?)\"");

    /* renamed from: eِّٞ, reason: contains not printable characters */
    public static final Pattern f29280e = Pattern.compile("X-TIMELINE-OCCUPIES=\"((?:.|\f)+?)\"");

    /* renamed from: eِ٘, reason: contains not printable characters */
    public static final Pattern f29303e = Pattern.compile("X-TIMELINE-STYLE=\"((?:.|\f)+?)\"");

    /* renamed from: eٍٟۨ, reason: contains not printable characters */
    public static final Pattern f29268e = Pattern.compile("X-SKIP-CONTROL-OFFSET=([\\d\\.]+)\\b");

    /* renamed from: eَۡٙ, reason: contains not printable characters */
    public static final Pattern f29272e = Pattern.compile("X-SKIP-CONTROL-DURATION=([\\d\\.]+)\\b");

    /* renamed from: eؙٓۢ, reason: contains not printable characters */
    public static final Pattern f29292e = Pattern.compile("X-SKIP-CONTROL-LABEL-ID=\"((?:.|\f)+?)\"");

    /* renamed from: eٌؑ, reason: contains not printable characters */
    public static final Pattern f29227e = Pattern.compile("\\{\\$([a-zA-Z0-9\\-_]+)\\}");

    /* renamed from: eۣؓٗ, reason: contains not printable characters */
    public static final Pattern f29235e = Pattern.compile("\\b(X-[A-Z0-9-]+)=");

    public C14778e(C5833e c5833e, C9144e c9144e) {
        this.f29307e = c5833e;
        this.f29306e = c9144e;
    }

    public static Pattern ad(String str) {
        return Pattern.compile(str.concat("=(NO|YES)"));
    }

    public static String adcel(String str, Pattern pattern, String str2, Map map, C12041e c12041e) {
        Matcher ad = C12041e.ad(c12041e, str, pattern);
        if (ad.find()) {
            str2 = ad.group(1);
            str2.getClass();
        }
        return (map.isEmpty() || str2 == null) ? str2 : advert(str2, map, c12041e);
    }

    public static String advert(String str, Map map, C12041e c12041e) {
        Matcher ad = C12041e.ad(c12041e, str, f29227e);
        StringBuffer stringBuffer = new StringBuffer();
        while (ad.find()) {
            String group = ad.group(1);
            if (map.containsKey(group)) {
                ad.appendReplacement(stringBuffer, Matcher.quoteReplacement((String) map.get(group)));
            }
        }
        ad.appendTail(stringBuffer);
        return stringBuffer.toString();
    }

    /* JADX WARN: Code restructure failed: missing block: B:290:0x09b2, code lost:
    
        if (r10.equals(r13) != false) goto L362;
     */
    /* JADX WARN: Code restructure failed: missing block: B:566:0x0996, code lost:
    
        if (r12.equals(r10) != false) goto L348;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:186:0x0789  */
    /* JADX WARN: Removed duplicated region for block: B:287:0x09a3  */
    /* JADX WARN: Removed duplicated region for block: B:293:0x09c6  */
    /* JADX WARN: Removed duplicated region for block: B:296:0x09da  */
    /* JADX WARN: Removed duplicated region for block: B:300:0x0a06  */
    /* JADX WARN: Removed duplicated region for block: B:360:0x0b87 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:562:0x09e0  */
    /* JADX WARN: Removed duplicated region for block: B:563:0x09cc  */
    /* JADX WARN: Removed duplicated region for block: B:594:0x0fd5  */
    /* JADX WARN: Removed duplicated region for block: B:598:0x100a  */
    /* JADX WARN: Removed duplicated region for block: B:600:0x100d  */
    /* JADX WARN: Removed duplicated region for block: B:601:0x0ff0  */
    /* JADX WARN: Removed duplicated region for block: B:770:0x1183  */
    /* JADX WARN: Removed duplicated region for block: B:773:0x1186 A[SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C9144e appmetrica(defpackage.C5833e r130, defpackage.C9144e r131, defpackage.C0909e r132, android.net.Uri r133, defpackage.C12041e r134) {
        /*
            Method dump skipped, instructions count: 4668
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14778e.appmetrica(eؘؚۗ, eٌۨ, eٍؚؒ, android.net.Uri, eِۡؕ):eٌۨ");
    }

    public static boolean billing(C12041e c12041e, String str, Pattern pattern) {
        Matcher ad = C12041e.ad(c12041e, str, pattern);
        if (ad.find()) {
            return "YES".equals(ad.group(1));
        }
        return false;
    }

    public static C14290e license(String str, String str2, HashMap hashMap, C12041e c12041e) {
        String adcel = adcel(str, f29254e, "1", hashMap, c12041e);
        boolean equals = "urn:uuid:edef8ba9-79d6-4ace-a3c8-27dcd51d21ed".equals(str2);
        Pattern pattern = f29296e;
        if (equals) {
            String mopub = mopub(str, pattern, hashMap, c12041e);
            return new C14290e(AbstractC18394e.appmetrica, null, "video/mp4", Base64.decode(mopub.substring(mopub.indexOf(44)), 0));
        }
        if ("com.widevine".equals(str2)) {
            UUID uuid = AbstractC18394e.appmetrica;
            String str3 = AbstractC9413e.ad;
            return new C14290e(uuid, null, "hls", str.getBytes(StandardCharsets.UTF_8));
        }
        if (!"com.microsoft.playready".equals(str2) || !"1".equals(adcel)) {
            return null;
        }
        String mopub2 = mopub(str, pattern, hashMap, c12041e);
        byte[] decode = Base64.decode(mopub2.substring(mopub2.indexOf(44)), 0);
        UUID uuid2 = AbstractC18394e.purchase;
        return new C14290e(uuid2, null, "video/mp4", AbstractC0436e.license(uuid2, null, decode));
    }

    public static String mopub(String str, Pattern pattern, Map map, C12041e c12041e) {
        String adcel = adcel(str, pattern, null, map, c12041e);
        if (adcel != null) {
            return adcel;
        }
        throw C15125e.vip("Couldn't match " + pattern.pattern() + " in " + str);
    }

    /* JADX WARN: Code restructure failed: missing block: B:137:0x01ed, code lost:
    
        if (r10.equals("db1p") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:141:0x01fd, code lost:
    
        if (r10.equals("db2g") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x020b, code lost:
    
        if (r10.startsWith("db4") == false) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x02da, code lost:
    
        if (r3 > 0) goto L134;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:185:0x055e. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:62:0x02c3  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x02e7  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0376  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x031f  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x02ec  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01cf  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x026e  */
    /* JADX WARN: Removed duplicated region for block: B:95:0x02af  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02b5  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0279  */
    /* JADX WARN: Type inference failed for: r28v1 */
    /* JADX WARN: Type inference failed for: r28v3 */
    /* JADX WARN: Type inference failed for: r28v6 */
    /* JADX WARN: Type inference failed for: r3v7, types: [java.util.List] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C5833e purchase(defpackage.C0909e r49, android.net.Uri r50, defpackage.C12041e r51) {
        /*
            Method dump skipped, instructions count: 1890
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14778e.purchase(eٍؚؒ, android.net.Uri, eِۡؕ):eؘؚۗ");
    }

    public static void smaato(String str, HashMap hashMap) {
        if (hashMap.containsKey(str)) {
            throw C15125e.vip("duplicate variable name \"" + str + "\"");
        }
    }

    public static long startapp(C12041e c12041e, String str, Pattern pattern) {
        Matcher ad = C12041e.ad(c12041e, str, pattern);
        if (!ad.find()) {
            return -1L;
        }
        String group = ad.group(1);
        group.getClass();
        return Long.parseLong(group);
    }

    public static C9284e vip(String str, C14290e[] c14290eArr) {
        C14290e[] c14290eArr2 = new C14290e[c14290eArr.length];
        for (int i = 0; i < c14290eArr.length; i++) {
            C14290e c14290e = c14290eArr[i];
            c14290eArr2[i] = new C14290e(c14290e.f28264e, c14290e.f28263e, c14290e.f28265e, null);
        }
        return new C9284e(str, true, c14290eArr2);
    }

    public static double yandex(String str, Pattern pattern, double d, C12041e c12041e) {
        Matcher ad = C12041e.ad(c12041e, str, pattern);
        if (!ad.find()) {
            return d;
        }
        String group = ad.group(1);
        group.getClass();
        return Double.parseDouble(group);
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x0073, code lost:
    
        r2 = r0.readLine();
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0077, code lost:
    
        if (r2 == null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0079, code lost:
    
        r2 = r2.trim();
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0081, code lost:
    
        if (r2.isEmpty() == false) goto L71;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x008a, code lost:
    
        if (r2.startsWith("#EXT-X-STREAM-INF") == false) goto L43;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x00a4, code lost:
    
        if (r2.startsWith("#EXT-X-TARGETDURATION") != false) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:22:0x00ac, code lost:
    
        if (r2.startsWith("#EXT-X-MEDIA-SEQUENCE") != false) goto L78;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x00b4, code lost:
    
        if (r2.startsWith("#EXTINF") != false) goto L80;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00bc, code lost:
    
        if (r2.startsWith("#EXT-X-KEY") != false) goto L82;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x00c4, code lost:
    
        if (r2.startsWith("#EXT-X-BYTERANGE") != false) goto L74;
     */
    /* JADX WARN: Code restructure failed: missing block: B:30:0x00cc, code lost:
    
        if (r2.equals("#EXT-X-DISCONTINUITY") != false) goto L77;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00d4, code lost:
    
        if (r2.equals("#EXT-X-DISCONTINUITY-SEQUENCE") != false) goto L79;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00dc, code lost:
    
        if (r2.equals("#EXT-X-ENDLIST") == false) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00df, code lost:
    
        r9.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00e3, code lost:
    
        r9.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00f6, code lost:
    
        return appmetrica(r7.f29307e, r7.f29306e, new defpackage.C0909e(r9, r0), r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:0x008c, code lost:
    
        r9.add(r2);
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x009b, code lost:
    
        return purchase(new defpackage.C0909e(r9, r0), r8, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00f7, code lost:
    
        defpackage.AbstractC9413e.yandex(r0);
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0100, code lost:
    
        throw defpackage.C15125e.vip("Failed to parse the playlist, could not identify any tags.");
     */
    @Override // defpackage.InterfaceC17431e
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object metrica(android.net.Uri r8, defpackage.C0534e r9) {
        /*
            Method dump skipped, instructions count: 268
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.C14778e.metrica(android.net.Uri, eؑۙۘ):java.lang.Object");
    }
}
