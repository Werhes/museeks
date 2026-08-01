package defpackage;

import android.content.SharedPreferences;
import androidx.car.app.navigation.model.Maneuver;
import kotlin.jvm.functions.Function0;
import org.conscrypt.PSKKeyManager;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٍٍٙ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9357e {
    public static SharedPreferences billing;
    public static final C2892e ad = new C2892e(-689463307, false, new C7156e(3));
    public static final C2892e vip = new C2892e(-1509239180, false, new C10387e(29));
    public static final C2892e metrica = new C2892e(1361481885, false, new C10417e(0));
    public static final C2892e license = new C2892e(1190642428, false, new C10417e(1));
    public static final C2892e appmetrica = new C2892e(-169089209, false, new C7156e(4));
    public static final C2892e purchase = new C2892e(-1535354685, false, new C7156e(5));

    public static final void ad(InterfaceC6790e interfaceC6790e, InterfaceC8079e interfaceC8079e, C2892e c2892e, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(-1090171650);
        if ((i & 6) == 0) {
            i2 = ((i & 8) == 0 ? c13770e.purchase(interfaceC6790e) : c13770e.yandex(interfaceC6790e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        if ((i & 48) == 0) {
            i2 |= c13770e.purchase(interfaceC8079e) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i2 |= c13770e.yandex(c2892e) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128;
        }
        if (c13770e.m3673protected(i2 & 1, (i2 & 147) != 146)) {
            boolean z = ((i2 & 14) == 4 || ((i2 & 8) != 0 && c13770e.purchase(interfaceC6790e))) | ((i2 & 112) == 32);
            Object m3681throw = c13770e.m3681throw();
            if (z || m3681throw == C2987e.ad) {
                m3681throw = new C17250e(interfaceC8079e, interfaceC6790e);
                c13770e.m3682throws(m3681throw);
            }
            AbstractC12710e.ad((C17250e) m3681throw, null, new C15534e(1, false, false), c2892e, c13770e, ((i2 << 3) & 7168) | 384, 2);
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C9381e(i, 0, interfaceC6790e, interfaceC8079e, c2892e);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:7:0x0023, code lost:
    
        if (r1 <= r6.getHeight()) goto L10;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final defpackage.C1362e appmetrica(defpackage.C8953e r31, float r32) {
        /*
            Method dump skipped, instructions count: 238
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9357e.appmetrica(eٌۚؓ, float):eٟؒ۟");
    }

    public static void license(String str, boolean z) {
        if (!z) {
            throw C15125e.ad(null, str);
        }
    }

    public static final void metrica(InterfaceC12864e interfaceC12864e, Function0 function0, boolean z, C13770e c13770e, int i) {
        int i2;
        c13770e.m3671package(2111672474);
        if ((i & 6) == 0) {
            i2 = (c13770e.purchase(interfaceC12864e) ? 4 : 2) | i;
        } else {
            i2 = i;
        }
        int i3 = i2 | (c13770e.yandex(function0) ? 32 : 16) | (c13770e.billing(z) ? PSKKeyManager.MAX_KEY_LENGTH_BYTES : 128);
        if (c13770e.m3673protected(i3 & 1, (i3 & 147) != 146)) {
            AbstractC12534e.ad(c13770e, AbstractC5679e.metrica(AbstractC18007e.adcel(interfaceC12864e, AbstractC1163e.ad, AbstractC1163e.vip), new C11031e(function0, z)));
        } else {
            c13770e.m3659default();
        }
        C2846e subscription = c13770e.subscription();
        if (subscription != null) {
            subscription.license = new C6829e(interfaceC12864e, function0, z, i);
        }
    }

    public static int purchase(int i) {
        if (i == 20) {
            return 63750;
        }
        if (i == 30) {
            return 2250000;
        }
        switch (i) {
            case 5:
                return 80000;
            case 6:
                return 768000;
            case 7:
                return 192000;
            case 8:
                return 2250000;
            case 9:
                return 40000;
            case 10:
                return 100000;
            case 11:
                return AbstractC1815e.AUDIO_CONTENT_SAMPLING_RATE;
            case 12:
                return 7000;
            default:
                switch (i) {
                    case 14:
                        return 3062500;
                    case 15:
                        return 8000;
                    case 16:
                        return 256000;
                    case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                        return 336000;
                    case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                        return 768000;
                    default:
                        return -2147483647;
                }
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:61:0x00d0, code lost:
    
        if (r22 == false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00e6, code lost:
    
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:91:0x00d4, code lost:
    
        if (r22 != false) goto L84;
     */
    /* JADX WARN: Code restructure failed: missing block: B:97:0x00e4, code lost:
    
        if (((r21 == 1 && !r22) || (r21 == 2 && r22)) == false) goto L84;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public static final void vip(final defpackage.InterfaceC6790e r19, final boolean r20, final int r21, final boolean r22, long r23, final float r25, final defpackage.C8128e r26, defpackage.C13770e r27, final int r28, final int r29) {
        /*
            Method dump skipped, instructions count: 367
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.AbstractC9357e.vip(eؙۦِ, boolean, int, boolean, long, float, eًٕۖ, eٓؕۥ, int, int):void");
    }

    public abstract void billing();

    public abstract void yandex();
}
