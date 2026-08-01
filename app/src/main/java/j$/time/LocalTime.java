package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import org.conscrypt.BuildConfig;

/* loaded from: classes2.dex */
public final class LocalTime implements j$.time.temporal.l, j$.time.temporal.m, Comparable<LocalTime>, Serializable {
    public static final LocalTime MAX;
    public static final LocalTime MIN;
    public static final LocalTime e;
    public static final LocalTime[] f = new LocalTime[24];
    private static final long serialVersionUID = 6414437269572265201L;
    public final byte a;
    public final byte b;
    public final byte c;
    public final int d;

    static {
        int i = 0;
        while (true) {
            LocalTime[] localTimeArr = f;
            if (i >= localTimeArr.length) {
                LocalTime localTime = localTimeArr[0];
                e = localTime;
                LocalTime localTime2 = localTimeArr[12];
                MIN = localTime;
                MAX = new LocalTime(23, 59, 59, 999999999);
                return;
            }
            localTimeArr[i] = new LocalTime(i, 0, 0, 0);
            i++;
        }
    }

    public LocalTime(int i, int i2, int i3, int i4) {
        this.a = (byte) i;
        this.b = (byte) i2;
        this.c = (byte) i3;
        this.d = i4;
    }

    public static LocalTime M(int i, int i2, int i3, int i4) {
        return ((i2 | i3) | i4) == 0 ? f[i] : new LocalTime(i, i2, i3, i4);
    }

    public static LocalTime N(TemporalAccessor temporalAccessor) {
        Objects.requireNonNull(temporalAccessor, "temporal");
        LocalTime localTime = (LocalTime) temporalAccessor.D(j$.time.temporal.p.g);
        if (localTime != null) {
            return localTime;
        }
        throw new DateTimeException("Unable to obtain LocalTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName());
    }

    public static LocalTime P(long j) {
        ChronoField.NANO_OF_DAY.D(j);
        int i = (int) (j / 3600000000000L);
        long j2 = j - (i * 3600000000000L);
        int i2 = (int) (j2 / 60000000000L);
        long j3 = j2 - (i2 * 60000000000L);
        int i3 = (int) (j3 / 1000000000);
        return M(i, i2, i3, (int) (j3 - (i3 * 1000000000)));
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v4, types: [int] */
    public static LocalTime V(DataInput dataInput) {
        int readInt;
        int i;
        int readByte = dataInput.readByte();
        byte b = 0;
        if (readByte < 0) {
            readByte = ~readByte;
            i = 0;
            readInt = 0;
        } else {
            byte readByte2 = dataInput.readByte();
            if (readByte2 < 0) {
                ?? r5 = ~readByte2;
                readInt = 0;
                b = r5;
                i = 0;
            } else {
                byte readByte3 = dataInput.readByte();
                if (readByte3 < 0) {
                    i = ~readByte3;
                    readInt = 0;
                    b = readByte2;
                } else {
                    readInt = dataInput.readInt();
                    b = readByte2;
                    i = readByte3;
                }
            }
        }
        return of(readByte, b, i, readInt);
    }

    public static LocalTime of(int i, int i2, int i3, int i4) {
        ChronoField.HOUR_OF_DAY.D(i);
        ChronoField.MINUTE_OF_HOUR.D(i2);
        ChronoField.SECOND_OF_MINUTE.D(i3);
        ChronoField.NANO_OF_SECOND.D(i4);
        return M(i, i2, i3, i4);
    }

    public static LocalTime parse(CharSequence charSequence) {
        DateTimeFormatter dateTimeFormatter = DateTimeFormatter.f;
        Objects.requireNonNull(dateTimeFormatter, "formatter");
        return (LocalTime) dateTimeFormatter.parse(charSequence, new d(2));
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new n((byte) 4, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final long B(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? temporalField == ChronoField.NANO_OF_DAY ? W() : temporalField == ChronoField.MICRO_OF_DAY ? W() / 1000 : O(temporalField) : temporalField.x(this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final Object D(TemporalQuery temporalQuery) {
        if (temporalQuery == j$.time.temporal.p.b || temporalQuery == j$.time.temporal.p.a || temporalQuery == j$.time.temporal.p.e || temporalQuery == j$.time.temporal.p.d) {
            return null;
        }
        if (temporalQuery == j$.time.temporal.p.g) {
            return this;
        }
        if (temporalQuery == j$.time.temporal.p.f) {
            return null;
        }
        return temporalQuery == j$.time.temporal.p.c ? j$.time.temporal.a.NANOS : temporalQuery.queryFrom(this);
    }

    public final int O(TemporalField temporalField) {
        switch (g.a[((ChronoField) temporalField).ordinal()]) {
            case 1:
                return this.d;
            case 2:
                throw new DateTimeException("Invalid field 'NanoOfDay' for get() method, use getLong() instead");
            case 3:
                return this.d / 1000;
            case 4:
                throw new DateTimeException("Invalid field 'MicroOfDay' for get() method, use getLong() instead");
            case 5:
                return this.d / 1000000;
            case 6:
                return (int) (W() / 1000000);
            case 7:
                return this.c;
            case 8:
                return X();
            case 9:
                return this.b;
            case 10:
                return (this.a * 60) + this.b;
            case 11:
                return this.a % 12;
            case 12:
                int i = this.a % 12;
                if (i % 12 == 0) {
                    return 12;
                }
                return i;
            case 13:
                return this.a;
            case 14:
                byte b = this.a;
                if (b == 0) {
                    return 24;
                }
                return b;
            case 15:
                return this.a / 12;
            default:
                throw new DateTimeException(b.a("Unsupported field: ", temporalField));
        }
    }

    @Override // j$.time.temporal.l
    /* renamed from: Q, reason: merged with bridge method [inline-methods] */
    public final LocalTime d(long j, j$.time.temporal.q qVar) {
        if (!(qVar instanceof j$.time.temporal.a)) {
            return (LocalTime) qVar.i(this, j);
        }
        switch (g.b[((j$.time.temporal.a) qVar).ordinal()]) {
            case 1:
                return T(j);
            case 2:
                return T((j % 86400000000L) * 1000);
            case 3:
                return T((j % 86400000) * 1000000);
            case 4:
                return U(j);
            case 5:
                return S(j);
            case 6:
                return R(j);
            case 7:
                return R((j % 2) * 12);
            default:
                throw new DateTimeException("Unsupported unit: " + qVar);
        }
    }

    public final LocalTime R(long j) {
        return j == 0 ? this : M(((((int) (j % 24)) + this.a) + 24) % 24, this.b, this.c, this.d);
    }

    public final LocalTime S(long j) {
        if (j != 0) {
            int i = (this.a * 60) + this.b;
            int i2 = ((((int) (j % 1440)) + i) + 1440) % 1440;
            if (i != i2) {
                return M(i2 / 60, i2 % 60, this.c, this.d);
            }
        }
        return this;
    }

    public final LocalTime T(long j) {
        if (j != 0) {
            long W = W();
            long j2 = (((j % 86400000000000L) + W) + 86400000000000L) % 86400000000000L;
            if (W != j2) {
                return M((int) (j2 / 3600000000000L), (int) ((j2 / 60000000000L) % 60), (int) ((j2 / 1000000000) % 60), (int) (j2 % 1000000000));
            }
        }
        return this;
    }

    public final LocalTime U(long j) {
        if (j != 0) {
            int i = (this.b * 60) + (this.a * 3600) + this.c;
            int i2 = ((((int) (j % 86400)) + i) + 86400) % 86400;
            if (i != i2) {
                return M(i2 / 3600, (i2 / 60) % 60, i2 % 60, this.d);
            }
        }
        return this;
    }

    public final long W() {
        return (this.c * 1000000000) + (this.b * 60000000000L) + (this.a * 3600000000000L) + this.d;
    }

    public final int X() {
        return (this.b * 60) + (this.a * 3600) + this.c;
    }

    @Override // j$.time.temporal.l
    /* renamed from: Y, reason: merged with bridge method [inline-methods] */
    public final LocalTime c(long j, TemporalField temporalField) {
        if (!(temporalField instanceof ChronoField)) {
            return (LocalTime) temporalField.B(this, j);
        }
        ChronoField chronoField = (ChronoField) temporalField;
        chronoField.D(j);
        switch (g.a[chronoField.ordinal()]) {
            case 1:
                return Z((int) j);
            case 2:
                return P(j);
            case 3:
                return Z(((int) j) * 1000);
            case 4:
                return P(j * 1000);
            case 5:
                return Z(((int) j) * 1000000);
            case 6:
                return P(j * 1000000);
            case 7:
                int i = (int) j;
                if (this.c != i) {
                    ChronoField.SECOND_OF_MINUTE.D(i);
                    return M(this.a, this.b, i, this.d);
                }
                return this;
            case 8:
                return U(j - X());
            case 9:
                int i2 = (int) j;
                if (this.b != i2) {
                    ChronoField.MINUTE_OF_HOUR.D(i2);
                    return M(this.a, i2, this.c, this.d);
                }
                return this;
            case 10:
                return S(j - ((this.a * 60) + this.b));
            case 11:
                return R(j - (this.a % 12));
            case 12:
                if (j == 12) {
                    j = 0;
                }
                return R(j - (this.a % 12));
            case 13:
                int i3 = (int) j;
                if (this.a != i3) {
                    ChronoField.HOUR_OF_DAY.D(i3);
                    return M(i3, this.b, this.c, this.d);
                }
                return this;
            case 14:
                if (j == 24) {
                    j = 0;
                }
                int i4 = (int) j;
                if (this.a != i4) {
                    ChronoField.HOUR_OF_DAY.D(i4);
                    return M(i4, this.b, this.c, this.d);
                }
                return this;
            case 15:
                return R((j - (this.a / 12)) * 12);
            default:
                throw new DateTimeException(b.a("Unsupported field: ", temporalField));
        }
    }

    public final LocalTime Z(int i) {
        if (this.d == i) {
            return this;
        }
        ChronoField.NANO_OF_SECOND.D(i);
        return M(this.a, this.b, this.c, i);
    }

    public final void a0(DataOutput dataOutput) {
        if (this.d != 0) {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(this.c);
            dataOutput.writeInt(this.d);
            return;
        }
        if (this.c != 0) {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(this.b);
            dataOutput.writeByte(~this.c);
        } else if (this.b == 0) {
            dataOutput.writeByte(~this.a);
        } else {
            dataOutput.writeByte(this.a);
            dataOutput.writeByte(~this.b);
        }
    }

    @Override // java.lang.Comparable
    public int compareTo(LocalTime localTime) {
        int compare = Integer.compare(this.a, localTime.a);
        return (compare == 0 && (compare = Integer.compare(this.b, localTime.b)) == 0 && (compare = Integer.compare(this.c, localTime.c)) == 0) ? Integer.compare(this.d, localTime.d) : compare;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final boolean e(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? ((ChronoField) temporalField).M() : temporalField != null && temporalField.i(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof LocalTime) {
            LocalTime localTime = (LocalTime) obj;
            if (this.a == localTime.a && this.b == localTime.b && this.c == localTime.c && this.d == localTime.d) {
                return true;
            }
        }
        return false;
    }

    public int hashCode() {
        long W = W();
        return (int) (W ^ (W >>> 32));
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final int i(TemporalField temporalField) {
        return temporalField instanceof ChronoField ? O(temporalField) : j$.time.temporal.p.a(this, temporalField);
    }

    @Override // j$.time.temporal.l
    /* renamed from: j */
    public final j$.time.temporal.l w(LocalDate localDate) {
        localDate.getClass();
        return (LocalTime) j$.com.android.tools.r8.a.a(localDate, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(TemporalField temporalField) {
        return j$.time.temporal.p.d(this, temporalField);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return lVar.c(W(), ChronoField.NANO_OF_DAY);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder(18);
        byte b = this.a;
        byte b2 = this.b;
        byte b3 = this.c;
        int i = this.d;
        sb.append(b < 10 ? "0" : BuildConfig.FLAVOR);
        sb.append((int) b);
        sb.append(b2 < 10 ? ":0" : ":");
        sb.append((int) b2);
        if (b3 > 0 || i > 0) {
            sb.append(b3 < 10 ? ":0" : ":");
            sb.append((int) b3);
            if (i > 0) {
                sb.append('.');
                if (i % 1000000 == 0) {
                    sb.append(Integer.toString((i / 1000000) + 1000).substring(1));
                } else if (i % 1000 == 0) {
                    sb.append(Integer.toString((i / 1000) + 1000000).substring(1));
                } else {
                    sb.append(Integer.toString(i + 1000000000).substring(1));
                }
            }
        }
        return sb.toString();
    }

    @Override // j$.time.temporal.l
    public final j$.time.temporal.l x(long j, j$.time.temporal.a aVar) {
        return j == Long.MIN_VALUE ? d(Long.MAX_VALUE, aVar).d(1L, aVar) : d(-j, aVar);
    }
}
