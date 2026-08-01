package defpackage;

import androidx.car.app.model.Alert;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٖؕۢ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC3405e extends AbstractC7718e {
    private static final int MEMOIZED_SERIALIZED_SIZE_MASK = Integer.MAX_VALUE;
    private static final int MUTABLE_FLAG_MASK = Integer.MIN_VALUE;
    static final int UNINITIALIZED_HASH_CODE = 0;
    static final int UNINITIALIZED_SERIALIZED_SIZE = Integer.MAX_VALUE;
    private static Map<Class<?>, AbstractC3405e> defaultInstanceMap = new ConcurrentHashMap();
    private int memoizedSerializedSize;
    protected C1434e unknownFields;

    public AbstractC3405e() {
        this.memoizedHashCode = 0;
        this.memoizedSerializedSize = -1;
        this.unknownFields = C1434e.purchase;
    }

    public static AbstractC3405e adcel(Class cls) {
        AbstractC3405e abstractC3405e = defaultInstanceMap.get(cls);
        if (abstractC3405e == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC3405e = defaultInstanceMap.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC3405e != null) {
            return abstractC3405e;
        }
        AbstractC3405e vip = ((AbstractC3405e) AbstractC5314e.vip(cls)).vip();
        if (vip == null) {
            throw new IllegalStateException();
        }
        defaultInstanceMap.put(cls, vip);
        return vip;
    }

    public static final boolean amazon(AbstractC3405e abstractC3405e, boolean z) {
        byte byteValue = ((Byte) abstractC3405e.startapp(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        C10051e c10051e = C10051e.metrica;
        c10051e.getClass();
        boolean metrica = c10051e.ad(abstractC3405e.getClass()).metrica(abstractC3405e);
        if (z) {
            abstractC3405e.startapp(2);
        }
        return metrica;
    }

    public static void billing(AbstractC3405e abstractC3405e) {
        if (abstractC3405e != null && !amazon(abstractC3405e, true)) {
            throw new IOException(new C8801e().getMessage());
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v0, types: [java.lang.Object, eَؙۥ] */
    public static AbstractC3405e pro(AbstractC3405e abstractC3405e, byte[] bArr, C5712e c5712e) {
        int length = bArr.length;
        if (length != 0) {
            AbstractC3405e subscription = abstractC3405e.subscription();
            try {
                C10051e c10051e = C10051e.metrica;
                c10051e.getClass();
                InterfaceC11115e ad = c10051e.ad(subscription.getClass());
                ?? obj = new Object();
                c5712e.getClass();
                ad.yandex(subscription, bArr, 0, length, obj);
                ad.vip(subscription);
                abstractC3405e = subscription;
            } catch (C8801e e) {
                throw new IOException(e.getMessage());
            } catch (C8868e e2) {
                if (e2.f17826e) {
                    throw new IOException(e2.getMessage(), e2);
                }
                throw e2;
            } catch (IOException e3) {
                if (e3.getCause() instanceof C8868e) {
                    throw ((C8868e) e3.getCause());
                }
                throw new IOException(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                throw C8868e.billing();
            }
        }
        billing(abstractC3405e);
        return abstractC3405e;
    }

    public static AbstractC3405e remoteconfig(AbstractC3405e abstractC3405e, AbstractC10498e abstractC10498e, C5712e c5712e) {
        C2096e c2096e = (C2096e) abstractC10498e;
        C7233e adcel = AbstractC15825e.adcel(c2096e.f5426e, c2096e.advert(), c2096e.size(), true);
        AbstractC3405e signatures = signatures(abstractC3405e, adcel, c5712e);
        adcel.vip(0);
        billing(signatures);
        return signatures;
    }

    public static AbstractC3405e signatures(AbstractC3405e abstractC3405e, AbstractC15825e abstractC15825e, C5712e c5712e) {
        AbstractC3405e subscription = abstractC3405e.subscription();
        try {
            C10051e c10051e = C10051e.metrica;
            c10051e.getClass();
            InterfaceC11115e ad = c10051e.ad(subscription.getClass());
            C11226e c11226e = (C11226e) abstractC15825e.f31256e;
            if (c11226e == null) {
                c11226e = new C11226e(abstractC15825e, (byte) 0);
            }
            ad.purchase(subscription, c11226e, c5712e);
            ad.vip(subscription);
            return subscription;
        } catch (C8801e e) {
            throw new IOException(e.getMessage());
        } catch (C8868e e2) {
            if (e2.f17826e) {
                throw new IOException(e2.getMessage(), e2);
            }
            throw e2;
        } catch (IOException e3) {
            if (e3.getCause() instanceof C8868e) {
                throw ((C8868e) e3.getCause());
            }
            throw new IOException(e3.getMessage(), e3);
        } catch (RuntimeException e4) {
            if (e4.getCause() instanceof C8868e) {
                throw ((C8868e) e4.getCause());
            }
            throw e4;
        }
    }

    public static Object smaato(Method method, AbstractC3405e abstractC3405e, Object... objArr) {
        try {
            return method.invoke(abstractC3405e, objArr);
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

    public static void tapsense(Class cls, AbstractC3405e abstractC3405e) {
        abstractC3405e.Signature();
        defaultInstanceMap.put(cls, abstractC3405e);
    }

    public final void Signature() {
        this.memoizedSerializedSize &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    @Override // defpackage.AbstractC7718e
    public final int ad(InterfaceC11115e interfaceC11115e) {
        int appmetrica;
        int appmetrica2;
        if (loadAd()) {
            if (interfaceC11115e == null) {
                C10051e c10051e = C10051e.metrica;
                c10051e.getClass();
                appmetrica2 = c10051e.ad(getClass()).appmetrica(this);
            } else {
                appmetrica2 = interfaceC11115e.appmetrica(this);
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
        if (interfaceC11115e == null) {
            C10051e c10051e2 = C10051e.metrica;
            c10051e2.getClass();
            appmetrica = c10051e2.ad(getClass()).appmetrica(this);
        } else {
            appmetrica = interfaceC11115e.appmetrica(this);
        }
        isVip(appmetrica);
        return appmetrica;
    }

    @Override // defpackage.AbstractC7718e
    /* renamed from: admob, reason: merged with bridge method [inline-methods] */
    public final AbstractC4490e license() {
        return (AbstractC4490e) startapp(5);
    }

    public final InterfaceC5309e advert() {
        return (InterfaceC5309e) startapp(7);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        C10051e c10051e = C10051e.metrica;
        c10051e.getClass();
        return c10051e.ad(getClass()).startapp(this, (AbstractC3405e) obj);
    }

    public final int hashCode() {
        if (loadAd()) {
            C10051e c10051e = C10051e.metrica;
            c10051e.getClass();
            return c10051e.ad(getClass()).adcel(this);
        }
        if (this.memoizedHashCode == 0) {
            C10051e c10051e2 = C10051e.metrica;
            c10051e2.getClass();
            this.memoizedHashCode = c10051e2.ad(getClass()).adcel(this);
        }
        return this.memoizedHashCode;
    }

    public final AbstractC4490e inmobi() {
        AbstractC4490e abstractC4490e = (AbstractC4490e) startapp(5);
        abstractC4490e.purchase(this);
        return abstractC4490e;
    }

    public final void isPro(AbstractC13258e abstractC13258e) {
        C10051e c10051e = C10051e.metrica;
        c10051e.getClass();
        InterfaceC11115e ad = c10051e.ad(getClass());
        C7850e c7850e = abstractC13258e.billing;
        if (c7850e == null) {
            c7850e = new C7850e(abstractC13258e);
        }
        ad.billing(this, c7850e);
    }

    public final void isVip(int i) {
        if (i < 0) {
            throw new IllegalStateException(AbstractC1786e.admob(i, "serialized size must be non-negative, was "));
        }
        this.memoizedSerializedSize = (i & Alert.DURATION_SHOW_INDEFINITELY) | (this.memoizedSerializedSize & Integer.MIN_VALUE);
    }

    public final boolean loadAd() {
        return (this.memoizedSerializedSize & Integer.MIN_VALUE) != 0;
    }

    @Override // defpackage.InterfaceC10218e
    /* renamed from: mopub, reason: merged with bridge method [inline-methods] */
    public final AbstractC3405e vip() {
        return (AbstractC3405e) startapp(6);
    }

    public abstract Object startapp(int i);

    public final AbstractC3405e subscription() {
        return (AbstractC3405e) startapp(4);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = AbstractC12709e.ad;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        AbstractC12709e.metrica(this, sb, 0);
        return sb.toString();
    }

    public final AbstractC4490e yandex() {
        return (AbstractC4490e) startapp(5);
    }
}
