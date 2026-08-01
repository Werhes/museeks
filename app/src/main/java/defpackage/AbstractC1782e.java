package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eؙْؓ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes.dex */
public abstract class AbstractC1782e {
    public final C17519e ad;
    public final C17519e metrica;
    public final C17519e vip;

    public AbstractC1782e(C17519e c17519e, C17519e c17519e2, C17519e c17519e3) {
        this.ad = c17519e;
        this.vip = c17519e2;
        this.metrica = c17519e3;
    }

    public abstract C1267e ad();

    public final void adcel(int i, int i2) {
        startapp(i2);
        ((C1267e) this).appmetrica.writeInt(i);
    }

    public final void advert(InterfaceC11282e interfaceC11282e) {
        if (interfaceC11282e == null) {
            ((C1267e) this).appmetrica.writeString(null);
            return;
        }
        try {
            ((C1267e) this).appmetrica.writeString(vip(interfaceC11282e.getClass()).getName());
            C1267e ad = ad();
            try {
                license(interfaceC11282e.getClass()).invoke(null, interfaceC11282e, ad);
                Parcel parcel = ad.appmetrica;
                int i = ad.startapp;
                if (i >= 0) {
                    int i2 = ad.license.get(i);
                    int dataPosition = parcel.dataPosition();
                    parcel.setDataPosition(i2);
                    parcel.writeInt(dataPosition - i2);
                    parcel.setDataPosition(dataPosition);
                }
            } catch (ClassNotFoundException e) {
                throw new RuntimeException(e);
            } catch (IllegalAccessException e2) {
                throw new RuntimeException(e2);
            } catch (NoSuchMethodException e3) {
                throw new RuntimeException(e3);
            } catch (InvocationTargetException e4) {
                Throwable cause = e4.getCause();
                if (cause instanceof RuntimeException) {
                    throw ((RuntimeException) cause);
                }
                if (!(cause instanceof Error)) {
                    throw new RuntimeException(e4);
                }
                throw ((Error) cause);
            }
        } catch (ClassNotFoundException e5) {
            throw new RuntimeException(interfaceC11282e.getClass().getSimpleName().concat(" does not have a Parcelizer"), e5);
        }
    }

    public abstract boolean appmetrica(int i);

    public final Parcelable billing(Parcelable parcelable, int i) {
        if (!appmetrica(i)) {
            return parcelable;
        }
        return ((C1267e) this).appmetrica.readParcelable(C1267e.class.getClassLoader());
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final Method license(Class cls) {
        String name = cls.getName();
        C17519e c17519e = this.vip;
        Method method = (Method) c17519e.get(name);
        if (method != null) {
            return method;
        }
        Method declaredMethod = vip(cls).getDeclaredMethod("write", cls, AbstractC1782e.class);
        c17519e.put(cls.getName(), declaredMethod);
        return declaredMethod;
    }

    public final Method metrica(String str) {
        C17519e c17519e = this.ad;
        Method method = (Method) c17519e.get(str);
        if (method != null) {
            return method;
        }
        Method declaredMethod = Class.forName(str, false, AbstractC1782e.class.getClassLoader()).getDeclaredMethod("read", AbstractC1782e.class);
        c17519e.put(str, declaredMethod);
        return declaredMethod;
    }

    public final void mopub(Parcelable parcelable, int i) {
        startapp(i);
        ((C1267e) this).appmetrica.writeParcelable(parcelable, 0);
    }

    public final int purchase(int i, int i2) {
        return !appmetrica(i2) ? i : ((C1267e) this).appmetrica.readInt();
    }

    public abstract void startapp(int i);

    public final Class vip(Class cls) {
        String name = cls.getName();
        C17519e c17519e = this.metrica;
        Class cls2 = (Class) c17519e.get(name);
        if (cls2 != null) {
            return cls2;
        }
        Class<?> cls3 = Class.forName(cls.getPackage().getName() + "." + cls.getSimpleName() + "Parcelizer", false, cls.getClassLoader());
        c17519e.put(cls.getName(), cls3);
        return cls3;
    }

    public final InterfaceC11282e yandex() {
        String readString = ((C1267e) this).appmetrica.readString();
        if (readString == null) {
            return null;
        }
        try {
            return (InterfaceC11282e) metrica(readString).invoke(null, ad());
        } catch (ClassNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IllegalAccessException e2) {
            throw new RuntimeException(e2);
        } catch (NoSuchMethodException e3) {
            throw new RuntimeException(e3);
        } catch (InvocationTargetException e4) {
            Throwable cause = e4.getCause();
            if (cause instanceof RuntimeException) {
                throw ((RuntimeException) cause);
            }
            if (cause instanceof Error) {
                throw ((Error) cause);
            }
            throw new RuntimeException(e4);
        }
    }
}
