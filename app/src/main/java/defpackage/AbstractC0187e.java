package defpackage;

import j$.util.DesugarTimeZone;
import java.util.Calendar;
import java.util.Locale;
import java.util.TimeZone;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًؑٗ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC0187e {
    public static final TimeZone ad = DesugarTimeZone.getTimeZone("GMT");
    public static final int[] vip = {0, 31, 59, 90, 120, 151, 181, 212, 243, 273, 304, 334};
    public static final int[] metrica = {0, 31, 60, 91, 121, 152, 182, 213, 244, 274, 305, 335};

    public static final C17476e ad(int i, int i2, int i3, int i4, EnumC15009e enumC15009e, int i5) {
        Calendar calendar = Calendar.getInstance(ad, Locale.ROOT);
        calendar.set(1, i5);
        calendar.set(2, enumC15009e.ordinal());
        calendar.set(5, i4);
        calendar.set(11, i3);
        calendar.set(12, i2);
        calendar.set(13, i);
        calendar.set(14, 0);
        return new C17476e(calendar.get(13), calendar.get(12), calendar.get(11), (EnumC18164e) EnumC18164e.f35586e.get((calendar.get(7) + 5) % 7), calendar.get(5), calendar.get(6), (EnumC15009e) EnumC15009e.f29734e.get(calendar.get(2)), calendar.get(1), calendar.getTimeInMillis() + calendar.get(16) + calendar.get(15));
    }

    public static final C17476e vip(Long l) {
        int i;
        int i2;
        long longValue = l != null ? l.longValue() : System.currentTimeMillis();
        long j = longValue / 1000;
        if (longValue - (1000 * j) != 0 && (((1000 ^ longValue) >> 63) | 1) < 0) {
            j--;
        }
        long j2 = j % 86400;
        if (j2 == 0) {
            j2 = 0;
        } else if ((((j ^ 86400) >> 63) | 1) <= 0) {
            j2 += 86400;
        }
        long j3 = 60;
        int i3 = (int) (j2 % j3);
        int i4 = (int) ((j2 / j3) % j3);
        int i5 = (int) (j2 / 3600);
        long j4 = j / 86400;
        if (j - (86400 * j4) != 0 && (((j ^ 86400) >> 63) | 1) < 0) {
            j4--;
        }
        int i6 = (int) j4;
        EnumC18164e enumC18164e = (EnumC18164e) EnumC18164e.f35586e.get(((i6 % 7) + 10) % 7);
        int i7 = 719468 + i6;
        if (i7 >= 0) {
            i = i7 / 146097;
            i2 = i7 % 146097;
        } else {
            i = (i6 + 573372) / 146097;
            i2 = i7 - (146097 * i);
        }
        int i8 = (((i2 / 36524) + (i2 - (i2 / 1460))) - (i2 / 146096)) / 365;
        int i9 = (i * 400) + i8;
        int i10 = i2 - (((i8 / 4) + (i8 * 365)) - (i8 / 100));
        int i11 = ((i10 * 5) + 2) / 153;
        int i12 = (i10 - (((i11 * 153) + 2) / 5)) + 1;
        int i13 = i11 < 10 ? i11 + 2 : i11 - 10;
        if (i13 <= 1) {
            i9++;
        }
        int i14 = i9;
        return new C17476e(i3, i4, i5, enumC18164e, i12, ((i14 % 4 != 0 || (i14 % 100 == 0 && i14 % 400 != 0)) ? vip : metrica)[i13] + i12, (EnumC15009e) EnumC15009e.f29734e.get(i13), i14, longValue);
    }
}
