package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.Instant;
import j$.time.LocalDate;
import j$.time.ZoneId;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class e0 extends a implements Serializable {
    public static final e0 c = new e0();
    private static final long serialVersionUID = 2775954514031616474L;

    static {
        HashMap hashMap = new HashMap();
        HashMap hashMap2 = new HashMap();
        HashMap hashMap3 = new HashMap();
        hashMap.put("en", new String[]{"BB", "BE"});
        hashMap.put("th", new String[]{"BB", "BE"});
        hashMap2.put("en", new String[]{"B.B.", "B.E."});
        hashMap2.put("th", new String[]{"พ.ศ.", "ปีก่อนคริสต์กาลที่"});
        hashMap3.put("en", new String[]{"Before Buddhist", "Budhhist Era"});
        hashMap3.put("th", new String[]{"พุทธศักราช", "ปีก่อนคริสต์กาลที่"});
    }

    private e0() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate F(int i, int i2, int i3) {
        return new g0(LocalDate.of(i - 543, i2, i3));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.j
    public final ChronoLocalDate H(Map map, j$.time.format.d0 d0Var) {
        return (g0) super.H(map, d0Var);
    }

    @Override // j$.time.chrono.j
    public final ChronoZonedDateTime I(Instant instant, ZoneId zoneId) {
        return i.N(this, instant, zoneId);
    }

    @Override // j$.time.chrono.j
    public final boolean K(long j) {
        return q.c.K(j - 543);
    }

    @Override // j$.time.chrono.j
    public final String getId() {
        return "ThaiBuddhist";
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate h(long j) {
        return new g0(LocalDate.ofEpochDay(j));
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate j() {
        return new g0(LocalDate.O(LocalDate.U(new j$.time.a(ZoneId.systemDefault()))));
    }

    @Override // j$.time.chrono.j
    public final String l() {
        return "buddhist";
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate m(int i, int i2) {
        return new g0(LocalDate.V(i - 543, i2));
    }

    @Override // j$.time.chrono.j
    public final j$.time.temporal.s q(ChronoField chronoField) {
        int i = d0.a[chronoField.ordinal()];
        if (i == 1) {
            j$.time.temporal.s sVar = ChronoField.PROLEPTIC_MONTH.b;
            return j$.time.temporal.s.f(sVar.a + 6516, sVar.d + 6516);
        }
        if (i == 2) {
            j$.time.temporal.s sVar2 = ChronoField.YEAR.b;
            return j$.time.temporal.s.g(1L, (-(sVar2.a + 543)) + 1, sVar2.d + 543);
        }
        if (i != 3) {
            return chronoField.b;
        }
        j$.time.temporal.s sVar3 = ChronoField.YEAR.b;
        return j$.time.temporal.s.f(sVar3.a + 543, sVar3.d + 543);
    }

    @Override // j$.time.chrono.j
    public final List s() {
        return j$.com.android.tools.r8.a.S(h0.values());
    }

    @Override // j$.time.chrono.j
    public final k t(int i) {
        if (i == 0) {
            return h0.BEFORE_BE;
        }
        if (i == 1) {
            return h0.BE;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // j$.time.chrono.j
    public final int u(k kVar, int i) {
        if (kVar instanceof h0) {
            return kVar == h0.BE ? i : 1 - i;
        }
        throw new ClassCastException("Era must be BuddhistEra");
    }

    public Object writeReplace() {
        return new c0((byte) 1, this);
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate z(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof g0 ? (g0) temporalAccessor : new g0(LocalDate.O(temporalAccessor));
    }
}
