package defpackage;

import android.graphics.RectF;
import androidx.car.app.navigation.model.Maneuver;
import java.util.HashMap;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import org.bouncycastle.jcajce.provider.config.ConfigurableProvider;
import org.conscrypt.OpenSSLProvider;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؘْؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract /* synthetic */ class AbstractC1634e {
    public static void Signature(StringBuilder sb, String str, ConfigurableProvider configurableProvider, String str2) {
        sb.append(str);
        configurableProvider.addAlgorithm(str2, sb.toString());
    }

    public static Object ad(InterfaceC8376e interfaceC8376e, Object obj, C12025e c12025e, AbstractC10731e abstractC10731e) {
        interfaceC8376e.loadAd().metrica().getAttributes().billing(AbstractC7186e.ad, c12025e);
        C13886e amazon = interfaceC8376e.loadAd().amazon();
        if (obj == null) {
            obj = C16676e.ad;
        }
        Object vip = amazon.vip(interfaceC8376e, obj, abstractC10731e);
        return vip == EnumC2821e.f6782e ? vip : Unit.INSTANCE;
    }

    public static Ctry adcel(String str) {
        return new Ctry(str).m4674goto();
    }

    public static void admob(HashMap hashMap, Ctry ctry) {
        hashMap.put(ctry, new C2222e(16));
    }

    public static String advert(Object obj, String str) {
        return str + obj;
    }

    public static StringBuilder amazon(OpenSSLProvider openSSLProvider, String str, String str2, String str3, String str4) {
        openSSLProvider.put(str, str2);
        openSSLProvider.put(str3, str4);
        return new StringBuilder();
    }

    public static /* synthetic */ String applovin(int i) {
        switch (i) {
            case 1:
                return "RLM_PROPERTY_TYPE_INT";
            case 2:
                return "RLM_PROPERTY_TYPE_BOOL";
            case 3:
                return "RLM_PROPERTY_TYPE_STRING";
            case 4:
                return "RLM_PROPERTY_TYPE_BINARY";
            case 5:
                return "RLM_PROPERTY_TYPE_MIXED";
            case 6:
                return "RLM_PROPERTY_TYPE_TIMESTAMP";
            case 7:
                return "RLM_PROPERTY_TYPE_FLOAT";
            case 8:
                return "RLM_PROPERTY_TYPE_DOUBLE";
            case 9:
                return "RLM_PROPERTY_TYPE_OBJECT";
            case 10:
                return "RLM_PROPERTY_TYPE_LINKING_OBJECTS";
            case 11:
                return "RLM_PROPERTY_TYPE_DECIMAL128";
            case 12:
                return "RLM_PROPERTY_TYPE_OBJECT_ID";
            case 13:
                return "RLM_PROPERTY_TYPE_UUID";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String appmetrica(int i) {
        switch (i) {
            case 1:
                return "default media data must be auto selected";
            case 2:
                return "bad format found for an EXT tag";
            case 3:
                return "CHANNELS is empty";
            case 4:
                return "CHARACTERISTICS is empty";
            case 5:
                return "GROUP-ID is empty";
            case 6:
                return "NAME is empty";
            case 7:
                return "found illegal whitespace";
            case 8:
                return "there was an unrecoverable problem";
            case 9:
                return "invalid attribute name";
            case 10:
                return "invalid compatibility version";
            case 11:
                return "invalid encryption method";
            case 12:
                return "a hexadecimal string was not properly formatted";
            case 13:
                return "the initialization vector is the wrong size";
            case 14:
                return "invalid KEYFORMATVERSIONS";
            case 15:
                return "invalid media INSTREAM-ID";
            case 16:
                return "invalid media TYPE";
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return "a resolution was not formatted properly";
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return "a quoted string was not properly formatted";
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return "a date-time string was not properly formatted";
            case 20:
                return "a byte range string was not properly formatted";
            case 21:
                return "master playlist tags we found in a media playlist";
            case 22:
                return "media playlist tags we found in a master playlist";
            case 23:
                return "missing the name of an attribute";
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return "missing the value of an attribute";
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return "missing the separator in an attribute";
            case Maneuver.TYPE_FORK_RIGHT /* 26 */:
                return "missing the URI for encrypted media segments";
            case Maneuver.TYPE_MERGE_LEFT /* 27 */:
                return "missing the colon after an EXT tag";
            case Maneuver.TYPE_MERGE_RIGHT /* 28 */:
                return "missing EXTINF for a track in an extended media playlist";
            case Maneuver.TYPE_MERGE_SIDE_UNSPECIFIED /* 29 */:
                return "multiple instances of an attribute name found in an attribute list";
            case 30:
                return "multiple instances of an EXT tag found for which only one is allowed";
            case 31:
                return "only java integers are supported";
            case 32:
                return "only specific values are supported";
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CW_WITH_ANGLE /* 33 */:
                return "only java floats are supported";
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW /* 34 */:
                return "the only valid values are YES and NO";
            case Maneuver.TYPE_ROUNDABOUT_ENTER_AND_EXIT_CCW_WITH_ANGLE /* 35 */:
                return "a quoted string was not closed";
            case Maneuver.TYPE_STRAIGHT /* 36 */:
                return "unable to determine playlist type";
            case Maneuver.TYPE_FERRY_BOAT /* 37 */:
                return "open m3u8 does not support this version";
            case Maneuver.TYPE_FERRY_TRAIN /* 38 */:
                return "unsupported ext tag detected";
            case Maneuver.TYPE_DESTINATION /* 39 */:
                return "whitespace was found surrounding a track";
            case Maneuver.TYPE_DESTINATION_STRAIGHT /* 40 */:
                return "A Media Playlist REQUIRES protocol version 4 or higher";
            default:
                throw null;
        }
    }

    public static float billing(float f, float f2, float f3, float f4) {
        return ((f - f2) * f3) + f4;
    }

    public static /* synthetic */ String inmobi(int i) {
        switch (i) {
            case 1:
                return "NOT_REQUIRED";
            case 2:
                return "CONNECTED";
            case 3:
                return "UNMETERED";
            case 4:
                return "NOT_ROAMING";
            case 5:
                return "METERED";
            case 6:
                return "TEMPORARILY_UNMETERED";
            default:
                return "null";
        }
    }

    public static /* synthetic */ String isPro(int i) {
        return i != 1 ? i != 2 ? "null" : "INEXACT" : "EXACT";
    }

    public static void isVip(C11384e c11384e, Function1 function1) {
        function1.invoke(new C14143e(c11384e.ad));
    }

    public static void license(C17985e c17985e, C2330e c2330e) {
        if (c17985e.vip == null) {
            c17985e.vip = new RectF();
        }
        RectF rectF = c17985e.vip;
        float f = c2330e.ad;
        long j = c2330e.yandex;
        long j2 = c2330e.billing;
        long j3 = c2330e.purchase;
        long j4 = c2330e.appmetrica;
        rectF.set(f, c2330e.vip, c2330e.metrica, c2330e.license);
        if (c17985e.metrica == null) {
            c17985e.metrica = new float[8];
        }
        float[] fArr = c17985e.metrica;
        fArr[0] = Float.intBitsToFloat((int) (j4 >> 32));
        fArr[1] = Float.intBitsToFloat((int) (j4 & 4294967295L));
        fArr[2] = Float.intBitsToFloat((int) (j3 >> 32));
        fArr[3] = Float.intBitsToFloat((int) (j3 & 4294967295L));
        fArr[4] = Float.intBitsToFloat((int) (j2 >> 32));
        fArr[5] = Float.intBitsToFloat((int) (j2 & 4294967295L));
        fArr[6] = Float.intBitsToFloat((int) (j >> 32));
        fArr[7] = Float.intBitsToFloat((int) (j & 4294967295L));
        c17985e.ad.addRoundRect(c17985e.vip, c17985e.metrica, AbstractC11972e.vip(1));
    }

    public static void loadAd(StringBuilder sb, String str, String str2, OpenSSLProvider openSSLProvider, String str3) {
        sb.append(str);
        sb.append(str2);
        openSSLProvider.put(str3, sb.toString());
    }

    public static void metrica(C17985e c17985e, C0763e c0763e) {
        c17985e.getClass();
        float f = c0763e.ad;
        float f2 = c0763e.license;
        float f3 = c0763e.metrica;
        float f4 = c0763e.vip;
        if (Float.isNaN(f) || Float.isNaN(f4) || Float.isNaN(f3) || Float.isNaN(f2)) {
            AbstractC11972e.metrica("Invalid rectangle, make sure no value is NaN");
        }
        if (c17985e.vip == null) {
            c17985e.vip = new RectF();
        }
        c17985e.vip.set(f, f4, f3, f2);
        c17985e.ad.addRect(c17985e.vip, AbstractC11972e.vip(1));
    }

    public static String mopub(long j, String str, String str2) {
        return str + j + str2;
    }

    public static void pro(HashMap hashMap, Ctry ctry) {
        hashMap.put(ctry, new C2222e(19));
    }

    public static /* synthetic */ int purchase(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 4;
            case 5:
                return 6;
            case 6:
                return 8;
            case 7:
                return 9;
            case 8:
                return 10;
            case 9:
                return 12;
            case 10:
                return 14;
            case 11:
                return 11;
            case 12:
                return 15;
            case 13:
                return 17;
            default:
                throw null;
        }
    }

    public static int remoteconfig(int i, int i2, int i3, int i4, int i5) {
        return C2387e.startapp(i + i2 + i3, i4) + i5;
    }

    public static void signatures(HashMap hashMap, Ctry ctry) {
        hashMap.put(ctry, new C2222e(20));
    }

    public static String smaato(String str, int i, String str2) {
        return str + i + str2;
    }

    public static int startapp(int i, int i2, int i3, int i4, int i5) {
        return Math.max(((i * i2) / i3) + i4, i5);
    }

    public static int subscription(int i, int i2, int i3, int i4) {
        return C6697e.startapp(i + i2, i3) + i4;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x007b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x007d  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static java.lang.Object tapsense(defpackage.InterfaceC8376e r5, defpackage.C12025e r6, defpackage.AbstractC10731e r7) {
        /*
            boolean r0 = r7 instanceof defpackage.C3742e
            if (r0 == 0) goto L13
            r0 = r7
            eؕۥٖ r0 = (defpackage.C3742e) r0
            int r1 = r0.f8331e
            r2 = -2147483648(0xffffffff80000000, float:-0.0)
            r3 = r1 & r2
            if (r3 == 0) goto L13
            int r1 = r1 - r2
            r0.f8331e = r1
            goto L18
        L13:
            eؕۥٖ r0 = new eؕۥٖ
            r0.<init>(r5, r7)
        L18:
            java.lang.Object r7 = r0.f8329e
            int r1 = r0.f8331e
            eؙۚۜ r2 = defpackage.C6638e.ad
            r3 = 1
            if (r1 == 0) goto L31
            if (r1 != r3) goto L29
            eِ۟ۥ r6 = r0.f8330e
            defpackage.AbstractC2003e.purchase(r7)
            goto L73
        L29:
            java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
            java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
            r5.<init>(r6)
            throw r5
        L31:
            defpackage.AbstractC2003e.purchase(r7)
            eؘۙٗ r7 = r5.getAttributes()
            eًۛؗ r1 = defpackage.AbstractC4133e.vip
            java.lang.Object r7 = r7.purchase(r1)
            eؙۚۜ r7 = (defpackage.C6638e) r7
            if (r7 != 0) goto L49
            eؘۙٗ r4 = r5.getAttributes()
            r4.billing(r1, r2)
        L49:
            eًۛؗ r1 = defpackage.AbstractC17667e.ad
            eؘۙٗ r1 = r5.getAttributes()
            eًۛؗ r4 = defpackage.AbstractC17667e.ad
            r1.billing(r4, r6)
            if (r7 != 0) goto L5e
            eْۧؕ r7 = r5.license()
            eْٕؕ r7 = r7.mopub()
        L5e:
            eْۧؕ r1 = r5.license()
            eٍٓٚ r1 = r1.subscription()
            r0.f8330e = r6
            r0.f8331e = r3
            java.lang.Object r7 = r1.vip(r5, r7, r0)
            eٟؔۙ r5 = defpackage.EnumC2821e.f6782e
            if (r7 != r5) goto L73
            return r5
        L73:
            eِٖۨ r5 = defpackage.C16676e.ad
            boolean r5 = defpackage.AbstractC7890e.billing(r7, r5)
            if (r5 == 0) goto L7d
            r5 = 0
            return r5
        L7d:
            if (r7 == r2) goto L90
            eؚ٘ٚ r5 = r6.ad
            boolean r5 = r5.applovin(r7)
            if (r5 == 0) goto L88
            return r7
        L88:
            eؔۘٝ r5 = new eؔۘٝ
            eٓٔۖ r6 = r6.vip
            r5.<init>(r6)
            throw r5
        L90:
            eٍٍْ r5 = new eٍٍْ
            java.lang.String r6 = "Request body has already been consumed (received)."
            r7 = 8
            r5.<init>(r6, r7)
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC1634e.tapsense(eًَۨ, eِ۟ۥ, eُؑ۠):java.lang.Object");
    }

    public static int yandex(int i, int i2, int i3, int i4) {
        return C2387e.startapp(i + i2, i3) + i4;
    }
}
