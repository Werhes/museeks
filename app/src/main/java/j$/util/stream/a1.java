package j$.util.stream;

import androidx.car.app.navigation.model.Maneuver;
import j$.util.function.BiFunction$CC;
import j$.util.function.Consumer$CC;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.LongBinaryOperator;
import java.util.function.LongFunction;
import java.util.function.ObjLongConsumer;
import java.util.function.Supplier;

/* loaded from: classes2.dex */
public final /* synthetic */ class a1 implements Supplier, ObjLongConsumer, BiConsumer, LongBinaryOperator, Consumer, IntFunction, LongFunction, BinaryOperator {
    public final /* synthetic */ int a;

    public /* synthetic */ a1(int i) {
        this.a = i;
    }

    private final void accept$j$$util$stream$Node$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda0(Object obj) {
    }

    private final void accept$j$$util$stream$StreamSpliterators$SliceSpliterator$OfRef$$ExternalSyntheticLambda1(Object obj) {
    }

    @Override // java.util.function.Consumer
    /* renamed from: accept */
    public void t(Object obj) {
        int i = this.a;
    }

    @Override // java.util.function.ObjLongConsumer
    public void accept(Object obj, long j) {
        long[] jArr = (long[]) obj;
        jArr[0] = jArr[0] + 1;
        jArr[1] = jArr[1] + j;
    }

    @Override // java.util.function.BiConsumer
    public void accept(Object obj, Object obj2) {
        long[] jArr = (long[]) obj;
        long[] jArr2 = (long[]) obj2;
        jArr[0] = jArr[0] + jArr2[0];
        jArr[1] = jArr[1] + jArr2[1];
    }

    public /* synthetic */ BiConsumer andThen(BiConsumer biConsumer) {
        return j$.com.android.tools.r8.a.c(this, biConsumer);
    }

    public /* synthetic */ BiFunction andThen(Function function) {
        switch (this.a) {
            case 8:
                return BiFunction$CC.$default$andThen(this, function);
            case 9:
            case 11:
            default:
                return BiFunction$CC.$default$andThen(this, function);
            case 10:
                return BiFunction$CC.$default$andThen(this, function);
            case 12:
                return BiFunction$CC.$default$andThen(this, function);
        }
    }

    public /* synthetic */ Consumer andThen(Consumer consumer) {
        switch (this.a) {
            case 5:
                return Consumer$CC.$default$andThen(this, consumer);
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
                return Consumer$CC.$default$andThen(this, consumer);
            default:
                return Consumer$CC.$default$andThen(this, consumer);
        }
    }

    @Override // java.util.function.IntFunction
    public Object apply(int i) {
        switch (this.a) {
            case 6:
                return new Object[i];
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case Maneuver.TYPE_ON_RAMP_SHARP_RIGHT /* 18 */:
            case Maneuver.TYPE_ON_RAMP_U_TURN_LEFT /* 19 */:
            default:
                return new Double[i];
            case 14:
                return new Object[i];
            case 15:
                return new Integer[i];
            case 16:
                return new Long[i];
            case Maneuver.TYPE_ON_RAMP_SHARP_LEFT /* 17 */:
                return new Double[i];
            case 20:
                return new Integer[i];
            case 21:
                return new Integer[i];
            case 22:
                return new Long[i];
            case 23:
                return new Long[i];
            case Maneuver.TYPE_OFF_RAMP_NORMAL_RIGHT /* 24 */:
                return new Double[i];
        }
    }

    @Override // java.util.function.LongFunction
    public Object apply(long j) {
        switch (this.a) {
            case 7:
                return u3.i0(j);
            case 8:
            default:
                return u3.t0(j);
            case 9:
                return u3.s0(j);
        }
    }

    @Override // java.util.function.BiFunction
    public Object apply(Object obj, Object obj2) {
        switch (this.a) {
            case 8:
                return new h2((z1) obj, (z1) obj2);
            case 9:
            case 11:
            default:
                return new h2((f2) obj, (f2) obj2);
            case 10:
                return new h2((b2) obj, (b2) obj2);
            case 12:
                return new h2((d2) obj, (d2) obj2);
        }
    }

    @Override // java.util.function.LongBinaryOperator
    public long applyAsLong(long j, long j2) {
        switch (this.a) {
            case 3:
                return Math.max(j, j2);
            default:
                return j + j2;
        }
    }

    @Override // java.util.function.Supplier
    public Object get() {
        return new long[2];
    }
}
