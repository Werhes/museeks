package j$.time;

import androidx.car.app.navigation.model.Maneuver;
import j$.time.format.DateTimeFormatter;
import j$.time.format.DateTimeFormatterBuilder;
import j$.time.temporal.ChronoField;
import j$.time.temporal.TemporalAccessor;
import j$.time.temporal.TemporalQuery;
import j$.util.Objects;
import j$.util.v;
import j$.util.w;
import j$.util.y;
import java.util.LinkedHashSet;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.DoubleFunction;
import java.util.function.IntFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class d implements TemporalQuery, j$.time.temporal.m, IntFunction, Supplier, BiConsumer, DoubleBinaryOperator, ObjDoubleConsumer, DoubleFunction, ToDoubleFunction {
    public final /* synthetic */ int a;

    public /* synthetic */ d(int i) {
        this.a = i;
    }

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        switch (this.a) {
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                double[] dArr = (double[]) obj;
                dArr[2] = dArr[2] + 1.0d;
                j$.util.stream.j.a(dArr, d);
                dArr[3] = dArr[3] + d;
                return;
            default:
                ((v) obj).accept(d);
                return;
        }
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                ((LinkedHashSet) obj).add(obj2);
                return;
            case 20:
                ((LinkedHashSet) obj).addAll((LinkedHashSet) obj2);
                return;
            case 21:
                double[] dArr = (double[]) obj;
                double[] dArr2 = (double[]) obj2;
                j$.util.stream.j.a(dArr, dArr2[0]);
                j$.util.stream.j.a(dArr, dArr2[1]);
                dArr[2] = dArr[2] + dArr2[2];
                return;
            case 22:
            case 23:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            default:
                ((v) obj).a((v) obj2);
                return;
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                double[] dArr3 = (double[]) obj;
                double[] dArr4 = (double[]) obj2;
                j$.util.stream.j.a(dArr3, dArr4[0]);
                j$.util.stream.j.a(dArr3, dArr4[1]);
                dArr3[2] = dArr3[2] + dArr4[2];
                dArr3[3] = dArr3[3] + dArr4[3];
                return;
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return j$.com.android.tools.r8.a.c(this, biConsumer);
            case 20:
                return j$.com.android.tools.r8.a.c(this, biConsumer);
            case 21:
                return j$.com.android.tools.r8.a.c(this, biConsumer);
            case 22:
            case 23:
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
            default:
                return j$.com.android.tools.r8.a.c(this, biConsumer);
            case Maneuver.TYPE_FORK_LEFT /* 25 */:
                return j$.com.android.tools.r8.a.c(this, biConsumer);
        }
    }

    @Override // java.util.function.DoubleFunction
    public Object apply(double d) {
        return Double.valueOf(d);
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        return new Object[i];
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d, double d2) {
        return Math.min(d, d2);
    }

    @Override // java.util.function.ToDoubleFunction
    public double applyAsDouble(Object obj) {
        return ((Double) obj).doubleValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 15:
                return new v();
            case 16:
                return new w();
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new y();
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return new LinkedHashSet();
            default:
                return new double[4];
        }
    }

    @Override // j$.time.temporal.m
    public j$.time.temporal.l n(j$.time.temporal.l lVar) {
        ChronoField chronoField = ChronoField.DAY_OF_MONTH;
        return lVar.c(lVar.k(chronoField).d, chronoField);
    }

    @Override // j$.time.temporal.TemporalQuery
    public Object queryFrom(TemporalAccessor temporalAccessor) {
        int i = this.a;
        d dVar = j$.time.temporal.p.a;
        switch (i) {
            case 0:
                return LocalDate.O(temporalAccessor);
            case 1:
                return LocalDateTime.N(temporalAccessor);
            case 2:
                return LocalTime.N(temporalAccessor);
            case 3:
                DateTimeFormatter dateTimeFormatter = YearMonth.c;
                if (temporalAccessor instanceof YearMonth) {
                    return (YearMonth) temporalAccessor;
                }
                Objects.requireNonNull(temporalAccessor, "temporal");
                try {
                    if (!j$.time.chrono.q.c.equals(j$.com.android.tools.r8.a.P(temporalAccessor))) {
                        temporalAccessor = LocalDate.O(temporalAccessor);
                    }
                    return YearMonth.of(temporalAccessor.i(ChronoField.YEAR), temporalAccessor.i(ChronoField.MONTH_OF_YEAR));
                } catch (DateTimeException e) {
                    throw new RuntimeException("Unable to obtain YearMonth from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e);
                }
            case 4:
                if (temporalAccessor instanceof ZonedDateTime) {
                    return (ZonedDateTime) temporalAccessor;
                }
                try {
                    ZoneId M = ZoneId.M(temporalAccessor);
                    ChronoField chronoField = ChronoField.INSTANT_SECONDS;
                    temporalAccessor = temporalAccessor.e(chronoField) ? ZonedDateTime.n(temporalAccessor.B(chronoField), temporalAccessor.i(ChronoField.NANO_OF_SECOND), M) : ZonedDateTime.M(LocalDateTime.of(LocalDate.O(temporalAccessor), LocalTime.N(temporalAccessor)), M, null);
                    return temporalAccessor;
                } catch (DateTimeException e2) {
                    throw new RuntimeException("Unable to obtain ZonedDateTime from TemporalAccessor: " + temporalAccessor + " of type " + temporalAccessor.getClass().getName(), e2);
                }
            case 5:
                d dVar2 = DateTimeFormatterBuilder.h;
                ZoneId zoneId = (ZoneId) temporalAccessor.D(dVar);
                if (zoneId == null || (zoneId instanceof ZoneOffset)) {
                    return null;
                }
                return zoneId;
            case 6:
            default:
                ChronoField chronoField2 = ChronoField.NANO_OF_DAY;
                if (temporalAccessor.e(chronoField2)) {
                    return LocalTime.P(temporalAccessor.B(chronoField2));
                }
                return null;
            case 7:
                return (ZoneId) temporalAccessor.D(dVar);
            case 8:
                return (j$.time.chrono.j) temporalAccessor.D(j$.time.temporal.p.b);
            case 9:
                return (j$.time.temporal.q) temporalAccessor.D(j$.time.temporal.p.c);
            case 10:
                ChronoField chronoField3 = ChronoField.OFFSET_SECONDS;
                if (temporalAccessor.e(chronoField3)) {
                    return ZoneOffset.ofTotalSeconds(temporalAccessor.i(chronoField3));
                }
                return null;
            case 11:
                ZoneId zoneId2 = (ZoneId) temporalAccessor.D(dVar);
                return zoneId2 != null ? zoneId2 : (ZoneId) temporalAccessor.D(j$.time.temporal.p.d);
            case 12:
                ChronoField chronoField4 = ChronoField.EPOCH_DAY;
                if (temporalAccessor.e(chronoField4)) {
                    return LocalDate.ofEpochDay(temporalAccessor.B(chronoField4));
                }
                return null;
        }
    }

    public String toString() {
        switch (this.a) {
            case 7:
                return "ZoneId";
            case 8:
                return "Chronology";
            case 9:
                return "Precision";
            case 10:
                return "ZoneOffset";
            case 11:
                return "Zone";
            case 12:
                return "LocalDate";
            case 13:
                return "LocalTime";
            default:
                return super.toString();
        }
    }
}
