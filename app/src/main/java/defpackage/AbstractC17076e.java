package defpackage;

import androidx.car.app.model.Alert;
import androidx.recyclerview.widget.RecyclerView;
import j$.util.concurrent.ConcurrentHashMap;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.Map;

/* compiled from: r8-map-id-a03018653d44f370ce7a671d31c0358eb3f30ef65367264f2a4c1bf16e5cfea3 */
/* renamed from: eٗ٘ۚ, reason: invalid class name and case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC17076e extends AbstractC4291e {
    private static final Map zzb = new ConcurrentHashMap();
    protected C10308e zzc;
    private int zzd;

    public AbstractC17076e() {
        this.zza = 0;
        this.zzd = -1;
        this.zzc = C10308e.purchase;
    }

    public static final boolean adcel(AbstractC17076e abstractC17076e, boolean z) {
        byte byteValue = ((Byte) abstractC17076e.smaato(1, null)).byteValue();
        if (byteValue == 1) {
            return true;
        }
        if (byteValue == 0) {
            return false;
        }
        boolean metrica = C17792e.metrica.ad(abstractC17076e.getClass()).metrica(abstractC17076e);
        if (z) {
            abstractC17076e.smaato(2, true == metrica ? abstractC17076e : null);
        }
        return metrica;
    }

    public static AbstractC17076e appmetrica(Class cls) {
        Map map = zzb;
        AbstractC17076e abstractC17076e = (AbstractC17076e) map.get(cls);
        if (abstractC17076e == null) {
            try {
                Class.forName(cls.getName(), true, cls.getClassLoader());
                abstractC17076e = (AbstractC17076e) map.get(cls);
            } catch (ClassNotFoundException e) {
                throw new IllegalStateException("Class initialization cannot fail.", e);
            }
        }
        if (abstractC17076e != null) {
            return abstractC17076e;
        }
        AbstractC17076e abstractC17076e2 = (AbstractC17076e) ((AbstractC17076e) AbstractC8314e.billing(cls)).smaato(6, null);
        if (abstractC17076e2 == null) {
            throw new IllegalStateException();
        }
        map.put(cls, abstractC17076e2);
        return abstractC17076e2;
    }

    public static Object purchase(Method method, AbstractC17076e abstractC17076e, Object... objArr) {
        try {
            return method.invoke(abstractC17076e, objArr);
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

    public static void yandex(Class cls, AbstractC17076e abstractC17076e) {
        abstractC17076e.billing();
        zzb.put(cls, abstractC17076e);
    }

    @Override // defpackage.InterfaceC5238e
    public final boolean ad() {
        return adcel(this, true);
    }

    public final void advert(C5633e c5633e) {
        InterfaceC15433e ad = C17792e.metrica.ad(getClass());
        C17698e c17698e = c5633e.metrica;
        if (c17698e == null) {
            c17698e = new C17698e(c5633e);
        }
        ad.startapp(this, c17698e);
    }

    public final void billing() {
        this.zzd &= Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return C17792e.metrica.ad(getClass()).appmetrica(this, (AbstractC17076e) obj);
    }

    public final int hashCode() {
        if (mopub()) {
            return C17792e.metrica.ad(getClass()).vip(this);
        }
        int i = this.zza;
        if (i != 0) {
            return i;
        }
        int vip = C17792e.metrica.ad(getClass()).vip(this);
        this.zza = vip;
        return vip;
    }

    public final AbstractC15425e license() {
        return (AbstractC15425e) smaato(5, null);
    }

    public final int metrica() {
        if (mopub()) {
            int billing = C17792e.metrica.ad(getClass()).billing(this);
            if (billing >= 0) {
                return billing;
            }
            throw new IllegalStateException(AbstractC1786e.admob(billing, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Alert.DURATION_SHOW_INDEFINITELY;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int billing2 = C17792e.metrica.ad(getClass()).billing(this);
        if (billing2 < 0) {
            throw new IllegalStateException(AbstractC1786e.admob(billing2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | billing2;
        return billing2;
    }

    public final boolean mopub() {
        return (this.zzd & RecyclerView.UNDEFINED_DURATION) != 0;
    }

    public abstract Object smaato(int i, AbstractC17076e abstractC17076e);

    public final void startapp() {
        this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | Alert.DURATION_SHOW_INDEFINITELY;
    }

    public final String toString() {
        String obj = super.toString();
        char[] cArr = AbstractC5192e.ad;
        StringBuilder sb = new StringBuilder();
        sb.append("# ");
        sb.append(obj);
        AbstractC5192e.metrica(this, sb, 0);
        return sb.toString();
    }

    @Override // defpackage.AbstractC4291e
    public final int vip(InterfaceC15433e interfaceC15433e) {
        if (mopub()) {
            int billing = interfaceC15433e.billing(this);
            if (billing >= 0) {
                return billing;
            }
            throw new IllegalStateException(AbstractC1786e.admob(billing, "serialized size must be non-negative, was "));
        }
        int i = this.zzd & Alert.DURATION_SHOW_INDEFINITELY;
        if (i != Integer.MAX_VALUE) {
            return i;
        }
        int billing2 = interfaceC15433e.billing(this);
        if (billing2 < 0) {
            throw new IllegalStateException(AbstractC1786e.admob(billing2, "serialized size must be non-negative, was "));
        }
        this.zzd = (this.zzd & RecyclerView.UNDEFINED_DURATION) | billing2;
        return billing2;
    }
}
