package j$.time.format;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.util.Objects;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Map;

/* loaded from: classes2.dex */
public final class DateTimeFormatterBuilder {
    public static final j$.time.d h = new j$.time.d(5);
    public static final Map i;
    public DateTimeFormatterBuilder a;
    public final DateTimeFormatterBuilder b;
    public final List c;
    public final boolean d;
    public int e;
    public char f;
    public int g;

    static {
        HashMap hashMap = new HashMap();
        i = hashMap;
        hashMap.put('G', ChronoField.ERA);
        hashMap.put('y', ChronoField.YEAR_OF_ERA);
        hashMap.put('u', ChronoField.YEAR);
        j$.time.temporal.g gVar = j$.time.temporal.i.a;
        hashMap.put('Q', gVar);
        hashMap.put('q', gVar);
        ChronoField chronoField = ChronoField.MONTH_OF_YEAR;
        hashMap.put('M', chronoField);
        hashMap.put('L', chronoField);
        hashMap.put('D', ChronoField.DAY_OF_YEAR);
        hashMap.put('d', ChronoField.DAY_OF_MONTH);
        hashMap.put('F', ChronoField.ALIGNED_DAY_OF_WEEK_IN_MONTH);
        ChronoField chronoField2 = ChronoField.DAY_OF_WEEK;
        hashMap.put('E', chronoField2);
        hashMap.put('c', chronoField2);
        hashMap.put('e', chronoField2);
        hashMap.put('a', ChronoField.AMPM_OF_DAY);
        hashMap.put('H', ChronoField.HOUR_OF_DAY);
        hashMap.put('k', ChronoField.CLOCK_HOUR_OF_DAY);
        hashMap.put('K', ChronoField.HOUR_OF_AMPM);
        hashMap.put('h', ChronoField.CLOCK_HOUR_OF_AMPM);
        hashMap.put('m', ChronoField.MINUTE_OF_HOUR);
        hashMap.put('s', ChronoField.SECOND_OF_MINUTE);
        ChronoField chronoField3 = ChronoField.NANO_OF_SECOND;
        hashMap.put('S', chronoField3);
        hashMap.put('A', ChronoField.MILLI_OF_DAY);
        hashMap.put('n', chronoField3);
        hashMap.put('N', ChronoField.NANO_OF_DAY);
        hashMap.put('g', j$.time.temporal.k.a);
    }

    public DateTimeFormatterBuilder() {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = null;
        this.d = false;
    }

    public DateTimeFormatterBuilder(DateTimeFormatterBuilder dateTimeFormatterBuilder) {
        this.a = this;
        this.c = new ArrayList();
        this.g = -1;
        this.b = dateTimeFormatterBuilder;
        this.d = true;
    }

    public final void a(DateTimeFormatter dateTimeFormatter) {
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        c(dateTimeFormatter.b());
    }

    public DateTimeFormatterBuilder appendLiteral(char c) {
        c(new c(c));
        return this;
    }

    public DateTimeFormatterBuilder appendOffset(String str, String str2) {
        c(new k(str, str2));
        return this;
    }

    public DateTimeFormatterBuilder appendOffsetId() {
        c(k.e);
        return this;
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i2) {
        Objects.requireNonNull(temporalField, "field");
        if (i2 >= 1 && i2 <= 19) {
            h(new j(temporalField, i2, i2, SignStyle.NOT_NEGATIVE));
            return this;
        }
        throw new IllegalArgumentException("The width must be from 1 to 19 inclusive but was " + i2);
    }

    public DateTimeFormatterBuilder appendValue(TemporalField temporalField, int i2, int i3, SignStyle signStyle) {
        if (i2 == i3 && signStyle == SignStyle.NOT_NEGATIVE) {
            return appendValue(temporalField, i3);
        }
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(signStyle, "signStyle");
        if (i2 < 1 || i2 > 19) {
            throw new IllegalArgumentException("The minimum width must be from 1 to 19 inclusive but was " + i2);
        }
        if (i3 < 1 || i3 > 19) {
            throw new IllegalArgumentException("The maximum width must be from 1 to 19 inclusive but was " + i3);
        }
        if (i3 >= i2) {
            h(new j(temporalField, i2, i3, signStyle));
            return this;
        }
        throw new IllegalArgumentException("The maximum width must exceed or equal the minimum width but " + i3 + " < " + i2);
    }

    public final void b(ChronoField chronoField, int i2, int i3, boolean z) {
        if (i2 != i3 || z) {
            c(new f(chronoField, i2, i3, z));
        } else {
            h(new f(chronoField, i2, i3, z));
        }
    }

    public final int c(e eVar) {
        Objects.requireNonNull(eVar, "pp");
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.e;
        if (i2 > 0) {
            if (eVar != null) {
                eVar = new l(eVar, i2, dateTimeFormatterBuilder.f);
            }
            dateTimeFormatterBuilder.e = 0;
            dateTimeFormatterBuilder.f = (char) 0;
        }
        ((ArrayList) dateTimeFormatterBuilder.c).add(eVar);
        this.a.g = -1;
        return ((ArrayList) r5.c).size() - 1;
    }

    public final void d(String str) {
        Objects.requireNonNull(str, "literal");
        if (str.isEmpty()) {
            return;
        }
        if (str.length() == 1) {
            c(new c(str.charAt(0)));
        } else {
            c(new h(1, str));
        }
    }

    public final void e(TextStyle textStyle) {
        Objects.requireNonNull(textStyle, "style");
        if (textStyle != TextStyle.FULL && textStyle != TextStyle.SHORT) {
            throw new IllegalArgumentException("Style must be either full or short");
        }
        c(new h(0, textStyle));
    }

    public final void f(ChronoField chronoField, Map map) {
        Objects.requireNonNull(chronoField, "field");
        Objects.requireNonNull(map, "textLookup");
        LinkedHashMap linkedHashMap = new LinkedHashMap(map);
        TextStyle textStyle = TextStyle.FULL;
        c(new r(chronoField, textStyle, new a(new z(Collections.singletonMap(textStyle, linkedHashMap)))));
    }

    public final void g(TemporalField temporalField, TextStyle textStyle) {
        Objects.requireNonNull(temporalField, "field");
        Objects.requireNonNull(textStyle, "textStyle");
        c(new r(temporalField, textStyle, a0.c));
    }

    public final void h(j jVar) {
        j d;
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        int i2 = dateTimeFormatterBuilder.g;
        if (i2 < 0) {
            dateTimeFormatterBuilder.g = c(jVar);
            return;
        }
        j jVar2 = (j) ((ArrayList) dateTimeFormatterBuilder.c).get(i2);
        int i3 = jVar.b;
        int i4 = jVar.c;
        if (i3 == i4 && jVar.d == SignStyle.NOT_NEGATIVE) {
            d = jVar2.e(i4);
            c(jVar.d());
            this.a.g = i2;
        } else {
            d = jVar2.d();
            this.a.g = c(jVar);
        }
        ((ArrayList) this.a.c).set(i2, d);
    }

    public final void i(TemporalField temporalField) {
        Objects.requireNonNull(temporalField, "field");
        h(new j(temporalField, 1, 19, SignStyle.NORMAL));
    }

    public final void j() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        if (dateTimeFormatterBuilder.b == null) {
            throw new IllegalStateException("Cannot call optionalEnd() as there was no previous call to optionalStart()");
        }
        if (((ArrayList) dateTimeFormatterBuilder.c).size() <= 0) {
            this.a = this.a.b;
            return;
        }
        DateTimeFormatterBuilder dateTimeFormatterBuilder2 = this.a;
        d dVar = new d(dateTimeFormatterBuilder2.c, dateTimeFormatterBuilder2.d);
        this.a = this.a.b;
        c(dVar);
    }

    public final void k() {
        DateTimeFormatterBuilder dateTimeFormatterBuilder = this.a;
        dateTimeFormatterBuilder.g = -1;
        this.a = new DateTimeFormatterBuilder(dateTimeFormatterBuilder);
    }

    public final DateTimeFormatter l(d0 d0Var, j$.time.chrono.j jVar) {
        return m(Locale.getDefault(), d0Var, jVar);
    }

    public final DateTimeFormatter m(Locale locale, d0 d0Var, j$.time.chrono.j jVar) {
        Objects.requireNonNull(locale, "locale");
        while (this.a.b != null) {
            j();
        }
        d dVar = new d(this.c, false);
        b0 b0Var = b0.a;
        return new DateTimeFormatter(dVar, locale, d0Var, jVar);
    }

    public DateTimeFormatterBuilder parseCaseInsensitive() {
        c(q.INSENSITIVE);
        return this;
    }

    public DateTimeFormatter toFormatter() {
        return m(Locale.getDefault(), d0.SMART, null);
    }
}
