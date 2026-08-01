package j$.time.zone;

import j$.time.DayOfWeek;
import j$.time.LocalTime;
import j$.time.Month;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.util.Objects;
import java.io.DataInput;
import java.io.DataOutput;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class e implements Serializable {
    private static final long serialVersionUID = 6889046316657758795L;
    public final Month a;
    public final byte b;
    public final DayOfWeek c;
    public final LocalTime d;
    public final boolean e;
    public final d f;
    public final ZoneOffset g;
    public final ZoneOffset h;
    public final ZoneOffset i;

    public e(Month month, int i, DayOfWeek dayOfWeek, LocalTime localTime, boolean z, d dVar, ZoneOffset zoneOffset, ZoneOffset zoneOffset2, ZoneOffset zoneOffset3) {
        this.a = month;
        this.b = (byte) i;
        this.c = dayOfWeek;
        this.d = localTime;
        this.e = z;
        this.f = dVar;
        this.g = zoneOffset;
        this.h = zoneOffset2;
        this.i = zoneOffset3;
    }

    public static e a(DataInput dataInput) {
        d dVar;
        LocalTime localTime;
        int readInt = dataInput.readInt();
        Month P = Month.P(readInt >>> 28);
        int i = ((264241152 & readInt) >>> 22) - 32;
        int i2 = (3670016 & readInt) >>> 19;
        DayOfWeek M = i2 == 0 ? null : DayOfWeek.M(i2);
        int i3 = (507904 & readInt) >>> 14;
        d dVar2 = d.values()[(readInt & 12288) >>> 12];
        int i4 = (readInt & 4080) >>> 4;
        int i5 = (readInt & 12) >>> 2;
        int i6 = readInt & 3;
        if (i3 == 31) {
            long readInt2 = dataInput.readInt();
            LocalTime localTime2 = LocalTime.MIN;
            ChronoField.SECOND_OF_DAY.D(readInt2);
            int i7 = (int) (readInt2 / 3600);
            long j = readInt2 - (i7 * 3600);
            dVar = dVar2;
            localTime = LocalTime.M(i7, (int) (j / 60), (int) (j - (r14 * 60)), 0);
        } else {
            dVar = dVar2;
            int i8 = i3 % 24;
            LocalTime localTime3 = LocalTime.MIN;
            ChronoField.HOUR_OF_DAY.D(i8);
            localTime = LocalTime.f[i8];
        }
        ZoneOffset ofTotalSeconds = ZoneOffset.ofTotalSeconds(i4 == 255 ? dataInput.readInt() : (i4 - 128) * 900);
        ZoneOffset ofTotalSeconds2 = ZoneOffset.ofTotalSeconds(i5 == 3 ? dataInput.readInt() : (i5 * 1800) + ofTotalSeconds.getTotalSeconds());
        ZoneOffset ofTotalSeconds3 = ZoneOffset.ofTotalSeconds(i6 == 3 ? dataInput.readInt() : (i6 * 1800) + ofTotalSeconds.getTotalSeconds());
        boolean z = i3 == 24;
        Objects.requireNonNull(P, "month");
        Objects.requireNonNull(localTime, "time");
        d dVar3 = dVar;
        Objects.requireNonNull(dVar3, "timeDefnition");
        Objects.requireNonNull(ofTotalSeconds, "standardOffset");
        Objects.requireNonNull(ofTotalSeconds2, "offsetBefore");
        Objects.requireNonNull(ofTotalSeconds3, "offsetAfter");
        if (i < -28 || i > 31 || i == 0) {
            throw new IllegalArgumentException("Day of month indicator must be between -28 and 31 inclusive excluding zero");
        }
        if (z && !localTime.equals(LocalTime.e)) {
            throw new IllegalArgumentException("Time must be midnight when end of day flag is true");
        }
        if (localTime.d == 0) {
            return new e(P, i, M, localTime, z, dVar3, ofTotalSeconds, ofTotalSeconds2, ofTotalSeconds3);
        }
        throw new IllegalArgumentException("Time's nano-of-second must be zero");
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new a((byte) 3, this);
    }

    public final void b(DataOutput dataOutput) {
        int X = this.e ? 86400 : this.d.X();
        int totalSeconds = this.g.getTotalSeconds();
        int totalSeconds2 = this.h.getTotalSeconds() - totalSeconds;
        int totalSeconds3 = this.i.getTotalSeconds() - totalSeconds;
        byte b = X % 3600 == 0 ? this.e ? (byte) 24 : this.d.a : (byte) 31;
        int i = totalSeconds % 900 == 0 ? (totalSeconds / 900) + 128 : 255;
        int i2 = (totalSeconds2 == 0 || totalSeconds2 == 1800 || totalSeconds2 == 3600) ? totalSeconds2 / 1800 : 3;
        int i3 = (totalSeconds3 == 0 || totalSeconds3 == 1800 || totalSeconds3 == 3600) ? totalSeconds3 / 1800 : 3;
        DayOfWeek dayOfWeek = this.c;
        dataOutput.writeInt((this.a.getValue() << 28) + ((this.b + 32) << 22) + ((dayOfWeek == null ? 0 : dayOfWeek.getValue()) << 19) + (b << 14) + (this.f.ordinal() << 12) + (i << 4) + (i2 << 2) + i3);
        if (b == 31) {
            dataOutput.writeInt(X);
        }
        if (i == 255) {
            dataOutput.writeInt(totalSeconds);
        }
        if (i2 == 3) {
            dataOutput.writeInt(this.h.getTotalSeconds());
        }
        if (i3 == 3) {
            dataOutput.writeInt(this.i.getTotalSeconds());
        }
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof e) {
            e eVar = (e) obj;
            if (this.a == eVar.a && this.b == eVar.b && this.c == eVar.c && this.f == eVar.f && this.d.equals(eVar.d) && this.e == eVar.e && this.g.equals(eVar.g) && this.h.equals(eVar.h) && this.i.equals(eVar.i)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int X = ((this.d.X() + (this.e ? 1 : 0)) << 15) + (this.a.ordinal() << 11) + ((this.b + 32) << 5);
        DayOfWeek dayOfWeek = this.c;
        return ((this.g.hashCode() ^ (this.f.ordinal() + (X + ((dayOfWeek == null ? 7 : dayOfWeek.ordinal()) << 2)))) ^ this.h.hashCode()) ^ this.i.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder("TransitionRule[");
        ZoneOffset zoneOffset = this.h;
        ZoneOffset zoneOffset2 = this.i;
        zoneOffset.getClass();
        sb.append(zoneOffset2.b - zoneOffset.b > 0 ? "Gap " : "Overlap ");
        sb.append(this.h);
        sb.append(" to ");
        sb.append(this.i);
        sb.append(", ");
        DayOfWeek dayOfWeek = this.c;
        if (dayOfWeek != null) {
            byte b = this.b;
            if (b == -1) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day of ");
                sb.append(this.a.name());
            } else if (b < 0) {
                sb.append(dayOfWeek.name());
                sb.append(" on or before last day minus ");
                sb.append((-this.b) - 1);
                sb.append(" of ");
                sb.append(this.a.name());
            } else {
                sb.append(dayOfWeek.name());
                sb.append(" on or after ");
                sb.append(this.a.name());
                sb.append(' ');
                sb.append((int) this.b);
            }
        } else {
            sb.append(this.a.name());
            sb.append(' ');
            sb.append((int) this.b);
        }
        sb.append(" at ");
        sb.append(this.e ? "24:00" : this.d.toString());
        sb.append(" ");
        sb.append(this.f);
        sb.append(", standard offset ");
        sb.append(this.g);
        sb.append(']');
        return sb.toString();
    }
}
