package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.os.Build;
import androidx.camera.camera2.compat.quirk.ExtraSupportedSurfaceCombinationsQuirk;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Iterator;
import java.util.Locale;
import ua.itaysonlab.vkx.R;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eْۛ۠, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC13510e {
    public static final C2892e ad = new C2892e(-2046479553, false, new C7156e(0));
    public static final C2892e vip = new C2892e(-2004531282, false, new C7156e(1));
    public static final C2892e metrica = new C2892e(888630450, false, new C7156e(2));

    public static final boolean ad(C1839e c1839e) {
        C15803e c15803e;
        C0965e c0965e = c1839e.metrica;
        C14591e c14591e = (c0965e == null || (c15803e = c0965e.vip) == null) ? null : new C14591e(c15803e.vip);
        boolean z = false;
        if (c14591e != null && c14591e.ad == 1) {
            z = true;
        }
        return !z;
    }

    public static boolean appmetrica() {
        if (AbstractC6507e.loadAd(Build.MANUFACTURER, "Samsung", true) || AbstractC6507e.loadAd(Build.BRAND, "Samsung", true)) {
            String upperCase = Build.MODEL.toUpperCase(Locale.ROOT);
            Iterator it = ExtraSupportedSurfaceCombinationsQuirk.license.iterator();
            while (it.hasNext()) {
                if (AbstractC6507e.pro(upperCase, (String) it.next(), false)) {
                    return true;
                }
            }
        }
        return false;
    }

    public static boolean license() {
        if (!AbstractC6507e.loadAd(Build.MANUFACTURER, "Google", true) && !AbstractC6507e.loadAd(Build.BRAND, "Google", true)) {
            return false;
        }
        return ExtraSupportedSurfaceCombinationsQuirk.metrica.contains(Build.MODEL.toUpperCase(Locale.ROOT));
    }

    public static String metrica(Context context, long j) {
        Resources resources = context.getResources();
        long j2 = 1000;
        long currentTimeMillis = (System.currentTimeMillis() / j2) - j;
        if (currentTimeMillis < 14400 && currentTimeMillis >= 0) {
            if (currentTimeMillis >= 10800) {
                return resources.getStringArray(R.array.date_ago_hrs)[2];
            }
            if (currentTimeMillis >= 7200) {
                return resources.getStringArray(R.array.date_ago_hrs)[1];
            }
            if (currentTimeMillis >= 3600) {
                return resources.getStringArray(R.array.date_ago_hrs)[0];
            }
            if (currentTimeMillis >= 60) {
                int i = (int) (currentTimeMillis / 60);
                return resources.getQuantityString(R.plurals.date_ago_mins, i, Integer.valueOf(i));
            }
            if (currentTimeMillis <= 10) {
                return resources.getString(R.string.date_ago_now);
            }
            int i2 = (int) currentTimeMillis;
            return resources.getQuantityString(R.plurals.date_ago_secs, i2, Integer.valueOf(i2));
        }
        Resources resources2 = context.getResources();
        long j3 = j * j2;
        Calendar calendar = Calendar.getInstance();
        int i3 = calendar.get(1);
        calendar.set(12, 0);
        calendar.set(11, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        long timeInMillis = calendar.getTimeInMillis();
        long j4 = timeInMillis + 86400000;
        long j5 = timeInMillis - 86400000;
        calendar.setTimeInMillis(j3);
        long j6 = timeInMillis + 172799999;
        if (j4 <= j3 && j3 <= j6) {
            return String.format(Locale.ENGLISH, "%s %s %d:%02d", Arrays.copyOf(new Object[]{resources2.getString(R.string.tomorrow), resources2.getString(calendar.get(11) == 1 ? R.string.date_at_1am : R.string.date_at), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12))}, 4));
        }
        long j7 = timeInMillis + 86399999;
        if (timeInMillis <= j3 && j3 <= j7) {
            return String.format(Locale.ENGLISH, "%s %s %d:%02d", Arrays.copyOf(new Object[]{resources2.getString(R.string.today), resources2.getString(calendar.get(11) == 1 ? R.string.date_at_1am : R.string.date_at), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12))}, 4));
        }
        if (j3 >= j5 && j3 < timeInMillis) {
            return String.format(Locale.ENGLISH, "%s %s %d:%02d", Arrays.copyOf(new Object[]{resources2.getString(R.string.yesterday), resources2.getString(calendar.get(11) == 1 ? R.string.date_at_1am : R.string.date_at), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12))}, 4));
        }
        return AbstractC8703e.tapsense(new Object[]{resources2.getString(calendar.get(11) == 1 ? R.string.date_at_1am : R.string.date_at), Integer.valueOf(calendar.get(11)), Integer.valueOf(calendar.get(12))}, 3, Locale.ENGLISH, " %s %d:%02d", AbstractC8703e.inmobi(calendar.get(1) != i3 ? resources2.getString(R.string.date_format_day_month_year, Integer.valueOf(calendar.get(5)), resources2.getStringArray(R.array.date_shortmonths)[Math.min(calendar.get(2), 11)], Integer.valueOf(calendar.get(1))) : resources2.getString(R.string.date_format_day_month, Integer.valueOf(calendar.get(5)), resources2.getStringArray(R.array.date_shortmonths)[Math.min(calendar.get(2), 11)])));
    }

    public static final C1733e purchase(String str, boolean z, int i) {
        return new C1733e(str, i, null, z);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [eْْۜ, eًٜؗ] */
    public static final C8063e vip(String str) {
        return new AbstractC13518e(str, new C10068e(5), Boolean.FALSE);
    }
}
