package defpackage;

import android.content.Context;
import ua.itaysonlab.vkx.activity.AppActivity;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُْ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13201e {
    public static C11648e appmetrica;
    public static C1362e license;
    public static C14434e purchase;
    public static final C2892e ad = new C2892e(1357457988, false, new C15480e(11));
    public static final C2892e vip = new C2892e(2046510101, false, new C15480e(12));
    public static final C2892e metrica = new C2892e(557900734, false, new C15480e(13));

    public static final InterfaceC12864e ad(InterfaceC12864e interfaceC12864e, float f, long j, InterfaceC16154e interfaceC16154e) {
        return interfaceC12864e.premium(new C16436e(f, new C18466e(j), interfaceC16154e));
    }

    public static final long appmetrica(float f, long j) {
        float max = Math.max(0.0f, Float.intBitsToFloat((int) (j >> 32)) - f);
        float max2 = Math.max(0.0f, Float.intBitsToFloat((int) (j & 4294967295L)) - f);
        return (Float.floatToRawIntBits(max) << 32) | (Float.floatToRawIntBits(max2) & 4294967295L);
    }

    public static void license(Context context, InterfaceC4079e interfaceC4079e) {
        vip(context, interfaceC4079e, C0086e.billing);
    }

    public static final void metrica(AppActivity appActivity, InterfaceC1686e interfaceC1686e, C0086e c0086e) {
        InterfaceC5083e interfaceC5083e = null;
        if (c0086e.metrica.isEmpty()) {
            AbstractC16519e.vip(appActivity, new C9697e(interfaceC1686e, c0086e, interfaceC5083e, 1));
            return;
        }
        C18220e billing = AbstractC17947e.billing(appActivity);
        C15420e c15420e = AbstractC6731e.ad;
        AbstractC5336e.purchase(billing, ExecutorC3603e.f8134e, 0, new C9697e(interfaceC1686e, c0086e, interfaceC5083e, 0), 2);
    }

    public static long purchase(String str) {
        int i;
        int length = str.length();
        if (length < 0) {
            throw new IllegalArgumentException(AbstractC1786e.Signature(length, 0, "endIndex < beginIndex: ", " < ").toString());
        }
        if (length > str.length()) {
            StringBuilder premium = AbstractC4653e.premium("endIndex > string.length: ", length, " > ");
            premium.append(str.length());
            throw new IllegalArgumentException(premium.toString().toString());
        }
        long j = 0;
        int i2 = 0;
        while (i2 < length) {
            char charAt = str.charAt(i2);
            if (charAt < 128) {
                j++;
            } else {
                if (charAt < 2048) {
                    i = 2;
                } else if (charAt < 55296 || charAt > 57343) {
                    i = 3;
                } else {
                    int i3 = i2 + 1;
                    char charAt2 = i3 < length ? str.charAt(i3) : (char) 0;
                    if (charAt > 56319 || charAt2 < 56320 || charAt2 > 57343) {
                        j++;
                        i2 = i3;
                    } else {
                        j += 4;
                        i2 += 2;
                    }
                }
                j += i;
            }
            i2++;
        }
        return j;
    }

    public static final void vip(Context context, InterfaceC1686e interfaceC1686e, C0086e c0086e) {
        AppActivity appActivity = context instanceof AppActivity ? (AppActivity) context : null;
        if (appActivity != null) {
            metrica(appActivity, interfaceC1686e, c0086e);
        }
    }
}
