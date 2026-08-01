package defpackage;

import android.util.Pair;
import java.nio.charset.StandardCharsets;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُٔۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC11004e {
    public static final byte[] ad;

    static {
        String str = AbstractC9413e.ad;
        ad = "OpusHead".getBytes(StandardCharsets.UTF_8);
    }

    public static void ad(C1292e c1292e) {
        int i = c1292e.vip;
        c1292e.m568protected(4);
        if (c1292e.smaato() != 1751411826) {
            i += 4;
        }
        c1292e.m571try(i);
    }

    /* JADX WARN: Removed duplicated region for block: B:101:0x072e  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0744  */
    /* JADX WARN: Removed duplicated region for block: B:269:0x0553  */
    /* JADX WARN: Removed duplicated region for block: B:359:0x049c  */
    /* JADX WARN: Removed duplicated region for block: B:404:0x015f  */
    /* JADX WARN: Removed duplicated region for block: B:407:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:411:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:414:0x01c3  */
    /* JADX WARN: Removed duplicated region for block: B:417:0x01cb  */
    /* JADX WARN: Removed duplicated region for block: B:429:0x0222  */
    /* JADX WARN: Removed duplicated region for block: B:438:0x0240  */
    /* JADX WARN: Removed duplicated region for block: B:440:0x024a  */
    /* JADX WARN: Removed duplicated region for block: B:451:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:484:0x01f8 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:486:0x01c5  */
    /* JADX WARN: Removed duplicated region for block: B:487:0x01b7  */
    /* JADX WARN: Removed duplicated region for block: B:488:0x0178  */
    /* JADX WARN: Removed duplicated region for block: B:489:0x0162  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x0499  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x04a0  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x06ec  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.util.ArrayList adcel(defpackage.C11900e r59, defpackage.C10082e r60, long r61, defpackage.C9284e r63, boolean r64, boolean r65, defpackage.InterfaceC8223e r66, boolean r67) {
        /*
            Method dump skipped, instructions count: 2669
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11004e.adcel(eِٟٛ, eَؗۡ, long, eٍؘ۠, boolean, boolean, eًۜؐ, boolean):java.util.ArrayList");
    }

    public static int appmetrica(int i) {
        return (i >> 24) & 255;
    }

    public static C13226e billing(C1292e c1292e) {
        long signatures;
        long signatures2;
        c1292e.m571try(8);
        if (appmetrica(c1292e.smaato()) == 0) {
            signatures = c1292e.subs();
            signatures2 = c1292e.subs();
        } else {
            signatures = c1292e.signatures();
            signatures2 = c1292e.signatures();
        }
        return new C13226e(signatures, signatures2, c1292e.subs());
    }

    public static int license(C1292e c1292e) {
        int ads = c1292e.ads();
        int i = ads & 127;
        while ((ads & 128) == 128) {
            ads = c1292e.ads();
            i = (i << 7) | (ads & 127);
        }
        return i;
    }

    public static C18524e metrica(int i, C1292e c1292e) {
        c1292e.m571try(i + 12);
        c1292e.m568protected(1);
        license(c1292e);
        c1292e.m568protected(2);
        int ads = c1292e.ads();
        if ((ads & 128) != 0) {
            c1292e.m568protected(2);
        }
        if ((ads & 64) != 0) {
            c1292e.m568protected(c1292e.ads());
        }
        if ((ads & 32) != 0) {
            c1292e.m568protected(2);
        }
        c1292e.m568protected(1);
        license(c1292e);
        String appmetrica = AbstractC8542e.appmetrica(c1292e.ads());
        if ("audio/mpeg".equals(appmetrica) || "audio/vnd.dts".equals(appmetrica) || "audio/vnd.dts.hd".equals(appmetrica)) {
            return new C18524e(appmetrica, null, -1L, -1L);
        }
        c1292e.m568protected(4);
        long subs = c1292e.subs();
        long subs2 = c1292e.subs();
        c1292e.m568protected(1);
        int license = license(c1292e);
        long j = subs2;
        byte[] bArr = new byte[license];
        c1292e.mopub(0, license, bArr);
        if (j <= 0) {
            j = -1;
        }
        return new C18524e(appmetrica, bArr, j, subs > 0 ? subs : -1L);
    }

    /* JADX WARN: Code restructure failed: missing block: B:100:0x019a, code lost:
    
        r1.m571try(r9);
        r1.m568protected(16);
     */
    /* JADX WARN: Code restructure failed: missing block: B:101:0x01ad, code lost:
    
        r9 = new defpackage.C7658e(r0, r8, r1.isVip(r10 - 16));
     */
    /* JADX WARN: Code restructure failed: missing block: B:104:0x024c, code lost:
    
        defpackage.AbstractC2803e.license("MetadataUtil", "Skipped unknown metadata entry: " + defpackage.AbstractC9615e.vip(r13));
     */
    /* JADX WARN: Code restructure failed: missing block: B:105:0x025f, code lost:
    
        r1.m571try(r15);
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:107:0x0077, code lost:
    
        r0 = defpackage.AbstractC15404e.ad(defpackage.AbstractC5097e.startapp(r1) - 1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:108:0x0080, code lost:
    
        if (r0 == null) goto L25;
     */
    /* JADX WARN: Code restructure failed: missing block: B:109:0x0082, code lost:
    
        r9 = new defpackage.C14500e("TCON", r12, defpackage.AbstractC17475e.ads(r0));
     */
    /* JADX WARN: Code restructure failed: missing block: B:110:0x008c, code lost:
    
        defpackage.AbstractC2803e.smaato("MetadataUtil", "Failed to parse standard genre code");
     */
    /* JADX WARN: Code restructure failed: missing block: B:111:0x0091, code lost:
    
        r9 = r12;
     */
    /* JADX WARN: Code restructure failed: missing block: B:113:0x00a4, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:115:0x027f, code lost:
    
        r1.m571try(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:116:0x0282, code lost:
    
        throw r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:119:0x01b9, code lost:
    
        r0 = 16777215 & r13;
     */
    /* JADX WARN: Code restructure failed: missing block: B:120:0x01c0, code lost:
    
        if (r0 != 6516084) goto L105;
     */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x01c2, code lost:
    
        r9 = defpackage.AbstractC5097e.purchase(r13, r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:123:0x01ca, code lost:
    
        if (r0 == 7233901) goto L145;
     */
    /* JADX WARN: Code restructure failed: missing block: B:125:0x01cf, code lost:
    
        if (r0 != 7631467) goto L110;
     */
    /* JADX WARN: Code restructure failed: missing block: B:128:0x01d6, code lost:
    
        if (r0 == 6516589) goto L144;
     */
    /* JADX WARN: Code restructure failed: missing block: B:130:0x01db, code lost:
    
        if (r0 != 7828084) goto L115;
     */
    /* JADX WARN: Code restructure failed: missing block: B:133:0x01e2, code lost:
    
        if (r0 != 6578553) goto L118;
     */
    /* JADX WARN: Code restructure failed: missing block: B:134:0x01e4, code lost:
    
        r9 = defpackage.AbstractC5097e.mopub(r13, r1, "TDRC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:136:0x01ee, code lost:
    
        if (r0 != 4280916) goto L121;
     */
    /* JADX WARN: Code restructure failed: missing block: B:137:0x01f0, code lost:
    
        r9 = defpackage.AbstractC5097e.mopub(r13, r1, "TPE1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:139:0x01fa, code lost:
    
        if (r0 != 7630703) goto L124;
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x0044, code lost:
    
        r1.m571try(r7);
        r7 = r7 + r13;
        r1.m568protected(r0);
        r6 = new java.util.ArrayList();
     */
    /* JADX WARN: Code restructure failed: missing block: B:140:0x01fc, code lost:
    
        r9 = defpackage.AbstractC5097e.mopub(r13, r1, "TSSE");
     */
    /* JADX WARN: Code restructure failed: missing block: B:142:0x0206, code lost:
    
        if (r0 != 6384738) goto L127;
     */
    /* JADX WARN: Code restructure failed: missing block: B:143:0x0208, code lost:
    
        r9 = defpackage.AbstractC5097e.mopub(r13, r1, "TALB");
     */
    /* JADX WARN: Code restructure failed: missing block: B:145:0x0212, code lost:
    
        if (r0 != 7108978) goto L130;
     */
    /* JADX WARN: Code restructure failed: missing block: B:146:0x0214, code lost:
    
        r9 = defpackage.AbstractC5097e.mopub(r13, r1, "USLT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:148:0x021e, code lost:
    
        if (r0 != 6776174) goto L133;
     */
    /* JADX WARN: Code restructure failed: missing block: B:149:0x0220, code lost:
    
        r9 = defpackage.AbstractC5097e.mopub(r13, r1, "TCON");
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0050, code lost:
    
        r13 = r1.vip;
     */
    /* JADX WARN: Code restructure failed: missing block: B:151:0x0228, code lost:
    
        if (r0 != 6779504) goto L136;
     */
    /* JADX WARN: Code restructure failed: missing block: B:152:0x022a, code lost:
    
        r9 = defpackage.AbstractC5097e.mopub(r13, r1, "TIT1");
     */
    /* JADX WARN: Code restructure failed: missing block: B:154:0x0234, code lost:
    
        if (r0 != 7173742) goto L139;
     */
    /* JADX WARN: Code restructure failed: missing block: B:155:0x0236, code lost:
    
        r9 = defpackage.AbstractC5097e.mopub(r13, r1, "MVNM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:157:0x0241, code lost:
    
        if (r0 != 7173737) goto L142;
     */
    /* JADX WARN: Code restructure failed: missing block: B:158:0x0243, code lost:
    
        r9 = defpackage.AbstractC5097e.adcel(r13, "MVIN", r1, true, false);
     */
    /* JADX WARN: Code restructure failed: missing block: B:159:0x0264, code lost:
    
        r9 = defpackage.AbstractC5097e.mopub(r13, r1, "TCOM");
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0052, code lost:
    
        if (r13 >= r7) goto L233;
     */
    /* JADX WARN: Code restructure failed: missing block: B:160:0x026c, code lost:
    
        r9 = defpackage.AbstractC5097e.mopub(r13, r1, "TIT2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:163:0x0287, code lost:
    
        if (r6.isEmpty() == false) goto L155;
     */
    /* JADX WARN: Code restructure failed: missing block: B:169:0x028b, code lost:
    
        r12 = new defpackage.C17750e(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0054, code lost:
    
        r15 = r1.smaato() + r13;
        r13 = r1.smaato();
        r0 = (r13 >> 24) & 255;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x0069, code lost:
    
        if (r0 == 169) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x006d, code lost:
    
        if (r0 != 253) goto L20;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0075, code lost:
    
        if (r13 != 1735291493) goto L28;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x009b, code lost:
    
        if (r13 != 1684632427) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x009d, code lost:
    
        r9 = defpackage.AbstractC5097e.yandex(r13, r1, "TPOS");
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x0092, code lost:
    
        r1.m571try(r15);
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0274, code lost:
    
        if (r9 == null) goto L235;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0276, code lost:
    
        r6.add(r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x0279, code lost:
    
        r3 = false;
        r12 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00aa, code lost:
    
        if (r13 != 1953655662) goto L36;
     */
    /* JADX WARN: Code restructure failed: missing block: B:33:0x00ac, code lost:
    
        r9 = defpackage.AbstractC5097e.yandex(r13, r1, "TRCK");
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00b6, code lost:
    
        if (r13 != 1953329263) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00b8, code lost:
    
        r9 = defpackage.AbstractC5097e.adcel(r13, "TBPM", r1, true, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:38:0x00c2, code lost:
    
        if (r13 != 1668311404) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:39:0x00c4, code lost:
    
        r9 = defpackage.AbstractC5097e.adcel(r13, "TCMP", r1, true, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:41:0x00ce, code lost:
    
        if (r13 != 1668249202) goto L45;
     */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x00d0, code lost:
    
        r9 = defpackage.AbstractC5097e.billing(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x00d8, code lost:
    
        if (r13 != 1631670868) goto L48;
     */
    /* JADX WARN: Code restructure failed: missing block: B:45:0x00da, code lost:
    
        r9 = defpackage.AbstractC5097e.mopub(r13, r1, "TPE2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:47:0x00e4, code lost:
    
        if (r13 != 1936682605) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:48:0x00e6, code lost:
    
        r9 = defpackage.AbstractC5097e.mopub(r13, r1, "TSOT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:50:0x00f0, code lost:
    
        if (r13 != 1936679276) goto L54;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:0x00f2, code lost:
    
        r9 = defpackage.AbstractC5097e.mopub(r13, r1, "TSOA");
     */
    /* JADX WARN: Code restructure failed: missing block: B:53:0x00fc, code lost:
    
        if (r13 != 1936679282) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:54:0x00fe, code lost:
    
        r9 = defpackage.AbstractC5097e.mopub(r13, r1, "TSOP");
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0108, code lost:
    
        if (r13 != 1936679265) goto L60;
     */
    /* JADX WARN: Code restructure failed: missing block: B:57:0x010a, code lost:
    
        r9 = defpackage.AbstractC5097e.mopub(r13, r1, "TSO2");
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x0114, code lost:
    
        if (r13 != 1936679791) goto L63;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x0116, code lost:
    
        r9 = defpackage.AbstractC5097e.mopub(r13, r1, "TSOC");
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x0121, code lost:
    
        if (r13 != 1920233063) goto L66;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x0123, code lost:
    
        r9 = defpackage.AbstractC5097e.adcel(r13, "ITUNESADVISORY", r1, r3, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x012e, code lost:
    
        if (r13 != 1885823344) goto L69;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:0x0130, code lost:
    
        r9 = defpackage.AbstractC5097e.adcel(r13, "ITUNESGAPLESS", r1, r3, true);
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x013b, code lost:
    
        if (r13 != 1936683886) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:69:0x013d, code lost:
    
        r9 = defpackage.AbstractC5097e.mopub(r13, r1, "TVSHOWSORT");
     */
    /* JADX WARN: Code restructure failed: missing block: B:71:0x0148, code lost:
    
        if (r13 != 1953919848) goto L75;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x014a, code lost:
    
        r9 = defpackage.AbstractC5097e.mopub(r13, r1, "TVSHOW");
     */
    /* JADX WARN: Code restructure failed: missing block: B:74:0x0155, code lost:
    
        if (r13 != 757935405) goto L101;
     */
    /* JADX WARN: Code restructure failed: missing block: B:75:0x0157, code lost:
    
        r0 = r12;
        r8 = r0;
        r9 = -1;
        r10 = -1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:76:0x015b, code lost:
    
        r13 = r1.vip;
     */
    /* JADX WARN: Code restructure failed: missing block: B:77:0x015d, code lost:
    
        if (r13 >= r15) goto L236;
     */
    /* JADX WARN: Code restructure failed: missing block: B:78:0x015f, code lost:
    
        r14 = r1.smaato();
        r12 = r1.smaato();
        r1.m568protected(4);
     */
    /* JADX WARN: Code restructure failed: missing block: B:79:0x016e, code lost:
    
        if (r12 != 1835360622) goto L83;
     */
    /* JADX WARN: Code restructure failed: missing block: B:80:0x0170, code lost:
    
        r0 = r1.isVip(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:84:0x017a, code lost:
    
        if (r12 != 1851878757) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:85:0x017c, code lost:
    
        r8 = r1.isVip(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:88:0x0186, code lost:
    
        if (r12 != 1684108385) goto L89;
     */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x0188, code lost:
    
        r9 = r13;
        r10 = r14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x018a, code lost:
    
        r1.m568protected(r14 - 12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:93:0x0192, code lost:
    
        if (r0 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:94:0x0194, code lost:
    
        if (r8 == null) goto L98;
     */
    /* JADX WARN: Code restructure failed: missing block: B:96:0x0197, code lost:
    
        if (r9 != (-1)) goto L96;
     */
    /* JADX WARN: Code restructure failed: missing block: B:98:0x01b0, code lost:
    
        r9 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:99:0x01b1, code lost:
    
        r1.m571try(r15);
     */
    /* JADX WARN: Removed duplicated region for block: B:202:0x032c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C17750e mopub(defpackage.C18375e r17) {
        /*
            Method dump skipped, instructions count: 948
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11004e.mopub(eۜؖ):eۣ٘ٓ");
    }

    /* JADX WARN: Code restructure failed: missing block: B:25:0x008a, code lost:
    
        r9 = r14.smaato();
        r10 = r14.smaato();
        r11 = r11 - 16;
        r12 = new byte[r11];
        r14.mopub(0, r11, r12);
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0099, code lost:
    
        r11 = new defpackage.C9635e(r8, r12, r10, r9);
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x009f, code lost:
    
        defpackage.AbstractC17861e.applovin("Failed to parse metadata entry with key: ", r8, "MetadataUtil");
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C17750e purchase(defpackage.C11900e r14) {
        /*
            r0 = 1751411826(0x68646c72, float:4.3148E24)
            eۜؖ r0 = r14.Signature(r0)
            r1 = 1801812339(0x6b657973, float:2.7741754E26)
            eۜؖ r1 = r14.Signature(r1)
            r2 = 1768715124(0x696c7374, float:1.7865732E25)
            eۜؖ r14 = r14.Signature(r2)
            r2 = 0
            if (r0 == 0) goto Lcb
            if (r1 == 0) goto Lcb
            if (r14 == 0) goto Lcb
            eؒۙۚ r0 = r0.f36046e
            r3 = 16
            r0.m571try(r3)
            int r0 = r0.smaato()
            r3 = 1835299937(0x6d647461, float:4.4189547E27)
            if (r0 == r3) goto L2e
            goto Lcb
        L2e:
            eؒۙۚ r0 = r1.f36046e
            r1 = 12
            r0.m571try(r1)
            int r1 = r0.smaato()
            java.lang.String[] r3 = new java.lang.String[r1]
            r4 = 0
            r5 = r4
        L3d:
            r6 = 8
            if (r5 >= r1) goto L55
            int r7 = r0.smaato()
            r8 = 4
            r0.m568protected(r8)
            int r7 = r7 - r6
            java.nio.charset.Charset r6 = java.nio.charset.StandardCharsets.UTF_8
            java.lang.String r6 = r0.isPro(r7, r6)
            r3[r5] = r6
            int r5 = r5 + 1
            goto L3d
        L55:
            eؒۙۚ r14 = r14.f36046e
            r14.m571try(r6)
            java.util.ArrayList r0 = new java.util.ArrayList
            r0.<init>()
        L5f:
            int r5 = r14.ad()
            if (r5 <= r6) goto Lbf
            int r5 = r14.vip
            int r7 = r14.smaato()
            int r8 = r14.smaato()
            int r8 = r8 + (-1)
            if (r8 < 0) goto Lb3
            if (r8 >= r1) goto Lb3
            r8 = r3[r8]
            int r9 = r5 + r7
        L79:
            int r10 = r14.vip
            if (r10 >= r9) goto Lac
            int r11 = r14.smaato()
            int r12 = r14.smaato()
            r13 = 1684108385(0x64617461, float:1.6635614E22)
            if (r12 != r13) goto La7
            int r9 = r14.smaato()
            int r10 = r14.smaato()
            int r11 = r11 + (-16)
            byte[] r12 = new byte[r11]
            r14.mopub(r4, r11, r12)
            eٍٞٗ r11 = new eٍٞٗ     // Catch: java.lang.Exception -> L9f
            r11.<init>(r8, r12, r10, r9)     // Catch: java.lang.Exception -> L9f
            goto Lad
        L9f:
            java.lang.String r9 = "MetadataUtil"
            java.lang.String r10 = "Failed to parse metadata entry with key: "
            defpackage.AbstractC17861e.applovin(r10, r8, r9)
            goto Lac
        La7:
            int r10 = r10 + r11
            r14.m571try(r10)
            goto L79
        Lac:
            r11 = r2
        Lad:
            if (r11 == 0) goto Lba
            r0.add(r11)
            goto Lba
        Lb3:
            java.lang.String r9 = "BoxParsers"
            java.lang.String r10 = "Skipped metadata with unknown key index: "
            defpackage.AbstractC10257e.pro(r10, r8, r9)
        Lba:
            int r5 = r5 + r7
            r14.m571try(r5)
            goto L5f
        Lbf:
            boolean r14 = r0.isEmpty()
            if (r14 == 0) goto Lc6
            goto Lcb
        Lc6:
            eۣ٘ٓ r2 = new eۣ٘ٓ
            r2.<init>(r0)
        Lcb:
            return r2
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11004e.purchase(eِٟٛ):eۣ٘ٓ");
    }

    /* JADX WARN: Removed duplicated region for block: B:126:0x02e1  */
    /* JADX WARN: Removed duplicated region for block: B:466:0x0960  */
    /* JADX WARN: Removed duplicated region for block: B:470:0x0980  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static defpackage.C9831e startapp(defpackage.C1292e r66, defpackage.C16374e r67, java.lang.String r68, defpackage.C9284e r69, boolean r70) {
        /*
            Method dump skipped, instructions count: 3793
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11004e.startapp(eؒۙۚ, eٖٝٗ, java.lang.String, eٍؘ۠, boolean):eٍۢؔ");
    }

    /*  JADX ERROR: Type inference failed
        jadx.core.utils.exceptions.JadxOverflowException: Type update terminated with stack overflow, arg: (r38v1 java.util.List), method size: 3236
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        	at jadx.core.dex.visitors.typeinference.TypeInferenceVisitor.visit(TypeInferenceVisitor.java:77)
        */
    public static void vip(defpackage.C1292e r49, int r50, int r51, int r52, int r53, java.lang.String r54, boolean r55, defpackage.C9284e r56, defpackage.C9831e r57, int r58) {
        /*
            Method dump skipped, instructions count: 3236
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC11004e.vip(eؒۙۚ, int, int, int, int, java.lang.String, boolean, eٍؘ۠, eٍۢؔ, int):void");
    }

    public static Pair yandex(C1292e c1292e, int i, int i2) {
        Integer num;
        C18274e c18274e;
        Pair create;
        int i3;
        int i4;
        Integer num2;
        boolean z;
        int i5 = c1292e.vip;
        while (i5 - i < i2) {
            c1292e.m571try(i5);
            int smaato = c1292e.smaato();
            AbstractC9357e.license("childAtomSize must be positive", smaato > 0);
            if (c1292e.smaato() == 1936289382) {
                int i6 = i5 + 8;
                int i7 = 0;
                int i8 = -1;
                Integer num3 = null;
                String str = null;
                while (i6 - i5 < smaato) {
                    c1292e.m571try(i6);
                    int smaato2 = c1292e.smaato();
                    int smaato3 = c1292e.smaato();
                    if (smaato3 == 1718775137) {
                        num3 = Integer.valueOf(c1292e.smaato());
                    } else if (smaato3 == 1935894637) {
                        c1292e.m568protected(4);
                        str = c1292e.isPro(4, StandardCharsets.UTF_8);
                    } else if (smaato3 == 1935894633) {
                        i8 = i6;
                        i7 = smaato2;
                    }
                    i6 += smaato2;
                }
                byte[] bArr = null;
                if ("cenc".equals(str) || "cbc1".equals(str) || "cens".equals(str) || "cbcs".equals(str)) {
                    AbstractC9357e.license("frma atom is mandatory", num3 != null);
                    AbstractC9357e.license("schi atom is mandatory", i8 != -1);
                    int i9 = i8 + 8;
                    while (true) {
                        if (i9 - i8 >= i7) {
                            num = num3;
                            c18274e = null;
                            break;
                        }
                        c1292e.m571try(i9);
                        int smaato4 = c1292e.smaato();
                        if (c1292e.smaato() == 1952804451) {
                            int appmetrica = appmetrica(c1292e.smaato());
                            c1292e.m568protected(1);
                            if (appmetrica == 0) {
                                c1292e.m568protected(1);
                                i4 = 0;
                                i3 = 0;
                            } else {
                                int ads = c1292e.ads();
                                i3 = ads & 15;
                                i4 = (ads & 240) >> 4;
                            }
                            if (c1292e.ads() == 1) {
                                num2 = num3;
                                z = true;
                            } else {
                                num2 = num3;
                                z = false;
                            }
                            int ads2 = c1292e.ads();
                            byte[] bArr2 = new byte[16];
                            c1292e.mopub(0, 16, bArr2);
                            if (z && ads2 == 0) {
                                int ads3 = c1292e.ads();
                                byte[] bArr3 = new byte[ads3];
                                c1292e.mopub(0, ads3, bArr3);
                                bArr = bArr3;
                            }
                            num = num2;
                            c18274e = new C18274e(z, str, ads2, bArr2, i4, i3, bArr);
                        } else {
                            i9 += smaato4;
                        }
                    }
                    AbstractC9357e.license("tenc atom is mandatory", c18274e != null);
                    String str2 = AbstractC9413e.ad;
                    create = Pair.create(num, c18274e);
                } else {
                    create = null;
                }
                if (create != null) {
                    return create;
                }
            }
            i5 += smaato;
        }
        return null;
    }
}
