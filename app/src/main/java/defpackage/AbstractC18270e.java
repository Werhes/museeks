package defpackage;

import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٟؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC18270e extends AbstractC4765e {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, AbstractC18270e> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C16724e unknownFields;

    public AbstractC18270e() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C16724e.purchase;
    }

    public static void adcel(Class cls, AbstractC18270e abstractC18270e) {
        abstractC18270e.yandex();
        defaultInstanceMap.put(cls, abstractC18270e);
    }

    public static final boolean appmetrica(AbstractC18270e abstractC18270e, boolean z) {
        byte byteValue = ((Byte) abstractC18270e.vip(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C13571e c13571e = C13571e.metrica;
        c13571e.getClass();
        boolean metrica = c13571e.ad(abstractC18270e.getClass()).metrica(abstractC18270e);
        if (z) {
            abstractC18270e.vip(2);
        }
        return metrica;
    }

    public static Object license(Method method, AbstractC18270e abstractC18270e, Object... objArr) {
        try {
            return method.invoke(abstractC18270e, objArr);
        } catch (IllegalAccessException e) {
            throw new RuntimeException("Couldn't use Java reflection to implement protocol message reflection.", e);
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException("Unexpected exception thrown by generated accessor method.", cause);
        }
    }

    public static AbstractC18270e metrica(Class cls) {
        AbstractC18270e abstractC18270e = defaultInstanceMap.get(cls);
        if (abstractC18270e == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC18270e = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC18270e != null) {
            return abstractC18270e;
        }
        AbstractC18270e abstractC18270e2 = (AbstractC18270e) ((AbstractC18270e) AbstractC9259e.license(cls)).vip(6);
        if (abstractC18270e2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC18270e2);
        return abstractC18270e2;
    }

    @Override // defpackage.AbstractC4765e
    public final int ad(InterfaceC11969e interfaceC11969e) {
        int billing;
        int billing2;
        if (purchase()) {
            if (interfaceC11969e == null) {
                C13571e c13571e = C13571e.metrica;
                c13571e.getClass();
                billing2 = c13571e.ad(getClass()).billing(this);
            } else {
                billing2 = interfaceC11969e.billing(this);
            }
            if (billing2 >= 0) {
                return billing2;
            }
            throw new IllegalStateException(AbstractC1786e.admob(billing2, "serialized size must be non-negative, was "));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Alert.DURATION_SHOW_INDEFINITELY) != Integer.MAX_VALUE) {
            return i & Alert.DURATION_SHOW_INDEFINITELY;
        }
        if (interfaceC11969e == null) {
            C13571e c13571e2 = C13571e.metrica;
            c13571e2.getClass();
            billing = c13571e2.ad(getClass()).billing(this);
        } else {
            billing = interfaceC11969e.billing(this);
        }
        mopub(billing);
        return billing;
    }

    public final void advert(C15997e c15997e) {
        C13571e c13571e = C13571e.metrica;
        c13571e.getClass();
        InterfaceC11969e ad = c13571e.ad(getClass());
        C6594e c6594e = c15997e.vip;
        if (c6594e == null) {
            c6594e = new C6594e(c15997e);
        }
        ad.yandex(c6594e, this);
    }

    public final void billing() {
        C13571e c13571e = C13571e.metrica;
        c13571e.getClass();
        c13571e.ad(getClass()).vip(this);
        yandex();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C13571e c13571e = C13571e.metrica;
        c13571e.getClass();
        return c13571e.ad(getClass()).appmetrica(this, (AbstractC18270e) obj);
    }

    public final int hashCode() {
        if (purchase()) {
            C13571e c13571e = C13571e.metrica;
            c13571e.getClass();
            return c13571e.ad(getClass()).purchase(this);
        }
        if (this.memoizedHashCode == 0) {
            C13571e c13571e2 = C13571e.metrica;
            c13571e2.getClass();
            this.memoizedHashCode = c13571e2.ad(getClass()).purchase(this);
        }
        return this.memoizedHashCode;
    }

    public final void mopub(int i) {
        if (i < 0) {
            throw new IllegalStateException(AbstractC1786e.admob(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Alert.DURATION_SHOW_INDEFINITELY) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final boolean purchase() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    public final AbstractC18270e startapp() {
        return (AbstractC18270e) vip(4);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = AbstractC5068e.ad;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        AbstractC5068e.metrica(this, sb, 0);
        return sb.toString();
    }

    public abstract Object vip(int i);

    public final void yandex() {
        this.memoizedSerializedSize &= Alert.DURATION_SHOW_INDEFINITELY;
    }
}
