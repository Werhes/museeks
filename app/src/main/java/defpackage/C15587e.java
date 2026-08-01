package defpackage;

import j$.lang.Iterable$CC;
import j$.util.Collection;
import j$.util.List;
import j$.util.Spliterator;
import j$.util.stream.Stream;
import java.lang.reflect.Array;
import java.util.AbstractList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.RandomAccess;
import java.util.function.Consumer;
import java.util.function.IntFunction;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eِٕٜ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C15587e extends AbstractList implements RandomAccess, List {

    /* renamed from: eؘٙؓ, reason: contains not printable characters */
    public Object f30751e;

    /* renamed from: eّٖۦ, reason: contains not printable characters */
    public int f30752e;

    public static /* synthetic */ void appmetrica(int i) {
        String str = (i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? "@NotNull method %s.%s must not return null" : "Argument for @NotNull parameter '%s' of %s.%s must not be null";
        Object[] objArr = new Object[(i == 2 || i == 3 || i == 5 || i == 6 || i == 7) ? 2 : 3];
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                objArr[0] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
                break;
            case 4:
                objArr[0] = "a";
                break;
            default:
                objArr[0] = "elements";
                break;
        }
        if (i == 2 || i == 3) {
            objArr[1] = "iterator";
        } else if (i == 5 || i == 6 || i == 7) {
            objArr[1] = "toArray";
        } else {
            objArr[1] = "kotlin/reflect/jvm/internal/impl/utils/SmartList";
        }
        switch (i) {
            case 2:
            case 3:
            case 5:
            case 6:
            case 7:
                break;
            case 4:
                objArr[2] = "toArray";
                break;
            default:
                objArr[2] = "<init>";
                break;
        }
        String format = String.format(str, objArr);
        if (i != 2 && i != 3 && i != 5 && i != 6 && i != 7) {
            throw new IllegalArgumentException(format);
        }
        throw new IllegalStateException(format);
    }

    @Override // java.util.AbstractList, java.util.List
    public final void add(int i, Object obj) {
        int i2;
        if (i < 0 || i > (i2 = this.f30752e)) {
            StringBuilder premium = AbstractC4653e.premium("Index: ", i, ", Size: ");
            premium.append(this.f30752e);
            throw new IndexOutOfBoundsException(premium.toString());
        }
        if (i2 == 0) {
            this.f30751e = obj;
        } else if (i2 == 1 && i == 0) {
            this.f30751e = new Object[]{obj, this.f30751e};
        } else {
            Object[] objArr = new Object[i2 + 1];
            if (i2 == 1) {
                objArr[0] = this.f30751e;
            } else {
                Object[] objArr2 = (Object[]) this.f30751e;
                System.arraycopy(objArr2, 0, objArr, 0, i);
                System.arraycopy(objArr2, i, objArr, i + 1, this.f30752e - i);
            }
            objArr[i] = obj;
            this.f30751e = objArr;
        }
        this.f30752e++;
        ((AbstractList) this).modCount++;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean add(Object obj) {
        int i = this.f30752e;
        if (i == 0) {
            this.f30751e = obj;
        } else if (i == 1) {
            this.f30751e = new Object[]{this.f30751e, obj};
        } else {
            Object[] objArr = (Object[]) this.f30751e;
            int length = objArr.length;
            if (i >= length) {
                int appmetrica = AbstractC10257e.appmetrica(length, 3, 2, 1);
                int i2 = i + 1;
                if (appmetrica < i2) {
                    appmetrica = i2;
                }
                Object[] objArr2 = new Object[appmetrica];
                this.f30751e = objArr2;
                System.arraycopy(objArr, 0, objArr2, 0, length);
                objArr = objArr2;
            }
            objArr[this.f30752e] = obj;
        }
        this.f30752e++;
        ((AbstractList) this).modCount++;
        return true;
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        this.f30751e = null;
        this.f30752e = 0;
        ((AbstractList) this).modCount++;
    }

    @Override // java.lang.Iterable, j$.util.Collection, j$.lang.a
    public /* synthetic */ void forEach(Consumer consumer) {
        Iterable$CC.$default$forEach(this, consumer);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object get(int i) {
        int i2;
        if (i >= 0 && i < (i2 = this.f30752e)) {
            return i2 == 1 ? this.f30751e : ((Object[]) this.f30751e)[i];
        }
        StringBuilder premium = AbstractC4653e.premium("Index: ", i, ", Size: ");
        premium.append(this.f30752e);
        throw new IndexOutOfBoundsException(premium.toString());
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator iterator() {
        int i = this.f30752e;
        if (i == 0) {
            return C7726e.f15673e;
        }
        if (i == 1) {
            return new C8710e(this);
        }
        Iterator it = super.iterator();
        if (it != null) {
            return it;
        }
        appmetrica(3);
        throw null;
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream parallelStream() {
        return Collection.CC.$default$parallelStream(this);
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream parallelStream() {
        return Stream.Wrapper.convert(parallelStream());
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object remove(int i) {
        int i2;
        Object obj;
        if (i < 0 || i >= (i2 = this.f30752e)) {
            StringBuilder premium = AbstractC4653e.premium("Index: ", i, ", Size: ");
            premium.append(this.f30752e);
            throw new IndexOutOfBoundsException(premium.toString());
        }
        if (i2 == 1) {
            obj = this.f30751e;
            this.f30751e = null;
        } else {
            Object[] objArr = (Object[]) this.f30751e;
            Object obj2 = objArr[i];
            if (i2 == 2) {
                this.f30751e = objArr[1 - i];
            } else {
                int i3 = (i2 - i) - 1;
                if (i3 > 0) {
                    System.arraycopy(objArr, i + 1, objArr, i, i3);
                }
                objArr[this.f30752e - 1] = null;
            }
            obj = obj2;
        }
        this.f30752e--;
        ((AbstractList) this).modCount++;
        return obj;
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ boolean removeIf(Predicate predicate) {
        return Collection.CC.$default$removeIf(this, predicate);
    }

    @Override // java.util.List, j$.util.List
    public /* synthetic */ void replaceAll(UnaryOperator unaryOperator) {
        List.CC.$default$replaceAll(this, unaryOperator);
    }

    @Override // java.util.AbstractList, java.util.List
    public final Object set(int i, Object obj) {
        int i2;
        if (i < 0 || i >= (i2 = this.f30752e)) {
            StringBuilder premium = AbstractC4653e.premium("Index: ", i, ", Size: ");
            premium.append(this.f30752e);
            throw new IndexOutOfBoundsException(premium.toString());
        }
        if (i2 == 1) {
            Object obj2 = this.f30751e;
            this.f30751e = obj;
            return obj2;
        }
        Object[] objArr = (Object[]) this.f30751e;
        Object obj3 = objArr[i];
        objArr[i] = obj;
        return obj3;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.f30752e;
    }

    @Override // java.util.List, j$.util.List
    public final void sort(Comparator comparator) {
        int i = this.f30752e;
        if (i >= 2) {
            Arrays.sort((Object[]) this.f30751e, 0, i, comparator);
        }
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List, j$.util.List, j$.util.Collection
    public /* synthetic */ Spliterator spliterator() {
        return List.CC.$default$spliterator(this);
    }

    @Override // java.util.Collection, java.lang.Iterable, java.util.List
    public /* synthetic */ java.util.Spliterator spliterator() {
        return Spliterator.Wrapper.convert(spliterator());
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Stream stream() {
        return Collection.CC.$default$stream(this);
    }

    @Override // java.util.Collection
    public /* synthetic */ java.util.stream.Stream stream() {
        return Stream.Wrapper.convert(stream());
    }

    @Override // java.util.Collection, j$.util.Collection
    public /* synthetic */ Object[] toArray(IntFunction intFunction) {
        Object[] array;
        array = toArray((Object[]) intFunction.apply(0));
        return array;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final Object[] toArray(Object[] objArr) {
        if (objArr == null) {
            appmetrica(4);
            throw null;
        }
        int length = objArr.length;
        int i = this.f30752e;
        if (i == 1) {
            if (length == 0) {
                Object[] objArr2 = (Object[]) Array.newInstance(objArr.getClass().getComponentType(), 1);
                objArr2[0] = this.f30751e;
                return objArr2;
            }
            objArr[0] = this.f30751e;
        } else {
            if (length < i) {
                Object[] copyOf = Arrays.copyOf((Object[]) this.f30751e, i, objArr.getClass());
                if (copyOf != null) {
                    return copyOf;
                }
                appmetrica(6);
                throw null;
            }
            if (i != 0) {
                System.arraycopy(this.f30751e, 0, objArr, 0, i);
            }
        }
        int i2 = this.f30752e;
        if (length > i2) {
            objArr[i2] = null;
        }
        return objArr;
    }
}
