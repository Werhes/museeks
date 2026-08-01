package j$.time;

import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes2.dex */
public final class Month implements TemporalAccessor, j$.time.temporal.m {
    public static final Month APRIL;
    public static final Month AUGUST;
    public static final Month DECEMBER;
    public static final Month FEBRUARY;
    public static final Month JANUARY;
    public static final Month JULY;
    public static final Month JUNE;
    public static final Month MARCH;
    public static final Month MAY;
    public static final Month NOVEMBER;
    public static final Month OCTOBER;
    public static final Month SEPTEMBER;
    public static final Month[] a;
    public static final /* synthetic */ Month[] b;

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v0, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r11v1, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r13v1, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r15v1, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r1v1, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r2v3, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r3v1, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r4v3, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r5v1, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r6v3, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r7v1, types: [j$.time.Month, java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v1, types: [j$.time.Month, java.lang.Enum] */
    static {
        ?? r0 = new Enum("JANUARY", 0);
        JANUARY = r0;
        ?? r1 = new Enum("FEBRUARY", 1);
        FEBRUARY = r1;
        ?? r3 = new Enum("MARCH", 2);
        MARCH = r3;
        ?? r5 = new Enum("APRIL", 3);
        APRIL = r5;
        ?? r7 = new Enum("MAY", 4);
        MAY = r7;
        ?? r9 = new Enum("JUNE", 5);
        JUNE = r9;
        ?? r11 = new Enum("JULY", 6);
        JULY = r11;
        ?? r13 = new Enum("AUGUST", 7);
        AUGUST = r13;
        ?? r15 = new Enum("SEPTEMBER", 8);
        SEPTEMBER = r15;
        ?? r2 = new Enum("OCTOBER", 9);
        OCTOBER = r2;
        ?? r4 = new Enum("NOVEMBER", 10);
        NOVEMBER = r4;
        ?? r6 = new Enum("DECEMBER", 11);
        DECEMBER = r6;
        b = new Month[]{r0, r1, r3, r5, r7, r9, r11, r13, r15, r2, r4, r6};
        a = values();
    }

    public static Month P(int i) {
        if (i >= 1 && i <= 12) {
            return a[i - 1];
        }
        throw new DateTimeException("Invalid value for MonthOfYear: " + i);
    }

    public static Month valueOf(String str) {
        return (Month) Enum.valueOf(Month.class, str);
    }

    public static Month[] values() {
        return (Month[]) b.clone();
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long B(TemporalField temporalField) {
        if (temporalField == ChronoField.MONTH_OF_YEAR) {
            return getValue();
        }
        if (temporalField instanceof ChronoField) {
            throw new DateTimeException(b.a("Unsupported field: ", temporalField));
        }
        return temporalField.x(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.p.b ? j$.time.chrono.q.c : temporalQuery == j$.time.temporal.p.c ? j$.time.temporal.a.MONTHS : j$.time.temporal.p.c(this, temporalQuery);
    }

    public final int M(boolean z) {
        switch (h.a[ordinal()]) {
            case 1:
                return 32;
            case 2:
                return (z ? 1 : 0) + 91;
            case 3:
                return (z ? 1 : 0) + 152;
            case 4:
                return (z ? 1 : 0) + 244;
            case 5:
                return (z ? 1 : 0) + 305;
            case 6:
                return 1;
            case 7:
                return (z ? 1 : 0) + 60;
            case 8:
                return (z ? 1 : 0) + 121;
            case 9:
                return (z ? 1 : 0) + 182;
            case 10:
                return (z ? 1 : 0) + 213;
            case 11:
                return (z ? 1 : 0) + 274;
            default:
                return (z ? 1 : 0) + 335;
        }
    }

    public final int N(boolean z) {
        int i = h.a[ordinal()];
        return i != 1 ? (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31 : z ? 29 : 28;
    }

    public final int O() {
        int i = h.a[ordinal()];
        if (i != 1) {
            return (i == 2 || i == 3 || i == 4 || i == 5) ? 30 : 31;
        }
        return 29;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.MONTH_OF_YEAR : temporalField != null && temporalField.i(this);
    }

    public int getValue() {
        return ordinal() + 1;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(TemporalField temporalField) {
        return temporalField == ChronoField.MONTH_OF_YEAR ? getValue() : j$.time.temporal.p.a(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(TemporalField temporalField) {
        return temporalField == ChronoField.MONTH_OF_YEAR ? temporalField.n() : j$.time.temporal.p.d(this, temporalField);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        if (!j$.com.android.tools.r8.a.P(lVar).equals(j$.time.chrono.q.c)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return lVar.c(getValue(), ChronoField.MONTH_OF_YEAR);
    }
}
