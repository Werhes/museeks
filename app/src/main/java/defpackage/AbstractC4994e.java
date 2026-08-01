package defpackage;

import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.nio.charset.Charset;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؗٚۘ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC4994e extends AbstractC6866e {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Object, AbstractC4994e> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C16137e unknownFields;

    public AbstractC4994e() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C16137e.purchase;
    }

    public static AbstractC4994e appmetrica(Class cls) {
        AbstractC4994e abstractC4994e = defaultInstanceMap.get(cls);
        if (abstractC4994e == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC4994e = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC4994e != null) {
            return abstractC4994e;
        }
        AbstractC4994e abstractC4994e2 = (AbstractC4994e) ((AbstractC4994e) AbstractC14352e.vip(cls)).license(6);
        if (abstractC4994e2 == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, abstractC4994e2);
        return abstractC4994e2;
    }

    public static final boolean billing(AbstractC4994e abstractC4994e, boolean z) {
        byte byteValue = ((Byte) abstractC4994e.license(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C5623e c5623e = C5623e.metrica;
        c5623e.getClass();
        boolean metrica = c5623e.ad(abstractC4994e.getClass()).metrica(abstractC4994e);
        if (z) {
            abstractC4994e.license(2);
        }
        return metrica;
    }

    public static void mopub(Class cls, AbstractC4994e abstractC4994e) {
        abstractC4994e.startapp();
        defaultInstanceMap.put(cls, abstractC4994e);
    }

    public static Object purchase(Method method, AbstractC4994e abstractC4994e, Object... objArr) {
        try {
            return method.invoke(abstractC4994e, objArr);
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

    public final AbstractC4994e adcel() {
        return (AbstractC4994e) license(4);
    }

    public final void advert(int i) {
        if (i < 0) {
            throw new IllegalStateException(AbstractC1786e.admob(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Alert.DURATION_SHOW_INDEFINITELY) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C5623e c5623e = C5623e.metrica;
        c5623e.getClass();
        return c5623e.ad(getClass()).adcel(this, (AbstractC4994e) obj);
    }

    public final int hashCode() {
        if (yandex()) {
            C5623e c5623e = C5623e.metrica;
            c5623e.getClass();
            return c5623e.ad(getClass()).billing(this);
        }
        if (this.memoizedHashCode == 0) {
            C5623e c5623e2 = C5623e.metrica;
            c5623e2.getClass();
            this.memoizedHashCode = c5623e2.ad(getClass()).billing(this);
        }
        return this.memoizedHashCode;
    }

    public abstract Object license(int i);

    public final AbstractC12161e metrica() {
        return (AbstractC12161e) license(5);
    }

    /* JADX WARN: Type inference failed for: r1v3, types: [eّّٓ, java.lang.Object] */
    public final void smaato(AbstractC16754e abstractC16754e) {
        C5623e c5623e = C5623e.metrica;
        c5623e.getClass();
        InterfaceC3028e ad = c5623e.ad(getClass());
        C13935e c13935e = abstractC16754e.vip;
        C13935e c13935e2 = c13935e;
        if (c13935e == null) {
            ?? obj = new Object();
            Charset charset = AbstractC0352e.ad;
            obj.f27641e = abstractC16754e;
            abstractC16754e.vip = obj;
            c13935e2 = obj;
        }
        ad.purchase(this, c13935e2);
    }

    public final void startapp() {
        this.memoizedSerializedSize &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = AbstractC13378e.ad;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        AbstractC13378e.metrica(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.AbstractC6866e
    public final int vip(InterfaceC3028e interfaceC3028e) {
        int appmetrica;
        int appmetrica2;
        if (yandex()) {
            if (interfaceC3028e == null) {
                C5623e c5623e = C5623e.metrica;
                c5623e.getClass();
                appmetrica2 = c5623e.ad(getClass()).appmetrica(this);
            } else {
                appmetrica2 = interfaceC3028e.appmetrica(this);
            }
            if (appmetrica2 >= 0) {
                return appmetrica2;
            }
            throw new IllegalStateException(AbstractC1786e.admob(appmetrica2, "serialized size must be non-negative, was "));
        }
        int i = this.memoizedSerializedSize;
        if ((i & Alert.DURATION_SHOW_INDEFINITELY) != Integer.MAX_VALUE) {
            return i & Alert.DURATION_SHOW_INDEFINITELY;
        }
        if (interfaceC3028e == null) {
            C5623e c5623e2 = C5623e.metrica;
            c5623e2.getClass();
            appmetrica = c5623e2.ad(getClass()).appmetrica(this);
        } else {
            appmetrica = interfaceC3028e.appmetrica(this);
        }
        advert(appmetrica);
        return appmetrica;
    }

    public final boolean yandex() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }
}
