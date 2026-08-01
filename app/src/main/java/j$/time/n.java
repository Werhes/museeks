package j$.time;

import j$.time.format.DateTimeFormatter;
import j$.time.temporal.ChronoField;
import j$.util.Objects;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
public final class n implements Externalizable {
    private static final long serialVersionUID = -7683839454370182990L;
    public byte a;
    public Object b;

    public n() {
    }

    public n(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    public static Object a(byte b, ObjectInput objectInput) {
        switch (b) {
            case 1:
                Duration duration = Duration.c;
                return Duration.ofSeconds(objectInput.readLong(), objectInput.readInt());
            case 2:
                Instant instant = Instant.c;
                return Instant.ofEpochSecond(objectInput.readLong(), objectInput.readInt());
            case 3:
                LocalDate localDate = LocalDate.MIN;
                return LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte());
            case 4:
                return LocalTime.V(objectInput);
            case 5:
                LocalDateTime localDateTime = LocalDateTime.MIN;
                LocalDate localDate2 = LocalDate.MIN;
                return LocalDateTime.of(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.V(objectInput));
            case 6:
                LocalDateTime localDateTime2 = LocalDateTime.MIN;
                LocalDate localDate3 = LocalDate.MIN;
                LocalDateTime of = LocalDateTime.of(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.V(objectInput));
                ZoneOffset T = ZoneOffset.T(objectInput);
                ZoneId zoneId = (ZoneId) a(objectInput.readByte(), objectInput);
                Objects.requireNonNull(of, "localDateTime");
                Objects.requireNonNull(T, "offset");
                Objects.requireNonNull(zoneId, "zone");
                if (!(zoneId instanceof ZoneOffset) || T.equals(zoneId)) {
                    return new ZonedDateTime(of, zoneId, T);
                }
                throw new IllegalArgumentException("ZoneId must match ZoneOffset");
            case 7:
                int i = s.d;
                return ZoneId.N(objectInput.readUTF(), false);
            case 8:
                return ZoneOffset.T(objectInput);
            case 9:
                int i2 = l.c;
                return new l(LocalTime.V(objectInput), ZoneOffset.T(objectInput));
            case 10:
                int i3 = OffsetDateTime.c;
                LocalDate localDate4 = LocalDate.MIN;
                return new OffsetDateTime(LocalDateTime.of(LocalDate.of(objectInput.readInt(), objectInput.readByte(), objectInput.readByte()), LocalTime.V(objectInput)), ZoneOffset.T(objectInput));
            case 11:
                int i4 = p.b;
                return p.M(objectInput.readInt());
            case 12:
                DateTimeFormatter dateTimeFormatter = YearMonth.c;
                return YearMonth.of(objectInput.readInt(), objectInput.readByte());
            case 13:
                int i5 = j.c;
                byte readByte = objectInput.readByte();
                byte readByte2 = objectInput.readByte();
                Month P = Month.P(readByte);
                Objects.requireNonNull(P, "month");
                ChronoField.DAY_OF_MONTH.D(readByte2);
                if (readByte2 <= P.O()) {
                    return new j(P.getValue(), readByte2);
                }
                throw new DateTimeException("Illegal value for DayOfMonth field, value " + ((int) readByte2) + " is not valid for month " + P.name());
            case 14:
                m mVar = m.d;
                return m.a(objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        byte readByte = objectInput.readByte();
        this.a = readByte;
        this.b = a(readByte, objectInput);
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                Duration duration = (Duration) obj;
                objectOutput.writeLong(duration.a);
                objectOutput.writeInt(duration.b);
                return;
            case 2:
                Instant instant = (Instant) obj;
                objectOutput.writeLong(instant.a);
                objectOutput.writeInt(instant.b);
                return;
            case 3:
                LocalDate localDate = (LocalDate) obj;
                objectOutput.writeInt(localDate.a);
                objectOutput.writeByte(localDate.b);
                objectOutput.writeByte(localDate.c);
                return;
            case 4:
                ((LocalTime) obj).a0(objectOutput);
                return;
            case 5:
                LocalDateTime localDateTime = (LocalDateTime) obj;
                LocalDate localDate2 = localDateTime.a;
                objectOutput.writeInt(localDate2.a);
                objectOutput.writeByte(localDate2.b);
                objectOutput.writeByte(localDate2.c);
                localDateTime.b.a0(objectOutput);
                return;
            case 6:
                ZonedDateTime zonedDateTime = (ZonedDateTime) obj;
                LocalDateTime localDateTime2 = zonedDateTime.a;
                LocalDate localDate3 = localDateTime2.a;
                objectOutput.writeInt(localDate3.a);
                objectOutput.writeByte(localDate3.b);
                objectOutput.writeByte(localDate3.c);
                localDateTime2.b.a0(objectOutput);
                zonedDateTime.b.U(objectOutput);
                zonedDateTime.c.Q(objectOutput);
                return;
            case 7:
                objectOutput.writeUTF(((s) obj).b);
                return;
            case 8:
                ((ZoneOffset) obj).U(objectOutput);
                return;
            case 9:
                l lVar = (l) obj;
                lVar.a.a0(objectOutput);
                lVar.b.U(objectOutput);
                return;
            case 10:
                OffsetDateTime offsetDateTime = (OffsetDateTime) obj;
                LocalDateTime localDateTime3 = offsetDateTime.a;
                LocalDate localDate4 = localDateTime3.a;
                objectOutput.writeInt(localDate4.a);
                objectOutput.writeByte(localDate4.b);
                objectOutput.writeByte(localDate4.c);
                localDateTime3.b.a0(objectOutput);
                offsetDateTime.b.U(objectOutput);
                return;
            case 11:
                objectOutput.writeInt(((p) obj).a);
                return;
            case 12:
                YearMonth yearMonth = (YearMonth) obj;
                objectOutput.writeInt(yearMonth.a);
                objectOutput.writeByte(yearMonth.b);
                return;
            case 13:
                j jVar = (j) obj;
                objectOutput.writeByte(jVar.a);
                objectOutput.writeByte(jVar.b);
                return;
            case 14:
                m mVar = (m) obj;
                objectOutput.writeInt(mVar.a);
                objectOutput.writeInt(mVar.b);
                objectOutput.writeInt(mVar.c);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }
}
