package j$.util.stream;

import j$.util.Objects;
import j$.util.function.IntConsumer$CC;
import java.util.Arrays;
import java.util.Iterator;
import java.util.function.Consumer;
import java.util.function.IntConsumer;

/* loaded from: classes2.dex */
public class p6 extends t6 implements IntConsumer {
    @Override // java.util.function.IntConsumer
    public void accept(int i) {
        u();
        int[] iArr = (int[]) this.e;
        int i2 = this.b;
        this.b = i2 + 1;
        iArr[i2] = i;
    }

    public final /* synthetic */ IntConsumer andThen(IntConsumer intConsumer) {
        return IntConsumer$CC.$default$andThen(this, intConsumer);
    }

    @Override // java.lang.Iterable, j$.lang.a
    public final void forEach(Consumer consumer) {
        if (consumer instanceof IntConsumer) {
            d((IntConsumer) consumer);
        } else {
            if (f8.a) {
                f8.a(getClass(), "{0} calling SpinedBuffer.OfInt.forEach(Consumer)");
                throw null;
            }
            j$.com.android.tools.r8.a.l((o6) spliterator(), consumer);
        }
    }

    @Override // java.lang.Iterable
    public final Iterator iterator() {
        j$.util.w0 spliterator = spliterator();
        Objects.requireNonNull(spliterator);
        return new j$.util.f1(spliterator);
    }

    @Override // j$.util.stream.t6
    public final void j(Object obj, int i, int i2, Object obj2) {
        int[] iArr = (int[]) obj;
        IntConsumer intConsumer = (IntConsumer) obj2;
        while (i < i2) {
            intConsumer.accept(iArr[i]);
            i++;
        }
    }

    @Override // j$.util.stream.t6
    public final int k(Object obj) {
        return ((int[]) obj).length;
    }

    @Override // j$.util.stream.t6
    public final Object newArray(int i) {
        return new int[i];
    }

    @Override // j$.util.stream.t6
    public final Object[] r() {
        return new int[8];
    }

    public final String toString() {
        int[] iArr = (int[]) b();
        if (iArr.length < 200) {
            return String.format("%s[length=%d, chunks=%d]%s", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(iArr));
        }
        return String.format("%s[length=%d, chunks=%d]%s...", getClass().getSimpleName(), Integer.valueOf(iArr.length), Integer.valueOf(this.c), Arrays.toString(Arrays.copyOf(iArr, 200)));
    }

    @Override // j$.util.stream.t6, java.lang.Iterable, j$.util.stream.f2
    /* renamed from: v, reason: merged with bridge method [inline-methods] */
    public j$.util.w0 spliterator() {
        return new o6(this, 0, this.c, 0, this.b);
    }
}
