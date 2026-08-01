package j$.time.format;

import j$.time.DateTimeException;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalQuery;
import java.text.ParsePosition;
import java.util.AbstractMap;
import java.util.Map;
import java.util.Set;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public class t implements e {
    public static volatile Map.Entry c;
    public static volatile Map.Entry d;
    public final TemporalQuery a;
    public final String b;

    public t(TemporalQuery temporalQuery, String str) {
        this.a = temporalQuery;
        this.b = str;
    }

    public static int b(v vVar, CharSequence charSequence, int i, int i2, k kVar) {
        String upperCase = charSequence.subSequence(i, i2).toString().toUpperCase();
        if (i2 >= charSequence.length()) {
            vVar.f(ZoneId.of(upperCase));
            return i2;
        }
        if (charSequence.charAt(i2) == '0' || vVar.a(charSequence.charAt(i2), 'Z')) {
            vVar.f(ZoneId.of(upperCase));
            return i2;
        }
        v vVar2 = new v(vVar.a);
        vVar2.b = vVar.b;
        vVar2.c = vVar.c;
        int j = kVar.j(vVar2, charSequence, i2);
        try {
            if (j >= 0) {
                vVar.f(ZoneId.O(upperCase, ZoneOffset.ofTotalSeconds((int) vVar2.e(ChronoField.OFFSET_SECONDS).longValue())));
                return j;
            }
            if (kVar == k.e) {
                return ~i;
            }
            vVar.f(ZoneId.of(upperCase));
            return i2;
        } catch (DateTimeException unused) {
            return ~i;
        }
    }

    public n a(v vVar) {
        Set<String> set = j$.time.zone.h.d;
        int size = set.size();
        Map.Entry entry = vVar.b ? c : d;
        if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
            synchronized (this) {
                try {
                    entry = vVar.b ? c : d;
                    if (entry == null || ((Integer) entry.getKey()).intValue() != size) {
                        Integer valueOf = Integer.valueOf(size);
                        n nVar = vVar.b ? new n(BuildConfig.FLAVOR, null, null) : new n(BuildConfig.FLAVOR, null, null);
                        for (String str : set) {
                            nVar.a(str, str);
                        }
                        entry = new AbstractMap.SimpleImmutableEntry(valueOf, nVar);
                        if (vVar.b) {
                            c = entry;
                        } else {
                            d = entry;
                        }
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
        return (n) entry.getValue();
    }

    @Override // j$.time.format.e
    public boolean i(x xVar, StringBuilder sb) {
        ZoneId zoneId = (ZoneId) xVar.b(this.a);
        if (zoneId == null) {
            return false;
        }
        sb.append(zoneId.getId());
        return true;
    }

    @Override // j$.time.format.e
    public final int j(v vVar, CharSequence charSequence, int i) {
        int i2;
        int length = charSequence.length();
        if (i > length) {
            throw new IndexOutOfBoundsException();
        }
        if (i == length) {
            return ~i;
        }
        char charAt = charSequence.charAt(i);
        if (charAt == '+' || charAt == '-') {
            return b(vVar, charSequence, i, i, k.e);
        }
        int i3 = i + 2;
        if (length >= i3) {
            char charAt2 = charSequence.charAt(i + 1);
            if (vVar.a(charAt, 'U') && vVar.a(charAt2, 'T')) {
                int i4 = i + 3;
                return (length < i4 || !vVar.a(charSequence.charAt(i3), 'C')) ? b(vVar, charSequence, i, i3, k.f) : b(vVar, charSequence, i, i4, k.f);
            }
            if (vVar.a(charAt, 'G') && length >= (i2 = i + 3) && vVar.a(charAt2, 'M') && vVar.a(charSequence.charAt(i3), 'T')) {
                int i5 = i + 4;
                if (length < i5 || !vVar.a(charSequence.charAt(i2), '0')) {
                    return b(vVar, charSequence, i, i2, k.f);
                }
                vVar.f(ZoneId.of("GMT0"));
                return i5;
            }
        }
        n a = a(vVar);
        ParsePosition parsePosition = new ParsePosition(i);
        String c2 = a.c(charSequence, parsePosition);
        if (c2 != null) {
            vVar.f(ZoneId.of(c2));
            return parsePosition.getIndex();
        }
        if (!vVar.a(charAt, 'Z')) {
            return ~i;
        }
        vVar.f(ZoneOffset.UTC);
        return i + 1;
    }

    public final String toString() {
        return this.b;
    }
}
