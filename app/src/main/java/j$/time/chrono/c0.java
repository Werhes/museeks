package j$.time.chrono;

import j$.time.LocalDate;
import j$.time.LocalTime;
import j$.time.ZoneId;
import j$.time.ZoneOffset;
import j$.time.temporal.ChronoField;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.Externalizable;
import java.io.InvalidClassException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.io.StreamCorruptedException;

/* loaded from: classes2.dex */
public final class c0 implements Externalizable {
    private static final long serialVersionUID = -6103370247208168577L;
    public byte a;
    public Object b;

    public c0() {
    }

    public c0(byte b, Object obj) {
        this.a = b;
        this.b = obj;
    }

    private Object readResolve() {
        return this.b;
    }

    @Override // java.io.Externalizable
    public final void readExternal(ObjectInput objectInput) {
        Object a0;
        byte readByte = objectInput.readByte();
        this.a = readByte;
        switch (readByte) {
            case 1:
                ConcurrentHashMap concurrentHashMap = a.a;
                a0 = j$.com.android.tools.r8.a.a0(objectInput.readUTF());
                break;
            case 2:
                a0 = ((ChronoLocalDate) objectInput.readObject()).C((LocalTime) objectInput.readObject());
                break;
            case 3:
                a0 = ((ChronoLocalDateTime) objectInput.readObject()).y((ZoneOffset) objectInput.readObject()).v((ZoneId) objectInput.readObject());
                break;
            case 4:
                LocalDate localDate = v.d;
                int readInt = objectInput.readInt();
                byte readByte2 = objectInput.readByte();
                byte readByte3 = objectInput.readByte();
                t.c.getClass();
                a0 = new v(LocalDate.of(readInt, readByte2, readByte3));
                break;
            case 5:
                w wVar = w.d;
                a0 = w.m(objectInput.readByte());
                break;
            case 6:
                m mVar = (m) objectInput.readObject();
                int readInt2 = objectInput.readInt();
                byte readByte4 = objectInput.readByte();
                byte readByte5 = objectInput.readByte();
                mVar.getClass();
                a0 = new o(mVar, readInt2, readByte4, readByte5);
                break;
            case 7:
                int readInt3 = objectInput.readInt();
                byte readByte6 = objectInput.readByte();
                byte readByte7 = objectInput.readByte();
                y.c.getClass();
                a0 = new a0(LocalDate.of(readInt3 + 1911, readByte6, readByte7));
                break;
            case 8:
                int readInt4 = objectInput.readInt();
                byte readByte8 = objectInput.readByte();
                byte readByte9 = objectInput.readByte();
                e0.c.getClass();
                a0 = new g0(LocalDate.of(readInt4 - 543, readByte8, readByte9));
                break;
            case 9:
                int i = f.e;
                a0 = new f(j$.com.android.tools.r8.a.a0(objectInput.readUTF()), objectInput.readInt(), objectInput.readInt(), objectInput.readInt());
                break;
            default:
                throw new StreamCorruptedException("Unknown serialized type");
        }
        this.b = a0;
    }

    @Override // java.io.Externalizable
    public final void writeExternal(ObjectOutput objectOutput) {
        byte b = this.a;
        Object obj = this.b;
        objectOutput.writeByte(b);
        switch (b) {
            case 1:
                objectOutput.writeUTF(((a) obj).getId());
                return;
            case 2:
                e eVar = (e) obj;
                objectOutput.writeObject(eVar.a);
                objectOutput.writeObject(eVar.b);
                return;
            case 3:
                i iVar = (i) obj;
                objectOutput.writeObject(iVar.a);
                objectOutput.writeObject(iVar.b);
                objectOutput.writeObject(iVar.c);
                return;
            case 4:
                v vVar = (v) obj;
                vVar.getClass();
                objectOutput.writeInt(j$.time.temporal.p.a(vVar, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(vVar, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(vVar, ChronoField.DAY_OF_MONTH));
                return;
            case 5:
                objectOutput.writeByte(((w) obj).a);
                return;
            case 6:
                o oVar = (o) obj;
                objectOutput.writeObject(oVar.a);
                objectOutput.writeInt(j$.time.temporal.p.a(oVar, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(oVar, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(oVar, ChronoField.DAY_OF_MONTH));
                return;
            case 7:
                a0 a0Var = (a0) obj;
                a0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.p.a(a0Var, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(a0Var, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(a0Var, ChronoField.DAY_OF_MONTH));
                return;
            case 8:
                g0 g0Var = (g0) obj;
                g0Var.getClass();
                objectOutput.writeInt(j$.time.temporal.p.a(g0Var, ChronoField.YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(g0Var, ChronoField.MONTH_OF_YEAR));
                objectOutput.writeByte(j$.time.temporal.p.a(g0Var, ChronoField.DAY_OF_MONTH));
                return;
            case 9:
                f fVar = (f) obj;
                objectOutput.writeUTF(fVar.a.getId());
                objectOutput.writeInt(fVar.b);
                objectOutput.writeInt(fVar.c);
                objectOutput.writeInt(fVar.d);
                return;
            default:
                throw new InvalidClassException("Unknown serialized type");
        }
    }
}
