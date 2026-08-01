package j$.time.chrono;

import j$.time.DateTimeException;
import j$.time.LocalDate;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalField;
import j$.time.temporal.TemporalQuery;
import java.io.InvalidObjectException;
import java.io.ObjectInputStream;
import java.io.Serializable;

/* loaded from: classes2.dex */
public final class w implements k, Serializable {
    public static final w d;
    public static final w[] e;
    private static final long serialVersionUID = 1466499369062886794L;
    public final transient int a;
    public final transient LocalDate b;
    public final transient String c;

    static {
        w wVar = new w(-1, LocalDate.of(1868, 1, 1), "Meiji");
        d = wVar;
        w wVar2 = new w(0, LocalDate.of(1912, 7, 30), "Taisho");
        w wVar3 = new w(1, LocalDate.of(1926, 12, 25), "Showa");
        w wVar4 = new w(2, LocalDate.of(1989, 1, 8), "Heisei");
        w wVar5 = new w(3, LocalDate.of(2019, 5, 1), "Reiwa");
        e = r7;
        w[] wVarArr = {wVar, wVar2, wVar3, wVar4, wVar5};
    }

    public w(int i, LocalDate localDate, String str) {
        this.a = i;
        this.b = localDate;
        this.c = str;
    }

    public static w h(LocalDate localDate) {
        if (localDate.R(v.d)) {
            throw new DateTimeException("JapaneseDate before Meiji 6 are not supported");
        }
        for (int length = e.length - 1; length >= 0; length--) {
            w wVar = e[length];
            if (localDate.compareTo((ChronoLocalDate) wVar.b) >= 0) {
                return wVar;
            }
        }
        return null;
    }

    public static w m(int i) {
        int i2 = i + 1;
        if (i2 >= 0) {
            w[] wVarArr = e;
            if (i2 < wVarArr.length) {
                return wVarArr[i2];
            }
        }
        throw new DateTimeException("Invalid era: " + i);
    }

    private void readObject(ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Deserialization via serialization delegate");
    }

    private Object writeReplace() {
        return new c0((byte) 5, this);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ long B(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.q(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ Object D(TemporalQuery temporalQuery) {
        return j$.com.android.tools.r8.a.y(this, temporalQuery);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ boolean e(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.t(this, temporalField);
    }

    @Override // j$.time.chrono.k
    public final int getValue() {
        return this.a;
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final /* synthetic */ int i(TemporalField temporalField) {
        return j$.com.android.tools.r8.a.o(this, temporalField);
    }

    @Override // j$.time.temporal.TemporalAccessor
    public final j$.time.temporal.s k(TemporalField temporalField) {
        ChronoField chronoField = ChronoField.ERA;
        return temporalField == chronoField ? t.c.q(chronoField) : j$.time.temporal.p.d(this, temporalField);
    }

    public final w l() {
        if (this == e[r0.length - 1]) {
            return null;
        }
        return m(this.a + 1);
    }

    @Override // j$.time.temporal.m
    public final j$.time.temporal.l n(j$.time.temporal.l lVar) {
        return lVar.c(getValue(), ChronoField.ERA);
    }

    public final String toString() {
        return this.c;
    }
}
