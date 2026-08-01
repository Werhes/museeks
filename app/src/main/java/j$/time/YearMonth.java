package j$.time;

import com.google.android.gms.dynamite.descriptors.com.google.mlkit.dynamite.barcode.ModuleDescriptor;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.format.SignStyle;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class YearMonth implements j$.time.temporal.l, j$.time.temporal.m, Comparable<YearMonth>, Serializable {
    public static final DateTimeFormatter c = new DateTimeFormatterBuilder().appendValue(ChronoField.YEAR, 4, 10, SignStyle.EXCEEDS_PAD).appendLiteral('-').appendValue(ChronoField.MONTH_OF_YEAR, 2).toFormatter();
    private static final long serialVersionUID = 4183400860270640070L;
    public final int a;
    public final int b;

    public YearMonth(int i, int i2) {
        this.a = i;
        this.b = i2;
    }

    public static YearMonth of(int i, int i2) {
        ChronoField.YEAR.D(i);
        ChronoField.MONTH_OF_YEAR.D(i2);
        return new YearMonth(i, i2);
    }

    public static YearMonth parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = c;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (YearMonth) dateTimeFormatter.parse(charSequence, new d(3));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 12, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long B(TemporalField temporalField) {
        int i;
        if (!(temporalField instanceof ChronoField)) {
            return temporalField.x(this);
        }
        int i2 = q.a[((ChronoField) temporalField).ordinal()];
        if (i2 == 1) {
            i = this.b;
        } else {
            if (i2 == 2) {
                return M();
            }
            if (i2 == 3) {
                int i3 = this.a;
                if (i3 < 1) {
                    i3 = 1 - i3;
                }
                return i3;
            }
            if (i2 != 4) {
                if (i2 == 5) {
                    return this.a < 1 ? 0 : 1;
                }
                throw new DateTimeException(b.a("Unsupported field: ", temporalField));
            }
            i = this.a;
        }
        return i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(TemporalQuery temporalQuery) {
        return temporalQuery == j$.time.temporal.p.b ? j$.time.chrono.q.c : temporalQuery == j$.time.temporal.p.c ? j$.time.temporal.a.MONTHS : j$.time.temporal.p.c(this, temporalQuery);
    }

    public final long M() {
        return ((this.a * 12) + this.b) - 1;
    }

    @Override // j$.time.temporal.l
    /* renamed from: N, reason: merged with bridge method [inline-methods] */
    public final YearMonth d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (YearMonth) qVar.i(this, j);
        }
        switch (q.b[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return O(j);
            case 2:
                return P(j);
            case 3:
                return P(j$.com.android.tools.r8.a.X(j, 10));
            case 4:
                return P(j$.com.android.tools.r8.a.X(j, 100));
            case 5:
                return P(j$.com.android.tools.r8.a.X(j, 1000));
            case 6:
                ChronoField chronoField = ChronoField.ERA;
                return c(j$.com.android.tools.r8.a.R(B(chronoField), j), chronoField);
            default:
                throw new DateTimeException("Unsupported unit: " + qVar);
        }
    }

    public final YearMonth O(long j) {
        if (j == 0) {
            return this;
        }
        long j2 = (this.a * 12) + (this.b - 1) + j;
        ChronoField chronoField = ChronoField.YEAR;
        long j3 = 12;
        return Q(chronoField.b.a(j$.com.android.tools.r8.a.W(j2, j3), chronoField), ((int) j$.com.android.tools.r8.a.V(j2, j3)) + 1);
    }

    public final YearMonth P(long j) {
        if (j == 0) {
            return this;
        }
        ChronoField chronoField = ChronoField.YEAR;
        return Q(chronoField.b.a(this.a + j, chronoField), this.b);
    }

    public final YearMonth Q(int i, int i2) {
        return (this.a == i && this.b == i2) ? this : new YearMonth(i, i2);
    }

    @Override // j$.time.temporal.l
    /* renamed from: R, reason: merged with bridge method [inline-methods] */
    public final YearMonth c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (YearMonth) temporalField.B(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.D(j);
        int i = q.a[chronoField.ordinal()];
        if (i == 1) {
            int i2 = (int) j;
            ChronoField.MONTH_OF_YEAR.D(i2);
            return Q(this.a, i2);
        }
        if (i == 2) {
            return O(j - M());
        }
        if (i == 3) {
            if (this.a < 1) {
                j = 1 - j;
            }
            int i3 = (int) j;
            ChronoField.YEAR.D(i3);
            return Q(i3, this.b);
        }
        if (i == 4) {
            int i4 = (int) j;
            ChronoField.YEAR.D(i4);
            return Q(i4, this.b);
        }
        if (i != 5) {
            throw new DateTimeException(b.a("Unsupported field: ", temporalField));
        }
        if (B(ChronoField.ERA) == j) {
            return this;
        }
        int i5 = 1 - this.a;
        ChronoField.YEAR.D(i5);
        return Q(i5, this.b);
    }

    @Override // java.lang.Comparable
    public int compareTo(YearMonth yearMonth) {
        int i = this.a - yearMonth.a;
        return i == 0 ? this.b - yearMonth.b : i;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.YEAR || temporalField == ChronoField.MONTH_OF_YEAR || temporalField == ChronoField.PROLEPTIC_MONTH || temporalField == ChronoField.YEAR_OF_ERA || temporalField == ChronoField.ERA : temporalField != null && temporalField.i(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof YearMonth) {
            YearMonth yearMonth = (YearMonth) obj;
            if (this.a == yearMonth.a && this.b == yearMonth.b) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        return this.a ^ (this.b << 27);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(TemporalField temporalField) {
        return k(temporalField).a(B(temporalField), temporalField);
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(LocalDate localDate) {
        localDate.getClass();
        return (YearMonth) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(TemporalField temporalField) {
        if (temporalField == ChronoField.YEAR_OF_ERA) {
            return j$.time.temporal.s.f(1L, this.a <= 0 ? 1000000000L : 999999999L);
        }
        return j$.time.temporal.p.d(this, temporalField);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        if (!j$.com.android.tools.r8.a.P(lVar).equals(j$.time.chrono.q.c)) {
            throw new DateTimeException("Adjustment only supported on ISO date-time");
        }
        return lVar.c(M(), ChronoField.PROLEPTIC_MONTH);
    }

    public final String toString() {
        int abs = Math.abs(this.a);
        StringBuilder sb = new StringBuilder(9);
        if (abs < 1000) {
            int i = this.a;
            if (i < 0) {
                sb.append(i - 10000);
                sb.deleteCharAt(1);
            } else {
                sb.append(i + ModuleDescriptor.MODULE_VERSION);
                sb.deleteCharAt(0);
            }
        } else {
            sb.append(this.a);
        }
        sb.append(this.b < 10 ? "-0" : "-");
        sb.append(this.b);
        return sb.toString();
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l x(long j, j$.time.temporal.a aVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, aVar).d(1L, aVar) : d(-j, aVar);
    }
}
