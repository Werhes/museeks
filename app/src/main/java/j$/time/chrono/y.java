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
import java.util.List;
import java.util.Map;

/* loaded from: classes2.dex */
public final class y extends a implements Serializable {
    public static final y c = new y();
    private static final long serialVersionUID = 1039765215346859963L;

    private y() {
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate F(int i, int i2, int i3) {
        return new a0(LocalDate.of(i + 1911, i2, i3));
    }

    @Override // j$.time.chrono.a, j$.time.chrono.j
    public final ChronoLocalDate H(Map map, j$.time.format.d0 d0Var) {
        return (a0) super.H(map, d0Var);
    }

    @Override // j$.time.chrono.j
    public final ChronoZonedDateTime I(Instant instant, ZoneId zoneId) {
        return i.N(this, instant, zoneId);
    }

    @Override // j$.time.chrono.j
    public final boolean K(long j) {
        return q.c.K(j + 1911);
    }

    @Override // j$.time.chrono.j
    public final String getId() {
        return "Minguo";
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate h(long j) {
        return new a0(LocalDate.ofEpochDay(j));
    }

    @Override // j$.time.chrono.a
    public final ChronoLocalDate j() {
        return new a0(LocalDate.O(LocalDate.U(new j$.time.a(ZoneId.systemDefault()))));
    }

    @Override // j$.time.chrono.j
    public final String l() {
        return "roc";
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate m(int i, int i2) {
        return new a0(LocalDate.V(i + 1911, i2));
    }

    @Override // j$.time.chrono.j
    public final j$.time.temporal.s q(ChronoField chronoField) {
        int i = x.a[chronoField.ordinal()];
        if (i == 1) {
            j$.time.temporal.s sVar = ChronoField.PROLEPTIC_MONTH.b;
            return j$.time.temporal.s.f(sVar.a - 22932, sVar.d - 22932);
        }
        if (i == 2) {
            j$.time.temporal.s sVar2 = ChronoField.YEAR.b;
            return j$.time.temporal.s.g(1L, sVar2.d - 1911, (-sVar2.a) + 1912);
        }
        if (i != 3) {
            return chronoField.b;
        }
        j$.time.temporal.s sVar3 = ChronoField.YEAR.b;
        return j$.time.temporal.s.f(sVar3.a - 1911, sVar3.d - 1911);
    }

    @Override // j$.time.chrono.j
    public final List s() {
        return j$.com.android.tools.r8.a.S(b0.values());
    }

    @Override // j$.time.chrono.j
    public final k t(int i) {
        if (i == 0) {
            return b0.BEFORE_ROC;
        }
        if (i == 1) {
            return b0.ROC;
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    @Override // j$.time.chrono.j
    public final int u(k kVar, int i) {
        if (kVar instanceof b0) {
            return kVar == b0.ROC ? i : 1 - i;
        }
        throw new ClassCastException("Era must be MinguoEra");
    }

    public Object writeReplace() {
        return new c0((byte) 1, this);
    }

    @Override // j$.time.chrono.j
    public final ChronoLocalDate z(TemporalAccessor temporalAccessor) {
        return temporalAccessor instanceof a0 ? (a0) temporalAccessor : new a0(LocalDate.O(temporalAccessor));
    }
}
