package j$.util.stream;

import j$.util.Objects;
import j$.util.Spliterator;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.ToDoubleFunction;
import java.util.function.ToIntFunction;
import java.util.function.ToLongFunction;

/* loaded from: classes2.dex */
public abstract class c5 extends a implements Stream {
    @Override // j$.util.stream.u3
    public final x1 A0(long j, IntFunction intFunction) {
        return u3.Z(j, intFunction);
    }

    @Override // j$.util.stream.a
    public final f2 J0(a aVar, Spliterator spliterator, boolean z, IntFunction intFunction) {
        return u3.b0(aVar, spliterator, z, intFunction);
    }

    @Override // j$.util.stream.a
    public final boolean K0(Spliterator spliterator, k5 k5Var) {
        boolean m;
        do {
            m = k5Var.m();
            if (m) {
                break;
            }
        } while (spliterator.tryAdvance(k5Var));
        return m;
    }

    @Override // j$.util.stream.a
    public final y6 L0() {
        return y6.REFERENCE;
    }

    @Override // j$.util.stream.a
    public final Spliterator S0(a aVar, Supplier supplier, boolean z) {
        return new z6(aVar, supplier, z);
    }

    @Override // j$.util.stream.Stream
    public final boolean allMatch(Predicate predicate) {
        return ((Boolean) H0(u3.B0(s1.ALL, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final boolean anyMatch(Predicate predicate) {
        return ((Boolean) H0(u3.B0(s1.ANY, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        Objects.requireNonNull(supplier);
        Objects.requireNonNull(biConsumer);
        Objects.requireNonNull(biConsumer2);
        return H0(new z3(y6.REFERENCE, biConsumer2, biConsumer, supplier, 3));
    }

    @Override // j$.util.stream.Stream
    public final long count() {
        return ((Long) H0(new b4(2))).longValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream d(j$.time.r rVar) {
        Objects.requireNonNull(rVar);
        return new q(this, x6.p | x6.n | x6.t, rVar, 6);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [j$.util.stream.Stream, j$.util.stream.a] */
    @Override // j$.util.stream.Stream
    public final Stream distinct() {
        return new a(this, x6.m | x6.t);
    }

    @Override // j$.util.stream.Stream
    public final Stream dropWhile(Predicate predicate) {
        int i = x8.a;
        Objects.requireNonNull(predicate);
        return new g8(this, x8.b, predicate, 1);
    }

    @Override // j$.util.stream.Stream
    public final Stream filter(Predicate predicate) {
        Objects.requireNonNull(predicate);
        return new q(this, x6.t, predicate, 4);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.z findAny() {
        return (j$.util.z) H0(h0.d);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.z findFirst() {
        return (j$.util.z) H0(h0.c);
    }

    @Override // j$.util.stream.Stream
    public void forEach(Consumer consumer) {
        Objects.requireNonNull(consumer);
        H0(new o0(consumer, false));
    }

    @Override // j$.util.stream.Stream
    public void forEachOrdered(Consumer consumer) {
        Objects.requireNonNull(consumer);
        H0(new o0(consumer, true));
    }

    /* JADX WARN: Code restructure failed: missing block: B:131:0x0137, code lost:
    
        if (r0.contains(j$.util.stream.h.UNORDERED) != false) goto L106;
     */
    /* JADX WARN: Removed duplicated region for block: B:139:0x0199  */
    /* JADX WARN: Removed duplicated region for block: B:165:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:196:0x020b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:197:0x020c  */
    @Override // j$.util.stream.Stream
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct add '--show-bad-code' argument
    */
    public final java.lang.Object h(j$.util.stream.i r10) {
        /*
            Method dump skipped, instructions count: 535
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: j$.util.stream.c5.h(j$.util.stream.i):java.lang.Object");
    }

    @Override // j$.util.stream.g
    public final Iterator iterator() {
        Spliterator spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.e1(spliterator);
    }

    @Override // j$.util.stream.Stream
    public final Stream limit(long j) {
        if (j >= 0) {
            return u3.C0(this, 0L, j);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream map(Function function) {
        Objects.requireNonNull(function);
        return new q(this, x6.p | x6.n, function, 5);
    }

    @Override // j$.util.stream.Stream
    public final c0 mapToDouble(ToDoubleFunction toDoubleFunction) {
        Objects.requireNonNull(toDoubleFunction);
        return new r(this, x6.p | x6.n, toDoubleFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final IntStream mapToInt(ToIntFunction toIntFunction) {
        Objects.requireNonNull(toIntFunction);
        return new t0(this, x6.p | x6.n, toIntFunction, 2);
    }

    @Override // j$.util.stream.Stream
    public final l1 mapToLong(ToLongFunction toLongFunction) {
        Objects.requireNonNull(toLongFunction);
        return new e1(this, x6.p | x6.n, toLongFunction, 3);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.z max(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 0));
    }

    @Override // j$.util.stream.Stream
    public final j$.util.z min(Comparator comparator) {
        Objects.requireNonNull(comparator);
        return reduce(new j$.util.function.a(comparator, 1));
    }

    @Override // j$.util.stream.Stream
    public final boolean noneMatch(Predicate predicate) {
        return ((Boolean) H0(u3.B0(s1.NONE, predicate))).booleanValue();
    }

    @Override // j$.util.stream.Stream
    public final Stream peek(Consumer consumer) {
        Objects.requireNonNull(consumer);
        return new q(this, consumer);
    }

    @Override // j$.util.stream.Stream
    public final l1 q(j$.time.r rVar) {
        Objects.requireNonNull(rVar);
        return new e1(this, x6.p | x6.n | x6.t, rVar, 2);
    }

    @Override // j$.util.stream.Stream
    public final j$.util.z reduce(BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        return (j$.util.z) H0(new x3(y6.REFERENCE, binaryOperator, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        Objects.requireNonNull(biFunction);
        Objects.requireNonNull(binaryOperator);
        return H0(new z3(y6.REFERENCE, binaryOperator, biFunction, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Object reduce(Object obj, BinaryOperator binaryOperator) {
        Objects.requireNonNull(binaryOperator);
        Objects.requireNonNull(binaryOperator);
        return H0(new z3(y6.REFERENCE, binaryOperator, binaryOperator, obj, 2));
    }

    @Override // j$.util.stream.Stream
    public final Stream skip(long j) {
        if (j >= 0) {
            return j == 0 ? this : u3.C0(this, j, -1L);
        }
        throw new IllegalArgumentException(Long.toString(j));
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted() {
        return new f6(this);
    }

    @Override // j$.util.stream.Stream
    public final Stream sorted(Comparator comparator) {
        return new f6(this, comparator);
    }

    @Override // j$.util.stream.Stream
    public final Stream takeWhile(Predicate predicate) {
        int i = x8.a;
        Objects.requireNonNull(predicate);
        return new g8(this, x8.a, predicate, 0);
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray() {
        return toArray(new a1(14));
    }

    @Override // j$.util.stream.Stream
    public final Object[] toArray(IntFunction intFunction) {
        return u3.n0(I0(intFunction), intFunction).g(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final List toList() {
        return Collections.unmodifiableList(new ArrayList(Arrays.asList(toArray())));
    }

    @Override // j$.util.stream.Stream
    public final IntStream w(j$.time.r rVar) {
        Objects.requireNonNull(rVar);
        return new t0(this, x6.p | x6.n | x6.t, rVar, 3);
    }

    @Override // j$.util.stream.Stream
    public final c0 y(j$.time.r rVar) {
        Objects.requireNonNull(rVar);
        return new r(this, x6.p | x6.n | x6.t, rVar, 4);
    }
}
