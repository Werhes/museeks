package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class DayOfWeek implements TemporalAccessor, j$.time.temporal.m {
    public static final DayOfWeek FRIDAY;
    public static final DayOfWeek MONDAY;
    public static final DayOfWeek SATURDAY;
    public static final DayOfWeek SUNDAY;
    public static final DayOfWeek THURSDAY;
    public static final DayOfWeek TUESDAY;
    public static final DayOfWeek WEDNESDAY;
    public static final DayOfWeek[] a;
    public static final /* synthetic */ DayOfWeek[] b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.DayOfWeek, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r11v1, types: [j$.time.DayOfWeek, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j$.time.DayOfWeek, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [j$.time.DayOfWeek, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [j$.time.DayOfWeek, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [j$.time.DayOfWeek, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [j$.time.DayOfWeek, java.lang.Enum] */
    static {
        ?? r0 = new Enum("MONDAY", 0);
        MONDAY = r0;
        ?? r1 = new Enum("TUESDAY", 1);
        TUESDAY = r1;
        ?? r3 = new Enum("WEDNESDAY", 2);
        WEDNESDAY = r3;
        ?? r5 = new Enum("THURSDAY", 3);
        THURSDAY = r5;
        ?? r7 = new Enum("FRIDAY", 4);
        FRIDAY = r7;
        ?? r9 = new Enum("SATURDAY", 5);
        SATURDAY = r9;
        ?? r11 = new Enum("SUNDAY", 6);
        SUNDAY = r11;
        b = new DayOfWeek[]{r0, r1, r3, r5, r7, r9, r11};
        a = values();
    }

    public static DayOfWeek M(int i) {
        if (i >= 1 && i <= 7) {
            return a[i - 1];
        }
        throw new DateTimeException("Invalid value for DayOfWeek: " + i);
    }

    public static DayOfWeek valueOf(String str) {
        return (DayOfWeek) Enum.valueOf(DayOfWeek.class, str);
    }

    public static DayOfWeek[] values() {
        return (DayOfWeek[]) b.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long B(TemporalField temporalField) {
        if (temporalField == ChronoField.DAY_OF_WEEK) {
            return getValue();
        }
        if (temporalField instanceof ChronoField) {
            throw new DateTimeException(b.a("Unsupported field: ", temporalField));
        }
        return temporalField.x(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.p.c ? j$.time.temporal.a.DAYS : j$.time.temporal.p.c(this, temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.DAY_OF_WEEK : temporalField != null && temporalField.i(this);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(TemporalField temporalField) {
        return temporalField == ChronoField.DAY_OF_WEEK ? getValue() : j$.time.temporal.p.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(TemporalField temporalField) {
        return temporalField == ChronoField.DAY_OF_WEEK ? temporalField.n() : j$.time.temporal.p.d(this, temporalField);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return lVar.c(getValue(), ChronoField.DAY_OF_WEEK);
    }
}
