package j$.util.stream;

import androidx.car.app.navigation.model.Maneuver;
import java.util.function.BiConsumer;
import java.util.function.DoubleBinaryOperator;
import java.util.function.IntBinaryOperator;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjDoubleConsumer;
import java.util.function.ObjIntConsumer;
import java.util.function.ObjLongConsumer;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public final /* synthetic */ class n implements IntFunction, DoubleBinaryOperator, Supplier, ObjDoubleConsumer, Predicate, ToIntFunction, IntBinaryOperator, ObjIntConsumer, BiConsumer, ObjLongConsumer, LongBinaryOperator, ToLongFunction, LongFunction {
    public final /* synthetic */ int a;

    @Override // java.util.function.ObjDoubleConsumer
    public void accept(Object obj, double d) {
        double[] dArr = (double[]) obj;
        j.a(dArr, d);
        dArr[2] = dArr[2] + d;
    }

    @Override // java.util.function.ObjIntConsumer
    public void accept(Object obj, int i) {
        switch (this.a) {
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                ((j$.util.w) obj).accept(i);
                return;
            default:
                long[] jArr = (long[]) obj;
                jArr[0] = jArr[0] + 1;
                jArr[1] = jArr[1] + i;
                return;
        }
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j) {
        ((j$.util.y) obj).accept(j);
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        switch (this.a) {
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                ((j$.util.w) obj).a((j$.util.w) obj2);
                return;
            case 23:
                long[] jArr = (long[]) obj;
                long[] jArr2 = (long[]) obj2;
                jArr[0] = jArr[0] + jArr2[0];
                jArr[1] = jArr[1] + jArr2[1];
                return;
            default:
                ((j$.util.y) obj).a((j$.util.y) obj2);
                return;
        }
    }

    public /* synthetic */ Predicate and(Predicate predicate) {
        switch (this.a) {
            case 4:
                return j$.com.android.tools.r8.a.b(this, predicate);
            case 5:
            case 7:
            default:
                return j$.com.android.tools.r8.a.b(this, predicate);
            case 6:
                return j$.com.android.tools.r8.a.b(this, predicate);
            case 8:
                return j$.com.android.tools.r8.a.b(this, predicate);
        }
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        switch (this.a) {
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return j$.com.android.tools.r8.a.c(this, biConsumer);
            case 23:
                return j$.com.android.tools.r8.a.c(this, biConsumer);
            default:
                return j$.com.android.tools.r8.a.c(this, biConsumer);
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 0:
                return new Double[i];
            case 12:
                return new Object[i];
            case 13:
                return new Integer[i];
            case 15:
                return Integer.valueOf(i);
            default:
                return new Long[i];
        }
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        return Long.valueOf(j);
    }

    @Override // java.util.function.DoubleBinaryOperator
    public double applyAsDouble(double d, double d2) {
        return Math.max(d, d2);
    }

    @Override // java.util.function.IntBinaryOperator
    public int applyAsInt(int i, int i2) {
        switch (this.a) {
            case 16:
                return Math.min(i, i2);
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
                return i + i2;
            default:
                return Math.max(i, i2);
        }
    }

    @Override // java.util.function.ToIntFunction
    public int applyAsInt(Object obj) {
        return ((Integer) obj).intValue();
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j2) {
        return Math.min(j, j2);
    }

    @Override // java.util.function.ToLongFunction
    public long applyAsLong(Object obj) {
        return ((Long) obj).longValue();
    }

    @Override // java.util.function.Supplier
    public Object get() {
        switch (this.a) {
            case 2:
                return new double[3];
            case 5:
                return new Object();
            case 7:
                return new Object();
            case 9:
                return new Object();
            case 11:
                return new Object();
            default:
                return new long[2];
        }
    }

    public Predicate negate() {
        switch (this.a) {
            case 4:
                return new j$.time.r(2, this);
            case 5:
            case 7:
            default:
                return new j$.time.r(2, this);
            case 6:
                return new j$.time.r(2, this);
            case 8:
                return new j$.time.r(2, this);
        }
    }

    public /* synthetic */ Predicate or(Predicate predicate) {
        switch (this.a) {
            case 4:
                return j$.com.android.tools.r8.a.u(this, predicate);
            case 5:
            case 7:
            default:
                return j$.com.android.tools.r8.a.u(this, predicate);
            case 6:
                return j$.com.android.tools.r8.a.u(this, predicate);
            case 8:
                return j$.com.android.tools.r8.a.u(this, predicate);
        }
    }

    @Override // java.util.function.Predicate
    public boolean test(Object obj) {
        switch (this.a) {
            case 4:
                return ((j$.util.a0) obj).a;
            case 5:
            case 7:
            default:
                return ((j$.util.z) obj).a != null;
            case 6:
                return ((j$.util.b0) obj).a;
            case 8:
                return ((j$.util.c0) obj).a;
        }
    }
}
