package defpackage;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eًٕؔ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC15319e extends AbstractC17836e {
    public static final /* synthetic */ int zzd = 0;
    private static final Map zze = new ConcurrentHashMap();
    private int zzb;
    protected C2370e zzc;

    public AbstractC15319e() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = C2370e.purchase;
    }

    public static void Signature(Class cls, AbstractC15319e abstractC15319e) {
        abstractC15319e.yandex();
        zze.put(cls, abstractC15319e);
    }

    public static Object admob(Method method, AbstractC15319e abstractC15319e, Object... objArr) {
        try {
            return method.invoke(abstractC15319e, objArr);
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

    public static AbstractC15319e appmetrica(AbstractC15319e abstractC15319e, byte[] bArr, C17268e c17268e) {
        int length = bArr.length;
        if (length != 0) {
            AbstractC15319e startapp = abstractC15319e.startapp();
            try {
                InterfaceC16984e ad = C5913e.metrica.ad(startapp.getClass());
                ad.purchase(startapp, bArr, 0, length, new C6313e(c17268e));
                ad.metrica(startapp);
                abstractC15319e = startapp;
            } catch (C10895e e) {
                if (e.f21565e) {
                    throw new IOException(e.getMessage(), e);
                }
                throw e;
            } catch (C16873e e2) {
                throw e2.ad();
            } catch (IOException e3) {
                if (e3.getCause() instanceof C10895e) {
                    throw ((C10895e) e3.getCause());
                }
                throw new IOException(e3.getMessage(), e3);
            } catch (IndexOutOfBoundsException unused) {
                throw new IOException("While parsing a protocol message, the input ended unexpectedly in the middle of a field.  This could mean either that the input has been truncated or that an embedded message misreported its own length.");
            }
        }
        remoteconfig(abstractC15319e);
        return abstractC15319e;
    }

    public static AbstractC15319e loadAd(Class cls) {
        Map map = zze;
        AbstractC15319e abstractC15319e = (AbstractC15319e) map.get(cls);
        if (abstractC15319e == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC15319e = (AbstractC15319e) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC15319e != null) {
            return abstractC15319e;
        }
        AbstractC15319e abstractC15319e2 = (AbstractC15319e) ((AbstractC15319e) AbstractC1929e.license(cls)).pro(6);
        if (abstractC15319e2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC15319e2);
        return abstractC15319e2;
    }

    public static void remoteconfig(AbstractC15319e abstractC15319e) {
        if (abstractC15319e != null && !subscription(abstractC15319e, true)) {
            throw new C16873e().ad();
        }
    }

    public static final boolean subscription(AbstractC15319e abstractC15319e, boolean z) {
        byte byteValue = ((Byte) abstractC15319e.pro(1)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean appmetrica = C5913e.metrica.ad(abstractC15319e.getClass()).appmetrica(abstractC15319e);
        if (z) {
            abstractC15319e.pro(2);
        }
        return appmetrica;
    }

    public final void adcel() {
        C5913e.metrica.ad(getClass()).metrica(this);
        yandex();
    }

    public final AbstractC6041e advert() {
        AbstractC6041e abstractC6041e = (AbstractC6041e) pro(5);
        abstractC6041e.purchase(this);
        return abstractC6041e;
    }

    public final int amazon() {
        if (billing()) {
            int license = C5913e.metrica.ad(getClass()).license(this);
            if (license >= 0) {
                return license;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(license).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(license);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zzb & Alert.DURATION_SHOW_INDEFINITELY;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int license2 = C5913e.metrica.ad(getClass()).license(this);
        if (license2 >= 0) {
            this.zzb = (this.zzb & RecyclerView.UNDEFINED_DURATION) | license2;
            return license2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(license2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(license2);
        throw new IllegalStateException(sb2.toString());
    }

    public final boolean billing() {
        return (this.zzb & RecyclerView.UNDEFINED_DURATION) != 0;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C5913e.metrica.ad(getClass()).startapp(this, (AbstractC15319e) obj);
    }

    public final int hashCode() {
        if (billing()) {
            return C5913e.metrica.ad(getClass()).billing(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int billing = C5913e.metrica.ad(getClass()).billing(this);
        this.zza = billing;
        return billing;
    }

    @Override // defpackage.AbstractC17836e
    public final int metrica(InterfaceC16984e interfaceC16984e) {
        if (billing()) {
            int license = interfaceC16984e.license(this);
            if (license >= 0) {
                return license;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(license).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(license);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zzb & Alert.DURATION_SHOW_INDEFINITELY;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int license2 = interfaceC16984e.license(this);
        if (license2 >= 0) {
            this.zzb = (this.zzb & RecyclerView.UNDEFINED_DURATION) | license2;
            return license2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(license2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(license2);
        throw new IllegalStateException(sb2.toString());
    }

    public final AbstractC6041e mopub() {
        return (AbstractC6041e) pro(5);
    }

    public abstract Object pro(int i);

    /* JADX WARN: Type inference failed for: r1v3, types: [java.lang.Object, eٍؘٖ] */
    public final void purchase(AbstractC13874e abstractC13874e) {
        InterfaceC16984e ad = C5913e.metrica.ad(getClass());
        C16089e c16089e = abstractC13874e.vip;
        C16089e c16089e2 = c16089e;
        if (c16089e == null) {
            ?? obj = new Object();
            obj.f31681e = abstractC13874e;
            abstractC13874e.vip = obj;
            c16089e2 = obj;
        }
        ad.yandex(this, c16089e2);
    }

    public final void smaato() {
        this.zzb = (this.zzb & RecyclerView.UNDEFINED_DURATION) | Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final AbstractC15319e startapp() {
        return (AbstractC15319e) pro(4);
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = AbstractC15155e.ad;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        AbstractC15155e.vip(this, sb, 0);
        return sb.toString();
    }

    public final void yandex() {
        this.zzb &= Alert.DURATION_SHOW_INDEFINITELY;
    }
}
