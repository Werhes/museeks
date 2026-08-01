package j$.time.format;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import j$.time.LocalDate;
import j$.time.LocalDateTime;
import j$.time.LocalTime;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;

/* loaded from: classes2.dex */
public final class g implements e {
    @Override // j$.time.format.e
    public final boolean i(x xVar, StringBuilder sb) {
        Long a = xVar.a(ChronoField.INSTANT_SECONDS);
        TemporalAccessor temporalAccessor = xVar.a;
        ChronoField chronoField = ChronoField.NANO_OF_SECOND;
        Long valueOf = temporalAccessor.e(chronoField) ? Long.valueOf(temporalAccessor.B(chronoField)) : null;
        int i = 0;
        if (a == null) {
            return false;
        }
        long longValue = a.longValue();
        int a2 = chronoField.b.a(valueOf != null ? valueOf.longValue() : 0L, chronoField);
        if (longValue >= -62167219200L) {
            long j = longValue - 253402300800L;
            long W = j$.com.android.tools.r8.a.W(j, 315569520000L) + 1;
            LocalDateTime P = LocalDateTime.P(j$.com.android.tools.r8.a.V(j, 315569520000L) - 62167219200L, 0, ZoneOffset.UTC);
            if (W > 0) {
                sb.append('+');
                sb.append(W);
            }
            sb.append(P);
            if (P.b.c == 0) {
                sb.append(":00");
            }
        } else {
            long j2 = longValue + 62167219200L;
            long j3 = j2 / 315569520000L;
            long j4 = j2 % 315569520000L;
            LocalDateTime P2 = LocalDateTime.P(j4 - 62167219200L, 0, ZoneOffset.UTC);
            int length = sb.length();
            sb.append(P2);
            if (P2.b.c == 0) {
                sb.append(":00");
            }
            if (j3 < 0) {
                if (P2.a.getYear() == -10000) {
                    sb.replace(length, length + 2, Long.toString(j3 - 1));
                } else if (j4 == 0) {
                    sb.insert(length, j3);
                } else {
                    sb.insert(length + 1, Math.abs(j3));
                }
            }
        }
        if (a2 > 0) {
            sb.append('.');
            int i2 = 100000000;
            while (true) {
                if (a2 <= 0 && i % 3 == 0 && i >= -2) {
                    break;
                }
                int i3 = a2 / i2;
                sb.append((char) (i3 + 48));
                a2 -= i3 * i2;
                i2 /= 10;
                i++;
            }
        }
        sb.append('Z');
        return true;
    }

    @Override // j$.time.format.e
    public final int j(v vVar, CharSequence charSequence, int i) {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder.a(DateTimeFormatter.ISO_LOCAL_DATE);
        DateTimeFormatterBuilder appendLiteral = dateTimeFormatterBuilder.appendLiteral('T');
        ChronoField chronoField = ChronoField.HOUR_OF_DAY;
        DateTimeFormatterBuilder appendLiteral2 = appendLiteral.appendValue(chronoField, 2).appendLiteral(':');
        ChronoField chronoField2 = ChronoField.MINUTE_OF_HOUR;
        DateTimeFormatterBuilder appendLiteral3 = appendLiteral2.appendValue(chronoField2, 2).appendLiteral(':');
        ChronoField chronoField3 = ChronoField.SECOND_OF_MINUTE;
        DateTimeFormatterBuilder appendValue = appendLiteral3.appendValue(chronoField3, 2);
        ChronoField chronoField4 = ChronoField.NANO_OF_SECOND;
        int i2 = 1;
        appendValue.b(chronoField4, 0, 9, true);
        d b = appendValue.appendLiteral('Z').toFormatter().b();
        v vVar2 = new v(vVar.a);
        vVar2.b = vVar.b;
        vVar2.c = vVar.c;
        int j = b.j(vVar2, charSequence, i);
        if (j < 0) {
            return j;
        }
        long longValue = vVar2.e(ChronoField.YEAR).longValue();
        int intValue = vVar2.e(ChronoField.MONTH_OF_YEAR).intValue();
        int intValue2 = vVar2.e(ChronoField.DAY_OF_MONTH).intValue();
        int intValue3 = vVar2.e(chronoField).intValue();
        int intValue4 = vVar2.e(chronoField2).intValue();
        Long e = vVar2.e(chronoField3);
        Long e2 = vVar2.e(chronoField4);
        int intValue5 = e != null ? e.intValue() : 0;
        int intValue6 = e2 != null ? e2.intValue() : 0;
        if (intValue3 == 24 && intValue4 == 0 && intValue5 == 0 && intValue6 == 0) {
            intValue3 = 0;
        } else if (intValue3 == 23 && intValue4 == 59 && intValue5 == 60) {
            vVar.c().d = true;
            i2 = 0;
            intValue5 = 59;
        } else {
            i2 = 0;
        }
        int i3 = ((int) longValue) % ModuleDescriptor.MODULE_VERSION;
        try {
            LocalDateTime localDateTime = LocalDateTime.MIN;
            LocalDate of = LocalDate.of(i3, intValue, intValue2);
            LocalTime of2 = LocalTime.of(intValue3, intValue4, intValue5, 0);
            return vVar.g(chronoField4, intValue6, i, vVar.g(ChronoField.INSTANT_SECONDS, j$.com.android.tools.r8.a.z(new LocalDateTime(of, of2).U(of.X(i2), of2), ZoneOffset.UTC) + j$.com.android.tools.r8.a.X(longValue / 10000, 315569520000L), i, j));
        } catch (RuntimeException unused) {
            return ~i;
        }
    }

    public final String toString() {
        return "Instant()";
    }
}
