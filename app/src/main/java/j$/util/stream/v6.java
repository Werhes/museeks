package j$.util.stream;

import j$.util.Spliterator;
import j$.util.stream.IntStream;
import j$.util.stream.Stream;
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
public final /* synthetic */ class v6 implements Stream {
    public final /* synthetic */ java.util.stream.Stream a;

    public /* synthetic */ v6(java.util.stream.Stream stream) {
        this.a = stream;
    }

    public static /* synthetic */ Stream f(java.util.stream.Stream stream) {
        if (stream == null) {
            return null;
        }
        return stream instanceof Stream.Wrapper ? Stream.this : new v6(stream);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean allMatch(Predicate predicate) {
        return this.a.allMatch(predicate);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean anyMatch(Predicate predicate) {
        return this.a.anyMatch(predicate);
    }

    @Override // java.lang.AutoCloseable
    public final /* synthetic */ void close() {
        this.a.close();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object collect(Supplier supplier, BiConsumer biConsumer, BiConsumer biConsumer2) {
        return this.a.collect(supplier, biConsumer, biConsumer2);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ long count() {
        return this.a.count();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream d(j$.time.r rVar) {
        return f(this.a.flatMap(u3.r0(rVar)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream distinct() {
        return f(this.a.distinct());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream dropWhile(Predicate predicate) {
        return f(this.a.dropWhile(predicate));
    }

    public final /* synthetic */ boolean equals(Object obj) {
        java.util.stream.Stream stream = this.a;
        if (obj instanceof v6) {
            obj = ((v6) obj).a;
        }
        return stream.equals(obj);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream filter(Predicate predicate) {
        return f(this.a.filter(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.z findAny() {
        return j$.com.android.tools.r8.a.G(this.a.findAny());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.z findFirst() {
        return j$.com.android.tools.r8.a.G(this.a.findFirst());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEach(Consumer consumer) {
        this.a.forEach(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ void forEachOrdered(Consumer consumer) {
        this.a.forEachOrdered(consumer);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object h(i iVar) {
        return this.a.collect(iVar == null ? null : iVar.a);
    }

    public final /* synthetic */ int hashCode() {
        return this.a.hashCode();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ boolean isParallel() {
        return this.a.isParallel();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Iterator iterator() {
        return this.a.iterator();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream limit(long j) {
        return f(this.a.limit(j));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream map(Function function) {
        return f(this.a.map(function));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ c0 mapToDouble(ToDoubleFunction toDoubleFunction) {
        return a0.f(this.a.mapToDouble(toDoubleFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream mapToInt(ToIntFunction toIntFunction) {
        return IntStream.VivifiedWrapper.convert(this.a.mapToInt(toIntFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ l1 mapToLong(ToLongFunction toLongFunction) {
        return j1.f(this.a.mapToLong(toLongFunction));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.z max(Comparator comparator) {
        return j$.com.android.tools.r8.a.G(this.a.max(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.z min(Comparator comparator) {
        return j$.com.android.tools.r8.a.G(this.a.min(comparator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ boolean noneMatch(Predicate predicate) {
        return this.a.noneMatch(predicate);
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g onClose(Runnable runnable) {
        return e.f(this.a.onClose(runnable));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g parallel() {
        return e.f(this.a.parallel());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream peek(Consumer consumer) {
        return f(this.a.peek(consumer));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ l1 q(j$.time.r rVar) {
        return j1.f(this.a.flatMapToLong(u3.r0(rVar)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ j$.util.z reduce(BinaryOperator binaryOperator) {
        return j$.com.android.tools.r8.a.G(this.a.reduce(binaryOperator));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BiFunction biFunction, BinaryOperator binaryOperator) {
        return this.a.reduce(obj, biFunction, binaryOperator);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object reduce(Object obj, BinaryOperator binaryOperator) {
        return this.a.reduce(obj, binaryOperator);
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g sequential() {
        return e.f(this.a.sequential());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream skip(long j) {
        return f(this.a.skip(j));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted() {
        return f(this.a.sorted());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream sorted(Comparator comparator) {
        return f(this.a.sorted(comparator));
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ Spliterator spliterator() {
        return j$.util.d1.a(this.a.spliterator());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Stream takeWhile(Predicate predicate) {
        return f(this.a.takeWhile(predicate));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray() {
        return this.a.toArray();
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ Object[] toArray(IntFunction intFunction) {
        return this.a.toArray(intFunction);
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ List toList() {
        return this.a.toList();
    }

    @Override // j$.util.stream.g
    public final /* synthetic */ g unordered() {
        return e.f(this.a.unordered());
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ IntStream w(j$.time.r rVar) {
        return IntStream.VivifiedWrapper.convert(this.a.flatMapToInt(u3.r0(rVar)));
    }

    @Override // j$.util.stream.Stream
    public final /* synthetic */ c0 y(j$.time.r rVar) {
        return a0.f(this.a.flatMapToDouble(u3.r0(rVar)));
    }
}
