package j$.time.format;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;
import java.io.IOException;
import java.util.HashMap;
import java.util.Locale;

/* loaded from: classes2.dex */
public final class DateTimeFormatter {
    public static final DateTimeFormatter ISO_LOCAL_DATE;
    public static final DateTimeFormatter RFC_1123_DATE_TIME;
    public static final DateTimeFormatter f;
    public static final DateTimeFormatter g;
    public static final DateTimeFormatter h;
    public final d a;
    public final Locale b;
    public final b0 c;
    public final d0 d;
    public final j$.time.chrono.j e;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v11, types: [j$.time.format.e, java.lang.Object] */
    static {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        ChronoField chronoField = ChronoField.YEAR;
        SignStyle signStyle = SignStyle.EXCEEDS_PAD;
        DateTimeFormatterBuilder appendLiteral = dateTimeFormatterBuilder.appendValue(chronoField, 4, 10, signStyle).appendLiteral('-');
        ChronoField chronoField2 = ChronoField.MONTH_OF_YEAR;
        DateTimeFormatterBuilder appendLiteral2 = appendLiteral.appendValue(chronoField2, 2).appendLiteral('-');
        ChronoField chronoField3 = ChronoField.DAY_OF_MONTH;
        DateTimeFormatterBuilder appendValue = appendLiteral2.appendValue(chronoField3, 2);
        d0 d0Var = d0.STRICT;
        j$.time.chrono.q qVar = j$.time.chrono.q.c;
        DateTimeFormatter l = appendValue.l(d0Var, qVar);
        ISO_LOCAL_DATE = l;
        DateTimeFormatterBuilder parseCaseInsensitive = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive.a(l);
        parseCaseInsensitive.appendOffsetId().l(d0Var, qVar);
        DateTimeFormatterBuilder parseCaseInsensitive2 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive2.a(l);
        parseCaseInsensitive2.k();
        parseCaseInsensitive2.appendOffsetId().l(d0Var, qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = new DateTimeFormatterBuilder();
        ChronoField chronoField4 = ChronoField.HOUR_OF_DAY;
        DateTimeFormatterBuilder appendLiteral3 = dateTimeFormatterBuilder2.appendValue(chronoField4, 2).appendLiteral(':');
        ChronoField chronoField5 = ChronoField.MINUTE_OF_HOUR;
        DateTimeFormatterBuilder appendValue2 = appendLiteral3.appendValue(chronoField5, 2);
        appendValue2.k();
        DateTimeFormatterBuilder appendLiteral4 = appendValue2.appendLiteral(':');
        ChronoField chronoField6 = ChronoField.SECOND_OF_MINUTE;
        DateTimeFormatterBuilder appendValue3 = appendLiteral4.appendValue(chronoField6, 2);
        appendValue3.k();
        appendValue3.b(ChronoField.NANO_OF_SECOND, 0, 9, true);
        DateTimeFormatter l2 = appendValue3.l(d0Var, null);
        f = l2;
        DateTimeFormatterBuilder parseCaseInsensitive3 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive3.a(l2);
        parseCaseInsensitive3.appendOffsetId().l(d0Var, null);
        DateTimeFormatterBuilder parseCaseInsensitive4 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive4.a(l2);
        parseCaseInsensitive4.k();
        parseCaseInsensitive4.appendOffsetId().l(d0Var, null);
        DateTimeFormatterBuilder parseCaseInsensitive5 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive5.a(l);
        DateTimeFormatterBuilder appendLiteral5 = parseCaseInsensitive5.appendLiteral('T');
        appendLiteral5.a(l2);
        DateTimeFormatter l3 = appendLiteral5.l(d0Var, qVar);
        g = l3;
        DateTimeFormatterBuilder parseCaseInsensitive6 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive6.a(l3);
        q qVar2 = q.LENIENT;
        parseCaseInsensitive6.c(qVar2);
        DateTimeFormatterBuilder appendOffsetId = parseCaseInsensitive6.appendOffsetId();
        q qVar3 = q.STRICT;
        appendOffsetId.c(qVar3);
        DateTimeFormatter l4 = appendOffsetId.l(d0Var, qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder3 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder3.a(l4);
        dateTimeFormatterBuilder3.k();
        DateTimeFormatterBuilder appendLiteral6 = dateTimeFormatterBuilder3.appendLiteral('[');
        q qVar4 = q.SENSITIVE;
        appendLiteral6.c(qVar4);
        j$.time.d dVar = DateTimeFormatterBuilder.h;
        appendLiteral6.c(new t(dVar, "ZoneRegionId()"));
        appendLiteral6.appendLiteral(']').l(d0Var, qVar);
        DateTimeFormatterBuilder dateTimeFormatterBuilder4 = new DateTimeFormatterBuilder();
        dateTimeFormatterBuilder4.a(l3);
        dateTimeFormatterBuilder4.k();
        DateTimeFormatterBuilder appendOffsetId2 = dateTimeFormatterBuilder4.appendOffsetId();
        appendOffsetId2.k();
        DateTimeFormatterBuilder appendLiteral7 = appendOffsetId2.appendLiteral('[');
        appendLiteral7.c(qVar4);
        appendLiteral7.c(new t(dVar, "ZoneRegionId()"));
        appendLiteral7.appendLiteral(']').l(d0Var, qVar);
        DateTimeFormatterBuilder appendValue4 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(chronoField, 4, 10, signStyle).appendLiteral('-').appendValue(ChronoField.DAY_OF_YEAR, 3);
        appendValue4.k();
        appendValue4.appendOffsetId().l(d0Var, qVar);
        DateTimeFormatterBuilder appendValue5 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(j$.time.temporal.i.c, 4, 10, signStyle);
        appendValue5.d("-W");
        DateTimeFormatterBuilder appendLiteral8 = appendValue5.appendValue(j$.time.temporal.i.b, 2).appendLiteral('-');
        ChronoField chronoField7 = ChronoField.DAY_OF_WEEK;
        DateTimeFormatterBuilder appendValue6 = appendLiteral8.appendValue(chronoField7, 1);
        appendValue6.k();
        appendValue6.appendOffsetId().l(d0Var, qVar);
        DateTimeFormatterBuilder parseCaseInsensitive7 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive7.getClass();
        parseCaseInsensitive7.c(new Object());
        h = parseCaseInsensitive7.l(d0Var, null);
        DateTimeFormatterBuilder appendValue7 = new DateTimeFormatterBuilder().parseCaseInsensitive().appendValue(chronoField, 4).appendValue(chronoField2, 2).appendValue(chronoField3, 2);
        appendValue7.k();
        appendValue7.c(qVar2);
        DateTimeFormatterBuilder appendOffset = appendValue7.appendOffset("+HHMMss", "Z");
        appendOffset.c(qVar3);
        appendOffset.l(d0Var, qVar);
        HashMap hashMap = new HashMap();
        hashMap.put(1L, "Mon");
        hashMap.put(2L, "Tue");
        hashMap.put(3L, "Wed");
        hashMap.put(4L, "Thu");
        hashMap.put(5L, "Fri");
        hashMap.put(6L, "Sat");
        hashMap.put(7L, "Sun");
        HashMap hashMap2 = new HashMap();
        hashMap2.put(1L, "Jan");
        hashMap2.put(2L, "Feb");
        hashMap2.put(3L, "Mar");
        hashMap2.put(4L, "Apr");
        hashMap2.put(5L, "May");
        hashMap2.put(6L, "Jun");
        hashMap2.put(7L, "Jul");
        hashMap2.put(8L, "Aug");
        hashMap2.put(9L, "Sep");
        hashMap2.put(10L, "Oct");
        hashMap2.put(11L, "Nov");
        hashMap2.put(12L, "Dec");
        DateTimeFormatterBuilder parseCaseInsensitive8 = new DateTimeFormatterBuilder().parseCaseInsensitive();
        parseCaseInsensitive8.c(qVar2);
        parseCaseInsensitive8.k();
        parseCaseInsensitive8.f(chronoField7, hashMap);
        parseCaseInsensitive8.d(", ");
        parseCaseInsensitive8.j();
        DateTimeFormatterBuilder appendLiteral9 = parseCaseInsensitive8.appendValue(chronoField3, 1, 2, SignStyle.NOT_NEGATIVE).appendLiteral(' ');
        appendLiteral9.f(chronoField2, hashMap2);
        DateTimeFormatterBuilder appendValue8 = appendLiteral9.appendLiteral(' ').appendValue(chronoField, 4).appendLiteral(' ').appendValue(chronoField4, 2).appendLiteral(':').appendValue(chronoField5, 2);
        appendValue8.k();
        DateTimeFormatterBuilder appendValue9 = appendValue8.appendLiteral(':').appendValue(chronoField6, 2);
        appendValue9.j();
        RFC_1123_DATE_TIME = appendValue9.appendLiteral(' ').appendOffset("+HHMM", "GMT").l(d0.SMART, qVar);
    }

    public DateTimeFormatter(d dVar, Locale locale, d0 d0Var, j$.time.chrono.j jVar) {
        b0 b0Var = b0.a;
        this.a = (d) Objects.requireNonNull(dVar, "printerParser");
        this.b = (Locale) Objects.requireNonNull(locale, "locale");
        this.c = (b0) Objects.requireNonNull(b0Var, "decimalStyle");
        this.d = (d0) Objects.requireNonNull(d0Var, "resolverStyle");
        this.e = jVar;
    }

    public static DateTimeFormatter ofLocalizedDateTime(FormatStyle formatStyle, FormatStyle formatStyle2) {
        Objects.requireNonNull(formatStyle, "dateStyle");
        Objects.requireNonNull(formatStyle2, "timeStyle");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = new DateTimeFormatterBuilder();
        if (formatStyle == null && formatStyle2 == null) {
            throw new IllegalArgumentException("Either the date or time style must be non-null");
        }
        dateTimeFormatterBuilder.c(new i(formatStyle, formatStyle2));
        return dateTimeFormatterBuilder.l(d0.SMART, j$.time.chrono.q.c);
    }

    /* JADX WARN: Code restructure failed: missing block: B:99:0x0329, code lost:
    
        if (((java.util.HashMap) r8.a).containsKey(j$.time.temporal.ChronoField.SECOND_OF_MINUTE) != false) goto L127;
     */
    /* JADX WARN: Removed duplicated region for block: B:106:0x0381  */
    /* JADX WARN: Removed duplicated region for block: B:110:0x0393  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x03b9  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:77:0x02be  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x02c5  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x02e5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x02f3  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x0307  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final j$.time.format.c0 a(java.lang.CharSequence r27) {
        /*
            Method dump skipped, instructions count: 1101
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.time.format.DateTimeFormatter.a(java.lang.CharSequence):j$.time.format.c0");
    }

    public final d b() {
        d dVar = this.a;
        return !dVar.b ? dVar : new d(dVar.a, false);
    }

    public String format(TemporalAccessor temporalAccessor) {
        StringBuilder sb = new StringBuilder(32);
        d dVar = this.a;
        Objects.requireNonNull(temporalAccessor, "temporal");
        Objects.requireNonNull(sb, "appendable");
        try {
            dVar.i(new x(temporalAccessor, this), sb);
            return sb.toString();
        } catch (IOException e) {
            throw new RuntimeException(e.getMessage(), e);
        }
    }

    public <T> T parse(CharSequence charSequence, TemporalQuery<T> temporalQuery) {
        String charSequence2;
        Objects.requireNonNull(charSequence, "text");
        Objects.requireNonNull(temporalQuery, "query");
        try {
            return (T) a(charSequence).D(temporalQuery);
        } catch (DateTimeParseException e) {
            throw e;
        } catch (RuntimeException e2) {
            if (charSequence.length() > 64) {
                charSequence2 = charSequence.subSequence(0, 64).toString() + "...";
            } else {
                charSequence2 = charSequence.toString();
            }
            RuntimeException runtimeException = new RuntimeException("Text '" + charSequence2 + "' could not be parsed: " + e2.getMessage(), e2);
            charSequence.toString();
            throw runtimeException;
        }
    }

    public final String toString() {
        String dVar = this.a.toString();
        return dVar.startsWith("[") ? dVar : dVar.substring(1, dVar.length() - 1);
    }
}
