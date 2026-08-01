package defpackage;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eُۗٝ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC11202e extends AbstractC4191e {
    private static final Map zzd = new ConcurrentHashMap();
    private int zzb;
    protected C7012e zzc;

    public AbstractC11202e() {
        this.zza = 0;
        this.zzb = -1;
        this.zzc = C7012e.appmetrica;
    }

    public static void billing(Class cls, AbstractC11202e abstractC11202e) {
        abstractC11202e.mopub();
        zzd.put(cls, abstractC11202e);
    }

    public static AbstractC11202e purchase(Class cls) {
        Map map = zzd;
        AbstractC11202e abstractC11202e = (AbstractC11202e) map.get(cls);
        if (abstractC11202e == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC11202e = (AbstractC11202e) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC11202e != null) {
            return abstractC11202e;
        }
        AbstractC11202e abstractC11202e2 = (AbstractC11202e) ((AbstractC11202e) AbstractC9914e.appmetrica(cls)).startapp(6, null);
        if (abstractC11202e2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC11202e2);
        return abstractC11202e2;
    }

    public static Object yandex(Method method, AbstractC11202e abstractC11202e, Object... objArr) {
        try {
            return method.invoke(abstractC11202e, objArr);
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

    @Override // defpackage.AbstractC4191e
    public final int ad(InterfaceC0627e interfaceC0627e) {
        if (adcel()) {
            int metrica = interfaceC0627e.metrica(this);
            if (metrica >= 0) {
                return metrica;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(metrica).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(metrica);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zzb & Alert.DURATION_SHOW_INDEFINITELY;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int metrica2 = interfaceC0627e.metrica(this);
        if (metrica2 >= 0) {
            this.zzb = (this.zzb & RecyclerView.UNDEFINED_DURATION) | metrica2;
            return metrica2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(metrica2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(metrica2);
        throw new IllegalStateException(sb2.toString());
    }

    public final boolean adcel() {
        return (this.zzb & RecyclerView.UNDEFINED_DURATION) != 0;
    }

    public final int appmetrica() {
        if (adcel()) {
            int metrica = C11222e.metrica.ad(getClass()).metrica(this);
            if (metrica >= 0) {
                return metrica;
            }
            StringBuilder sb = new StringBuilder(String.valueOf(metrica).length() + 42);
            sb.append("serialized size must be non-negative, was ");
            sb.append(metrica);
            throw new IllegalStateException(sb.toString());
        }
        int i = this.zzb & Alert.DURATION_SHOW_INDEFINITELY;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int metrica2 = C11222e.metrica.ad(getClass()).metrica(this);
        if (metrica2 >= 0) {
            this.zzb = (this.zzb & RecyclerView.UNDEFINED_DURATION) | metrica2;
            return metrica2;
        }
        StringBuilder sb2 = new StringBuilder(String.valueOf(metrica2).length() + 42);
        sb2.append("serialized size must be non-negative, was ");
        sb2.append(metrica2);
        throw new IllegalStateException(sb2.toString());
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C11222e.metrica.ad(getClass()).license(this, (AbstractC11202e) obj);
    }

    public final int hashCode() {
        if (adcel()) {
            return C11222e.metrica.ad(getClass()).appmetrica(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int appmetrica = C11222e.metrica.ad(getClass()).appmetrica(this);
        this.zza = appmetrica;
        return appmetrica;
    }

    public final void license() {
        this.zzb = (this.zzb & RecyclerView.UNDEFINED_DURATION) | Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final AbstractC10140e metrica() {
        return (AbstractC10140e) startapp(5, null);
    }

    public final void mopub() {
        this.zzb &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    public abstract Object startapp(int i, AbstractC11202e abstractC11202e);

    public final String toString() {
        String obj = super.toString();
        char[] cArr = AbstractC18232e.ad;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        AbstractC18232e.vip(this, sb, 0);
        return sb.toString();
    }
}
