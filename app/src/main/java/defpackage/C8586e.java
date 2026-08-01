package defpackage;

import android.graphics.Color;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٌٍَ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public final class C8586e {
    public final String ad;
    public final int adcel;
    public final float appmetrica;
    public final boolean billing;
    public final Integer license;
    public final Integer metrica;
    public final boolean purchase;
    public final boolean startapp;
    public final int vip;
    public final boolean yandex;

    public C8586e(String str, int i, Integer num, Integer num2, float f, boolean z, boolean z2, boolean z3, boolean z4, int i2) {
        this.ad = str;
        this.vip = i;
        this.metrica = num;
        this.license = num2;
        this.appmetrica = f;
        this.purchase = z;
        this.billing = z2;
        this.yandex = z3;
        this.startapp = z4;
        this.adcel = i2;
    }

    public static int ad(String str) {
        boolean z;
        try {
            int parseInt = Integer.parseInt(str.trim());
            switch (parseInt) {
                case 1:
                case 2:
                case 3:
                case 4:
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    z = true;
                    break;
                default:
                    z = false;
                    break;
            }
            if (z) {
                return parseInt;
            }
        } catch (NumberFormatException unused) {
        }
        AbstractC17861e.applovin("Ignoring unknown alignment: ", str, "SsaStyle");
        return -1;
    }

    public static Integer metrica(String str) {
        try {
            long parseLong = str.startsWith("&H") ? Long.parseLong(str.substring(2), 16) : Long.parseLong(str);
            AbstractC2301e.billing(parseLong <= 4294967295L);
            return Integer.valueOf(Color.argb(AbstractC10509e.purchase(((parseLong >> 24) & 255) ^ 255), AbstractC10509e.purchase(parseLong & 255), AbstractC10509e.purchase((parseLong >> 8) & 255), AbstractC10509e.purchase((parseLong >> 16) & 255)));
        } catch (IllegalArgumentException e) {
            AbstractC2803e.amazon("SsaStyle", "Failed to parse color expression: '" + str + "'", e);
            return null;
        }
    }

    public static boolean vip(String str) {
        try {
            int parseInt = Integer.parseInt(str);
            return parseInt == 1 || parseInt == -1;
        } catch (NumberFormatException e) {
            AbstractC2803e.amazon("SsaStyle", "Failed to parse boolean value: '" + str + "'", e);
            return false;
        }
    }
}
